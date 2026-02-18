# 📘 MODULE 5: Compile-Time Rules & Custom Exceptions

---

## 1️⃣3️⃣ PART 13: COMPILE-TIME RULES

---

## 13.1 Why Java Enforces Compile-Time Exception Rules

Java follows a strongly typed, contract-based, and safety-oriented design philosophy.

Unlike some programming languages that allow exceptions to propagate silently without compiler intervention, Java deliberately enforces handling rules for certain types of exceptions at compile-time.

This enforcement applies specifically to checked exceptions.

---

### 🔹 Design Philosophy Behind Checked Exceptions

Checked exceptions exist because:

1. Some failures are predictable
2. Some failures are recoverable
3. The caller must be explicitly informed about potential failure

These are not programming mistakes.<br>
They are environmental or external conditions.

**Examples:**

* A file may not exist (FileNotFoundException)
* A network connection may fail (IOException)
* A thread may be interrupted (InterruptedException)
* A database connection may be lost (SQLException)

These are not logical bugs in code.<br>
They are runtime conditions that can legitimately occur.

Because recovery may be possible, Java forces developers to consciously decide:

👉 Handle the exception<br>
OR<br>
👉 Declare it using `throws`

---

### 🔹 Compiler’s Role (Static Analysis)

For checked exceptions, the Java compiler performs static analysis.

It examines:

* Method calls
* Declared throws clauses
* try–catch blocks
* Propagation chain

If it detects a checked exception that is neither handled nor declared, it produces a compile-time error.

This mechanism ensures:

* Program correctness
* Explicit API contracts
* Clear method responsibility
* Predictable error flow
* Safer large-scale systems

---

### 🔹 Why Unchecked Exceptions Are Not Enforced

Unchecked exceptions (subclasses of RuntimeException) are not enforced at compile-time because:

* They represent programming errors.
* They indicate logical flaws.
* They are usually not recoverable at runtime.
* They should be fixed in code rather than handled externally.

**Examples:**

* NullPointerException
* ArithmeticException
* ArrayIndexOutOfBoundsException
* IllegalArgumentException

These typically occur due to:

* Bad logic
* Invalid assumptions
* Coding mistakes

Therefore, Java does not force handling or declaration of unchecked exceptions.

---

### 🔹 Core Difference (Compiler Perspective)

| Aspect                 | Checked Exception     | Unchecked Exception |
| ---------------------- | --------------------- | ------------------- |
| Compiler Enforced      | Yes                   | No                  |
| Must Handle or Declare | Yes                   | No                  |
| Represents             | Recoverable condition | Programming bug     |
| Design Goal            | Reliability & clarity | Code correctness    |

---

### 🔹 Major Compile-Time Rules

---

### Rule 13.1: Unreported Checked Exception

**When It Occurs**

When a method contains code that may throw a checked exception, and the exception is neither:

* Handled using try–catch
* Nor declared using throws

**Example**

```java
public static void main(String[] args) {
    Thread.sleep(1000);
}
```

**Compile-Time Error**

```
unreported exception java.lang.InterruptedException;
must be caught or declared to be thrown
```

**Why Compiler Complains**

Because InterruptedException is a checked exception.<br>
The compiler detects possibility of interruption.

**How to Fix**

Option 1 — Handle:

```java
try {
    Thread.sleep(1000);
} catch (InterruptedException e) {
}
```

Option 2 — Declare:

```java
public static void main(String[] args) throws InterruptedException {
    Thread.sleep(1000);
}
```

---

### Rule 13.2: Unreachable Catch Block (Wrong Order)

**When It Occurs**

When a broader exception is caught before a narrower one.

**Example**

```java
try {
    int x = 10 / 0;
} catch (Exception e) {
} catch (ArithmeticException e) {
}
```

**Compile-Time Error**

```
exception ArithmeticException has already been caught
```

**Reason**

Because Exception is parent of ArithmeticException.<br>
So second catch becomes unreachable.

**Correct Order**

```java
catch (ArithmeticException e)
catch (Exception e)
```

---

### Rule 13.3: Catching Fully Checked Exception Without Possibility

**Example**

```java
try {
    System.out.println("Hello");
} catch (IOException e) {
}
```

**Compile-Time Error**

```
exception java.io.IOException is never thrown in body of corresponding try statement
```

**Reason**

Compiler performs static analysis.<br>
It sees no possibility of IOException inside try.

**Why This Is Allowed?**

```java
catch (Exception e)
```

Because Exception includes unchecked exceptions, and the compiler cannot guarantee that no unchecked exception may occur at runtime.

---

### Rule 13.4: Duplicate Catch Block

```java
try {
} catch (IOException e) {
} catch (IOException e) {
}
```

**Compile-Time Error:** Duplicate exception.<br>
**Reason:** Same type already handled.

---

### Rule 13.5: Overriding Checked Exception Rule

**Parent**

```java
void m1() throws IOException { }
```

**Invalid Child**

```java
void m1() throws Exception { }
```

**Compile-Time Error.**

**Reason**

Child cannot widen checked exception.

Because of polymorphism:

```java
Parent p = new Child();
p.m1();
```

Compiler checks based on Parent reference.<br>
Contract consistency must be maintained.

This rule exists to preserve the **Liskov Substitution Principle (LSP)** in object-oriented design.

---

### Rule 13.6: Invalid throws Usage (Compile-Time Errors)

The throws keyword has strict syntactical and type rules.
If these rules are violated, the compiler produces an error.

---

### ❌ 1️⃣ throws in Class Declaration (Wrong Place)

**Invalid Code**

```java
class Test throws Exception {
}
```

**Why This Is Invalid**

throws is part of method or constructor declaration syntax only.
It cannot be used:

* With a class
* With a variable
* With a block

**Compiler Error**

```
'{' expected
```

**Correct Usage**

```java
class Test {
    void m1() throws Exception {
    }
}
```

---

### ❌ 2️⃣ Non-Throwable Type in throws

**Invalid Code**

```java
void m1() throws Test {
}
```

If:

```java
class Test {
}
```

**Why This Is Invalid**

Only types that extend:

```
java.lang.Throwable
```

can be used in a throws clause.

Hierarchy reminder:

```
Object
   ↓
Throwable
   ↓
Exception
   ↓
RuntimeException
```

If Test does not extend Throwable, the compiler rejects it.

**Compile-Time Error**

```
incompatible types: Test cannot be converted to Throwable
```

---

### ✅ Valid Version

```java
class Test extends Exception {
}

void m1() throws Test {
}
```

Now it compiles because Test is a subclass of Throwable.

---

### ❌ 3️⃣ Duplicate Exception in throws

**Invalid Code**

```java
void m1() throws IOException, IOException {
}
```

**Why?**

You cannot declare the same exception type more than once.

**Compile-Time Error**

```
duplicate exception IOException
```

---

### ❌ 4️⃣ Mixing Parent & Child Incorrectly (Redundancy)

**Code (Valid but Redundant)**

```java
void m1() throws Exception, IOException {
}
```

**Why Redundant?**

Because: IOException is a subclass of Exception.<br>
Declaring Exception already covers IOException.

**Better version:**

```java
void m1() throws Exception {
}
```

---

### 🔹 Important Concept

The throws clause is:

* Checked at compile-time
* Used for contract declaration
* Not involved in runtime throwing mechanism

It must follow:

1. Correct syntax placement
2. Correct type hierarchy
3. No duplicates
4. Logical consistency

---

## 1️⃣4️⃣ PART 14: CUSTOM (USER-DEFINED) EXCEPTIONS

---

## 14.1 Why Custom Exceptions Are Needed

Built-in exceptions are generic:

* IllegalArgumentException
* IOException
* NullPointerException

But real-world systems require domain-specific clarity.

**Example:**

* InsufficientBalanceException
* InvalidUserException
* OrderNotFoundException

Custom exceptions provide:

* Business rule clarity
* Clean API contracts
* Better debugging
* Better logging
* Better maintainability

---

## 14.2 Types of Custom Exceptions

---

### 14.1 Checked Custom Exception

Extend Exception.

```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
```

Must be handled or declared.

Use when:

* Error is recoverable
* Caller must take action

---

### 14.2 Unchecked Custom Exception

Extend RuntimeException.

```java
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
```

No mandatory handling.

Use when:

* Programming logic violation
* Invalid input
* Business rule breach

Most modern frameworks prefer unchecked custom exceptions.

---

## 14.3 Proper Constructor Design

Best practice:

```java
public class MyException extends Exception {

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}
```

This supports:

* Message propagation
* Cause chaining
* Preserving the original cause is critical for debugging complex production systems because it prevents loss of root exception information.
* Flexible usage

---

## 14.4 Real-World Layered Example (Banking)

```java
class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance");
        }
        balance -= amount;
    }
}
```

Flow:

User → Service → BankAccount → throw → Propagation → Handler

---

## 14.5 Best Practices for Custom Exceptions

✔ Prefer extending RuntimeException for business logic<br>
✔ Do not extend Error<br>
✔ Do not extend Throwable directly<br>
✔ Provide meaningful names<br>
✔ Provide constructors<br>
✔ Do not swallow exceptions<br>
✔ Avoid using generic Exception<br>
✔ Do not create checked custom exceptions unless recovery is truly required

---

## 🧱 Final Integration Model

**Compile-Time Phase:**

* Compiler checks checked exceptions
* Verifies catch order
* Verifies throws declarations
* Ensures type safety

**Runtime Phase:**

* Exception object created
* Propagation begins
* Stack unwinding
* Matching catch found or default handler

---

## 🏆 Final Conclusion

1. Compiler enforces safety rules for checked exceptions.
2. Catch order matters.
3. Overriding rules maintain polymorphism contract.
4. Custom exceptions improve domain clarity.
5. Unchecked custom exceptions are preferred for business logic.
6. Constructor design matters for professional coding.
7. Compile-time and runtime exception systems work together.

---
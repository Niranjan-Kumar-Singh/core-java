# 📘 MODULE 4: Exception Propagation & Keywords

---

## 1️⃣4️⃣ Exception Propagation (Stack Unwinding Mechanism)

---

### 🔹 Definition of Exception Propagation

Exception Propagation is the systematic process by which an exception object, once created inside a method, is transferred from that method to its caller method, and then upward through the runtime call stack, until a matching exception handler (catch block) is found.

If no matching handler is found in the entire call stack, the JVM’s Default Exception Handler handles the exception and terminates the program abnormally.

---

### 🔹 Connection with Runtime Stack (From Module 1)

Every thread in Java has:

- One Runtime Stack  
- Each method call creates one Stack Frame  
- Stack follows LIFO (Last In First Out)  

When an exception occurs:

1. The current method terminates abnormally.  
2. Its stack frame is removed.  
3. Control moves to caller method.  
4. JVM checks for matching catch block.  
5. If not found → continues removing frames.  
6. If main() also does not handle → Default Exception Handler executes.  

This entire removal process is called:

👉 Stack Unwinding<br>
👉 Exception Propagation

---

### 🔹 Who Creates the Exception Object?

There are exactly two cases.

---

### Case 1️⃣: JVM-Generated Exception

**Example:**

```
System.out.println(10 / 0);
```

**What happens internally?**

1. JVM executes bytecode instruction for division.  
2. JVM detects illegal arithmetic operation (division by zero).  
3. JVM creates an object of:

    **Exception Name:**<br>
    `java.lang.ArithmeticException`<br><br>
    **Message:**<br>
    `/ by zero`

4. JVM captures stack trace.

    **Important Technical Detail:**<br>
    The stack trace is arranged in reverse chronological order.<br>
    The topmost entry represents the most recent method call where the exception actually occurred.<br>
    Each subsequent line shows the caller method, thereby reflecting the exact order of method invocation stored in the Runtime Stack.

5. JVM begins exception propagation.

    **Reason:**<br>
    Division by zero violates arithmetic rules.

    So:

    👉 In system-detected runtime errors, JVM creates the exception object.

**Important Concept:**<br>
The method in which the exception occurs is responsible for creating (or triggering the creation of) the exception object and handing it over to the JVM’s exception handling mechanism.

---

### Case 2️⃣: Programmer-Generated Exception (Using throw)

**Example:**

```
throw new ArithmeticException("/ by zero");
```

Here:

1. Programmer explicitly creates exception object.  
2. throw hands object to JVM.  
3. JVM starts propagation.

**Exception Name:**<br>
`java.lang.ArithmeticException`<br><br>
**Reason:**<br>
Programmer manually triggered exception mechanism.

So:

👉 When using throw, programmer creates the exception object.

---

### 🔹 What Does an Exception Object Contain?

An exception object contains:

1. Exception class name  
2. Error message  
3. Stack trace  
4. Cause (optional – advanced feature)  

**Important:**<br>
Stack trace is captured at the time the exception object is created, not when printed.

---

## 1️⃣5️⃣ throw Keyword

---

### 🔹 Definition of throw

The throw keyword is a Java keyword used inside a method body to explicitly create and hand over an exception object to the JVM’s exception handling mechanism, thereby forcing abnormal termination of the current method and initiating exception propagation.

---

### 🔹 Why Do We Require throw?

JVM automatically throws exceptions only when it detects technical runtime violations such as:

- Division by zero  
- Null reference access  
- Invalid array index  
- File not found  

However, JVM does NOT understand business rules.

**Example:**

Requirement:<br>
Age must be ≥ 18.

```java
if (age < 18) {
    throw new IllegalArgumentException("Not eligible to vote");
}
```

There is:

- No syntax error  
- No runtime crash  
- No illegal memory access  

But logically, input is invalid.

Therefore:

👉 We require throw to manually trigger exception handling for logical or business rule violations.

---

### 🔹 Purpose of throw

We use throw to:

1. Enforce validation rules  
2. Convert logical errors into exception flow  
3. Stop method execution immediately  
4. Trigger propagation mechanism manually  

---

### 🔹 Internal Working of throw

```
Programmer creates exception object
            ↓
throw statement executes
            ↓
Control transfers immediately
            ↓
JVM searches for matching catch
            ↓
If found → handler executes
If not found → stack unwinding continues
```

---

### 🔹 Rules of throw

---

#### Rule 1: Only Throwable Types Allowed

**Invalid:**

```java
throw new Test();
```

**Compile-Time Error:**<br>
`incompatible types: Test cannot be converted to Throwable`

**Reason:**<br>
Only classes extending `java.lang.Throwable` can be thrown.

---

#### Rule 2: Statement After throw Is Unreachable

```java
throw new ArithmeticException();
System.out.println("Hello");
```

**Compile-Time Error:**<br>
`unreachable statement`

**Reason:**<br>
throw transfers control immediately.

---

#### Rule 3: throw null

```java
throw null;
```

Compiles successfully.

**Runtime Exception:**<br>
**Exception Name:** `java.lang.NullPointerException`

**Reason:**<br>
JVM attempts to throw a null reference.

---

#### Rule 4: Checked Exception with throw

```java
throw new Exception();
```

**Compile-Time Error:**<br>
`unreported exception java.lang.Exception; must be caught or declared to be thrown`

**Reason:**<br>
Exception is checked; compiler enforces handling.

---

#### Rule 5: throw Causes Abnormal Termination

| Statement | Termination |
|-----------|-------------|
| return    | Normal      |
| throw     | Abnormal    |

**Reason:**<br>
throw interrupts normal control flow.

---

## 1️⃣6️⃣ throws Keyword

---

### 🔹 Definition of throws

The throws keyword is used in method or constructor declaration to declare that the method may generate one or more exceptions and that the responsibility for handling those exceptions is delegated to the caller of the method.

---

### 🔹 Why Do We Require throws?

Java enforces a compile-time rule for checked exceptions.

Checked exceptions represent recoverable environmental issues such as:

- File not found  
- Network failure  
- Database failure  
- Interrupted thread  

Because they are recoverable, the compiler forces acknowledgment.

If a method may produce a checked exception and does not handle it, it must declare it using throws.

---

### 🔹 What throws Does NOT Do

- It does NOT throw the exception.  
- It does NOT handle the exception.  
- It does NOT prevent abnormal termination.  
- It does NOT generate bytecode instructions for throwing an exception at runtime.  

It only satisfies the compiler and maintains propagation chain.

**Important:**  
The throws keyword exists purely at compile-time to satisfy the compiler’s checked exception rule. It does not participate in runtime exception generation.

---

### 🔹 Example – InterruptedException

```
Thread.sleep(1000);
```

**Exception:**  
`java.lang.InterruptedException`

**Reason:**  
Thread may be interrupted while sleeping.

If not handled:

**Compile-Time Error:**

```
unreported exception java.lang.InterruptedException;
must be caught or declared to be thrown
```

---

### 🔹 Rules of throws

---

**Invalid:**

```java
class Test throws Exception { }
```

**Reason:**<br>
throws is part of method/constructor declaration syntax only.

---

```java
void m1() throws Test;
```

Valid only if Test extends Throwable.

Otherwise:

**Compile-Time Error:**<br>
`Incompatible types`.

---

#### Rule 3: Multiple Exceptions Allowed

```java
void m1() throws IOException, SQLException, ClassNotFoundException
```

Allowed.

---

#### Rule 4: Order Does NOT Matter

Unlike catch blocks, order in throws clause does not matter.

**Reason:**<br>
No matching logic is involved in throws declaration.

---

#### Rule 5: Parent & Child Together (Redundant but Valid)

```java
throws Exception, IOException
```

Valid but redundant.

**Reason:**<br>
IOException is subclass of Exception.

---

#### Rule 6: Duplicate Not Allowed

```java
throws IOException, IOException
```

Compile-Time Error.

**Reason:**<br>
Duplicate types not allowed.

---

#### Rule 7: Overriding Rule (Important – Related to Polymorphism)

Parent:

```java
void m1() throws IOException { }
```

Invalid Child:

```java
void m1() throws Exception { }
```

**Compile-Time Error.**

**Reason:**<br>
A child class method cannot throw a broader checked exception than the parent class method.

This restriction exists to maintain method contract consistency in polymorphism.

Because of polymorphism:

```java
Parent p = new Child();
p.m1();
```

At compile-time, the compiler checks the method based on the Parent reference.

If the parent method promises that only IOException may occur, the child method cannot widen that promise to Exception.

Otherwise, it would break type safety and violate the substitution principle.

Child class is allowed to:

- Throw the same exception  
- Throw a subclass of the declared exception  
- Throw no exception at all  

Unchecked exceptions (RuntimeException and Error) have no such restriction because they are not checked at compile-time.

---

## 1️⃣7️⃣ Catch Block Compile-Time Rule

If try block has no possibility of fully checked exception:

Writing catch block for that exception results in compile-time error.

**Example:**

```java
try {
    System.out.println("Hello");
} catch (IOException e) { }
```

**Compile-Time Error:**<br>
`exception java.io.IOException is never thrown in body of corresponding try statement`

**Reason:**<br>
Compiler performs static analysis for fully checked exceptions.

Allowed:

```java
catch (Exception e)
```

**Reason:**<br>
Exception is partially checked.

---

## 1️⃣8️⃣ throw vs throws

| Feature          | throw       | throws             |
| ---------------- | ----------- | ------------------ |
| Used in          | Method body | Method declaration |
| Actually throws? | Yes         | No                 |
| Compile-time role| No          | Yes                |
| Multiple allowed | No          | Yes                |
| Stops execution  | Yes         | No                 |

---

## 🔟 Final Integration Model

**Creation Phase:**

* Exception occurs due to technical violation (JVM) or logical rule (Programmer).
* Exception object is created containing Name, Message, and Stack Trace.

**Propagation Phase:**

* Method terminates abnormally.
* Stack unwinding begins (Stack frame removal).
* Object is transferred to the caller.

**Handling Phase:**

* JVM searches for matching catch block in the call stack.
* If found → Handler executes, normal flow continues.
* If NOT found → Default Exception Handler executes, abnormal termination.

---

## 🔥 Final Conclusion of Module 4

1. Exception Propagation is the upward transfer of an exception object.
2. The Runtime Stack is unwound frame-by-frame during propagation.
3. `throw` is used to manually trigger the exception mechanism (Business logic).
4. `throws` is used to delegate responsibility to the caller (Compile-time contract).
5. Only `Throwable` types can be thrown or declared.
6. A statement immediately following `throw` is unreachable.
7. `throw null` triggers a `NullPointerException`.
8. Overriding rules ensure polymorphism consistency.
9. Compiler prevents catching fully checked exceptions that cannot occur.

---
```
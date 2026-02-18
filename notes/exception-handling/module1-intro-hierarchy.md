# MODULE 1: EXCEPTION HANDLING BASICS

---

## 1️⃣ PART 1: INTRODUCTION & RUNTIME STACK

An **Exception** is an **unexpected, unwanted event** that occurs during the **execution of a program** and disturbs the **normal flow of the program**.

**Important Note:**<br>
An exception always occurs at **run-time**, not at compile-time.

---

## 1.1 Simple Real-Life Examples

* Tyre punctured while travelling<br>
* Sleeping while listening to class<br>
* Mobile battery drained unexpectedly

---

## 1.2 Java Examples

* Dividing a number by zero → `ArithmeticException`<br>
* Accessing invalid array index → `ArrayIndexOutOfBoundsException`<br>
* File not found → `FileNotFoundException`<br>
* Accessing object reference as `null` → `NullPointerException`

---

### Important Observation ⭐

* Exception is **NOT** a syntax error<br>
* Program **compiles successfully**<br>
* Problem occurs **while running** the program

---

## 1.3 What is Exception Handling?

**Exception Handling** is a mechanism to handle **runtime abnormal situations** so that the program terminates **gracefully** instead of **abnormally**.

---

## 1.4 Main Objective of Exception Handling

The **main objective** of exception handling is **GRACEFUL TERMINATION** of the program.

---

### What is Graceful Termination?

* Program should not crash suddenly<br>
* Program should continue execution normally or alternatively<br>
* Proper error message should be given to the user

---

### Very Important Point ⭐⭐

* ❌ Exception handling does **NOT** mean fixing or repairing an exception<br>
* ✅ Exception handling means **providing an alternative way** to continue execution

---

### Real-Time Example

**Requirement:**
Read data from a remote file located in London

**Problem:**
At runtime, the London file may not be available:

* **Without Exception Handling** → Program terminates abnormally<br>
* **With Exception Handling** → Use a local file and continue execution

```java
try {
    // Read data from remote file (London)
} catch (FileNotFoundException e) {
    // Use local file and continue program normally
}
```

✔ This alternative execution is called **Exception Handling**.

---

### Conclusion

Exception handling improves:

* Reliability<br>
* User experience<br>
* Program robustness

---

## 1.5 Runtime Stack Mechanism

### What is a Thread?

A **Thread** is a **path of execution** inside a Java program.

---

## 1.6 What is Runtime Stack?

For every thread, JVM creates **one separate Runtime Stack**.

The **Runtime Stack** is a memory area used to:

* Store method calls<br>
* Maintain execution order<br>
* Perform exception handling

---

## 1.7 Stack Frame / Activation Record

Every method call performed by a thread is stored in the Runtime Stack as an entry called:

* **Stack Frame**<br>
* **Activation Record**

Each stack frame contains:

* Method name<br>
* Local variables<br>
* Intermediate results<br>
* Return address

---

### Important Stack Rules ⭐⭐⭐

1. Whenever a method is called, a **new stack frame** is created<br>
2. When a method completes execution, its **stack frame is removed**<br>
3. Stack follows **LIFO (Last In First Out)** order<br>
4. After all method calls complete, the stack becomes **empty**<br>
5. JVM destroys the empty stack **just before terminating the thread**

---

### Example Program

```java
class Test {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {
        doMoreStuff();
    }

    public static void doMoreStuff() {
        System.out.println("Hello");
    }
}
```

---

### Runtime Stack Execution (Step-by-Step)

**Step 1:** JVM creates Runtime Stack for main thread (empty)

```
(empty stack)
```

**Step 2:** `main()` is called → Stack frame created

```
| main() |
```

**Step 3:** `main()` calls `doStuff()`

```
| doStuff() |
| main()    |
```

**Step 4:** `doStuff()` calls `doMoreStuff()`

```
| doMoreStuff() |
| doStuff()     |
| main()        |
```

**Step 5:** `doMoreStuff()` finishes execution (frame removed)

```
| doStuff() |
| main()    |
```

**Step 6:** `doStuff()` finishes execution

```
| main() |
```

**Step 7:** `main()` finishes execution

```
(empty stack)
```

➡️ Empty stack is destroyed by JVM

---

### What JVM Does Behind the Scenes ⭐

1. JVM starts<br>
2. JVM creates one default thread called **main thread**<br>
3. JVM creates a Runtime Stack for the main thread<br>
4. JVM invokes `main()` method

---

### Key Points to Remember ⭐⭐⭐

* Thread → Path of execution<br>
* Runtime Stack → Memory used by that thread<br>
* One Thread → One Runtime Stack<br>
* Multiple Threads → Multiple Runtime Stacks<br>
* Runtime Stack plays a **crucial role** in exception propagation

---

### Relation with Exception Handling

When an exception occurs:

* JVM **unwinds the runtime stack**
* Methods are removed **one by one**
* JVM searches for exception handling code

This process is called **Exception Propagation**.

---

---

## 2️⃣ PART 2: DEFAULT EXCEPTION HANDLING

## 2.1 What is Default Exception Handling?

**Default Exception Handling** is the mechanism provided by the **JVM** to handle exceptions **when the programmer does not handle them explicitly**.

> **Important:** Default exception handling always results in **abnormal termination** of the program.

---

### Who Is Responsible Initially?

The **method in which the exception occurs** is responsible for **creating the exception object**.

---

## 2.2 What Does the Exception Object Contain?

When an exception occurs, the exception object contains:

1. **Name of the exception**<br>
2. **Description of the exception**<br>
3. **Location where the exception occurred**, known as **Stack Trace**

**Stack Trace:**<br>
Represents the sequence of method calls that led to the exception.

---

### Default Exception Handling Flow ⭐⭐⭐

1. An exception occurs inside a method.
2. That method **creates an exception object**.
3. The method **hands over the exception object to the JVM**.
4. JVM checks:

   * Does this method contain exception handling code?
5. If **NO**:<br>
   * JVM **terminates the method abnormally**<br>
   * JVM **removes the corresponding stack frame** from the runtime stack
6. JVM identifies the **caller method** and repeats the same process.
7. This process continues **up to the `main()` method**.
8. If `main()` also does not handle the exception:

   * JVM hands over the responsibility to the **Default Exception Handler**
9. Default Exception Handler:<br>
   * Prints exception information<br>
   * Terminates the program **abnormally**

👉 This process of removing methods from the stack is called **Exception Propagation** or **Stack Unwinding**.

---

## 2.3 Default Exception Output Format

```text
Exception in thread "thread-name" ExceptionName : Description
Stack Trace
```

---

### Example 1: Exception in a Deep Method

```java
class Test {
    public static void main(String[] args) {
        doStuff();
    }

    public static void doStuff() {
        doMoreStuff();
    }

    public static void doMoreStuff() {
        System.out.println(10 / 0);
    }
}
```

#### Runtime Stack at the Time of Exception

```text
| doMoreStuff() |
| doStuff()     |
| main()        |
```

#### Output

```text
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Test.doMoreStuff()
    at Test.doStuff()
    at Test.main()
```

👉 JVM terminates methods **one by one** and prints the **complete stack trace**.

---

### Example 2: Exception in `main()` Method

```java
class Test {
    public static void main(String[] args) {
        doStuff();
        System.out.println(10 / 0);
    }

    public static void doStuff() {
        doMoreStuff();
        System.out.println("Hi");
    }

    public static void doMoreStuff() {
        System.out.println("Hello");
    }
}
```

#### Output

```text
Hello
Hi
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Test.main()
```

👉 Since the exception occurred directly in `main()`, **only the `main()` stack frame** is involved.

---

### Important Program Termination Rule ⭐⭐

* If **at least one method** terminates abnormally → **Program termination is abnormal**<br>
* If **all methods** terminate normally → **Program termination is normal**

---

### Key Points to Remember

* Default exception handler is a **part of JVM**<br>
* Default handling **always causes abnormal termination**<br>
* Stack trace shows **method call history**<br>
* Default handling is used **only when programmer does not handle the exception**

---

---

## 3️⃣ PART 3: EXCEPTION HIERARCHY & TYPES

### Root of Java Exception Hierarchy

* `java.lang.Object` is the **root class of all Java classes**.
* `java.lang.Throwable` is the **root class for all exceptions and errors**.

**Important Point ⭐⭐⭐**
Only classes which extend `Throwable` can be:

* thrown explicitly using `throw`<br>
* caught explicitly using `catch`

Hence, `Throwable` is the **root of Java exception handling mechanism**.

---

### Throwable Class

The `Throwable` class has **two direct child classes**:

1. `Exception`
2. `Error`

```
java.lang.Object
 └── java.lang.Throwable
     ├── Exception
     └── Error
```

---

### Important Methods of Throwable ⭐⭐

The `Throwable` class defines important methods such as:

* `getMessage()`<br>
* `printStackTrace()`<br>
* `toString()`

These methods are used to **retrieve and display exception information**.

**Important Point ⭐⭐⭐**

`printStackTrace()` prints exception information based on the **Runtime Stack**.<br>
Hence, the order of methods displayed in the stack trace represents the **sequence of method calls** stored in the runtime stack.

---

## 3.1 Exception Class

### Definition

An **Exception** represents **application-level abnormal conditions** caused due to:

* Programmer mistakes<br>
* Invalid input<br>
* Missing resources

---

## 3.1.1 Characteristics of Exception

* Caused by application logic<br>
* Mostly **recoverable**<br>
* Program can continue execution using exception handling<br>
* Should be handled by the programmer

---

## 3.1.2 Categories of Exception

The `Exception` class has **two major categories**:

```
Exception
├── Checked Exceptions
└── Unchecked Exceptions (RuntimeException)
```

---

## 3.1.3 RuntimeException

`RuntimeException` represents **programming mistakes**.

**Examples:**

* Dividing a number by zero<br>
* Accessing an array with invalid index<br>
* Using a `null` reference

These problems should be **corrected in code**, not handled using `try-catch`.

Hence, `RuntimeException` and its child classes are **unchecked exceptions**.

---

### Real-Time Example
**Requirement:**
Read data from a remote file located in London

**Problem:**
At runtime, file is not available → `FileNotFoundException`

```java
try {
    // Read data from remote file
} catch (FileNotFoundException e) {
    // Use local file and continue program normally
}
```

✔ This recovery proves that **Exception is recoverable**.

---

## 3.1.5 Examples of Exception

* `FileNotFoundException`<br>
* `IOException`<br>
* `SQLException`<br>
* `ClassNotFoundException`

---

## 3.1.6 Handling Exceptions

Exceptions should be handled using:

* `try-catch`<br>
* `throws`

---

## 3.2 Error Class

### Definition

An **Error** represents **serious system-level or JVM-level problems** that occur due to **lack of system resources** and are **not recoverable**.

---

## 3.2.2 Characteristics of Error

* Not caused by programmer mistakes<br>
* Caused due to lack of system resources<br>
* JVM may become unstable<br>
* Program cannot continue safely<br>
* Not intended to be handled by application code

---

## 3.2.3 Examples of Error

* `OutOfMemoryError`
* `StackOverflowError`
* `VirtualMachineError`
* `NoClassDefFoundError`

---

### Important Point ⭐

❌ Programmer **cannot recover** from Errors  
✔ System / Server administrator responsibility (e.g., increase heap memory)

---

### Can We Catch Error?

**Important Rule ⭐**

* Catching `Error` is **syntactically possible**
* Handling `Error` is **strongly discouraged**

**Reason:**
Errors indicate **serious JVM failures** and recovery is **not guaranteed**.
Hence, catching Error is meant only for logging or shutdown, not for recovery.

---

## 3.2.4 Exception vs Error

| Aspect       | Exception                 | Error                      |
| ------------ | ------------------------- | -------------------------- |
| Nature       | Application-level problem | System / JVM-level problem |
| Cause        | Programmer mistakes       | Resource exhaustion        |
| Recoverable  | Yes                       | No                         |
| Handling     | Should be handled         | Should not be handled      |
| Control Flow | Can continue              | Cannot continue safely     |

---

## 3.3. Complete Throwable Hierarchy (Reference)

```
java.lang.Object
 └── java.lang.Throwable                         (Partially Checked)
     ├── java.lang.Exception                     (Partially Checked)
     │   ├── java.lang.RuntimeException          (Unchecked)
     │   │   ├── ArithmeticException
     │   │   ├── NullPointerException
     │   │   ├── ClassCastException
     │   │   ├── IndexOutOfBoundsException
     │   │   │   ├── ArrayIndexOutOfBoundsException
     │   │   │   └── StringIndexOutOfBoundsException
     │   │   ├── IllegalArgumentException
     │   │   │   └── NumberFormatException
     │   │   ├── IllegalStateException
     │   │   ├── SecurityException
     │   │   ├── UnsupportedOperationException
     │   │   └── ConcurrentModificationException
     │   │
     │   ├── IOException                         (Checked – Fully)
     │   │   ├── FileNotFoundException
     │   │   ├── EOFException
     │   │   ├── InterruptedIOException
     │   │   ├── SocketException
     │   │   │   └── ConnectException
     │   │   └── UnknownHostException
     │   │
     │   ├── SQLException
     │   ├── ClassNotFoundException
     │   ├── CloneNotSupportedException
     │   ├── InstantiationException
     │   ├── IllegalAccessException
     │   ├── NoSuchMethodException
     │   ├── NoSuchFieldException
     │   ├── ParseException
     │   ├── TimeoutException
     │   ├── InterruptedException
     │   ├── RemoteException
     │   ├── ServletException
     │   └── InvocationTargetException
     │
     └── java.lang.Error                         (Unchecked)
         ├── VirtualMachineError
         │   ├── OutOfMemoryError
         │   └── StackOverflowError
         ├── AssertionError
         ├── ExceptionInInitializerError
         ├── NoClassDefFoundError
         ├── LinkageError
         │   ├── ClassFormatError
         │   ├── UnsupportedClassVersionError
         │   └── UnsatisfiedLinkError
         └── InternalError
```

---

### Checked vs Unchecked Exceptions

## 3.4.1 Checked Exceptions

### Definition

A **Checked Exception** is an exception whose **possibility is checked by the compiler** to ensure **safer execution at runtime**.

---

### Rules for Checked Exceptions ⭐⭐⭐

1. If there is a possibility of a checked exception occurring inside a method, then the method **must handle it**.<br>
2. Handling can be done using:
   * `try-catch`<br>
   * `throws`<br>
3. If a checked exception is **neither handled nor declared**, the compiler gives a **compile-time error**.<br>

---

### Compiler Rule ⭐⭐⭐

If there is a possibility of a checked exception occurring inside a method,
then the method must either:

* handle the exception using `try-catch`
* OR declare the exception using `throws`

Otherwise, the compiler gives a **compile-time error**.

---

### Examples of Checked Exceptions

* `IOException`<br>
* `FileNotFoundException`<br>
* `SQLException`<br>
* `InterruptedException`<br>
* `ClassNotFoundException`

---

### Why Compiler Checks Checked Exceptions?

The compiler checks checked exceptions because:

* They are **recoverable**<br>
* They occur due to **external factors** (file system, network, database, etc.)<br>
* They are **not programmer mistakes**<br>

---

## 3.4.2 Unchecked Exceptions

### Definition

An **Unchecked Exception** is an exception that is **NOT checked by the compiler** whether the programmer is handling it or not.

---

### Which Exceptions Are Unchecked?

The following are **unchecked exceptions**:

1. `RuntimeException` and its child classes<br>
2. `Error` and its child classes<br>

---

### Examples of Unchecked Exceptions

* `ArithmeticException`<br>
* `NullPointerException`<br>
* `ArrayIndexOutOfBoundsException`<br>
* `ClassCastException`<br>
* `OutOfMemoryError`<br>

---

### Why Compiler Does NOT Check Unchecked Exceptions?

The compiler does not check unchecked exceptions because:

* They represent **programming mistakes**<br>
* Handling them does **not fix the root cause**<br>
* Correcting the code is better than handling the exception<br>

---

## 3.4.3 Runtime vs Compile-Time

### Important Truth

* **All exceptions occur only at runtime**
* There is **NO exception** that occurs at compile-time

### Role of Compiler

* Compiler **never throws exceptions**<br>
* Compiler only **checks the possibility** of checked exceptions<br>
* Compiler enforces **handling rules** for checked exceptions<br>

---

### Important Note ⭐

Occurrence of an exception is always at **runtime**, but
handling rules are checked at **compile-time** for checked exceptions.

---

## 3.4.4 Fully Checked vs Partially Checked Exceptions

### Fully Checked Exception

A checked exception is said to be **fully checked** if **ALL its child classes are checked exceptions**.

#### Examples

* `IOException`
* `InterruptedException`

---

### Partially Checked Exception

A checked exception is said to be **partially checked** if **at least one of its child classes is unchecked**.

#### Only Two Partially Checked Exceptions in Java ⭐⭐⭐

1. `Exception`<br>
2. `Throwable`<br>

---

### Why Exception Is Partially Checked?

Because:

* `Exception` has `RuntimeException` as a child class
* `RuntimeException` is **unchecked**

---

### Why Throwable Is Partially Checked?

Because:

* `Throwable` has `Error` as a child class
* `Error` is **unchecked**

---

## 4.4.5 Summary Table

| Exception Type        | Category                    |
| --------------------- | --------------------------- |
| IOException           | Checked (Fully Checked)     |
| RuntimeException      | Unchecked                   |
| InterruptedException  | Checked (Fully Checked)     |
| Error                 | Unchecked                   |
| Throwable             | Checked (Partially Checked) |
| ArithmeticException   | Unchecked                   |
| NullPointerException  | Unchecked                   |
| Exception             | Checked (Partially Checked) |
| FileNotFoundException | Checked (Fully Checked)     |

---

## 🔟 Final Integration Model

**Execution Flow:**

* Exception occurs at runtime inside a method.
* JVM creates an exception object (Name, Message, Stack Trace).
* Stack unwinding begins if no local handler is found.
* Default Exception Handler executes if propagation reaches `main()` without a match.

**Key Rule:**

* **Checked Exceptions:** compiler-enforced handling (Recoverable).<br>
* **Unchecked Exceptions:** programming errors (Non-recoverable).

---

## 🔥 Final Conclusion of Module 1

1. Exceptions are runtime unwanted events that disrupt program flow.
2. Exception Handling is about **graceful termination**, not fixing logic.
3. Every thread has its own **Runtime Stack**.
4. The **Throwable** class is the root of the exception hierarchy.
5. Errors (System-level) vs Exceptions (Application-level).
6. Checked exceptions represent external, recoverable conditions.
7. Unchecked exceptions are mostly caused by programmer mistakes.

---

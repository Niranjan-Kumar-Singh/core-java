# Core Java – Conceptwise Learning Repository ☕🚀

This repository contains **well-structured Core Java programs and notes**, written while learning Java **deeply and concept-by-concept**.

The goal of this repository is:

* To build **strong Java fundamentals**
* To keep **clean, readable, interview-ready code**
* To maintain **clear notes alongside executable programs**

---

## 📁 Project Structure

```text
core-java/
├── 📁 src/
│   └── 📁 com/corejava/exceptionhandling/
│       ├── 📁 module1_basics/
│       │   ├── 📄 ... (9 files)
│       │   └── 📄 StackOverflowErrorDemo.java
│       ├── 📁 module2_trycatch/
│       │   ├── 📄 ... (9 files)
│       │   └── 📄 DuplicateCatchCompileErrorDemo.java
│       └── 📁 module3_finally/
│           ├── 📄 FinallyBasicDemo.java
│           ├── 📄 FinallyWithExceptionHandledDemo.java
│           ├── 📄 FinallyWithExceptionNotHandledDemo.java
│           ├── 📄 FinallyWithReturnDemo.java
│           ├── 📄 FinallyOverridesReturnDemo.java
│           ├── 📄 FinallyNotExecutedCaseDemo.java
│           ├── 📄 FinalVsFinallyVsFinalizeDemo.java
│           └── 📄 NestedTryCatchFinallyDemo.java
├── 📁 notes/
│   └── 📁 exception-handling/
│       ├── 📝 module1-basics.md
│       ├── 📝 module2-trycatch.md
│       ├── 📝 module3-finally.md
│       └── 📝 README.md
└── 📝 README.md (Root)
```

---

## 📘 Covered Topics

### 🔹 Exception Handling – Module 1 (Completed)
**Concepts covered:**
* What is an Exception?
* Runtime Stack Mechanism
* Default Exception Handling
* Exception Propagation
* Exception Hierarchy
* Checked vs Unchecked Exceptions
* Fully Checked vs Partially Checked Exceptions
* Throwable methods (`getMessage()`, `printStackTrace()`)
* Stack trace order
* Error vs Exception

📄 **Notes:** [module1-basics.md](module1-basics.md)

### 🔹 Exception Handling – Module 2 (Completed)
**Concepts covered:**
* Customized Exception Handling using Try–Catch
* Why Java introduced Try–Catch?
* Risky Code & Handling Logic
* Control Flow in Try–Catch (Cases 1–4)
* Methods to print exception information (`printStackTrace()`, `toString()`, `getMessage()`)
* Try with Multiple Catch Blocks
* Catch Order Rule (Child first, Parent last)

📄 **Notes:** [module2-trycatch.md](module2-trycatch.md)
 
 ### 🔹 Exception Handling – Module 3 (Completed)
 **Concepts covered:**
 * finally block definition and importance
 * Execution guarantee of finally
 * finally vs return statement (Interview cases)
 * Rare cases where finally does not execute
 * Difference between final, finally, and finalize()
 * Control Flow in try–catch–finally
 * Nested try–catch–finally
 * All possible combinations of try–catch–finally
 * Curly brace rules
 
 📄 **Notes:** [module3-finally.md](module3-finally.md)

---

## 💻 Programs

### 🔹 Module 1: Exception Handling Basics
**Location:** `src/com/corejava/exceptionhandling/module1_basics`

| Class Name | Description |
| :--- | :--- |
| [`ExceptionIntroDemo`](../../src/com/corejava/exceptionhandling/module1_basics/ExceptionIntroDemo.java) | Demonstrates that exceptions are runtime errors, not syntax errors. |
| [`RuntimeStackDemo`](../../src/com/corejava/exceptionhandling/module1_basics/RuntimeStackDemo.java) | Demonstrates the Runtime Stack mechanism and LIFO order. |
| [`DefaultExceptionHandlingDemo`](../../src/com/corejava/exceptionhandling/module1_basics/DefaultExceptionHandlingDemo.java) | Demonstrates how the JVM handles exceptions when no try-catch is used. |
| [`ExceptionInMainDemo`](../../src/com/corejava/exceptionhandling/module1_basics/ExceptionInMainDemo.java) | Shows the behavior when an exception occurs directly inside the `main()` method. |
| [`ExceptionHierarchyDemo`](../../src/com/corejava/exceptionhandling/module1_basics/ExceptionHierarchyDemo.java) | Demonstrates the exception hierarchy and parental reference capability. |
| [`CheckedVsUncheckedDemo`](../../src/com/corejava/exceptionhandling/module1_basics/CheckedVsUncheckedDemo.java) | Differentiates between Checked and Unchecked exceptions. |
| [`ThrowableMethodsDemo`](../../src/com/corejava/exceptionhandling/module1_basics/ThrowableMethodsDemo.java) | Demonstrates methods of `Throwable` class: `getMessage()`, `toString()`, `printStackTrace()`. |
| [`StackTraceOrderDemo`](../../src/com/corejava/exceptionhandling/module1_basics/StackTraceOrderDemo.java) | Shows how the stack trace order reflects the method call stack. |
| [`StackOverflowErrorDemo`](../../src/com/corejava/exceptionhandling/module1_basics/StackOverflowErrorDemo.java) | Demonstrates `StackOverflowError` due to infinite recursion. |

### 🔹 Module 2: Try-Catch Handling
**Location:** `src/com/corejava/exceptionhandling/module2_trycatch`

| Class Name | Description |
| :--- | :--- |
| [`TryCatchIntroDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/TryCatchIntroDemo.java) | Basic demonstration of try-catch block for exception handling. |
| [`TryCatchWithoutHandlingDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/TryCatchWithoutHandlingDemo.java) | Shows abnormal termination when an exception is not handled. |
| [`TryCatchWithHandlingDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/TryCatchWithHandlingDemo.java) | Shows graceful termination when an exception is handled via try-catch. |
| [`TryCatchControlFlowDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/TryCatchControlFlowDemo.java) | Demonstrates the control flow in try-catch with different scenarios. |
| [`RiskyCodeScopeDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/RiskyCodeScopeDemo.java) | Explains what constitutes risky code and proper try-block scoping. |
| [`ThrowableMethodsDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/ThrowableMethodsDemo.java) | Detailed use of `printStackTrace()`, `toString()`, and `getMessage()`. |
| [`MultipleCatchDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/MultipleCatchDemo.java) | Demonstrates handling different exceptions with separate catch blocks. |
| [`CatchOrderRuleDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/CatchOrderRuleDemo.java) | Shows the importance of catch block order (Child first, Parent last). |
| [`DuplicateCatchCompileErrorDemo`](../../src/com/corejava/exceptionhandling/module2_trycatch/DuplicateCatchCompileErrorDemo.java) | Demonstrates compile-time error when same exception is caught twice. |
 
 ### 🔹 Module 3: finally & Control Flow
 **Location:** `src/com/corejava/exceptionhandling/module3_finally`
 
 | Class Name | Description |
 | :--- | :--- |
 | [`FinallyBasicDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinallyBasicDemo.java) | Demonstrates the basic syntax and execution of the `finally` block. |
 | [`FinallyWithExceptionHandledDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinallyWithExceptionHandledDemo.java) | Shows `finally` execution when an exception is caught and handled. |
 | [`FinallyWithExceptionNotHandledDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinallyWithExceptionNotHandledDemo.java) | Shows `finally` execution even when an exception is NOT handled. |
 | [`FinallyWithReturnDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinallyWithReturnDemo.java) | Demonstrates that `finally` executes even if there is a `return` statement in try/catch. |
 | [`FinallyOverridesReturnDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinallyOverridesReturnDemo.java) | Shows how a `return` in `finally` overrides `return` values from try/catch. |
 | [`FinallyNotExecutedCaseDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinallyNotExecutedCaseDemo.java) | Demonstrates rare cases (like `System.exit(0)`) where `finally` does not execute. |
 | [`FinalVsFinallyVsFinalizeDemo`](../../src/com/corejava/exceptionhandling/module3_finally/FinalVsFinallyVsFinalizeDemo.java) | Differentiates between `final`, `finally`, and `finalize()`. |
 | [`NestedTryCatchFinallyDemo`](../../src/com/corejava/exceptionhandling/module3_finally/NestedTryCatchFinallyDemo.java) | Demonstrates the control flow in nested try-catch-finally blocks. |

---

## 🎯 Learning Style

* One **concept → one demo class**
* Heavy use of **comments for clarity**
* **Durga Sir–style explanations**
* Notes written in **Markdown** for easy GitHub preview

---

## 🛠 Tools Used

* Java SE 17
* Eclipse IDE
* Git & GitHub
* Markdown for documentation

---

## 📌 Author

**Niranjan Kumar Singh**
Learning Core Java with focus on **clarity, depth, and correctness**.

---

⭐ If you find this repository helpful, feel free to star it!

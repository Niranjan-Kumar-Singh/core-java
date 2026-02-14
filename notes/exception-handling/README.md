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
│       ├── 📁 module1_intro_hierarchy/
│       │   ├── 📄 ... (9 files)
│       │   └── 📄 StackOverflowErrorDemo.java
│       ├── 📁 module2_try_catch_usage/
│       │   ├── 📄 ... (9 files)
│       │   └── 📄 DuplicateCatchCompileErrorDemo.java
│       ├── 📁 module3_finally_combinations/
│       │   └── 📄 ... (8 files)
│       ├── 📁 module4_throw_throws_propagation/
│       │   └── 📄 ... (10 files)
│       ├── 📁 module5_rules_custom/
│       │   └── 📄 ... (11 files)
│       └── 📁 module6_common_exceptions/
│           ├── 📄 ... (16 files)
│           └── 📄 DefensiveCodingBestPracticeDemo.java
├── 📁 notes/
│   └── 📁 exception-handling/
│       ├── 📝 module1-intro-hierarchy.md
│       ├── 📝 module2-try-catch-usage.md
│       ├── 📝 module3-finally-combinations.md
│       ├── 📝 module4-throw-throws-propagation.md
│       ├── 📝 module5-rules-custom.md
│       ├── 📝 module6-common-exceptions.md
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

📄 **Notes:** [module1-intro-hierarchy.md](module1-intro-hierarchy.md)

### 🔹 Exception Handling – Module 2 (Completed)
**Concepts covered:**
* Customized Exception Handling using Try–Catch
* Why Java introduced Try–Catch?
* Risky Code & Handling Logic
* Control Flow in Try–Catch (Cases 1–4)
* Methods to print exception information (`printStackTrace()`, `toString()`, `getMessage()`)
* Try with Multiple Catch Blocks
* Catch Order Rule (Child first, Parent last)

📄 **Notes:** [module2-try-catch-usage.md](module2-try-catch-usage.md)
 
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
 
 📄 **Notes:** [module3-finally-combinations.md](module3-finally-combinations.md)

 ### 🔹 Exception Handling – Module 4 (Completed)
 **Concepts covered:**
 * Exception Propagation (Stack Unwinding Mechanism)
 * Who creates the Exception Object? (JVM vs Programmer)
 * What does an Exception Object contain?
 * throw keyword (Purpose, Rules, and unreachable statement)
 * throw null vs throw exception
 * throws keyword (Delegation, satisfy compiler)
 * throws Rules (Methods/Constructors only, Multiple exceptions)
 * Overriding Rule with throws (Child class broader exception rule)
 * Catch block compile-time rule for fully checked exceptions
 * throw vs throws comparison
 
 📄 **Notes:** [module4-throw-throws-propagation.md](module4-throw-throws-propagation.md)

 ### 🔹 Exception Handling – Module 5 (Completed)
 **Concepts covered:**
 * Compile-Time Rules in Exception Handling
 * Why Java enforces Checked Exceptions
 * Unreported Checked Exception rule
 * Unreachable catch blocks (Hierarchy order)
 * Catching fully checked exceptions rule
 * Duplicate catch blocks rule
 * Overriding checked exception rules (Polymorphism)
 * Invalid `throws` usage
 * Custom (User-Defined) Exceptions (Checked vs Unchecked)
 * Proper Constructor Design for Custom Exceptions
 * Real-world layered example (Banking)
 
 📄 **Notes:** [module5-rules-custom.md](module5-rules-custom.md)

 ### 🔹 Exception Handling – Module 6 (Completed)
 **Concepts covered:**
 * Understanding JVM-Generated vs Programmatic Exceptions
 * Top 11 Common & Real-World Exceptions
 * `NullPointerException`, `ArrayIndexOutOfBoundsException`, `ClassCastException`
 * `StackOverflowError`, `OutOfMemoryError` (Stack vs Heap memory)
 * `NoClassDefFoundError` vs `ClassNotFoundException`
 * `ExceptionInInitializerError` (Static initialization failures)
 * `IllegalArgumentException`, `NumberFormatException`
 * `IllegalThreadStateException` (Thread lifecycle violations)
 * `AssertionError`
 * Production Debugging & Defensive Coding Strategies
 
 📄 **Notes:** [module6-common-exceptions.md](module6-common-exceptions.md)

---

## 💻 Programs

### 🔹 Module 1: Exception Handling Basics
**Location:** `src/com/corejava/exceptionhandling/module1_intro_hierarchy`

| Class Name | Description |
| :--- | :--- |
| [`ExceptionIntroDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/ExceptionIntroDemo.java) | Demonstrates that exceptions are runtime errors, not syntax errors. |
| [`RuntimeStackDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/RuntimeStackDemo.java) | Demonstrates the Runtime Stack mechanism and LIFO order. |
| [`DefaultExceptionHandlingDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/DefaultExceptionHandlingDemo.java) | Demonstrates how the JVM handles exceptions when no try-catch is used. |
| [`ExceptionInMainDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/ExceptionInMainDemo.java) | Shows the behavior when an exception occurs directly inside the `main()` method. |
| [`ExceptionHierarchyDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/ExceptionHierarchyDemo.java) | Demonstrates the exception hierarchy and parental reference capability. |
| [`CheckedVsUncheckedDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/CheckedVsUncheckedDemo.java) | Differentiates between Checked and Unchecked exceptions. |
| [`ThrowableMethodsDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/ThrowableMethodsDemo.java) | Demonstrates methods of `Throwable` class: `getMessage()`, `toString()`, `printStackTrace()`. |
| [`StackTraceOrderDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/StackTraceOrderDemo.java) | Shows how the stack trace order reflects the method call stack. |
| [`StackOverflowErrorDemo`](../../src/com/corejava/exceptionhandling/module1_intro_hierarchy/StackOverflowErrorDemo.java) | Demonstrates `StackOverflowError` due to infinite recursion. |

### 🔹 Module 2: Try-Catch Handling
**Location:** `src/com/corejava/exceptionhandling/module2_try_catch_usage`

| Class Name | Description |
| :--- | :--- |
| [`TryCatchIntroDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/TryCatchIntroDemo.java) | Basic demonstration of try-catch block for exception handling. |
| [`TryCatchWithoutHandlingDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/TryCatchWithoutHandlingDemo.java) | Shows abnormal termination when an exception is not handled. |
| [`TryCatchWithHandlingDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/TryCatchWithHandlingDemo.java) | Shows graceful termination when an exception is handled via try-catch. |
| [`TryCatchControlFlowDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/TryCatchControlFlowDemo.java) | Demonstrates the control flow in try-catch with different scenarios. |
| [`RiskyCodeScopeDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/RiskyCodeScopeDemo.java) | Explains what constitutes risky code and proper try-block scoping. |
| [`ThrowableMethodsDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/ThrowableMethodsDemo.java) | Detailed use of `printStackTrace()`, `toString()`, and `getMessage()`. |
| [`MultipleCatchDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/MultipleCatchDemo.java) | Demonstrates handling different exceptions with separate catch blocks. |
| [`CatchOrderRuleDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/CatchOrderRuleDemo.java) | Shows the importance of catch block order (Child first, Parent last). |
| [`DuplicateCatchCompileErrorDemo`](../../src/com/corejava/exceptionhandling/module2_try_catch_usage/DuplicateCatchCompileErrorDemo.java) | Demonstrates compile-time error when same exception is caught twice. |
 
 ### 🔹 Module 3: finally & Control Flow
 **Location:** `src/com/corejava/exceptionhandling/module3_finally_combinations`
 
 | Class Name | Description |
 | :--- | :--- |
 | [`FinallyBasicDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinallyBasicDemo.java) | Demonstrates the basic syntax and execution of the `finally` block. |
 | [`FinallyWithExceptionHandledDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinallyWithExceptionHandledDemo.java) | Shows `finally` execution when an exception is caught and handled. |
 | [`FinallyWithExceptionNotHandledDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinallyWithExceptionNotHandledDemo.java) | Shows `finally` execution even when an exception is NOT handled. |
 | [`FinallyWithReturnDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinallyWithReturnDemo.java) | Demonstrates that `finally` executes even if there is a `return` statement in try/catch. |
 | [`FinallyOverridesReturnDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinallyOverridesReturnDemo.java) | Shows how a `return` in `finally` overrides `return` values from try/catch. |
 | [`FinallyNotExecutedCaseDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinallyNotExecutedCaseDemo.java) | Demonstrates rare cases (like `System.exit(0)`) where `finally` does not execute. |
 | [`FinalVsFinallyVsFinalizeDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/FinalVsFinallyVsFinalizeDemo.java) | Differentiates between `final`, `finally`, and `finalize()`. |
 | [`NestedTryCatchFinallyDemo`](../../src/com/corejava/exceptionhandling/module3_finally_combinations/NestedTryCatchFinallyDemo.java) | Demonstrates the control flow in nested try-catch-finally blocks. |

 ### 🔹 Module 4: Exception Propagation & Keywords
 **Location:** `src/com/corejava/exceptionhandling/module4_throw_throws_propagation`
 
 | Class Name | Description |
 | :--- | :--- |
 | [`ExceptionPropagationDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ExceptionPropagationDemo.java) | Demonstrates the stack unwinding mechanism and exception propagation. |
 | [`ThrowKeywordBasicDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ThrowKeywordBasicDemo.java) | Basic usage of the `throw` keyword to manually trigger an exception. |
 | [`ThrowNullDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ThrowNullDemo.java) | Shows that `throw null` results in a `NullPointerException`. |
 | [`ThrowCheckedExceptionDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ThrowCheckedExceptionDemo.java) | Demonstrates the requirement to catch or declare checked exceptions when using `throw`. |
 | [`ThrowsKeywordBasicDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ThrowsKeywordBasicDemo.java) | Basic usage of the `throws` keyword for exception delegation. |
 | [`MultipleThrowsDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/MultipleThrowsDemo.java) | Shows how to declare multiple exceptions in the `throws` clause. |
 | [`ThrowsOrderDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ThrowsOrderDemo.java) | Shows that the order of exceptions in the `throws` clause does not matter. |
 | [`ThrowsOnlyThrowableDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ThrowsOnlyThrowableDemo.java) | Demonstrates that only `Throwable` types can be used with `throws`. |
 | [`ParentChildThrowsRuleDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/ParentChildThrowsRuleDemo.java) | Demonstrates the rules for overriding methods that throw exceptions. |
 | [`CatchFullyCheckedRuleDemo`](../../src/com/corejava/exceptionhandling/module4_throw_throws_propagation/CatchFullyCheckedRuleDemo.java) | Demonstrates the compile-time error when catching a fully checked exception that is never thrown. |

 ### 🔹 Module 5: Compile-Time Rules & Custom Exceptions
 **Location:** `src/com/corejava/exceptionhandling/module5_rules_custom`
 
 | Class Name | Description |
 | :--- | :--- |
 | [`CustomCheckedExceptionDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/CustomCheckedExceptionDemo.java) | Demonstrates how to create and use a custom Checked Exception. |
 | [`CustomUncheckedExceptionDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/CustomUncheckedExceptionDemo.java) | Demonstrates how to create and use a custom Unchecked Exception. |
 | [`CustomExceptionConstructorsDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/CustomExceptionConstructorsDemo.java) | Shows best practice constructor design for custom exceptions. |
 | [`CheckedExceptionCompileErrorDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/CheckedExceptionCompileErrorDemo.java) | Shows the "unreported exception" compile-time error. |
 | [`UnreachableCatchOrderDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/UnreachableCatchOrderDemo.java) | Demonstrates errors caused by catching parent exceptions before children. |
 | [`FullyCheckedCatchRuleDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/FullyCheckedCatchRuleDemo.java) | Shows the rule about catching fully checked exceptions without possibility. |
 | [`DuplicateCatchCompileErrorDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/DuplicateCatchCompileErrorDemo.java) | Shows the error when catching the same exception type twice. |
 | [`OverridingCheckedExceptionRuleDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/OverridingCheckedExceptionRuleDemo.java) | Demonstrates rules for overriding methods that throw checked exceptions. |
 | [`InvalidThrowsUsageDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/InvalidThrowsUsageDemo.java) | Shows syntax errors and rule violations for the `throws` keyword. |
 | [`BankingLayeredExampleDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/BankingLayeredExampleDemo.java) | A real-world example of using custom exceptions in a banking domain. |
 | [`ExceptionChainingDemo`](../../src/com/corejava/exceptionhandling/module5_rules_custom/ExceptionChainingDemo.java) | Shows how to wrap and chain exceptions while preserving the root cause. |
 
 ### 🔹 Module 6: Common & Real-World Exceptions
 **Location:** `src/com/corejava/exceptionhandling/module6_common_exceptions`
 
 | Class Name | Description |
 | :--- | :--- |
 | [`NullPointerExceptionDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/NullPointerExceptionDemo.java) | Demonstrates `NullPointerException` when accessing a method on a `null` reference. |
 | [`ArrayIndexOutOfBoundsDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/ArrayIndexOutOfBoundsDemo.java) | Demonstrates `ArrayIndexOutOfBoundsException` when accessing invalid indices. |
 | [`ClassCastExceptionDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/ClassCastExceptionDemo.java) | Shows `ClassCastException` during invalid type casting between incompatible classes. |
 | [`StackOverflowErrorDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/StackOverflowErrorDemo.java) | Demonstrates `StackOverflowError` caused by deep or infinite recursion. |
 | [`OutOfMemoryErrorDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/OutOfMemoryErrorDemo.java) | Demonstrates `OutOfMemoryError` when the JVM exceeds its available heap memory. |
 | [`ExceptionInInitializerErrorDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/ExceptionInInitializerErrorDemo.java) | Shows `ExceptionInInitializerError` occurring during static block initialization. |
 | [`IllegalArgumentExceptionDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/IllegalArgumentExceptionDemo.java) | Demonstrates `IllegalArgumentException` for invalid method arguments. |
 | [`NumberFormatExceptionDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/NumberFormatExceptionDemo.java) | Shows `NumberFormatException` during invalid string-to-number conversion. |
 | [`IllegalThreadStateExceptionDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/IllegalThreadStateExceptionDemo.java) | Demonstrates violations in the thread lifecycle (e.g., starting a thread twice). |
 | [`AssertionErrorDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/AssertionErrorDemo.java) | Demonstrates `AssertionError` when an `assert` statement fails. |
 | [`ExceptionFlowLifecycleDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/ExceptionFlowLifecycleDemo.java) | Detailed visualization of the exception object lifecycle from creation to handler. |
 | [`StackTraceAnalysisDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/StackTraceAnalysisDemo.java) | Deep dive into stack trace analysis and debugging strategies. |
 | [`SafeCastingDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/SafeCastingDemo.java) | Best practices for defensive coding using `instanceof` to prevent `ClassCastException`. |
 | [`DefensiveNullHandlingDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/DefensiveNullHandlingDemo.java) | Strategies for preventing `NullPointerException` through defensive checks. |
 | [`FailureClassificationDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/FailureClassificationDemo.java) | Classifying failures and choosing between checked vs. unchecked exceptions in production. |
 | [`DefensiveCodingBestPracticeDemo`](../../src/com/corejava/exceptionhandling/module6_common_exceptions/DefensiveCodingBestPracticeDemo.java) | Comprehensive examples of defensive coding strategies and production debugging. |

---

## 🎯 Learning Style

* One **concept → one demo class**
* Heavy use of **comments for clarity**
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
📸 **Instagram**: [`niranjan._23`](https://www.instagram.com/niranjan._23)  
Learning Core Java with focus on **clarity, depth, and correctness**.

---

⭐ If you find this repository helpful, feel free to star it!

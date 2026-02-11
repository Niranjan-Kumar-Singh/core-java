# 📘 Module 3: finally & Control Flow

---

# 9️⃣ finally Block

## 🔹 Definition

The **finally block** is a block associated with a `try` statement that is used to execute **cleanup code**, and it is executed whether an exception occurs or not.

In simple words:

> finally guarantees execution of important code after try/catch, regardless of exceptions.

---

## 🔹 Why finally Is Needed

In real-world applications, we often:

* Open files
* Open database connections
* Allocate memory
* Use Scanner
* Open network connections

These resources must be closed properly to prevent:

* Memory leaks
* Resource leaks
* Performance issues
* Application crashes

The finally block ensures that cleanup happens.

> 🔎 **Modern Best Practice:** In Java 7 and above, *try-with-resources* is preferred over finally for automatic resource management. It reduces boilerplate code and safely closes resources without explicitly writing cleanup logic inside finally.

---

## 🔹 Basic Syntax

```java
try {
    // Risky code
} catch (Exception e) {
    // Handling code
} finally {
    // Cleanup code
}
```

---

## 🔹 Execution Guarantee of finally

The finally block executes in all of these situations:

| Situation                        | Does finally execute? |
| -------------------------------- | --------------------- |
| No exception                     | ✅ Yes                 |
| Exception occurs and handled     | ✅ Yes                 |
| Exception occurs and not handled | ✅ Yes                 |
| return statement inside try      | ✅ Yes                 |
| return statement inside catch    | ✅ Yes                 |

It does NOT execute only in rare cases:

* `System.exit(0)`
* JVM crash
* Power failure

---

## 🔹 Important Interview Case: finally Overriding return

```java
class Demo {
    static int test() {
        try {
            return 10;
        } finally {
            return 20;  // Overrides previous return
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }
}
```

**Output:**

```
20
```

📌 If finally contains a return statement, it overrides any return statement inside try or catch. This is a very common interview question.

---

## 🔹 Example 1: No Exception

```java
try {
    System.out.println("Try executed");
} finally {
    System.out.println("Finally executed");
}
```

**Output:**

```
Try executed
Finally executed
```

---

## 🔹 Example 2: Exception Handled

```java
try {
    int x = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Exception handled");
} finally {
    System.out.println("Cleanup code executed");
}
```

**Output:**

```
Exception handled
Cleanup code executed
```

---

## 🔹 Example 3: Exception Not Handled

```java
try {
    int x = 10 / 0;
} finally {
    System.out.println("Finally block executed");
}
```

**Output:**

```
Finally block executed
ArithmeticException
```

Even if exception is not handled, finally executes.

---

# 🔟 Difference Between final, finally, finalize()

These three words look similar but are completely different concepts.

---

## 1️⃣ final

### Definition

`final` is a keyword (modifier) used to restrict modification.

It can be applied to:

* Variables
* Methods
* Classes

### 🔹 final Variable

A final variable cannot be reassigned.

```java
final int x = 10;
x = 20; // Compile-time error
```

### 🔹 final Method

A final method cannot be overridden.

```java
class Parent {
    final void show() {
        System.out.println("Final method");
    }
}
```

### 🔹 final Class

A final class cannot be extended.

```java
final class A { }
```

Example: `String` class is final.

---

## 2️⃣ finally

### Definition

`finally` is a block used in exception handling.

* It is associated with `try`
* Used for cleanup logic
* Not related to inheritance or garbage collection

---

## 3️⃣ finalize()

### Definition

`finalize()` is a method of the `Object` class.

It is invoked by the Garbage Collector before destroying an object.

**Purpose:** Perform cleanup related to object before memory removal.

```java
protected void finalize() throws Throwable {
    System.out.println("Object destroyed");
}
```

### Important Points

* Not guaranteed to run immediately
* Deprecated in modern Java
* Not recommended for important resource cleanup

---

## 🔥 Comparison Table

| Feature              | final       | finally            | finalize()         |
| -------------------- | ----------- | ------------------ | ------------------ |
| Type                 | Keyword     | Block              | Method             |
| Used in              | OOPS        | Exception Handling | Garbage Collection |
| Purpose              | Restriction | Cleanup            | Object destruction |
| Related to try-catch | ❌ No        | ✅ Yes              | ❌ No               |

---

# 1️⃣1️⃣ Control Flow in try–catch–finally

## General Structure

> 🔎 **JVM Internal Behavior:** When an exception occurs inside the try block, the JVM first searches for a matching catch block. Before transferring control outside the try-catch structure (whether handled or not), the JVM ensures that the finally block is executed.

```java
try {
    S1;
} catch (Exception e) {
    S2;
} finally {
    S3;
}
S4;
```

### Case 1: No Exception

Execution:

```
S1 → S3 → S4
```

### Case 2: Exception Occurs and Handled

Execution:

```
S2 → S3 → S4
```

### Case 3: Exception Occurs and Not Handled

Execution:

```
S3 → Program terminates
```

> finally executes even if exception is not handled.

---

# 1️⃣2️⃣ Nested try–catch–finally

Java allows nesting of try blocks.

```java
try {
    try {
        int x = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Inner catch");
    }
} catch (Exception e) {
    System.out.println("Outer catch");
}
```

* Inner catch handles exception
* Outer catch is skipped

---

# 1️⃣3️⃣ All Possible Combinations of try–catch–finally

## 🔹 Core Syntax Rules

1. `try` must be followed by at least one `catch` OR one `finally` OR both.

2. `catch` cannot exist without `try`.

3. `finally` cannot exist without `try`.

4. Correct order must always be:

   ```
   try → catch → finally
   ```

5. Only one finally block per try.

6. Curly braces `{}` are mandatory.

7. Nesting of try–catch–finally is allowed.

---

## ✅ VALID COMBINATIONS

### 1️⃣ try + catch

```java
try {

} catch (X e) {

}
```

✔ Valid
Reason: try is followed by catch.

### 2️⃣ try + multiple catch

```java
try {

} catch (X e) {

} catch (Y e) {

}
```

✔ Valid
Reason: Multiple catch blocks are allowed.

### 3️⃣ Duplicate catch

```java
try {

} catch (X e) {

} catch (X e) {

}
```

❌ Compile-Time Error (duplicate catch)
Reason: Same exception type already caught.

### 4️⃣ try + catch + finally

```java
try {

} catch (X e) {

} finally {

}
```

✔ Valid
Reason: Correct order.

### 5️⃣ try + finally

```java
try {

} finally {

}
```

✔ Valid
Reason: try must have either catch or finally.

### 6️⃣ Two separate try-catch blocks

```java
try {

} catch (X e) {

}

try {

} catch (X e) {

}
```

✔ Valid
Reason: They are independent blocks.

### 7️⃣ try-catch followed by try-finally

```java
try {

} catch (X e) {

}

try {

} finally {

}
```

✔ Valid
Reason: Each try satisfies rules separately.

---

## ❌ INVALID COMBINATIONS

### 8️⃣ try alone

```java
try {

}
```

❌ Compile-Time Error
Reason: try must be followed by catch or finally.

### 9️⃣ catch alone

```java
catch (X e) {

}
```

❌ Compile-Time Error
Reason: catch without try.

### 🔟 finally alone

```java
finally {

}
```

❌ Compile-Time Error
Reason: finally without try.

### 1️⃣1️⃣ try → finally → catch

```java
try {

} finally {

} catch (X e) {

}
```

❌ Compile-Time Error
Reason: catch must come before finally.

### 1️⃣2️⃣ try closed before catch

```java
try {

}
System.out.println("Hello");
catch (X e) {

}
```

❌ Compile-Time Errors

* try without catch or finally
* catch without try

### 1️⃣3️⃣ catch separated from try

```java
try {

} catch (X e) {

}
System.out.println("Hello");
catch (Y e) {

}
```

❌ Compile-Time Error
Reason: Second catch has no try.

### 1️⃣4️⃣ finally separated from try

```java
try {

} catch (X e) {

}
System.out.println("Hello");
finally {

}
```

❌ Compile-Time Error
Reason: finally without try.

---

## 🔁 NESTED COMBINATIONS

### 1️⃣5️⃣ Nested try-catch inside try

```java
try {
    try {

    } catch (X e) {

    }
} catch (X e) {

}
```

✔ Valid
Reason: Nesting is allowed.

### 1️⃣6️⃣ Inner try without catch/finally

```java
try {
    try {

    }
} catch (X e) {

}
```

❌ Compile-Time Error
Reason: Inner try must have catch or finally.

### 1️⃣7️⃣ Nested try-finally

```java
try {
    try {

    } finally {

    }
} catch (X e) {

}
```

✔ Valid
Reason: Inner try has finally.

### 1️⃣8️⃣ try inside catch

```java
try {

} catch (X e) {
    try {

    } finally {

    }
}
```

✔ Valid
Reason: Nesting inside catch is allowed.

### 1️⃣9️⃣ finally inside catch (without try)

```java
try {

} catch (X e) {
    finally {

    }
}
```

❌ Compile-Time Error
Reason: finally must be attached to a try.

### 2️⃣0️⃣ try inside finally

```java
try {

} catch (X e) {

} finally {
    try {

    } catch (X e) {

    }
}
```

✔ Valid
Reason: Nested try-catch inside finally is allowed.

### 2️⃣1️⃣ finally inside finally

```java
try {

} catch (X e) {

} finally {
    finally {

    }
}
```

❌ Compile-Time Error
Reason: finally must follow a try.

### 2️⃣2️⃣ Two finally blocks

```java
try {

} catch (X e) {

} finally {

} finally {

}
```

❌ Compile-Time Error
Reason: Only one finally allowed per try.

---

## 🔒 CURLY BRACE RULE

### 2️⃣3️⃣ Missing braces in try

```java
try
    System.out.println("try");
```

❌ Invalid
Reason: Curly braces mandatory.

### 2️⃣4️⃣ Missing braces in catch

```java
try {

} catch (X e)
    System.out.println("catch");
```

❌ Invalid
Reason: Curly braces mandatory.

### 2️⃣5️⃣ Missing braces in finally

```java
try {

} catch (X e) {

} finally
    System.out.println("finally");
```

❌ Invalid
Reason: Curly braces mandatory.

---

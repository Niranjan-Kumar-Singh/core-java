# 📘 Module 2: Core Exception Handling (try–catch)

---

## 5️⃣ Customized Exception Handling using Try–Catch

---

## 🔹 What Exactly Is an Exception?

An **exception** is a **runtime problem** that occurs during program execution and **disrupts the normal flow of the program**.

* Exceptions are **objects** created by the **JVM**
* Every exception object belongs to the **Throwable class hierarchy**
* Exceptions occur **only at runtime**, not at compile time

👉 When an exception occurs, Java creates an **exception object** and looks for appropriate handling code.

---

## 🔹 When Do Exceptions Occur?

Exceptions may occur due to invalid operations such as:

* Dividing a number by zero
* Accessing an invalid array index
* Opening a file that does not exist
* Using a null reference

📌 These errors cannot always be detected at compile time, so Java handles them at runtime.

---

## 🔹 Why Java Introduced Try–Catch?

### Without Try–Catch

* JVM detects the problem
* JVM prints exception details
* Program terminates immediately
  ➡ **Abnormal termination**

### With Try–Catch

* JVM detects the problem
* JVM transfers control to programmer-defined handling code
* Programmer decides how to recover or respond
  ➡ **Normal termination**

👉 This is why it is called **customized exception handling**.

---

## 🔹 What Is Exception Handling?

**Exception handling** is the process of handling runtime errors in such a way that the **normal execution of the program is not interrupted**.

📌 Exception handling improves:

* Program reliability
* User experience
* Application stability

➡ It is **highly recommended** in all real-world Java applications.

---

## 🔹 Risky Code

**Risky code** is the code that **may cause an exception at runtime**.

### Examples

```java
10 / 0              // ArithmeticException
arr[10]             // ArrayIndexOutOfBoundsException
str.length()        // NullPointerException
```

### Rules

* Risky code must always be written inside the **try block**
* Exception handling logic must be written inside the **catch block**

📌 **Golden Rule:**
👉 Only risky code should be placed inside the try block.

---

## 🔹 Try–Catch Syntax

```java
try {
    // Risky code
} catch (Exception e) {
    // Alternative logic / recovery code
}
```

---

## 🔹 JVM Internals

1. JVM executes the `try` block line by line
2. If an exception occurs:

   * JVM creates an exception object
   * JVM searches for a matching catch block
3. If a matching catch block is found → it is executed
4. If no matching catch block is found → program terminates abnormally

---

## ❌ Program Without Try–Catch (Step-by-Step Flow)

```java
class Test {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        System.out.println(10 / 0);
        System.out.println("Statement 3");
    }
}
```

### Execution Flow

1. Statement 1 → executed
2. `10 / 0` → ArithmeticException occurs
3. JVM prints exception information
4. Program stops immediately

### Output

```
Statement 1
Runtime Error: / by zero
```

❌ Program terminates abnormally
❌ Statement 3 is not executed

---

## ✅ Program With Try–Catch (Step-by-Step Flow)

```java
class Test {
    public static void main(String[] args) {
        System.out.println("Statement 1");
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            System.out.println(10 / 2);
        }
        System.out.println("Statement 3");
    }
}
```

### Execution Flow

1. Statement 1 → executed
2. Exception occurs inside try block
3. JVM matches `ArithmeticException`
4. Catch block executes alternative logic
5. Program continues normally

### Output

```
Statement 1
5
Statement 3
```

✅ Program terminates normally
✅ Exception is handled properly

---

## ⭐ Key Points

* If an exception occurs inside try, control moves to catch
* Remaining statements inside try are skipped
* After catch, program continues normally

---

## 6️⃣ Control Flow in Try–Catch

### General Structure

```java
try {
    S1;
    S2;
    S3;
} catch (X e) {
    S4;
}
S5;
```

---

### Case 1: No Exception

Execution:

```
S1 → S2 → S3 → S5
```

✔ Normal termination

---

### Case 2: Exception at S2 & Catch Matched

Execution:

```
S1 → S4 → S5
```

🧠 **Key Insight:**
Once an exception occurs, remaining statements inside try are skipped.

---

### Case 3: Exception at S2 & Catch Not Matched

Execution:

```
S1
```

❌ JVM cannot find a handler → abnormal termination

---

### Case 4: Exception Inside Catch or After Try

❌ Always results in abnormal termination

---

## ⚠️ Golden Rules

1. Try block should contain **minimum code**
2. Catch block executes **only when exception occurs**
3. Once exception occurs, rest of try is skipped
4. Code outside try block must be safe

---

## 📝 Important Notes

1. If an exception occurs in try, remaining statements in try are skipped
2. Try block should contain only risky code
3. Catch and finally blocks can also throw exceptions
4. If an exception occurs outside try, termination is always abnormal

---

## 7️⃣ Methods to Print Exception Information

The **Throwable** class provides methods to display exception details.

---

### 🔹 printStackTrace()

**Format:**

```
Exception Name : Description
    Stack Trace
```

* Most detailed
* Used internally by JVM
* Helpful for debugging

---

### 🔹 toString()

**Format:**

```
Exception Name : Description
```

---

### 🔹 getMessage()

**Format:**

```
Description
```

* User-friendly
* Best for displaying error messages

---

## 🧪 Example Program

```java
class Test {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();              // Statement 1
            System.out.println(e);            // Statement 2
            System.out.println(e.toString()); // Statement 3
            System.out.println(e.getMessage());// Statement 4
        }
    }
}
```

---

## 🖨 Output Explanation

**Statement 1**

```
java.lang.ArithmeticException: / by zero
    at Test.main()
```

**Statement 2 & 3**

```
java.lang.ArithmeticException: / by zero
```

**Statement 4**

```
/ by zero
```

---

## ⭐ Important Note

Internally, the **Default Exception Handler** uses `printStackTrace()` to print exception details.

---

## 8️⃣ Try with Multiple Catch Blocks

Different exceptions require **different handling strategies**.

➡ Therefore, **multiple catch blocks are recommended**.

---

### ❌ Bad Practice

```java
try {
    // Risky code
} catch (Exception e) {
    // Generic handling
}
```

---

### ✅ Best Practice

```java
try {
    // Risky code
} catch (ArithmeticException e) {
    // Arithmetic handling
} catch (SQLException e) {
    // Database handling
} catch (FileNotFoundException e) {
    // File handling
} catch (Exception e) {
    // Default handling
}
```

---

## 📌 Catch Order Rule

👉 **Child exception first, parent exception last**

### Reason

* Parent can handle child exceptions
* JVM stops searching after the first matching catch block

---

### ❌ Invalid Order (Compile-Time Error)

```java
try {
    // Risky code
} catch (Exception e) {

} catch (ArithmeticException e) {

}
```

❌ Error: *Exception ArithmeticException has already been caught*

---

### ✅ Correct Order

```java
try {
    // Risky code
} catch (ArithmeticException e) {

} catch (Exception e) {

}
```

---

### ❌ Duplicate Catch Block (Not Allowed)

```java
try {
    // Risky code
} catch (ArithmeticException e) {

} catch (ArithmeticException e) {

}
```

❌ Compile-time error
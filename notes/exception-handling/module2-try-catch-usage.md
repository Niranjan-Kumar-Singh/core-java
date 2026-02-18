# MODULE 2: CORE EXCEPTION HANDLING (TRY–CATCH)

---

## 4️⃣ PART 4: CUSTOMIZED EXCEPTION HANDLING

---

## 4.1 What Exactly Is an Exception?

An **exception** is a **runtime problem** that occurs during program execution and **disrupts the normal flow of the program**.

* Exceptions are **objects** created by the **JVM**<br>
* Every exception object belongs to the **Throwable class hierarchy**<br>
* Exceptions occur **only at runtime**, not at compile time

👉 When an exception occurs, Java creates an **exception object** and looks for appropriate handling code.

---

## 4.2 When Do Exceptions Occur?

Exceptions may occur due to invalid operations such as:

* Dividing a number by zero<br>
* Accessing an invalid array index<br>
* Opening a file that does not exist<br>
* Using a null reference

📌 These errors cannot always be detected at compile time, so Java handles them at runtime.

---

## 4.3 Why Java Introduced Try–Catch?

### Without Try–Catch

* JVM detects the problem<br>
* JVM prints exception details<br>
* Program terminates immediately → **Abnormal termination**

---

### With Try–Catch

* JVM detects the problem<br>
* JVM transfers control to programmer-defined handling code<br>
* Programmer decides how to recover or respond → **Normal termination**

👉 This is why it is called **customized exception handling**.

---

## 4.4 What Is Exception Handling?

**Exception handling** is the process of handling runtime errors in such a way that the **normal execution of the program is not interrupted**.

📌 Exception handling improves:

* Program reliability<br>
* User experience<br>
* Application stability

➡ It is **highly recommended** in all real-world Java applications.

---

## 4.5 Risky Code

**Risky code** is the code that **may cause an exception at runtime**.

### Examples:
```java
10 / 0              // ArithmeticException
arr[10]             // ArrayIndexOutOfBoundsException
str.length()        // NullPointerException
```

### Rules

* Risky code must always be written inside the **try block**<br>
* Exception handling logic must be written inside the **catch block**

📌 **Golden Rule:**<br>
Only risky code should be placed inside the try block.

---

## 4.6 Try–Catch Syntax

```java
try {
    // Risky code
} catch (Exception e) {
    // Alternative logic / recovery code
}
```

---

## 4.7 JVM Internals

1. JVM executes the `try` block line by line  
2. If an exception occurs:
    * JVM creates an exception object<br>
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

❌ Program terminates abnormally<br>
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

✅ Program terminates normally<br>
✅ Exception is handled properly

---

## ⭐ Key Points

* If an exception occurs inside try, control moves to catch<br>
* Remaining statements inside try are skipped<br>
* After catch, program continues normally

---

---

## 5️⃣ PART 5: CONTROL FLOW & METHOD ACCESS

## 5.1 General Structure

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

1. Try block should contain **minimum code**<br>
2. Catch block executes **only when exception occurs**<br>
3. Once exception occurs, rest of try is skipped<br>
4. Code outside try block must be safe

---

## 📝 Important Notes

1. If an exception occurs in try, remaining statements in try are skipped<br>
2. Try block should contain only risky code<br>
3. Catch and finally blocks can also throw exceptions<br>
4. If an exception occurs outside try, termination is always abnormal

---

## 5.2 Methods to Print Exception Information

The **Throwable** class provides methods to display exception details.

---

### 🔹 printStackTrace()

**Format:**

```
Exception Name : Description
    Stack Trace
```

* Most detailed<br>
* Used internally by JVM<br>
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

* User-friendly<br>
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

---

## 6️⃣ PART 6: MULTIPLE CATCH BLOCKS & HIERARCHY

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

## 6.1 Catch Order Rule

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

---

## 🔟 Final Integration Model

**Execution Rules:**

* If `try` block executes without exception, `catch` is completely skipped.
* If exception occurs at `S1`, control jumps to `catch`. `S2`, `S3` are never executed (Skipped).
* After `catch` block finishes, execution continues with statements following the `try-catch` structure.

**Important Note:**

* If no matching `catch` block is found, the JVM performs its default handling (Propagation/Abnormal Termination).

---

## 🔥 Final Conclusion of Module 2

1. `try-catch` is the fundamental mechanism for **customized exception handling**.
2. Only **risky code** (code that might throw an exception) should be inside the `try` block.
3. Once an exception occurs, the remaining code in the `try` block is **skipped**.
4. Multiple `catch` blocks allow for **specific handling** of different exception types.
5. In multi-catch, the **child exception must come before the parent exception**.
6. `printStackTrace()` is the most detailed way to view exception info.

---
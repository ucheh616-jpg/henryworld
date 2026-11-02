# COS 201 — Computer Programming I

COS 201 practical exercises and programming assignments.

## Student Details

- **Name:** Uche Chinedu Henry
- **Matriculation Number:** 25/16511
- **Programme:** Software Engineering
- **Course:** COS 201 — Computer Programming I

> This repository also holds my personal website, *Henry's World* (`index.html`, `style.css`, `script.js`, `img/` and `audio/`). My COS 201 work is in the `week01/`, `week02/` and `week03/` folders.

## Repository Structure

```
henryworld/
├── README.md
├── week01/
│   └── FirstProgram.java
├── week02/
│   ├── HelloWorld.java
│   ├── StudentProfile.java
│   ├── PrintExample.java
│   └── ErrorExample.java
├── week03/
│   ├── SimpleCalculator.java
│   ├── AverageCalculator.java
│   └── ItemCost.java
└── index.html, style.css, script.js, img/, audio/   (personal website)
```

---

## Week 1: Introduction to Programming and Problem-Solving

### Practical Exercise

Created and executed my first Java programme, then extended it to display the course, my programme of study, three reasons programming is important to Software Engineering and my personal learning goal for COS 201.

### File

- `week01/FirstProgram.java`

### How to Run

```bash
cd week01
javac FirstProgram.java
java FirstProgram
```

### Output

```
Welcome to COS 201!
I am learning computer programming.
Programming begins with problem-solving.

Course: COS 201 - Computer Programming I
Programme: Software Engineering
Reason 1: Programming is how a software engineer turns a user's needs into a working product.
Reason 2: Writing and testing code helps engineers find and fix mistakes before the software reaches users.
Reason 3: Programming skills are needed to maintain and improve large systems that many people depend on.
My goal: I want to write clean, well-tested Java programs and submit every practical on GitHub on time.

My programme is running successfully.
I will practise programming every week.
```

### Skills Practised

- Java class and main method
- Output statements
- Compilation and execution
- GitHub version control

Activities A, B and C (IPO components, algorithms, pseudocode and flowcharts) were done on paper, as instructed, so they are not in this repository.

---

## Week 2: Development Environment and First Java Program

### Objective

To configure the Java development environment, write a simple Java program, compile it, execute it and submit the source code through GitHub.

### Tools Used

- Java Development Kit (JDK)
- Visual Studio Code
- Git
- GitHub Desktop
- GitHub

### Files

- `week02/HelloWorld.java`: the practical program. Displays three lines of text.
- `week02/StudentProfile.java`: the personalized program. Displays my name, matric number, course and programme.
- `week02/PrintExample.java`: practice exercise on the difference between `print()` and `println()`. My predicted output is written in a comment at the top of the file.
- `week02/ErrorExample.java`: "Find and fix the error" exercise. The original was missing a semicolon, which caused the compiler error `';' expected`. This is the corrected version.

### How to Run

1. Open a terminal in the `week02` directory.
2. Compile the program using `javac HelloWorld.java`.
3. Run the program using `java HelloWorld`.

The other programs are compiled and run the same way, for example `javac StudentProfile.java` then `java StudentProfile`.

### Output

**HelloWorld**

```
Hello, World!
Welcome to COS 201.
I am learning Java programming.
```

**StudentProfile**

```
NAME: Uche Chinedu Henry
MATRIC NUMBER: 25/16511
COURSE: COS 201
COURSE TITLE: Computer Programming I
PROGRAMME: Software Engineering
WEEK: 2
TOPIC: Development Environment and Java
GOAL: To build useful software with Java, one practical at a time.
```

**PrintExample**

```
COS 201
Java
```

**ErrorExample**

```
Learning Java
```

### Learning Outcome

I set up the JDK, Visual Studio Code and Git, then created, compiled and ran Java programs and submitted the source code through GitHub. I learned that `print()` stays on the same line while `println()` moves to a new line, and how to read a compiler error message to find and fix a mistake.

---

## Week 3: Variables, Data Types, Expressions and Input/Output

### Objectives

- Declare and initialize Java variables.
- Use appropriate primitive and reference data types.
- Perform arithmetic calculations.
- Read keyboard input using Scanner.
- Display formatted output.
- Compile, test and submit Java programs using GitHub.

### Programs

1. `week03/SimpleCalculator.java`
   - Performs arithmetic calculations on two numbers (sum, difference, product and quotient).
   - Checks for a zero divisor before dividing.
2. `week03/AverageCalculator.java`
   - Calculates the total and average of three course scores for a named student.
   - Extension exercise: checks that every score is between 0 and 100 before calculating the result.
3. `week03/ItemCost.java`
   - Calculates the total cost using quantity and unit price.
   - Checks that the quantity is greater than 0 and the unit price is not negative.

### Data Types Used

| Data type | Used for |
|---|---|
| `double` | The calculator's numbers, scores, unit price, totals and averages, because they can have decimals |
| `int` | The quantity of items, because it is always a whole number |
| `String` | The student's name and the item name |
| `boolean` | Whether all three scores are valid |

### How to Run

You need the Java Development Kit (JDK) installed. Check with `java -version` and `javac -version`.

Open a terminal in the `week03` directory:

```bash
cd week03
```

Compile and run the calculator:

```bash
javac SimpleCalculator.java
java SimpleCalculator
```

Compile and run the average calculator:

```bash
javac AverageCalculator.java
java AverageCalculator
```

Compile and run the item-cost program:

```bash
javac ItemCost.java
java ItemCost
```

Type each value when prompted and press **Enter**.

### Sample Runs

**SimpleCalculator**

```
Enter the first number: 36
Enter the second number: 8
Sum: 44.00
Difference: 28.00
Product: 288.00
Quotient: 4.50
```

**AverageCalculator**

```
Enter student name: Uche Chinedu Henry
Enter score for Course 1: 58
Enter score for Course 2: 74
Enter score for Course 3: 91

--- STUDENT RESULT ---
Student: Uche Chinedu Henry
Total: 223.00
Average: 74.33
```

**ItemCost**

```
Enter item name: Notebook
Enter quantity: 4
Enter unit price: 850

--- PURCHASE SUMMARY ---
Item: Notebook
Quantity: 4
Unit price: 850.00
Total cost: 3400.00
```

### Testing

I tested each program with normal inputs, boundary values and invalid inputs, and checked every result against the expected calculation.

| Program | Input | Expected result | Actual result |
|---|---|---|---|
| SimpleCalculator | 36, 8 | Sum 44.00, Difference 28.00, Product 288.00, Quotient 4.50 | Correct |
| SimpleCalculator | 9.6, -1.2 (decimal and negative) | Sum 8.40, Difference 10.80, Product -11.52, Quotient -8.00 | Correct |
| SimpleCalculator | 25, 0 (zero divisor) | Quotient not calculated; "Division is undefined for a zero divisor." | Correct |
| AverageCalculator | 58, 74, 91 | Total 223.00, Average 74.33 | Correct |
| AverageCalculator | 0, 0, 0 (lowest boundary) | Total 0.00, Average 0.00 | Correct |
| AverageCalculator | 100, 100, 100 (highest boundary) | Total 300.00, Average 100.00 | Correct |
| AverageCalculator | 67.5, 80, 72.5 (decimal scores) | Total 220.00, Average 73.33 | Correct |
| AverageCalculator | 85, 101, 60 (score above 100) | Invalid input message; no result | Correct |
| AverageCalculator | -1, 50, 60 (score below 0) | Invalid input message; no result | Correct |
| ItemCost | Notebook: 4 × 850 | Total cost 3400.00 | Correct |
| ItemCost | Pen: 12 × 120.75 | Total cost 1449.00 | Correct |
| ItemCost | Free Flyer: 20 × 0 (zero price) | Total cost 0.00 | Correct |
| ItemCost | Quantity 0 | Invalid input message; no result | Correct |
| ItemCost | Unit price -10 | Invalid input message; no result | Correct |

### Notes

- Enter numbers only (no letters or currency symbols) where a number is requested; otherwise Java stops with an `InputMismatchException`.
- In `ItemCost`, the quantity must be a whole number (for example `4`, not `4.5`).

### Learning Outcome

I learned how to store values in variables of suitable data types, read keyboard input with `Scanner`, write arithmetic expressions, format output to two decimal places with `printf()`, and use `if` statements to reject invalid input before calculating.

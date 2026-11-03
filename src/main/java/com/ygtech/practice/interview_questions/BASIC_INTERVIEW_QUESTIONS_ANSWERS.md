## 1. What is Java?

Java is a general purpose programming language first released by Sun Microsystems in 1995 (now owned by Oracle). It's one of the most widely used languages in the world.

### Key characteristics
- Object-oriented: Code is organized around classes and objects.
- Platform-independent: Java source code compiles to bytecode, which runs on the Java Virtual Machine (JVM). This is the idea behind “write once, run anywhere”: the same program can run on Windows, macOS, Linux, and more, as long as a JVM is available.
- Statically typed: Variable types are checked at compile time, which catches many errors early.
- Automatic memory management: A garbage collector frees memory that’s no longer in use, so you don’t manage it manually.
- Large ecosystem: Mature libraries and frameworks (like Spring), plus strong tooling and community support.

### What it's used for?
- Mobile applications (specially Android apps)
- Desktop applications / Standalone applications
- Web applications
- Enterprise applications
- Web servers and application servers
- Games
- Database connection
- And much, much more!

## 2. What is a method?

A method is a named block of code inside a class that performs a specific task. You define it once and can then run (“call”) it as many times as you like. In other languages, the same idea is often called a function.

### Anatomy of a method
```java
public int add(int a, int b) {
return a + b;
}
```

- `public` is the access modifier, which controls who can call the method.
- `int` is the return type, the kind of value the method gives back. Use `void` if it returns nothing.
- add is the method name.
- `(int a, int b)` are the parameters, the inputs the method accepts.
- The code inside `{ }` is the body, which does the work.
- `return` sends a result back to whoever called the method.

- **Calling a method**
```java
int result = add(3, 4);   // result is 7
```

### Why methods are useful
- **Reuse:** write the logic once, use it anywhere.
- **Organization:** break big problems into small, named pieces.
- **Readability:** calculateTax(price) is clearer than a dozen lines of inline math.

### Two common kinds
- Instance methods belong to an object and can use that object’s data. You call them on an object, like `dog.bark()`.
- Static methods belong to the class itself and are called on the class, like `Math.max(5, 9)`. The `main` method from the earlier example is static.

## 3. What is a variable?

A variable is a named container that holds a value in your program’s memory. You can store a value in it, read it later, and change it as the program runs.

### Declaring and using one

```java
int age = 25;          // declare a variable named age and store 25 in it
age = 26;              // change its value
System.out.println(age);  // prints 26
```
- `int` is the type, which says what kind of value the variable can hold.
- `age` is the name you use to refer to it.
- `= 25` assigns an initial value.

Because Java is statically typed, a variable’s type is fixed once declared. An `int` variable can’t later hold text.

### Common types
- `int`: whole numbers (`42`)
- `double`: decimal numbers (`3.14`)
- `boolean`: `true` or `false`
- `char`: a single character (`'A'`)
- `String`: text (`"hello"`)

**Where variables live**  
- **Local variables** are declared inside a method and exist only while that method runs.
- **Instance variables** (also called fields) belong to an object and hold its data, like a dog’s `name`.
- **Static variables** belong to the class itself and are shared by all objects of that class.

### Constants
If a value should never change, add final:
```java
final double PI = 3.14159;
```
Methods and variables work together: methods do the work, and variables hold the data they work with.

## 4. What is datatype and explain each of them?

A data type tells Java what kind of value a variable can hold, how much memory it uses, and what operations you can perform on it. Java has two categories: primitive types and reference types.

### 1. Primitive data types

These are built into the language and store simple values directly. There are eight.

**Whole numbers**

| Type    | Size    | Range                             | Example                   |
|---------|---------|-----------------------------------|---------------------------|
| `byte`  | 8 bits  | -128 to 127                       | `byte b = 100;`           |
| `short` | 16 bits | -32,768 to 32,767                 | `short s = 20000;`        |
| `int`   | 32 bits | about -2.1 billion to 2.1 billion | `int age = 25;`           |
| `long`  | 64 bits | about ±9.2 quintillion            | `long big = 9000000000L;` |

- `int` is the default choice for whole numbers.
- `long` values need an `L` at the end of the literal.
- `byte` and `short` are used mainly to save memory in large arrays or in low-level code.

**Decimal numbers**

| Type   | Size     | Precision          | Example               |
|--------|----------|--------------------|-----------------------|
| float  | 32 bits	 | about 6-7 digits   | `float f = 3.14f;`    |
| double | 64 bits	 | about 15-16 digits | `double d = 3.14159;` |

- `double` is the default for decimals.
- `float` needs an f at the end of the literal.
- Neither is exact for money. For currency, use `BigDecimal`.

**Character**

- `char` is 16 bits and holds a single character in single quotes: `char grade = 'A';`

**Boolean**

- `boolean` holds only `true` or `false`: `boolean isOpen = true;`
- Used for conditions and decisions, like `if (isOpen)`.

### 2. Reference (non-primitive) data types

These don’t hold the value directly. They hold a reference (an address) to an object in memory.

- **String:** text, such as `String name = "Ravi";`. Strings are objects, not primitives, and they are immutable (can’t be changed after creation).
- **Arrays:** a fixed-size collection of same-type values, such as `int[] nums = {1, 2, 3};`
- **Classes and objects:** types you define yourself, such as `Dog myDog = new Dog();`
- **Interfaces and enums:** other ways of defining custom types.
- **Wrapper classes:** object versions of primitives (`Integer`, `Double`, `Boolean`, and so on), used where objects are required, like in collections: `Integer x = 5;`

**Key differences**

|               | Primitive         | Reference                    |
|---------------|-------------------|------------------------------|
| Stores        | the actual value  | a reference to an object     |
| Default value | 0, `false`, etc.  | `null`                       |
| Has methods?  | No                | Yes (`name.length()`)        |
| Starts with   | lowercase (`int`) | usually uppercase (`String`) |

**Type conversion**  

Java converts smaller types to larger ones automatically (widening), but going the other way requires an explicit cast, because data might be lost:

```java
int x = 10;
double y = x;          // automatic: 10.0

double pi = 3.99;
int z = (int) pi;      // manual cast: 3 (decimal part is cut off)
```

## 5. What is scanner?

`Scanner` is a built-in Java class that reads input from a source, most commonly the keyboard. It lives in the `java.util` package, so you need to import it before using it.

**Basic example**

```java
import java.util.Scanner;

public class Greeting {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();
    }
}
```

- `import java.util.Scanner;` makes the class available.
- `new Scanner(System.in)` creates a scanner that reads from standard input (the keyboard). `System.in` is the input stream.
- `sc.nextLine()` and `sc.nextInt()` read values typed by the user.
- `sc.close()` releases the resource when you’re done.

**Common methods**

| Method          | Reads                          | Example input |
|-----------------|--------------------------------|---------------|
| `nextInt()`     | an `int`                       | `25`          |
| `nextLong()`    | a `long`                       | `9000000000`  |
| `nextDouble()`  | a `double`                     | `3.14`        |
| `nextBoolean()` | a `boolean`                    | `true`        |
| `next()`        | one word (up to a space)       | `Ravi`        |
| `nextLine()`    | a whole line, including spaces | `Ravi Kumar`  |

**A common gotcha**

If you call `nextInt()` (or `nextDouble()`) and then `nextLine()`, the `nextLine()` appears to get skipped. This happens because `nextInt()` reads the number but leaves the newline (Enter key) in the buffer, and `nextLine()` then consumes that leftover newline as an empty line. The fix is to add an extra `sc.nextLine();` after the number to clear it:

```java
int age = sc.nextInt();
sc.nextLine();                 // consume leftover newline
String city = sc.nextLine();   // now works as expected
```
**Other uses**

Scanner can also read from files (`new Scanner(new File("data.txt"))`) or from a String, not just the keyboard.

## 6. What is operator and operand?

An **operator** is a symbol that tells Java to perform an operation. An **operand** is the value (or variable) that the operator works on.

```java
int result = a + b;
```
- `+` is the operator.
- `a` and `b` are the operands.
- `=` is also an operator (assignment), with `result` and `a + b` as its operands.

By number of operands, operators are:  
- **Unary:** one operand (`-x`, `x++`, `!flag`)
- **Binary:** two operands (`a + b`, `x > y`)
- **Ternary:** three operands (`condition ? valueIfTrue : valueIfFalse`)

### Types of operators

**1. Arithmetic:** math operations

| Operator | Meaning             | Example | Result                                   |
|----------|---------------------|---------|------------------------------------------|
| `+`      | addition            | `5 + 2` | `7`                                      |
| `-`      | subtraction         | `5 - 2` | `3`                                      |
| `*`      | multiplication      | `5 * 2` | `10`                                     |
| `/`      | division            | `5 / 2` | `2` (integer division drops the decimal) |
| `%`      | remainder (modulus) | `5 % 2` | `1`                                      |

**2. Assignment:** store a value in a variable

```java
int x = 10;   // assign
x += 5;       // same as x = x + 5  (x is now 15)
```
Others: `-=`, `*=`, `/=`, `%=`.

**3. Relational (comparison):** compare two values, result is `boolean`

| Operator  | Meaning                      | Example  |
|-----------|------------------------------|----------|
| `==`      | equal to                     | `a == b` |
| `!=`      | not equal to                 | `a != b` |
| `>` `<`   | greater / less than          | `a > b`  |
| `>=` `<=` | greater / less than or equal | `a >= b` |

**4. Logical:** combine boolean conditions

| Operator | Meaning                | Example                |
|----------|------------------------|------------------------|
| `&&`     | AND (both true)        | `age > 18 && hasId`    |
| `\|\|`   | OR (at least one true) | `isAdmin \|\| isOwner` |
| `!`      | NOT (reverses)         | `!isOpen`              |

**5. Increment and decrement:** add or subtract 1

```java
int i = 5;
i++;   // i is now 6
i--;   // i is now 5
```
`++i` (prefix) changes the value before it’s used in the expression; `i++` (postfix) changes it after.

**6. Bitwise:** work on individual bits (`&`, `|`, `^`, `~`, `<<`, `>>`). Used in low-level programming and rarely needed by beginners.

**7. Ternary:** a short form of if-else

```java
String status = (age >= 18) ? "Adult" : "Minor";
```
Two common gotchas  
- `=` assigns, while `==` compares. Writing `if (x = 5)` is an error.
- For `String` and other objects, use `.equals()` to compare contents, not `==`: `name.equals("Ravi")`.

## 7. Explain ASCII values?

ASCII (American Standard Code for Information Interchange) is a standard that assigns a number to each character, so computers, which only understand numbers, can store and process text. For example, the letter `A` is stored as the number `65`.

**Key ASCII values to remember**

| Characters     | ASCII range |
|----------------|-------------|
| `'0'` to `'9'` | 48 to 57    |
| `'A'` to `'Z'` | 65 to 90    |
| `'a'` to `'z'` | 97 to 122   |
| Space `' '`    | 32          |
| Newline `'\n'` | 10          |

Standard ASCII has 128 characters (0 to 127). It includes letters, digits, punctuation, and control characters like newline and tab.

Two patterns worth noticing:

- Lowercase letters are exactly 32 more than their uppercase versions (`'a'` = 97, `'A'` = 65).
- The digit character `'5'` is not the number 5. It’s the character with ASCII value 53.

### ASCII in Java

A `char` in Java is really a number underneath, so you can move between characters and their ASCII values easily.

**Character to ASCII value**

```java
char ch = 'A';
int ascii = ch;                 // implicit conversion: 65
System.out.println(ascii);      // 65
System.out.println((int) 'a');  // 97
```
**ASCII value to character**

```java
int num = 66;
char ch = (char) num;           // explicit cast needed
System.out.println(ch);         // B
```
**Arithmetic on characters**

```java
char c = 'A';
c++;                            // now 'B'
System.out.println(c + 1);      // 67 (char + int gives an int)
System.out.println((char)(c + 1)); // C
```
### Common uses

**Convert a lowercase letter to uppercase**

```java
char lower = 'g';
char upper = (char) (lower - 32);   // 'G'
```
**Convert a digit character to its numeric value**

```java
char digit = '7';
int value = digit - '0';            // 55 - 48 = 7
```
**Check what kind of character it is**

```java
if (ch >= 'A' && ch <= 'Z') {
System.out.println("Uppercase letter");
} else if (ch >= '0' && ch <= '9') {
System.out.println("Digit");
}
```
### ASCII vs Unicode

ASCII only covers English letters and basic symbols. Java actually uses Unicode (specifically UTF-16 for char), which covers characters from nearly all languages, including Telugu, Hindi, and emoji. Unicode is built so that its first 128 values match ASCII exactly, so everything above still works the same way.

## 8. List out operators and Explain Operators ?

### Operators in Java

An **operator** is a symbol that performs an operation on one or more **operands** (values or variables). Java operators fall into these groups:  
1. Arithmetic
2. Assignment
3. Relational (comparison)
4. Logical
5. Unary (including increment/decrement)
6. Bitwise
7. Shift
8. Ternary
9. `instanceof`


### 1. Arithmetic operators

Used for mathematical calculations.

| Operator | Name                | Example  | Result |
|----------|---------------------|----------|--------|
| `+`      | Addition            | `10 + 3` | `13`   |
| `-`      | Subtraction         | `10 - 3` | `7`    |
| `*`      | Multiplication      | `10 * 3` | `30`   |
| `/`      | Division            | `10 / 3` | `3`    |
| `%`      | Modulus (remainder) | `10 % 3` | `1`    |

- Dividing two integers gives an integer (10 / 3 is 3, not 3.33). Use a double for decimals: 10.0 / 3.
- `+` also joins strings: "Hello " + "World".

### 2. Assignment operators

Store a value in a variable. Compound forms combine an operation with assignment.

| Operator | Example  | Same as       |
|----------|----------|---------------|
| `=`      | `x = 5`  | assign 5 to x |
| `+=`     | `x += 3` | `x = x + 3`   |
| `-=`     | `x -= 3` | `x = x - 3`   |
| `*=`     | `x *= 3` | `x = x * 3`   |
| `/=`     | `x /= 3` | `x = x / 3`   |
| `%=`     | `x %= 3` | `x = x % 3`   |

### 3. Relational operators

Compare two values. The result is always `boolean`.

| Operator | Meaning               | Example (`a=5`, `b=3`) | Result  |
|----------|-----------------------|------------------------|---------|
| `==`     | equal to              | `a == b`               | `false` |
| `!=`     | not equal to          | `a != b`               | `true`  |
| `>`      | greater than          | `a > b`                | `true`  |
| `<`      | less than             | `a < b`                | `false` |
| `>=`     | greater than or equal | `a >= 5`               | `true`  |
| `<=`     | less than or equal    | `a <= b`               | `false` |

### 4. Logical operators

Combine boolean expressions.

| Operator | Name | Meaning                      | Example                |
|----------|------|------------------------------|------------------------|
| `&&`     | AND  | true if both are true        | `age > 18 && hasId`    |
| `\|\|`   | OR   | true if at least one is true | `isAdmin \|\| isOwner` |
| `!`      | NOT  | reverses the value           | `!isOpen`              |

`&&` and `\|\|` use short-circuiting: in `a && b`, if `a` is false, `b` is never evaluated. In `a || b`, if `a` is true, `b` is skipped.

### 5. Unary operators

Work on a single operand.

| Operator | Meaning        | Example        |
|----------|----------------|----------------|
| `+`      | positive sign  | +5             |
| `-`      | negation       | -x             |
| `!`      | logical NOT    | `!flag`        |
| `++`     | increment by 1 | `i++` or `++i` |
| `--`     | decrement by 1 | `i--` or `--i` |

### Prefix vs postfix:

```java
int i = 5;
int a = i++;   // a = 5, then i becomes 6  (use first, then change)
int b = ++i;   // i becomes 7, then b = 7  (change first, then use)
```
### 6. Bitwise operators

Work on the individual bits of integers.

| Operator | Name                        | Example (a=5 is 0101, b=3 is 0011) | Result |
|----------|-----------------------------|------------------------------------|--------|
| `&`      | AND                         | `a & b` → `0001`                   | `1`    |
| `\|`     | OR                          | `a \| b` → `0111`                  | `7`    |
| `^`      | XOR (different bits give 1) | `a ^ b` → `0110`                   | `6`    |
| `~`      | NOT (flips all bits)        | `~a`                               | `-6`   |
### 7. Shift operators

Move bits left or right.

| Operator | Name                                | Example      | Result                 |
|----------|-------------------------------------|--------------|------------------------|
| `<<`     | Left shift                          | `5 << 1`     | `10` (multiplies by 2) |
| `>>`     | Right shift (keeps sign)            | `20 >> 2`    | `5` (divides by 4)     |
| `>>>`    | Unsigned right shift (fills with 0) | `-20 >>> 28` | `15`                   |

### 8. Ternary operator

A compact if-else. It is the only operator with three operands.

```java
String result = (marks >= 40) ? "Pass" : "Fail";
```
Syntax: `condition ? valueIfTrue : valueIfFalse`

### 9. `instanceof` operator

Checks whether an object belongs to a particular class or type. Returns boolean.

```java
String s = "Java";
System.out.println(s instanceof String);   // true
```

### Operator precedence

When an expression has several operators, Java evaluates them in this order (highest to lowest):

1. Postfix and unary: `i++`, `i--`, `++i`, `--i`, `!`, `~`
2. Multiplicative: `*`, `/`, `%`
3. Additive: `+`, `-`
4. Shift: `<<`, `>>`, `>>>`
5. Relational: `<`, `>`, `<=`, `>=`, `instanceof`
6. Equality: `==`, `!=`
7. Bitwise: &, then `^`, then `|`
8. Logical: `&&`, then `||`
9. Ternary: `? :`
10. Assignment: `=`, `+=`, `-=`, and so on
```java
int r = 2 + 3 * 4;     // 14, because * runs before +
int s = (2 + 3) * 4;   // 20, because parentheses run first
```
When unsure, use parentheses. They make the order explicit and the code easier to read.

### Common mistakes
- `=` assigns, `==` compares. `if (x = 5)` is a compile error.
- Use `.equals()` to compare String contents, not `==`.
- `&&` and `||` are for booleans and short-circuit, while `&` and `|` are bitwise (they also work on booleans but don’t short-circuit).

## 9. Explain Control flow statements , Decision making Statements, Looping Statements?

### Control Flow Statements in Java

By default, Java runs statements top to bottom, one after another. **Control flow statements** change that order: they let your program make decisions, repeat code, or jump to another place.

They fall into three categories:

1. **Decision-making (selection) statements:** choose which code to run
2. **Looping (iteration) statements:** repeat code
3. **Jump statements:** transfer control elsewhere


### 1. Decision-making statements

`if`
Runs a block only when the condition is true.

```java
int age = 20;
if (age >= 18) {
    System.out.println("Eligible to vote");
}
```

`if-else`

Runs one block if true, another if false.

```java
if (age >= 18) {
    System.out.println("Adult");
} else {
    System.out.println("Minor");
}
```

`if-else if-else` (ladder)

Checks conditions in order and runs the first one that is true.

```java
int marks = 72;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 60) {
    System.out.println("Grade B");
} else if (marks >= 40) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

**Nested `if`**

An `if` inside another `if`.

```java
if (age >= 18) {
    if (hasId) {
        System.out.println("Entry allowed");
    }
}
```

`switch`

Chooses one block from many, based on the value of a variable. Best when comparing one variable against several fixed values.

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```
- `break` stops execution from “falling through” into the next case. Without it, all following cases run too.
- `default` runs when no case matches.
- `switch` works with `int`, `char`, `byte`, `short`, `String`, and `enum`.

**Modern switch (Java 14+)** is shorter and has no fall-through:

```java
String name = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    default -> "Invalid day";
};
```

### 2. Looping statements
`for loop`

Best when you know how many times to repeat. It has three parts: initialization, condition, update.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
// prints 1 2 3 4 5
```

Order of execution: initialize once, check condition, run body, update, check condition again, and so on.

`while loop`

Checks the condition first, then runs the body. Best when the number of repetitions isn’t known in advance.

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

If the condition is false at the start, the body never runs.

`do-while loop`

Runs the body first, then checks the condition. The body always runs at least once.

```java
int i = 1;
do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

Note the semicolon after `while (...)`.

**Enhanced `for` loop (for-each)**

Goes through every element of an array or collection without using an index.

```java
int[] nums = {10, 20, 30};
for (int n : nums) {
    System.out.println(n);
}
```

**Nested loops**

A loop inside another loop. The inner loop completes fully for each pass of the outer loop.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
```
Output:
```text
*
* *
* * *
```

***Comparing the loops***

| Loop       | Condition checked | Runs at least once? | Best used when             |
|------------|-------------------|---------------------|----------------------------|
| `for`      | before each pass  | No                  | count is known             |
| `while`    | before each pass  | No                  | count is unknown           |
| `do-while` | after each pass   | Yes                 | must run once (e.g. menus) |
| for-each`  | automatic         | No                  | visiting every element     |

**Infinite loop**

A loop whose condition never becomes false. Sometimes intentional, often a bug:

```java
while (true) {
// runs forever unless break is used
}
```

### 3. Jump statements

| Statement  | Purpose                                                           |
|------------|-------------------------------------------------------------------|
| `break`    | exits the loop or switch immediately                              |
| `continue` | skips the rest of the current pass and goes to the next iteration |
| `return`   | exits the current method (optionally giving back a value)         |

```java
for (int i = 1; i <= 5; i++) {
   if (i == 3) continue;   // skip 3
   if (i == 5) break;      // stop at 5
   System.out.println(i);
   }
   // prints 1 2 4
```
**Quick summary**

| Category        | Statements                                        | Purpose              |
|-----------------|---------------------------------------------------|----------------------|
| Decision-making | `if`, `if-else`, `else if`, nested `if`, `switch` | choose a path        |
| Looping         | `for`, `while`, `do-while`, for-each              | repeat code          |
| Jump            | `break₹, `continue`, `return`                     | change flow abruptly |

**Common mistakes**
- Forgetting `break` in an old-style `switch`, causing fall-through.
- Writing `if (x = 5)` instead of `if (x == 5)`.
- Forgetting to update the loop variable in a while loop, causing an infinite loop.
- Adding a stray semicolon like `for (...);` or `if (...);`, which makes the loop or if body empty.

## 10. Explain Type Conversion?

### Type Conversion in Java

Type conversion means changing a value from one data type to another. Java does this in two ways:

1. **Implicit conversion** (widening), done automatically by Java
2. **Explicit conversion** (narrowing), done manually by you using a cast

### 1. Implicit conversion (widening)

Java automatically converts a smaller type to a larger type, because no data can be lost.
```text
byte → short → int → long → float → double
              ↑
             char
```

```java
int x = 10;
double y = x;        // int to double automatically
System.out.println(y);   // 10.0

char c = 'A';
int code = c;        // char to int
System.out.println(code); // 65

long big = x;        // int to long
```
**Rules for widening:**

- The two types must be compatible (numeric types are).
- The destination type must be larger than the source type.

### 2. Explicit conversion (narrowing / casting)

Converting a larger type to a smaller type must be done manually, because data might be lost. Java will not do it for you.

**Syntax:** `(targetType) value`

```java
double pi = 3.99;
int n = (int) pi;
System.out.println(n);    // 3  (decimal part is cut off, not rounded)

int num = 66;
char ch = (char) num;
System.out.println(ch);   // B
```

Without the cast, this is a compile error:

```java
double d = 9.5;
int i = d;           // error: possible lossy conversion from double to int
```

**Overflow during narrowing**

If the value doesn’t fit in the smaller type, it wraps around:

```java
int big = 130;
byte b = (byte) big;
System.out.println(b);    // -126  (130 is outside byte's range of -128 to 127)
```

### 3. Type promotion in expressions

In an expression, Java automatically promotes smaller types to a larger type before calculating:

- `byte`, `short`, and `char` are promoted to `int`.
- If any operand is `long`, the result is `long`.
- If any operand is `float`, the result is `float`.
- If any operand is `double`, the result is `double`.

```java
byte a = 10, b = 20;
// byte c = a + b;       // error: a + b is an int
byte c = (byte) (a + b); // fix with a cast

int i = 5;
double d = 2.5;
double result = i * d;   // i is promoted to double: 12.5
```

A classic example:

```java
int a = 5, b = 2;
System.out.println(a / b);          // 2    (integer division)
System.out.println((double) a / b); // 2.5  (cast first, then divide)
```

Note that `(double) a / b` casts only `a`, and then `b` is promoted automatically. Writing `(double) (a / b)` would give `2.0`, because the integer division happens first.

### 4. Converting between Strings and numbers

Casting does not work between String and numeric types. Use methods instead.

**String to number**

```java
int n = Integer.parseInt("123");
double d = Double.parseDouble("3.14");
```

If the text isn’t a valid number (like `"abc"`), this throws a `NumberFormatException`.

**Number to String**

```java
String s1 = String.valueOf(123);
String s2 = Integer.toString(123);
String s3 = "" + 123;       // quick trick
```

### 5. Boxing and unboxing (primitive ↔ wrapper)

Java also converts automatically between primitives and their wrapper classes:

```java
int x = 5;
Integer obj = x;     // autoboxing: int to Integer
int y = obj;         // unboxing: Integer to int
```

### Summary
| Type                 | Direction      | Done by                 | Data loss? | Example                   |
|----------------------|----------------|-------------------------|------------|---------------------------|
| Implicit (widening)  | small → large  | Java automatically      | No         | `double d = 10;`          |
| Explicit (narrowing) | large → small  | You, with a cast        | Possible   | `int i = (int) 9.7;`      |
| Promotion            | in expressions | Java automatically      | No         | `byte + byte` gives `int` |
| String ↔ number      | not casting    | Methods like `parseInt` | n/a        | `Integer.parseInt("5")`   |

### Common mistakes

- Expecting a cast to round: `(int) 3.99` gives `3`, not `4`. Use `Math.round()` to round.
- Forgetting that `int / int` gives an `int`, so `5 / 2` is `2`.
- Assigning `long` to `int`, or `double` to `float` (as in `float f = 3.14;`), without a cast. Use `3.14f` for float literals.
- Trying to cast a `String` to int with `(int) "123"`, which is a compile error. Use `Integer.parseInt()`.

## 11.Explain History of Java?

### History of Java

Java is one of the most influential programming languages ever created. Its story runs from a small team at Sun Microsystems to one of the world’s most widely used platforms.

### Origins (1991 to 1995)

- **1991:** A small team at Sun Microsystems began the “Green Project.” The team included James Gosling, Mike Sheridan, and Patrick Naughton. Their goal was a language for consumer electronics such as set-top boxes and other embedded devices, which needed software that could run on many different kinds of hardware.
- **The name “Oak”:** The language was first called Oak, after an oak tree outside Gosling’s office. It was later found that the name was already trademarked, so it had to change.
- **The name “Java”:** The team chose Java, widely said to be inspired by Java coffee (the island of Java in Indonesia is famous for it). This is why the Java logo is a steaming coffee cup.
- **Shift to the internet:** The consumer-electronics market didn’t take off as hoped, but the web was growing fast. The team realized that a platform-independent language was ideal for the internet.
- **1995:** Sun publicly announced Java. Netscape added support for Java applets in its browser, which brought huge attention.

### Official release (1996)

- **January 1996:** JDK 1.0 was released, with the slogan “Write Once, Run Anywhere” (WORA). This idea came from compiling code to bytecode that runs on the JVM, so the same program works on any operating system with a JVM.

**Major milestones**

| Year | Version           | Notable additions                                               |
|------|-------------------|-----------------------------------------------------------------|
| 1996 | JDK 1.0           | First public release                                            |
| 1997 | JDK 1.1           | Inner classes, JDBC, JavaBeans                                  |
| 1998 | J2SE 1.2 (Java 2) | Swing, Collections framework, JIT compiler                      |
| 2000 | J2SE 1.3          | HotSpot JVM                                                     |
| 2002 | J2SE 1.4          | Assertions, regular expressions, NIO                            |
| 2004 | J2SE 5.0          | Generics, annotations, enhanced for loop, autoboxing, enums     |
| 2006 | Java SE 6         | Performance and tooling improvements                            |
| 2011 | Java SE 7         | try-with-resources, diamond operator, String in switch          |
| 2014 | Java SE 8         | Lambda expressions, Stream API, new Date/Time API               |
| 2017 | Java SE 9         | Module system (Project Jigsaw)                                  |
| 2018 | Java SE 10, 11    | `var` keyword; Java 11 became a long-term support (LTS) release |
| 2021 | Java SE 17        | LTS release; records, sealed classes                            |
| 2023 | Java SE 21        | LTS release; virtual threads, pattern matching for switch       |

Since 2018, Java has followed a six-month release cycle (a new version every March and September), with an LTS (Long-Term Support) version released every few years. Many companies stay on LTS versions such as 8, 11, 17, and 21. Newer releases have continued to arrive since Java 21, so check oracle.com/java for the latest version.

### Ownership changes

- 2006 to 2007: Sun released most of Java as open source under the GPL, creating OpenJDK.
- 2010: Oracle Corporation acquired Sun Microsystems and became the steward of Java.
- Today, Java is developed through OpenJDK with contributions from Oracle and many other companies and developers.

**Why Java became so popular**

- Platform independence through the JVM.
- Simplicity compared to C++ (no manual memory management, no pointers).
- Security features built into the platform from early on.
- Huge ecosystem of libraries, frameworks, and tools.
- Strong backward compatibility, so old code keeps working.
- Android: Java became the main language for Android development, which brought millions of developers to it (Kotlin is now preferred, but Java is still widely used).

**Fun facts**

- James Gosling is often called the “Father of Java.”
- Java’s early design borrowed syntax from C and C++, but removed complex features like explicit pointers and multiple inheritance of classes.
- Java applets, once a major feature, have been removed from modern browsers, but Java thrived on servers, in enterprise systems, and on Android.

## 12. Explain Java Tokens?

### Java Tokens

A token is the smallest individual unit of a Java program that the compiler recognizes. When the compiler reads your source code, it breaks it into tokens, much like splitting a sentence into words and punctuation.

```java
int sum = a + 10;
```

This line contains these tokens: `int`, `sum`, `=`, `a`, `+`, `10`, `;`

Java has five types of tokens:

1. Keywords
2. Identifiers
3. Literals
4. Operators
5. Separators

(Whitespace and comments are not tokens. The compiler ignores them, though they can separate tokens.)

### 1. Keywords

Reserved words that have a fixed meaning in Java. You cannot use them as names for variables, methods, or classes. All are lowercase.

| Category         | Keywords                                                                                       |
|------------------|------------------------------------------------------------------------------------------------|
| Data types       | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`                           |
| Control flow     | `if`, `else`, `switch`, `case`, `default`, `for`, `while`, `do`, `break`, `continue`, `return` |
| Class-related    | `class`, `interface`, `extends`, `implements`, `new`, `this`, `super`, `abstract`, `final`     |
| Access modifiers | `public`, `private`, `protected`                                                               |
| Other modifiers  | `static`, `synchronized`, `volatile`, `transient`, `native`                                    |
| Exceptions       | `try`, `catch`, `finally`, `throw`, `throws`                                                   |
| Packages         | `package`, `import`                                                                            |
| Others           | `void`, `enum`, `instanceof`, `assert`                                                         |

Java has about 50 keywords. Two (goto and const) are reserved but not used. Also, true, false, and null are literals, not keywords, but you can’t use them as names either.

### 2. Identifiers

Names you give to variables, methods, classes, interfaces, and so on.

**Rules**

- Can contain letters, digits, underscore `_`, and dollar sign `$`.
- Cannot start with a digit.
- Cannot be a keyword.
- Cannot contain spaces or special characters like `@`, `#`, `-`.
- Are case-sensitive: `age`, `Age`, and `AGE` are three different identifiers.

```java
int age;          // valid
int _count;       // valid
int $price;       // valid
int total2;       // valid

int 2total;       // invalid: starts with a digit
int my-name;      // invalid: contains a hyphen
int class;        // invalid: keyword
```

**Naming conventions** (not enforced by the compiler, but followed by almost every Java programmer)

| Element  | Convention       | Example            |
|----------|------------------|--------------------|
| Class    | PascalCase       | `StudentRecord`    |
| Method   | camelCase        | `calculateTotal()` |
| Variable | camelCase        | `firstName`        |
| Constant | UPPER_SNAKE_CASE | `MAX_SIZE₹         |
| Package  | lowercase        | `com.example.app`  |

### 3. Literals

Fixed values written directly in the code.

| Type           | Examples                                                  |
|----------------|-----------------------------------------------------------|
| Integer        | `10`, `-5`, `0x1F` (hex), `0b101` (binary), `017` (octal) 
| Long           | `9000000000L`                                             |
| Floating-point | `3.14`, `2.5f`, `1.5e3`                                   |
| Character      | `'A'`, `'7'`, `'\n'`                                      |
| String         | `"Hello"`, `"Java"`                                       |
| Boolean        | `true`, `false`                                           |
| Null           | `null`                                                    |

Underscores can make large numbers readable: `int million = 1_000_000;`

Common escape sequences in char and String literals:

| Sequence | Meaning      |
|----------|--------------|
| `\n`     | new line     |
| `\t`     | tab          |
| `\\`     | backslash    |
| `\"`     | double quote |
| `\'`     | single quote |

### 4. Operators

Symbols that perform operations on operands.

```java
+  -  *  /  %        // arithmetic
=  +=  -=            // assignment
==  !=  >  <         // relational
&&  ||  !            // logical
++  --               // increment/decrement
?:                   // ternary
```

### 5. Separators

Symbols that separate and organize code.

| Separator | Name        | Use                                            |
|-----------|-------------|------------------------------------------------|
| `;`       | Semicolon   | ends a statement                               |
| `,`       | Comma       | separates variables or arguments: `int a, b;`  |
| `.`       | Dot         | accesses members: `System.out`, `obj.method()` |
| `( )`     | Parentheses | method calls, conditions, grouping             |
| `{ }`     | Braces      | blocks of code, array initializers             |
| `[ ]`     | Brackets    | arrays: `int[] arr`                            |

### Example: identifying tokens

```java
public class Demo {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Value: " + x);
    }
}
```

| Token type  | Tokens in this program                                            |
|-------------|-------------------------------------------------------------------|
| Keywords    | `public`, `class`, `static`, `void`, `int`                        |
| Identifiers | `Demo`, `main`, `String`, `args`, `x`, `System`, `out`, `println` |
| Literals    | `5`, `"Value: "`                                                  |
| Operators   | `=`, `+`                                                          |
| Separators  | `{ }`, `( )`, `[ ]`, `;`, `.`                                     |

Strictly speaking, `String`, `System`, and `println` are identifiers (names of a class and a method), not keywords.

### Common mistakes

- Using a keyword as a variable name (`int new = 5;`).
- Starting an identifier with a digit.
- Forgetting that Java is case-sensitive (`Main` and `main` are different).
- Confusing keywords with literals: `true`, `false`, and `null` look like keywords but are literals.

## 13. Explain Feature of Java?

### Features of Java

Java’s popularity comes from a set of design goals: it should be simple to learn, safe to run, and able to work on any platform. Here are its main features.

**1. Simple**

Java’s syntax is clean and close to C and C++, but it removes the confusing parts: no explicit pointers, no operator overloading, no manual memory management, and no multiple inheritance of classes.

**2. Object-oriented**

Almost everything in Java is organized into classes and objects. It supports the four core OOP principles:

- **Encapsulation:** bundling data and methods together and hiding internal details
- **Inheritance:** a class can reuse the properties of another class
- **Polymorphism:** one interface, many forms (method overloading and overriding)
- **Abstraction:** showing only essential details

(Java is not 100% object-oriented, because it still has eight primitive types.)

**3. Platform-independent**

Java source code is compiled into bytecode, not machine code. Bytecode runs on any device that has a JVM (Java Virtual Machine). This is the “Write Once, Run Anywhere” idea.

```text
Source code (.java) → Compiler (javac) → Bytecode (.class) → JVM → Runs on any OS
```

**4.Secure**

- No direct memory access through pointers
- The bytecode verifier checks code before it runs
- The ClassLoader and the security manager framework limit what code can do
- Strong exception handling and type checking

Note that the Security Manager has been deprecated for removal in recent Java versions, so modern Java relies more on other mechanisms such as module encapsulation and container or OS-level isolation.

**5. Robust (reliable)**

Java catches errors early and handles them gracefully:

- Strong type checking at compile time
- Exception handling with `try`, `catch`, `finally`
- Automatic garbage collection prevents most memory leaks and dangling references
- No pointer errors

**6. Portable**

Because the language specification fixes the size of each data type (an `int` is always 32 bits on every platform), programs behave the same everywhere. In C, the size of `int` can vary by machine.

**7. Architecture-neutral**

Bytecode does not depend on any processor architecture. It works the same on Intel, ARM, and others.

**8. Multithreaded**

Java has built-in support for running multiple tasks at the same time using **threads**. This helps with responsive applications, servers, and games.

```java
class MyTask extends Thread {
    public void run() {
        System.out.println("Running in a separate thread");
    }
}
```

Newer versions also offer virtual threads (Java 21), which make handling very large numbers of concurrent tasks much easier.

**9. High performance**

Java is slower than fully native code in some cases, but the JIT (Just-In-Time) compiler converts frequently used bytecode into machine code at runtime, giving performance that is close to native for many workloads.

**10. Distributed**

Java has strong networking support (`java.net` package, sockets, HTTP client) for building applications that communicate across networks.

**11. Dynamic**

Classes are loaded when needed at runtime, not all at once. Java can also inspect and work with classes during execution using reflection.

**12. Automatic memory management**

The garbage collector finds objects that are no longer used and frees their memory, so you don’t call `free()` or `delete` like in C or C++.

**13. Rich standard library and ecosystem**

A large built-in API covers collections, I/O, networking, date and time, concurrency, and more. On top of that is a huge ecosystem of frameworks and tools, such as Spring, Hibernate, Maven, and Gradle.

### Summary table

| Feature              | Meaning in short                       |
|----------------------|----------------------------------------|
| Simple               | clean syntax, no pointers              |
| Object-oriented      | classes, objects, OOP principles       |
| Platform-independent | bytecode runs on any JVM               |
| Secure               | bytecode verification, no raw pointers |
| Robust               | exception handling, garbage collection |
| Portable             | fixed data type sizes                  |
| Architecture-neutral | not tied to any processor              |
| Multithreaded        | built-in thread support                |
| High performance     | JIT compiler                           |
| Distributed          | strong networking APIs                 |
| Dynamic              | runtime class loading, reflection      |

### Common exam point

If you are asked for the “buzzwords of Java” (from the original Sun white paper), the list is: **Simple, Object-oriented, Distributed, Robust, Secure, Architecture-neutral, Portable, High-performance, Multithreaded, and Dynamic, plus Interpreted** (bytecode is run by the JVM).

## 14.Explain Local Variables?

### Local Variables in Java

A local variable is a variable declared inside a method, constructor, or block (such as an if, for, or while body). It exists only while that block is running and cannot be used outside it.

```java
public class Demo {
    public static void main(String[] args) {
        int age = 25;                 // local variable
        System.out.println(age);
    }
}
```

### Key characteristics
- Declared inside a method, constructor, or block.
- **Scope:** visible only within the block where it is declared, from the point of declaration to the closing brace }.
- **Lifetime:** created when the block starts executing and destroyed when it ends.
- Stored in the stack memory (each method call gets its own stack frame). If the variable holds an object, the reference is on the stack and the object itself is on the heap.
- **No default value:** you must assign a value before using it.
- **No access modifiers:** you cannot use `public`, `private`, `protected`, or `static` on a local variable.
- Only `final` is allowed (and it makes the variable unchangeable once assigned).

### No default value

Unlike instance and static variables, local variables are not automatically initialized:

```java
public static void main(String[] args) {
int x;
System.out.println(x);   // compile error: variable x might not have been initialized
}
```

Fix it by assigning a value first:

```java
int x = 0;
System.out.println(x);       // 0
```

### Scope examples

**Method scope**

```java
void show() {
int a = 10;
System.out.println(a);   // works
}

void other() {
System.out.println(a);   // error: a is not visible here
}
```

**Block scope**

```java
for (int i = 0; i < 3; i++) {
    int square = i * i;      // exists only inside the loop body
    System.out.println(square);
}
System.out.println(i);       // error: i is out of scope
System.out.println(square);  // error: square is out of scope
```

**Parameters** are also local variables: they belong to the method and exist only during the call.

```java
int add(int a, int b) {      // a and b are local to add()
    int sum = a + b;         // sum is local too
    return sum;
}
```

### Same name in different methods

Each method has its own separate local variables, so the same name can be reused without conflict:

```java
void first()  { int count = 1; }
void second() { int count = 2; }   // completely separate variable
```

### Shadowing and redeclaration

Java does not allow you to declare a local variable with the same name as another local variable that is still in scope:

```java
int x = 5;
{
    int x = 10;   // error: x is already defined in this method
}
```

However, a local variable **can shadow** an instance variable (field). The local one takes priority, and you use this to reach the field:

```java
class Student {
int marks = 50;               // instance variable

    void show() {
        int marks = 80;           // local variable shadows the field
        System.out.println(marks);        // 80
        System.out.println(this.marks);   // 50
    }
}
```

This is also why constructors often use `this.name = name;` when a parameter has the same name as a field.

### The `var` keyword (Java 10+)

For local variables only, Java can infer the type from the assigned value:

```java
var count = 10;           // inferred as int
var name = "Ravi";        // inferred as String
```

`var` works only for local variables with an initializer. It cannot be used for fields, parameters, or return types.

### Local vs instance vs static variables

| Feature          | Local                  | Instance                      | Static                         |
|------------------|------------------------|-------------------------------|--------------------------------|
| Declared         | inside method/block    | inside class, outside methods | inside class with `static`     |
| Scope            | the block only         | the whole object              | the whole class                |
| Default value    | none (must initialize) | yes (`0`, `false`, `null`)    | yes                            |
| Memory           | stack                  | heap (inside object)          | method area / class storage    |
| Access modifiers | not allowed            | allowed                       | allowed                        |
| Lifetime         | until the block ends   | as long as the object exists  | as long as the class is loaded |

**Local variables in lambdas and inner classes**

A local variable used inside a lambda or anonymous class must be **final or effectively final** (never changed after assignment):

```java
int base = 10;
Runnable r = () -> System.out.println(base);   // OK
// base = 20;   // would cause a compile error above, since base is no longer effectively final
```

### Common mistakes

- Using a local variable before assigning it a value.
- Using a variable outside the block where it was declared (scope error).
- Declaring the same variable name twice in the same scope.
- Adding `public`, `private`, or `static` to a local variable.
- Assuming a local variable keeps its value between method calls. It does not, because it is recreated each time the method runs.

## 15. Explain Java in time Compiler?

### Just-In-Time (JIT) Compiler in Java

The JIT compiler is a part of the JVM that converts frequently used bytecode into native machine code at runtime, so the program runs much faster than if the JVM only interpreted bytecode line by line.

### Why is the JIT needed?

Recall how Java runs:
```text
Source (.java) → javac → Bytecode (.class) → JVM → Machine code → CPU
```

The CPU cannot run bytecode directly. The JVM has two ways to execute it:

| Method       | How it works                                          | Speed                             |
|--------------|-------------------------------------------------------|-----------------------------------|
| Interpreter  | Reads and executes bytecode one instruction at a time | Starts fast, runs slowly          |
| JIT compiler | Compiles bytecode to machine code and caches it       | Slower to start, runs much faster |

Interpreting the same code again and again (such as a loop running a million times) is wasteful. The JIT solves this by compiling that code once and reusing the machine code afterwards.

### How the JIT works

1. The JVM starts by interpreting bytecode, so the program begins running immediately.
2. While running, the JVM profiles the code, counting how often each method and loop is executed.
3. Code that runs very often is called hot code (a “hotspot”).
4. The JIT compiler compiles the hot code into optimized native machine code.
5. The machine code is stored in the code cache.
6. Future calls to that code run the native version directly, skipping interpretation.

Code that runs only once or twice is usually left interpreted, because compiling it would cost more than it saves.

### HotSpot JVM and tiered compilation

Oracle’s JVM is called HotSpot (named after this “find the hot spots” idea). It has two JIT compilers:

- **C1 (client compiler):** compiles quickly with light optimization. Good for fast startup.
- **C2 (server compiler):** compiles more slowly but applies heavy optimization. Good for long-running code.

**Tiered compilation** (the default in modern Java) combines both: code starts interpreted, then gets compiled by C1 quickly, and if it stays hot, it is recompiled by C2 for peak performance.

### Optimizations the JIT performs

Because the JIT sees the program while it is actually running, it can optimize based on real behavior:

- **Inlining:** replaces a method call with the method’s body to avoid call overhead.
- **Dead code elimination:** removes code that never affects the result.
- **Loop optimizations:** such as unrolling loops.
- **Escape analysis:** if an object never leaves a method, it can be allocated on the stack instead of the heap, or removed entirely.
- **Speculative optimization:** assumes common cases (for example, that a method is never overridden) and deoptimizes back to the interpreter if the assumption turns out wrong.

### JIT vs AOT vs interpreter

|                  | Interpreter       | JIT              | AOT (Ahead-of-Time)                   |
|------------------|-------------------|------------------|---------------------------------------|
| When it compiles | never; interprets | at runtime       | before running                        |
| Startup          | fast              | slower (warm-up) | fast                                  |
| Peak speed       | slow              | very high        | good, but fewer runtime optimizations |
| Example          | early JVM mode    | HotSpot C1/C2    | GraalVM Native Image                  |

### Advantages and disadvantages

**Advantages**

- Much faster execution than pure interpretation.
- Optimizations based on actual runtime behavior.
- Keeps platform independence, because the same bytecode is compiled to the right machine code for each CPU.

**Disadvantages**

- **Warm-up time:** a program runs slower at the start, until hot code is identified and compiled.
- Uses extra CPU and memory for compiling and for the code cache.

**Small example**

```java
public class Demo {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 0; i < 100_000_000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
```

The loop body runs 100 million times, so it quickly becomes hot code. The JIT compiles it to native code, and the loop finishes far faster than it would if interpreted. (You can see JIT activity with the JVM flag `-XX:+PrintCompilation`.)

### Key points to remember

- JIT is a component of the JVM, not a separate tool you run.
- It compiles bytecode to machine code at runtime, not source code.
- It targets hot code only.
- It is a big reason Java’s performance is close to native languages like C++ for many workloads.

### Common mistakes

- Thinking javac is the JIT. javac produces bytecode ahead of time, while the JIT works inside the JVM at runtime.
- Thinking Java is only interpreted. Modern JVMs both interpret and JIT-compile.
- Expecting full speed immediately. Java programs need a short warm-up period.


Fork

























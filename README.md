# ExtendLecture Example in Java

This project demonstrates the use of **inheritance** and **method overloading** in Java through two classes: `ExtendLecture` (the parent class) and `ExtendLecture2` (the child class).

## Features

1. **Inheritance**: The class `ExtendLecture2` extends the parent class `ExtendLecture`.
2. **Method Overloading**: The `value()` method is overloaded in the child class, allowing it to handle both integer and float arguments differently.
3. **Looping**: The `value()` method in the parent class prints the square of the given integer 10 times.

## Classes and Methods

### 1. ExtendLecture (Parent Class)
- **Variables**:
  - `int i`: Used to loop through and print the result.
  
- **Methods**:
  - `void value(int j)`: This method takes an integer `j`, and it prints `j * j` 10 times using a `for` loop.

### 2. ExtendLecture2 (Child Class)
- **Variables**:
  - `float i2`: A variable specific to the child class.
  
- **Methods**:
  - `void value(float j2)`: This method is overloaded to accept a float argument and prints `j2 * j2` once.

### 3. Main Method (`ClassLecture2`)
- Creates objects of both the child and parent classes.
- Demonstrates method overloading by calling the `value()` method with different argument types.
- Shows how polymorphism and inheritance work in Java.

## Example Usage

To run this example, compile the `ClassLecture2` class and execute it.

```bash
javac ClassLecture2.java
java ClassLecture2

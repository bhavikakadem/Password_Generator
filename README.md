# Java Password Generator

## About the Project

This is a simple command-line Java application that generates secure random passwords based on user-defined length. The password includes a mix of lowercase letters, uppercase letters, numbers, and special symbols, making it strong and suitable for everyday use.

The project demonstrates important Java concepts such as:

- Use of `SecureRandom` for cryptographically secure random number generation.
- String manipulation and `StringBuilder`.
- Basic input handling with `Scanner`.
- Object-oriented design with multiple classes to separate responsibilities.

---

## Technologies Used

- **Java**: Core programming language.
- **JDK (Java Development Kit)**: To compile and run the application.
## User Interface
- **Command Line Interface (CLI)**: Interaction via terminal.

---

## Key Features

- Generates passwords containing lowercase letters, uppercase letters, digits, and special symbols.
- Allows the user to specify the desired password length.
- Validates input to ensure the password length is a positive integer.
- Continuously prompts the user until valid input is entered.
- Demonstrates encapsulation through classes `Alphabet`, `Generator`, and `Password`.

---

## How to Run

### Prerequisites

- Install JDK (Java Development Kit). Download it from [Oracle JDK Download](https://www.oracle.com/java/technologies/javase-downloads.html).
- Ensure `javac` and `java` commands are available in your system's PATH.

---

### Steps to Compile and Run

1. Save your source code in a file named `PasswordGenerator.java`.

2. Open your terminal or command prompt.

3. Navigate to the directory containing your `PasswordGenerator.java` file, e.g.:

   cd path/to/your/project/folder
4. javac PasswordGenerator.java
5. java PasswordGenerator


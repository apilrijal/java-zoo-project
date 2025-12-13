<img width="1170" height="780" alt="image" src="https://github.com/user-attachments/assets/5eff2417-6c21-4b94-ace5-de3684b0bf27" /># 🦁 Zoo Management System (Java Console Application)
## 📌 Overview

The Zoo Management System is a Java-based, menu-driven console application designed to simulate the management of animals in a zoo.
This project demonstrates core Object-Oriented Programming (OOP) concepts, Java interfaces, object serialization, and file input/output (I/O).

Users can interactively:

Select animals

Set and view animal properties

Simulate animal behaviors

Save animal data to files

Load and display saved animal data

This project is well-suited for academic coursework, OOP practice, and Java portfolio projects.

## 🎯 Key Features
### 🐾 Animal Management

Abstract Animal base class with common properties:

name

age

height

weight

Concrete animal classes:

#### Tiger

#### Dolphin

#### Penguin

### 🧠 Object-Oriented Design

Inheritance: All animals extend the Animal class

Abstraction: Animal is abstract and cannot be instantiated

Encapsulation: Private fields with public getters/setters

Polymorphism: Same behavior methods with different implementations

### 🔌 Interface-Based Behavior

Eat – eating behavior

Walk – walking behavior

Swim – swimming behavior

Animals implement interfaces based on their abilities:

Tiger → Walk, Eat

Dolphin → Swim, Eat

Penguin → Walk, Swim, Eat

### 💾 Object Serialization & File Handling (NEW)

The system supports saving and loading animal objects using Java Serialization.

✔ Implemented Features

All animal classes implement Serializable

Objects are saved as .txt files using ObjectOutputStream

Objects are restored using ObjectInputStream

### 📂 Files Created
Animal	File Name
Tiger	tiger.txt
Penguin	penguin.txt
Dolphin	dolphin.txt
### 📜 Menu Options
Main Menu
1. Tiger
2. Dolphin
3. Penguin
4. Save animals to file
5. Display saved animals from file

### Sub Menu (Per Animal)
1. Set properties
2. Display properties
3. Display movement
4. Display eating

### 🔄 Save & Load Workflow

Option 4: Saves all current animal objects to files

Option 5: Reads saved objects from files and displays their state

Each animal’s toString() method is overridden to display only its own fields, ensuring clean output and compatibility with automated tests.

### 🧪 toString() Output Format (Strict)

The project follows strict formatting for toString() methods:

Tiger{numberOfStripes=100, speed=60, soundLevel=80}
Penguin{isSwimming=true, walkSpeed=5, swimSpeed=10}
Dolphin{color='Gray', swimmingSpeed=25}


Note: Inherited Animal fields are intentionally excluded.

## 🗂️ Project Structure
src/
├── Main.java
├── Animal.java
├── Tiger.java
├── Dolphin.java
├── Penguin.java
├── Eat.java
├── Walk.java
└── Swim.java

## 🖥️ Technologies Used

Java SE

Object-Oriented Programming (OOP)

Java Serialization

File I/O (ObjectInputStream, ObjectOutputStream)

Console-based UI

## ▶ How to Run

Clone the repository:

git clone https://github.com/yourusername/zoo-management-system.git


Navigate to the project directory:

cd zoo-management-system/src


Compile:

javac *.java


Run:

java Main

### 🖼️ Application Preview (Conceptual)

These are illustrative placeholders for documentation or GitHub README visuals.

### 🚀 Learning Outcomes

By completing this project, you gain hands-on experience with:

Designing class hierarchies

Implementing Java interfaces

Applying polymorphism

Persisting objects using serialization

Building interactive console applications

Writing test-friendly, deterministic code

### 📌 Future Enhancements

Add file existence checks before reading

Introduce exception-specific error handling

Add a GUI (JavaFX / Swing)

Store data in JSON or a database

Add more animal types

## 👨‍💻 Author

Zoo Management System
Developed as a Java OOP and File Handling project by Apil Rijal.

# Zoo Management System

## Overview
The **Zoo Management System** is a Java-based console application designed to simulate a virtual zoo. The project demonstrates **Object-Oriented Programming (OOP) principles** including **inheritance, abstraction, encapsulation, and polymorphism** while managing different types of animals and their behaviors.  

Users can interact with the system via a menu-driven interface, allowing them to **select animals**, **set properties**, **display characteristics**, and **simulate behaviors** like walking, swimming, and eating.

---

## Features
- **Animal Hierarchy**:  
  - Abstract `Animal` class as the base for all animals.  
  - Specific animal classes (`Tiger`, `Dolphin`, `Penguin`) inherit from `Animal`.  
  - Encapsulation of properties using **private fields** with **public getters and setters**.  

- **Behavior via Interfaces**:  
  - `Eat` interface implemented by all animals for eating behaviors.  
  - `Walk` interface implemented by land animals (e.g., `Tiger`, `Penguin`).  
  - `Swim` interface implemented by water animals (e.g., `Dolphin`, `Penguin`).  
  - Demonstrates **polymorphism**, allowing different animals to have distinct behavior implementations.  

- **Menu System**:  
  - Users can choose between animals using a **main menu**.  
  - Nested **sub-menu** allows setting properties, viewing characteristics, testing movement, and simulating eating behavior.  
  - Supports **flexible interaction** and continuous exploration of animal functionalities.

- **Flexible Initialization**:  
  - Default constructors initialize animals with predefined values (e.g., `"Tiger"`, `"Dolphin"`, `"Penguin"`).  
  - Parameterized constructors allow creating objects with custom data.

---

## Object-Oriented Programming Concepts Demonstrated
1. **Abstraction**  
   - `Animal` is an abstract class representing common properties and behaviors.  
   - Prevents instantiation of generic animals while defining a template for all child classes.

2. **Inheritance**  
   - `Tiger`, `Dolphin`, and `Penguin` extend `Animal` and reuse common properties like `age`, `weight`, and `height`.

3. **Encapsulation**  
   - Animal properties are **private** and accessed/modified through **public getters and setters** to ensure controlled access.

4. **Polymorphism**  
   - Interface methods (`walking()`, `swimming()`, `eatingFood()`) are implemented differently across animal types.  
   - Overriding the `eatingFood()` method allows each animal to have unique eating behavior.

5. **Interface Implementation**  
   - Interfaces (`Eat`, `Walk`, `Swim`) define contracts for animal behavior without specifying implementation.  
   - Enables multiple behaviors for a single class (e.g., `Penguin` can both walk and swim).

---

## Classes Overview
- **Animal.java**: Abstract parent class with common properties and methods.  
- **Tiger.java**: Land-based animal; implements `Walk` and `Eat`.  
- **Dolphin.java**: Water-based animal; implements `Swim` and `Eat`.  
- **Penguin.java**: Multifunctional animal; implements `Walk`, `Swim`, and `Eat`.  
- **Interfaces**:  
  - `Eat.java` – defines `eatingFood()` and `eatingCompleted()`.  
  - `Walk.java` – defines `walking()`.  
  - `Swim.java` – defines `swimming()`.  
- **Main.java**: Entry point; contains menu-driven interface for interacting with animals.

---

## How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/zoo-management.git

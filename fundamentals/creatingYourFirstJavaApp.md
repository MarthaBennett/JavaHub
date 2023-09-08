Java SE 17 Fundamentals

# Create and run app with IntelliJ IDEA

- Build a simple Java application
- Using IntelliJ

For now, just think of a class as something that can contain sections of code.

The name of the class doesn't matter: the name of the class within the method does.

Couple of ways we can run it: 'Run' with green arrow or just green arrow in top toolbar. This will build and run the application (IntelliJ does it for you).

Main is always the entry point

## JRE, JDK, IDE

JRE = Java Runtime Environment (translates bytecodes into an executable host environment)
JDK = Java Development Kit (tools required to make Java applications)
IDE = Integrated Development Environment (e.g. IntelliJ - edit, build + run applications)

The IDE cooperates with the JDK to produce the Java App

We want to run it in a host environment (e.g. Windows, Mac or Linux) - but they are byte-agnostic, so the JRE helps it run.

For the user, the set-up is simpler:

    Java App
      |
     JRE
      |
    Host Environment

## Running from the Command Line

Java applications are not native, they have to be run in the JRE

NB: class file names are case-sensitive

        javac Main.java
        java Main.java

 ## Statement Structure and Whitespace

 - Programs are made up of statements:

        System.out.println( "Pluralsight" );

 - Always end with a semicolon ;

 - Can contain zero or more whitespaces therefore you can mix it up - content controls behaviour, not whitespace

## Comments

Text ignored by the compiler.

- Makes it more readable

- Can 'hide' code

Types of comment:

    //...
    Line comment (ignore text until it reaches the end of the line)

    /*...*/
    Block comment (text ignored within the block)

    /**...*/
    Javadoc comment (treated like a block comment BUT can be used to generate documentation)

## Introduction to Packages

Source files are usually qualified with a package name

Packages: 

- Help us with organisation
- Follow standard naming convention 
- Affect source code structure 

Packaging Naming Conventions

- All lowercase
  - Use reverse domain name notation to assure global uniqueness

         package com.pluralsight

    - They affect our source code organisation
   
           src
           |
           com
           |
            pluralsight
               |
               example
                  |
                  Main.java

E.g. 

      java com.pluralsight.orgaqnized.Main

------------

# Variables, Data Types and Math Operators

## Variables

A way to store valuables

- Its a named data storage
- Strongly typed e.g. of an 'int' value

    



# Conditional Logic and Block Statements
# Looping and Arrays
# Understanding Methods
# Working with Strings
# Understanding Classes and Objects
# Implementing Class Constructors and Initializers
# Using Static Members
# A Closer Look at Methods
# Working with Wrapper Classes, Enums and Records
# Introducing Annotations

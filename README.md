# JavaHub

Java SE 17 Fundamentals - PluralSight

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
- Consist of only letters and numbers
- Variable names cannot start with a number
- Name variables using camelCase
- We can reassign value to variables
- Sometimes we don't - so we use the 'final' modifier (so it can't be changed)

## Primitive Data Types

- Built into the Java language
- The types from which all other types are made
- 4 categories: Integer, Floating point, Character + Boolean

### Integer Types

- byte (max value 127)
- short (max value 32767)
- int (max value 2147483647)
- - long (max value 9223372036854775807, literal form 0L)

### Float Types

- float (32 bits, literal form 0.0f)
- double (64 bits, literal form 0.0 or 0.0d)

### Character Types

- char (single Unicode character, can store values that aren't on your keyboard (\u00DA can equal U with an accent))

### Boolean Types

- boolean (true/false)

## Primitive Types are Stored by Value

- Types are stored by value
- Each variable gets its own independent copy of each value
- Each variable's values are unrelated to other variables values
- When we make an assignment, there's an independent copy made of that value

## Arithmetic Operators

### Basic

    + - * / %

- Work a bit like in Maths
- There's no impact on the values used in the operation

NB when dividing integers, there can be no decimals (so 13/5 would give 2)

NB Modulus gives us the remainder (so 13 % 5 would give 3)

### Prefix/postfix

        ++ //increment value by 1
        -- //decrement value by 1

- Increase or decrease a value
- Replace the original value

NB Order matters!

- Prefix applies operation before returning value
- Postfix applies operation after returning value 

### Compound assignment

Combine an operation and an assignment

- Apply right side value to left side
- Store result in variable on left side
- Operate on a value
- At the end of the calculation, they replace the original value

These are available for the 5 basic maths operations:

        +=  -=  *=  /=  %=

## Operator Precedence

There's a hierarchy of operators

What order will the compiler work through these operators?

        Postfix X++ X--, Prefix ++X --X, Multiplicative * ? %, Additive + -

NB If there are multiple operators in a calculation that have the same level of precedence, the compiler will work through them L --> R

NB You can override precedence with parenthesis (these can come in v. handy)

NB Nested parenthesis is evaluated from the inside --> out

## Type Conversion

Two main types:

- Implicit (conversion automatically performed by the compiler)

        int intValueOne = 50;
        long longValueOne = intValueOne;

        //The compiler has implicitly assigned the int value to be a long

There are only certain types that can be converted implicitly

- Mixed integer sizes = compiler will use the largest integer in the equation
- Mixed floating point sizes = compiler will automatically use a double
- Mixed integer amd floating point = the compiler will use the largest floating point in the equation

- Explicit (conversion performed explicitly in code with cast operator)

        long longValueOne = 50;
        int intValueTwo = (int) longValueTwo;

        //(int) is the cast operator

NB Can perform widening or narrowing conversions 

NB Be aware of potential side effects!

E.g. if you try to fit something big into something smaller, significant bits may be disgraded

OR

Floating point to integer, fractional portion is discarded

OR

Integer to floating point, precision may be lost (due to a nuance of how floating point values are stored)

## A Closer Look at Type Conversions

(Converting types in sequence using parenthesis)

## Inferring Variable Type

The var keyword infers the type of a local variable based on the value initially assigned to it

        var v1 = 50; 

        //v1 is an int

- You can use it with almost any data type

        var myValue = 100.0;
- 
        //myValue is a double

NB Because the var keyword infers the data type based on the value that's assigned to the variable, you can only use the var keyword when you're initialising the value as part of the declaration

E.g. you can't do this because the compiler can't tell at declaration time what the type of x is supposed to be.

        var x;

        //some time later in the code...

        x = 100;

NB The variable is statically typed, meaning the type of the variable remains the same once it's declared.

How do I get round this?

You can cast it!

        var v1 = 50; 

        //v1 is an int

        v1 = (int) 100.0; 

        //we've used a cast to change the type

OR

        var thisValue = 7.5f; 

        //this value is a float

        v1 = (int) thisValue;

        //this value is now an int





-----

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

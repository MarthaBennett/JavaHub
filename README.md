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

Helps us create interesting applications

There are 2 key parts:

1. Performing a test
2. Performing an action based on test result

## Conditional Logic and Relational Operators

- Greater than >
- Greater than or equal to >=
- Less than <
- Less than or equal to <=
- Equal to ==
- Not equal to !=

### Conditional Assignment

Return a value based on the result of a condition

        condition   ?   true-value //this is the value we want returned if the condition is true

        condition   ?   true-value :    false-value //this is the value we want returned if the condition is false

        result  =   condition   ?   true-value  :   false-value ; //now we have created a result which will tell us whether the condition is true or false

E.g.

        int value1 = 7;
        int value2 = 5;
        int maxValue = value1 > value2 ? value1 : value2;

        //here, we're wanting to check whether value1 is indeed larger than value2 
        //if that condition is true, we'll return back value1
        //if that condition is true, we'll return back value2


## If-else Statement

One of the most common ways of including a conditional statement

- An if-else statement conditionally executes a statement

- Else clause executes a statement when condition is false
- It is optional - only to be used in the case of the condition being false


        if (condition) 
            true statement;
        else
            false statement;

E.g.

        int value1 = 10;
        int value2 = 4;
        if (value1 > value2)
            System.out.println("value1 is bigger");
        else
            System.out.println("value1 is not bigger");

In some cases, we need to test a series of conditions in sequence.

### Chaining if-else

- Evaluated in order, top-bottom
- First to test true is executed
        
      if (condition-1)
              true-statement-1;
      else if (condition-2)
              true-statement-2;
            .
            .
            .
      else if (condition-N)
            true-statement-N;
      else
            false-statement;

- We can add an 'else' to the end of the statement if none of the conditions are tested as true

## Creating the CalcEngine Project

I'm making this under Source/Repos/LearningJava/JavaHub/gitHubRepo/pluralSightCalculator :)

## Logical Operators

Allow us to take 2 true or false values and create a single true or false result from those values

- May combine two relational tests
- May combine two Boolean variables

There are 4 basic Logical Operators:

### And & resolves: 

true & true

        int a = 20, b = 14, c = 5;

                true
                 |
            true    true
             |        |
        if (a > b & b > c)

        System.out.println("a is greater than c");

### Or | resolves 

false | true, true | false, true | true

### Exclusive or (XOR) ^ resolves 

false ^ true, true ^ false

### Negation ! false //NB the negation operator reverses the value. So the only thing that resolves to true is false.

        boolean done = false;

            true
              |
             false
                |
         if (! done)
            System.out.println("Keep going!");

- We have a boolean condition set to false. 
- So, the 'if' condition, we have 'if not' done - the first thing we do is look at the 'done',
- 'Done' has a value of 'false' and then we take the negation operator and apply it to that.
- The negation operator reverses it, so not false is true.
- So, in this case, we would run the next line, which would print out "Keep going!"

### Conditional Logical Operators

- Similar to standard logical operators

- They only perform the right side of the operation when it needs to:

### And && 

true && true

### Or ||

false || true, true || ---- //it won't even bother checking the right side in the second instance because it already knows the left side to be true

- && executes right only when the left is true
- We know if the condition is false, the left side's not going to pass

I'm making LetsGetLogical under Source/Repos/LearningJava/JavaHub/gitHubRepo/letsGetLogical

## Logical vs. Conditional Operators

Because we used the conditional operator 'and' (&&), the test didn't crash: our program runs 'the completion'

We didn't print the word "Crowded" because we couldn't determine the number of students in the rooms.

That's because when using the Conditional Logic &, when we did the evaluation to see if rooms !=0, it tested to false.

Because it tested to false, we never bothered doing the right side of the condition.

## Block Statements

- Groups several statements together
- It creates a compound statement
  - It is created by enclosing statements in opening and closing brackets

          {
              statement-1;
              statement-2;
                  .
                  .
                  .
              statement-N;
          }

    - Java will now treat them as a block statement

            int v1 = 10, v2 = 4;
            final int diff;                   //3rd variable called 'diff'. It is final, meaning we can only assign to it once.
            if (v1 > v2)
                diff = v1 - v2;               //if that statement is true, we want to calculate the difference by subtracting v2 from v1...
                System.out.println("v1 is bigger than v2, diff = " + diff); //printing out the message "v1 is bigger than v2" + displaying the difference
        
            else
              diff = v2 - v1;
              System.out.println("v1 is not bigger than v2, diff = " + diff);

This code as it is written has some significant issues

- The only thing associated with the 'if' is the 'diff' calculation as it only runs the one line that follows it.
- In addition, this code would not compile - the 'else' would not be valid because it's not associated with the 'if'.
- The reason is: there's more than one statement between the 'if' and the 'else'
- So, if we want to run these multiple statements with the 'if', we've got to group them together somehow.
  - This is where the block statement comes in

        int v1 = 10, v2 = 4;
        final int diff;
        if (v1 > v2) {
            diff = v1 - v2;
            System.out.println("v1 is bigger than v2, diff = " + diff);
        }
        else
            diff = v2 - v1;
            System.out.println("v1 is not bigger than v2, diff = " + diff);

- The code will now compile because the 'else' is associated with the 'if'
  - But there's still an issue, because that 'else' will only run the one line that follows it.
    - So, if we want the 'else' to do the 'diff' calculation and print out the value, we again need to create a block statement

          int v1 = 10, v2 = 4;
            final int diff;
            if (v1 > v2) {
                diff = v1 - v2;
                System.out.println("v1 is bigger than v2, diff = " + diff);
            }
            else {
                diff = v2 - v1;
                System.out.println("v1 is not bigger than v2, diff = " + diff);
            }

- 'Else' has also now become a block statement, so both of those statements are now associated with the 'else'

### Variable Scope

- Where is a particular variable visible from?
- Variable declared within a block statement - scope is limited to that block
- In other words, the variable cannot be seen from outside the block (or you'll get a compile error)

        double students = 30.0d, rooms = 4.0d;
        if (rooms > 0.0d) {
            System.out.println(students); //NB: variables are allowed to come inside of a block
            System.out.println(rooms);
            double avg = students / rooms
            System.out.println(avg); //you have to move the println up inside the block
        }


## Using Block Statements in CalcEngine

- 'Else' will only run one line after itself - how do we fix this?
- We need to put the code related to the 'Else' inside a block statement
- Now, when we run it, we get our appropriate results, 2.0 :)

  - We can also add additional 'if' statements to check that we are not trying to divide the number 0:

        ...
        else if(opCode == 'd')
          if(value2 != 0)

- BUT! If we do this, the final 'else' gets left out in the cold
- How do we fix this?
- You guessed it: we put the check for value2 not equalling zero inside a block statement!

## Switch Statement

- A  way for us to implement conditional logic, 
- Allows us to test a single value against multiple matches

      switch(value-to-test) {
        case matching-value-1:
          statements
          break;
        .
        .
        .
       case matching-value-N:
          statements
          break;
        default:
          statments
        }

- Put the variable that we want to check to see its current value
- And then within the switch, we list a series of cases.
- Each case provides a potential matching value
- So when it hits the switch statement, it'll look at the current value that's in the variable,
- Find the case that matches it,
- Then transfer control to that match,
- Then run all the statements within that case until it hits the 'break' keyword.
- The 'break' keyword indicates that we want to jump out of the switch.

-  Only certain primitive types can be used with a Switch statement:
  - byte
  - short
  - int
  - long
  - char

- Within our switch, each case can run multiple statements
- So, unlike an 'if' statement, code doesn't run in blocks: within a match, there can be multiple statements
NB: Make sure to end each case's statement with a break (or code will 'fall through' (it would find the match, start running the code in that case and if there's no break statement there, it would just run right through to the next case))

## Using Switch Statement and Conditional Assignment

(Back in CalcEngine project)

Instead of writing lots of 'else if' statements, we can use a switch statement:

      switch(identifyTheVariableWeWantToTest) {
          theValuesWeWantToTestOpCodeAgainst:
                                        calculation;
                                        break;
    
          and so on and so forth...
      }

      
      switch(opCode) {
        case 'a':
              result = value1 + value2;
              break;
        case 's':
              result = value1 - value2;
              break;
        case 'm':
              result = value1 * value2;
              break;
        case 'd':
              if (value2 != 0)
              result = value1 / value2;
              break;
    }

Now, all 4 of our opCodes are handled :)

NB: with a switch statement, we don't use 'else', we use 'default' and we remove the {}s, replacing one of them with a ':'

A Switch is more clear than an 'if/else' chain

We can tighten it up further - there's a chance to use the conditional assignment ooo!

    case 'd':
    if (value2 != 0)
    result = value1 / value2;
    break;

    //Changes to:

    case 'd':
    result = value2 != 0  ? value1 / value2 : 0.0d; //Before ':' = if the condition is true, we want to divide value1 by value2, after ':' = if the condition is false, we'll simply return 0
    break;

The code is now much cleaner and easier to read.

------
# Looping and Arrays

Blocks of repeated work across groups of repeated data.

Doing this requires loops + ...

We often have to manage this data in what are known as arrays.

- There are a number of different loop types in Java
- Each loop basically does the same thing
- We provide a condition that we call a 'control condition'
- The loop will keep running for as long as that condition remains true

3 fundamental loops in Java:

- While loop (basic looping)
- Do-while loop (looping with deferred condition check)
- For loop (similar to a while loop but has a simplified notation for use with common cases)

## While Loop

Control condition is checked at the start of the loop:

    while (condition)
      statement;

By default, a loop will only run the one statement that follows it.

If you want to make multiple statements, you have to make this a compound statement by enclosing them in brackets

NB: because a while loop checks the condition at the start of the loop, it's possible that the loop body may never run. If the condition reaches a while loop and the condition is false, the loop body will never be executed.

An example:

Calculating a factorial value (the number multiplied by each integer below it, down to 1)

    int someValue = 4;          //This is the number we want to calculate the factorial of
    int factorial = 1;          //This will hold the result of the factorial calculation
    while(someValue > 1) {      //Setting up a while loop for while the value is still greater than 1
      factorial *= someValue;   //This is the factorial calculation - it will also reduce someValue's current value
      someValue--;              //We also want it to run for the other value...
    }                           //... So we can put them both in squiggly brackets
    System.out.println(factorial); //When the loop is finished, we want to display the factorial value.

When we run this code:

1. We allocate out the someValue variable (which has a value of 4) + we'd also have our factorial variable with a value of 1
2. In the while loop - the first thing we'll do is check the condition is greater than 1
3. someValue has a value of 4, so our condition is true, so we go into the body of the loop
4. We take factorial's current value (which is 1), multiply that by someValue (which is 4), (4 times 1 is 4) and we store that back into factorial
5. We reduce someValue by 1, so we go from 4 to 3
6. And then the while loop again checks the condition (3 is greater than 1)
7. So we go back into the body of the loop 
8. We multiply 4 times 3 (which is 12) and store that into factorial
9. Reduce someValue by 1, so that takes us down to 2
10. We again check the condition (2 is greater than 1)
11. Back into the body of the loop
12. (12 times 2 is 24)
13. Reduce someValue by 1 (which makes it 1)
14. We go back to the condition in our while loop and check is 1 > 1 (it is now false!)
15. So we exit the loop and print out the value factorial
16. (Which will display the value 24)

## Do-while Loop

This continues running as long as the control condition is true

NB: the key difference is that the condition is checked at the ned of the loop.

    do
    while (         )
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    

## For Loop


------
# Understanding Methods
# Working with Strings
# Understanding Classes and Objects
# Implementing Class Constructors and Initializers
# Using Static Members
# A Closer Look at Methods
# Working with Wrapper Classes, Enums and Records
# Introducing Annotations
 
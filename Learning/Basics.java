public class Basics{
    public static void main(String[] args){
        //System.out.println("Hello World !");

        int num1 = 15;
        System.out.println(num1);

        /*
        you can add the final keyword if you don't want others (or yourself) to overwrite existing values 
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):
        */
        final int num2 = 10;
        //if you try this this will generate an error...
        //so comment and then run the code :) or uncomment if want to see an error...
        //num2 = 20;

        System.out.println("*****Addition of two string*****");
        String name = "Model";
        System.out.println("Hello " + name);
        //System.out.print("\n\n");

        String f1 = "Suraj ";
        String f2 = "Gavali";
        String total = f1 + f2;
        System.out.println(total);

        /*
        Data types are divided into two groups:

            1. Primitive data types - includes byte, short, int, long, float, double, boolean and char
            2. Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)   
            
            
            Data Type	Size	Description

              byte	   1 byte	Stores whole numbers from -128 to 127
              short	   2 bytes	Stores whole numbers from -32,768 to 32,767
              int	   4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
              long	   8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
              float	   4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
              double   8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
              boolean  1 bit	Stores true or false values
              char	   2 bytes	Stores a single character/letter or ASCII values
        ------------------------------------------------------------------------------------------------------------------------------

        Numbers :

            Primitive number types are divided into two groups:

            Integer types - stores whole numbers, positive or negative (such as 123 or -456), 
            without decimals. Valid types are byte, short, int and long. Which type you should use, 
            depends on the numeric value.

            Floating point types - represents numbers with a fractional part, 
            containing one or more decimals. There are two types: float and double.
        */

        System.out.print("\n\n");

        System.out.println("*****Data types*****\n");
        long myLong = 15000000000L;
        System.out.println("Long : " + myLong);

        float myFloat = 5.75f;
        System.out.println("Float : " + myFloat);

        double myDouble = 19.99d;
        System.out.println("Double : " + myDouble);  

        float fl1 = 35e3f;
        double d1 = 12E4d;

        System.out.println("Floating number with specific number after decimal " + fl1);
        System.out.println("Double number with specific number after decimal " + d1);

        /*
        Non-Primitive Data Types - 

            Non-primitive data types are called reference types because they refer to objects.

            The main difference between primitive and non-primitive data types are:

                Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and 
                is not defined by Java (except for String).

                Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.

                A primitive type has always a value, while non-primitive types can be null.

                A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

                The size of a primitive type depends on the data type, while non-primitive types have all the same size.

        Java Type Casting - 

            Type casting is when you assign a value of one primitive data type to another type.

            In Java, there are two types of casting:

            Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

            Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte
        */

        int myInt = 9;
        double myD = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myD);   // Outputs 9.0

        double myD2 = 9.78d;
        int myI2 = (int) myD2; // Manual casting: double to int

        System.out.println(myD2);   // Outputs 9.78
        System.out.println(myI2);      // Outputs 9

        /*
        String Length
        
            A String in Java is actually an object, which contain methods that can perform certain operations on strings. 
            For example, the length of a string can be found with the length() method:

        */

        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        //String Methods

        String txt1 = "Hello World";
        System.out.println(txt1.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt1.toLowerCase());   // Outputs "hello world"

        /*
            Finding a Character in a String

                The indexOf() method returns the index (the position) of the first occurrence of a 
                specified text in a string (including whitespace):

        */

        String txt2 = "Please locate where 'locate' occurs!";
        System.out.println(txt2.indexOf("locate")); // Outputs 7

        /*
        
            String Concatenation
                
            The + operator can be used between strings to combine them. This is called concatenation:

            You can also use the concat() method to concatenate two strings:

        */

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

        String firstName1 = "John ";
        String lastName1 = "Doe";
        System.out.println(firstName1.concat(lastName1));

        /*
        
        Math class - 

            1. Math.max(x,y)
            2. Math.min(x,y)
            3. Math.sqrt(x)   -- 
            4. Math.abs(x)    -- method returns the absolute (positive) value of x
            5. Math.random()  -- returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
            
            To get more control over the random number, e.g. you only want a random number between 0 and 100, 
            you can use the following formula:

                int randomNum = (int)(Math.random() * 101);  // 0 to 100

            
            Short Hand If...Else (Ternary Operator)
                
                There is also a short-hand if else, which is known as the ternary operator because it consists of three operands. 
                It can be used to replace multiple lines of code with a single line. It is often used to replace simple if else statements:

                    variable = (condition) ? expressionTrue :  expressionFalse;
        
        */

        /*
        
            For loop : 

                For-Each Loop:

                    for (type variableName : arrayName) {
                        // code block to be executed
                    }
        */

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
            for (String i : cars) {
                System.out.println(i);
            }
        }

        /*
        
        Java Arrays : 

            
        */
}
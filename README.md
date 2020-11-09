**README.md**  
**ABINAYA R**  
**11/08/2020**  


#### CODE AVAILABILITY:
GitHub URL: https://github.com/AbinayaRav/AssignmentTask1.git

#### ASSIGNMENT DESCRIPTION:
The assignment requires the completion of the below requirements:  

**1. Swap two numbers using the third variable as a result name and do the same task without using any third variable.**  
 The code logic prompts the user to enter any two numbers and swapping is made. 
 
***With temporary variable:***
 ```java
 result = number1;  
 number1 = number2;  
 number2 = result;
 ```
 ***Without temporary variable:***
 ```java
 number1 = number1 + number2;
 number2 = number1 - number2;
 number1 = number1 - number2;
 ```

**2. Write a program to print the value given by the user.**   
 A simple code logic that prompts the user to enter any given value and then print it back on the console. The Scanner class is used to get the user input.
 ```java
 Scanner scan = new Scanner(System.in);       
 int userData = scan.nextInt();
 ```

**3. Write a program to complete the task given below:  
 ●	Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.  
 ●	Use z for adding 30 into it and print the final result by using variable results.**  
 The code logic prompts the user to enter any two numbers. The two numbers are checked if they are between 1 and 10. If not within the range, the user is prompted to enter the   numbers until they are correct using looping structure. And then the two numbers are added together and then again added with 30. The result is printed.  
 ```java
 int z;
 z = x + y;
 //Adding 30 to z
 z += 30;
 ```
#### INSTALLATION, COMPILE AND RUNTIME REQUIREMENTS:

***IDE***  
IntelliJ IDEA Community Edition 2020.2.3 x64

***The assignment has been coded and runs on***   
***HARDWARE***  
•	Intel® Core™ i7-7500U CPU @ 2.70 GHz 2.90 GHz  

***SOFTWARE***   
•	Windows 8 64-bit, Java SE8 (jdk1.8.0_251, jre8) 


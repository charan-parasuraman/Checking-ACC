# Checking-ACC

--Create a class, with same name as your file name (keep in mine the main class name should be consistent with your file name).
a.	There are two data members: 
i.	An int variable AccountNumber
ii.	A static float variable InterestRate
b.	There are two methods:
i.	ChangAccNum. This method will change the account number of corresponding object. This method should have one int parameter. There is no return value for this method. This method will take the value of the parameter and use this value as the new value of data member AccountNumber. 
ii.	SetInterest. This method will change the interest rate. This is a static method. It takes one float parameter. There is no return value. This method will take the value of the parameter and use this value as the new value of data member InterestRate.
iii.	Main method. The entry point to the program, i.e., public static void main(String[] args)
c.	In the main methods: 
*) Write several lines of code that takes three numbers as input (use Scanner class as we did in class) to calculate and print the average of the numbers. The program should look as following. Think about how you can use the println function to first print a string, then the value of a variable as below on the same line. 
 
*) Write several lines of code that takes a string as input (use Scanner class as we did in class) and display the length of the string, and the third character of the string. 
 
(Hint: if you use nextInt() method to read a number, you may need to use nextLine() method to clear user input).
*) Write several lines of code that first take one number as input (use Scanner class as we did in class. Hint: which method you should use when you expect a float number as input?). Then calls the ChangAccNum method and use the input number as parameter of this function (hint: how should you call this function? Should you create a new object and call this method using this object?)
*) Write several lines of code that first take one number as input (use Scanner class as we did in class). Then calls the SetInterest method and use the input number as parameter of this function (hint: how should you call this function? Should you create a new object and call this method using this object?)

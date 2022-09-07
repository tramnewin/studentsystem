# studentsystem  
a basic program that can add delete remove arrange a list of student's information  
the list of students is stored in an arraylist datatype named UserInput.  
With this list, the user can modify the list (edit information, delete student, arrange, add one ore more students).  
the program runs until the user press a nubmer that is not [0,5].  
if the user presses 1, the program adds one ore more students into the list.  
if the user presses 2, the program arranges the student list by sorting the students' IDs incrementally.  
if the user enters 3, the program continues to ask for the student's ID that the user wants to delete from the system.  
if the user enters 4, the user can changes the student's information (student ID or name or phone number or home address) in which matches the student ID that the user provides.  
if the user presses 5, the program adds in exactly one student information into the system  


This progam focus mainly on exception handling of Java, the program would try to catches any exception occurs from the console's input. 
The program cheecks NumberFormatException if the input is not in int datatype.
The program checks for NullPointerException when the input is NULL.
The program makes sure the String/integer input is valid by using StringIndexOutofBoundException/IndexOutOfBoundException.

If the user wants to exit out of the program, they can simply presses any number/char besides number from 1 to 5 inclusively.

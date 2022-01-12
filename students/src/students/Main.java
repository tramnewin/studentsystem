package students;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
    static void readInfo(UserInput tt) {
        boolean theFlag = true;
        System.out.println("Please enter your student ID: ");
        while(theFlag) {
        	try {
           	 
                // Parsing user input to integer
                // using the parseInt() method
                int number = Integer.parseInt(sc.next());

                // Number can be valid or invalid

                // If number is valid, print and display
                // the message and number
                System.out.println("You entered: "
                                   + number);
                tt.setstudentID(number);
                // Get off from this loop
                theFlag = false;
            }

            // Catch block to handle NumberFormatException
            catch (NumberFormatException e) {
            	System.out.println("NumberFormatException occured");
            }
        }
        theFlag = true;
        sc.nextLine();
        System.out.println("Please enter your name: ");
        
        while(theFlag) {
        	try {
        	    String input = sc.nextLine();
        	    if (input.length() == 0 ) {
        	        input = null;
        	    }
        	    int userInputLength = input.length();
        		
        		tt.setname(input);
                // Get off from this loop
                theFlag = false;
            }

            // Catch block to handle NullPointerException
            catch (NullPointerException e) {
            	System.out.println("NullPointerException occured");
            }
        }
        theFlag = true;

        
        
        System.out.println("Please enter your home address: ");
        while(theFlag) {
        	try {
        	    String input = sc.nextLine();
        	    if (input.length() == 0 ) {
        	        input = null;
        	    }
        	    int userInputLength = input.length();
        		tt.setaddress(input);
                // Get off from this loop
                theFlag = false;
            }

            // Catch block to handle NullPointerException
            catch (NullPointerException e) {
            	System.out.println("NullPointerException occured");
            }
        }
        theFlag = true;
        
        System.out.println("Please enter your phone number: ");
        while(theFlag) {
        	String phoneStr = sc.nextLine();

        	if(phoneStr.length() == 7) {
        		tt.setphoneNum(phoneStr);
        		theFlag = false;
        	}else if(phoneStr.length() > 7) {
        		System.out.println("invalid phone number, your phone number cannot exceed 7 digits ");
        	}
        	else {
        		try {
        			System.out.println(phoneStr.charAt(6));
        			System.out.println(phoneStr.charAt(0));
        		}
        		catch (StringIndexOutOfBoundsException  e) {
        			System.out.println("invalid phone number, phone number cannot less than 7 digits ");
        		}        		
        	}
        }
        
    }
	
	public static void main(String[] args) {
		ArrayList<UserInput> sv = null;
		sv = new ArrayList<UserInput>();
        int switchControl;
        boolean flag = true;
        do {
            System.out.println("Please enter the number in the menu: ");
            System.out.println("1.Add students' information. \n" +
                    "2.Arrange students' list. \n" + 
            		"3.Delete student's information \n" + 
            		"4.Edit student's information\n" +
            		"5.Add a student's information \n" +
                    "press a different number than the listed above to exit \n");
            switchControl = sc.nextInt();
            switch (switchControl) 
            {
                case 1:{
                    //
                    System.out.println("Please enter the number of students to add into the system ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Student number " + (i + 1)+": ");
                        UserInput aStudent = new UserInput();
                        readInfo(aStudent);
                        sv.add(aStudent);
                    }
                }
                    break;
                case 2:
                	Collections.sort(sv, new Comparator<UserInput>(){
                	@Override
                	public int compare (UserInput sv1, UserInput sv2) {
                	    if (sv1.getstudentID() > sv2.getstudentID()) {
                	        return 1;
                	     } else {
                	       if (sv1.getstudentID() == sv2.getstudentID()) {
                	            return 0;
                	         } else {
                	            return -1;
                	        }
                	    }
                	}
                	}
                	);
                    System.out.printf("%-5s %15s %15s %20s \n", "student ID", "name", "home address", "phoneNum");
                    for (int i = 0; i < sv.size() ; i++) {
                    	try {
                    		sv.get(i).displayInfo();
                    	}
                    	catch(IndexOutOfBoundsException e) {
                    		System.out.println("empty student list");
                    	}
                    	
                    }
                    break;
                case 3:
                	System.out.println("Enter the student ID for deletion");
                	int b = sc.nextInt();
                	for (int i = 0; i < sv.size(); i++) {
                		int c = sv.get(i).getstudentID();
                		if (c == b)
                		{
                			sv.remove(i);
                		}
                	}
                	break;
                case 4:
                	System.out.println("Enter the student for editing");
                	int e = sc.nextInt();
                	for (int i = 0; i < sv.size(); i++) {
                		try {
                			int c = sv.get(i).getstudentID();
                			if (c == e)
                    		{
                    			System.out.println("Please enter a number for editing");
                                System.out.println("1.Student ID.\n" +
                                        "2.Student's name. \n" + 
                                		"3.Home address. \n" + 
                                		"4.phone number. \n" +
                                        "Enter a different number to exit out of the function");
                                int d = sc.nextInt();
                                switch (d) {
                                case 1:
                                	System.out.println("enter new student ID: ");
                                	int g = sc.nextInt(); //nextLine();
                                	while (g<999)
                                	{
                                		System.out.println("Invalid student ID, please enter a valid number");
                                		g = sc.nextInt();
                                	}
                                	sv.get(i).setstudentID(g);
                                	break;
                                	//case2-3-4
                                case 2:
                                	System.out.println("Please enter the student's name: ");
                                	String h = sc.nextLine();
                                	while (h != null)
                                	{
                                		System.out.println("Invalid name, please enter a valid one");
                                	}
                                	break;
                                case 3:
                                	System.out.println("Please enter the student's home address: ");
                                	String j = sc.nextLine();
                                	break;
                                case 4:
                                	System.out.println("Please enter the student's phone number: ");
                                	int k = sc.nextInt();
                                	break;
                                }
                    		}
                		} 
                		catch (IndexOutOfBoundsException m) {
                    		System.out.println("empty student list");
                    	}
                		
                		
                	}
                	break;
                case 5:
                	 UserInput aStudent = new UserInput();
                     readInfo(aStudent);
                     sv.add(aStudent);
                	break;
                default:
                    System.out.println("Exit..");
                    flag = false;
                    break;
            }
        } while (flag);

	}

}

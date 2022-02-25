package LockedMe;


import java.util.InputMismatchException;
import java.util.Scanner;


public class LockedMe{
	static String path1 = "C:\\Users\\n.suresh.thakare\\Assingment\\Project_Module1\\LockedMe";
	static int key ;
	static int key1;
	
	
	public static void main(String[] args)   {
		FileOption obj =new FileOption();
		displayMenu();
		
		
		do {
			
			try {
				options();

			} catch (InputMismatchException e) {
				System.out.println(e + "**********Please Enter correct option***************");
				options();
			}
			
			
			switch (key) {
			case 1:
				System.out.println("=============================");
				System.out.println(" Files Present in Directory ::");
				System.out.println("=============================");
				obj.allFiles(path1);
				;
				System.out.println(
						"*****************************************************************************************");
				break;
			case 2:
				obj.fileOptions();
				Scanner sc1 = new Scanner(System.in);
				try {
					key1 = sc1.nextInt();
				} catch (InputMismatchException e) {
					System.out.println(e + "Please Enter correct file option");
					
				}
				obj.switchCase(key1);
				break;
			case 3:
				System.out.println(
						"=======================================================================================");
				System.out.println("\t\t\t Thanks for using LockedMe.com Application ");
				System.out.println(
						"=======================================================================================");
				System.exit(0);
				break;
			default:
				System.out.println("****** Incorrect Input **********");
			 
			    break;
			}

		}

		while (key > 0);

	}
///
	public static void displayMenu() {

		System.out.println("\n=======================================================================================");
		System.out.println("\t\t\tThis is Lock Me Application");
		System.out.println("\t\t\t***Author:Nikita Thakare***");
		System.out.println("=======================================================================================");

	}
///
	public static void options() {

		System.out.println("\n=======================================================================================");
		System.out.println("\t\t Features of Lock Me Application :");
		System.out.println("=======================================================================================");
		System.out.println("1. Display All Files");
		System.out.println("2. Show File Options");
		System.out.println("3. Exit Menu");
		System.out.println("\nPlease select option : ");
		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();

	}
	

	
 
	
	
	

}

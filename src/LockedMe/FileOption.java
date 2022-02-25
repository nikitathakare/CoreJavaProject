package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class FileOption {
	Scanner sc = new Scanner(System.in);

	public void fileOptions() {
		System.out.println("***** File Options ****");
		System.out.println("1. Add File");
		System.out.println("2. Delete File");
		System.out.println("3. Search  File");
		System.out.println("\nPlease Select Feature : ");

	}

//*************************************** Display All Files*************************************************
	public void allFiles(String path) {
		TreeSet<String> results = new TreeSet<String>();

		File[] files = new File(path).listFiles();

		for (File file : files) {
			if (file.isFile()) {
				results.add(file.getName());
			}
		}

		Iterator<String> it = results.iterator();
		while (it.hasNext() == true) {
			System.out.println(it.next());
		}

	}

//************************************ Add Files ***************************
	public void addFiles(String a, String b) {
		File f = new File(a, b);
		try {
			if (f.createNewFile() == true) {
				String s1 = f.getName().toString();

				System.out.println("\n******************* File is added successfully *******************");

			} else {

				System.out.println(
						"\n******************* File alreday Exists ------- Please Try again!! *******************");

			}
		} catch (IOException e) {

			System.out.println(e);
			System.out.println("\n------------!! Please Enter correct file name !! -----------------");

		}

	}

//*************************************Delete File*******************************************************	
	public void deleteFile(String a, String b) {
		File f = new File(a, b);
		String filePath = "";
		try {
			f = f.getCanonicalFile();

		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		filePath = f.toString();
		if (f.exists() == true) {
		 if (filePath.contains(b)) {
			f.delete();
		 }

			System.out.println("\n ******************* File is deleted Successfully *******************");

		} else {

			System.out.println("\n******************* File NOT Found *******************");

		}

	}

//******************************************Search File*******************************************************
	public void searchFile(String a, String b) {
		File f = new File(a, b);
		String FilePath = "";
		try {
			f = f.getCanonicalFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e);
		}

		FilePath = f.toString();
		if (f.exists() == true) {
			if (FilePath.contains(b)) {
			}
			System.out.println("\n******************* File " + f.getName() + " is found *******************");
		}

		else {

			System.out.println("******************* File " + f.getName() + " is not found *******************");

		}

	}

/// *****************************************File Options************************************
	public void switchCase(int i) {

		switch (i) {
		case 1:
			System.out.println("\nPlease enter file name to be added : ");
			String fileName = sc.next();
			addFiles(LockedMe.path1, fileName);
			break;
		case 2:
			System.out.println("\nPlease Enter file name to be deleted :");
			String filedelete = sc.next();
			deleteFile(LockedMe.path1, filedelete);
			break;
		case 3:
			System.out.println("\nPlease Enter file name to be searched :");
			String fileSearch = sc.next();
			searchFile(LockedMe.path1, fileSearch);
			break;

		default:

			System.out.println("****** Incorrect File Option **********");

			break;
		}
	}

}

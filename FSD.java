package FSDProject;
import java.util.*;
import java.io.*;
public class FSD {
	public static final String filepath = "C:\\Users\\Lenovo\\Desktop\\New folder\\";
	private static String filename = "";
	public static void add(){
		try {
			BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the File Name:");
			filename = file.readLine();
			File ff = new File(filepath + "" + filename +".txt");
			System.out.println(filepath+filename);
			if(ff.createNewFile()) {
				System.out.println("File" + " "+ filename + " Has been created Succesfully");
			}
		}
		catch(Exception e) {
			System.out.println("Error Occured");
		}
	}
	public static void delete() throws IOException {
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Name of the file which you want to delete:");
		filename = file.readLine();
		File ff = new File(filepath + "" + filename +".txt");
	    if(ff.delete()) {
	    	System.out.println("Files has been deleted successfully");
	    }
	    else {
	    	System.out.println("File Not FOund");
	    }
	}
	public static void search() throws IOException {
		System.out.println("File name that you want to search:");
		BufferedReader file = new BufferedReader(new InputStreamReader(System.in));
		filename = file.readLine();
		File dir = new File(filepath);
		String[] flist = dir.list();
		for(int i=0;i<flist.length;i++) {
			String fn = flist[i];
			if(fn.equalsIgnoreCase(filename + ".txt")) {
				System.out.println("File found Successfully");
			}
		}
	}
	public static void shList(){
		File dir = new File(filepath);
		String[] flist = dir.list();
		for(int i =0;i<flist.length;i++) {
			System.out.println(flist[i]);
		}
	}
	public static void option() throws IOException {
		System.out.println("1. Add \n" + "2. Delete \n" + "3. Search \n" + "4. return back to menu");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
			switch(n) {
			case 1: add();
			break;
			case 2: delete();
			break;
			case 3: search();
			break;
			case 4: service();
			}
	}
	public static void service() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Company Lockers Pvt.Ltd \n" + "Developer: Shrikant Gayagwal\n");
		boolean op = true;
		while(op) {
			System.out.println("1. Show \n" + "2. Show File option \n" + "3. Quit");
			int n = sc.nextInt();
			switch(n) {
			case 1: shList();
			break;
			case 2: option();
			break;
			case 3: op =false;
			break;
			default: System.out.println("Invalid Input");
			}
		}
		System.out.println("Thank you for using our services");
	}
	public static void main(String []args) throws IOException {
		service();
	}
	
}

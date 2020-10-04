//Banner goes from here.


package Project1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Console {

public static void main(String[] args) throws Exception  {
		System.out.println("\n\t!!!!!!!!!!! Welcome to LockedMe.com !!!!!!!!!!!!!!");
		System.out.println("\t===========xxxxxxxxxxxxxxxxxxxxxxxxx==============");
		System.out.println("\nDeveloped By: Shubham Kumar"+"\t\t- Product of Lockers Pvt. Ltd.");
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\nChoose option from the following...");
		System.out.println("--------------------------------------\n");
	//===========================================
	
	//Menu Options goes from here.
	
		Scanner sc=new Scanner(System.in);
		int MainOption=0, SubOption=0;
		do {
			System.out.println("1) To List Main Directory");
			System.out.println("2) For More");
			System.out.println("3) To Exit");
			System.out.println("\nPlease enter an appropriate choice[1-3]");
		try {
			MainOption=Integer.parseInt(sc.nextLine());
		}	catch (NumberFormatException e) {
			System.out.println("Input is not valid");
		}
		switch (MainOption) {
		case 1:System.out.println("Main Directory" +"\n---------------");
				FileListing();
			break;
		case 2: {
            do {
                System.out.println("Choose option from the following : ");
                System.out.println("Press 1 -> to add.Add a file in the existing directory");
                System.out.println("Press 2 -> to Delete a file from the existing directory");
                System.out.println("Press 3 -> to Search a file in the existing directory");
                System.out.println("Press 4 -> to Back to main Menu");
                System.out.print("Enter your option : ");
			
	//inner menu goes from here=======================
                try {
        			SubOption=Integer.parseInt(sc.nextLine());
        		}	catch (NumberFormatException e) {
        			System.out.println("Input is not valid");
        		}
            switch (SubOption) {
            case 1:  {
                System.out.println("Add a file in the root directory");
                Add();
            }break;
            case 2: {
                System.out.println("Delete a file from the root directory");
               DeleteFile();
            }break;
            case 3: {
                System.out.println("Search a file in the root directory");
                SearchFile();
            }break;
            case 4: System.out.println("Back to main Menu");
            break;
            default:System.out.println("Invalid Choice... Choice should and must be between 1-4 only");
        }
} while (SubOption != 4);
		}
		break;
			case 3:System.out.println("Thankyou for using the app...\n");
				
				break;
			default:System.out.println("Invalid Choice... Choice should be and must be between 1-4 Only.\n");
				break; 
		} 
			}while(MainOption != 3);
}	
//==============================================

	//Adding file goes from here.
	
	    
	    @SuppressWarnings("resource")
		public static void Add() {
	    String f1;
	    Scanner UserFile=new Scanner(System.in);
	    f1=UserFile.nextLine();
	    {
	    	File file = new File("./Root" + "/" + f1);
	            if (file.exists()) {
	                System.out.println(file + " " + "Already Exist");
	            } else {
	                try {
	                	file.createNewFile();
	                } 
	                
	            catch (IOException e) 
	                { 
	    System.out.println(e.getMessage());
       }}
	    
	            System.out.println(file + " " + "Write  Successfully");
	    
	    }}
	//===========================================
	
	
	//file listing goes from here.
	
	 public static void FileListing() {
	        File fl= new File("./Root");

	        String[] rootFiles = fl.list();
	        try {
	            assert rootFiles != null;
	            if (rootFiles.length > 0) {
	                Arrays.sort(rootFiles);
	                for (String x : rootFiles) {
	                    System.out.println(x);
	                }
	            } else {
	                System.out.println("Empty folder, please add files to list");
	            }
	        }catch (Exception e) {
	            System.out.println("Something went wrong");
	        }
	 }
	 
	 //========================================
	 
	 //Search file goes from here.
	 
	
	  
	  public static void SearchFile() {

		    	int counter = 0;
			    Scanner src = new Scanner(System.in);
			    String SF = src.nextLine();

		    	
		    	File fileName= new File("./Root");
		        File pathName=new File("./Root"+"/"+ SF);

		        String[] rootFiles1 = fileName.list();


		        if (rootFiles1 != null) {
		            for (String files : rootFiles1) {
		                if (files.equals(SF)) {
		                    counter++;
		                    break;
		                }

		            }
		        }

		        if (counter==1){
		            if (pathName.exists()) {
		                System.out.println("Result :" + " " + SF+ " " + "File found");
		            }

		        }else {
		            System.out.println("Result :" + " " +SF + " " + " File Not Found");
		        }
	  }    
	   
	   //=====================================
	   
	   //Delete file goes from here.
	   
		  public static void DeleteFile() {
		     
		    	int counter1 =0;
			     Scanner s = new Scanner(System.in);
			     String DeleteFileName = s.nextLine();
			     
		    	File FName = new File("./Root");
		        File pathName1=new File("./Root"+"/"+DeleteFileName);
		        String[] rootFiles2 = FName.list();

		        if (rootFiles2 != null) {
		            for (String files : rootFiles2) {
		                if (files.equals(DeleteFileName)) {
		                    counter1++;
		                    break;
		                }

		            }
		        }

		        if (counter1==1){
		            if (pathName1.delete()) {
		                System.out.println("Result :" + " " +DeleteFileName + " " + "Deleted From Root Directory");
		            }

		        }else {
		            System.out.println("Result :" + " " +DeleteFileName + " " + " File Not Found");
		        }

		    }
}

		

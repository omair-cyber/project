package project;
import java.util.*;
public class practice2 {
public static void main(String[] args) {
	linkedlist l = new linkedlist();
	Scanner sc = new Scanner(System.in);
	 System.out.println("Press 1 to start");
	int x ;
	x=sc.nextInt();
	//student1
	     l.add( 5274034,"NAME : Qamar"+"\r\nBALANCE: 51,000"+"\r\nDESIGNATION: MANAGER");
	     //student2
	     l.add(5342198,"NAME : Umer \r\n"+"BALANCE : 60,000\r\n"+"DESIGNATION: HRM");
	     	     //student3
	     l.add(5467357,"NAME : Saif\r\n"+"BALANCE : 30,000\r\n"+"DESIGNATION: TYPIST");
	     while(x!=5) {
	     System.out.println("****WELCOME TO BANK MANAGEMENT SYSTEM*****");
	     System.out.println("Press 1 To Display All ACCOUNT NUMBERS");
	     System.out.println("Press 2 To Create ACCOUNT NUMBER");
	     System.out.println("Press 3 to search ACCOUNT ");
	     System.out.println("Press 4 to delete ACCOUNT");
	     System.out.println("Press 5 To Exit");
	     x= sc.nextInt();
	     
	     if (x==2) {
	    	 //new student	   
	     String b,c,d ;int a;
	     System.out.println("Enter ACCOUNT NUMBER: ");
	     a=sc.nextInt(); 
	     System.out.println("Enter Name: ");
	     b=sc.next();
	     System.out.println("Enter BALANCE: ");
	     c=sc.next();
	     System.out.println("Enter DESIGNATION: ");
	     d=sc.next();
	     l.add(a,"NAME : "+b+"\r\nBALANCE: "+c+"\r\nDESIGNATION: "+d);
	     }
	     if(x==1) {
	   l.print();
	   
	   
	     }
	     if(x==3) {
	    	 System.out.println("Enter ACCOUNT Number To Search");
	    	 int a = sc.nextInt();
	    	 l.search(a);
	     }
	     if(x==4) {
	    	 System.out.println("Enter ACCOUNT Number To delete");
	    	 int a = sc.nextInt();
	    	 l.delete(a);
	     }
	     }  
	     }


       
	}



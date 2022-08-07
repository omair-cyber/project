package project;
import java.util.*;
public class practice {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
//     System.out.println("Press 4 to start");
     
     System.out.println("Press 1 to create new Profile: ");
     System.out.println("Press 2 to access current students profiles : ");
     System.out.println("Press 3 to delete current students profiles : ");
     LinkedList<String> l = new LinkedList<String>();
     int x=sc.nextInt();
     if(x == 1) {
     String a,b,c,d ;
     System.out.println("Enter Name: ");
     a=sc.next();
     l.push("NAME : "+a);
     System.out.println("Enter Registration ID: ");
     b=sc.next();
     l.push(b);
     System.out.println("Enter Program: ");
     c=sc.next();
     l.push(c);
     System.out.println("Enter Semester No: ");
     d=sc.next();
     l.push(d);
     return;
     }
     //student 1
     LinkedList<String> ll = new LinkedList<String>();
     ll.push("NAME : Qamar");
     ll.push("REG ID  55365");
     ll.push("PROGRAM : BSAI");
     ll.push("SEMESTER : 4");
     //student 3
     LinkedList<String> aa = new LinkedList<String>();
     aa.push("NAME : Saif");
     aa.push("REG ID : 55676");
     aa.push("PROGRAM : BSSE");
     aa.push("SEMESTER : 3");
     //STUDENT 4
     LinkedList<String> aaa = new LinkedList<String>();
     aaa.push("NAME : Umer");
     aaa.push("REG ID : 54367");
     aaa.push("PROGRAM : BSSE");
     aaa.push("SEMESTER : 6");
    if ( x == 2) {
    	System.out.println("Student 1 biodata:-");
    	System.out.println(ll);
    	System.out.println("Student 2 biodata:-");
    	System.out.println(aa);
    	System.out.println("Student 3 biodata:-");
    	System.out.println(aaa);
    	if(l.size() < 0 ) {
    	System.out.println("Student 4 biodata:-");
    	System.out.println(l);}
    	 }
    
     
     
     
     
     
     
     
     
     
     
     
     
	}
     }
	

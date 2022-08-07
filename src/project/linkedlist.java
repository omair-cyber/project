package project;

public class linkedlist {
	public Node head;
	int size=0;
	linkedlist(){
		this.size = size;
	}
	class Node{
		int data1;
		String data;
		Node next;
		
		Node(int data1,String data){
			this.data1=data1;
			this.data=data;
			this.next = null;
			size++;
		}
	}
	public void add(int data1,String data) {
	
		Node newnode = new Node(data1,data);
		if (head==null) {
		head = newnode;
		return;
		}
		else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void print() {
		int count=1;
		if (head==null) {
			System.out.println("linkedlist is Empty");
			return;
			}
		Node currentnode = head;
				
				while(currentnode!=null) {
					System.out.println("STUDENT NO "+count);
					count++;
			System.out.println(currentnode.data1);		
			System.out.println(currentnode.data);
			currentnode = currentnode.next;
		}
	} 
	public void search(int index) {
		Node currentnode = head;
		while(currentnode.data != null) {
		if(currentnode.data1 == index) {
			System.out.println(currentnode.data);
			break;
		}
		currentnode=currentnode.next;
		}
		
	}
	public void delete(int index) {
		Node currentnode = head;
		while(currentnode.data != null) {
			if(currentnode.data1 == index) {
			currentnode.data=null;
			break;
			}
			currentnode=currentnode.next;
		}
}
}

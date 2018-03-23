/**
* Data Structure, List
*	@author :Camila chacón
*	@date 23-03-2019
*	@version 1
**/

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ListString {
	
	public Node_String head=null;
	


	public boolean isEmpty() {//Method Check if empty
		
		return head == null ? true : false;
	}
	
	public int StringSize(){
		int counter=0;
		Node_String temp=head;
		while(temp !=null){
			counter +=1;
			temp=temp.next;
			
		}
		return counter;
		
	}

	
	public void concatenar(Node_String newNode){
		

		if(isEmpty()) {
			
			head = newNode;	
			
		}else{
			
		Node_String temp = head;
		
		while(temp.next != null) {
			
			temp = temp.next;
		}
		temp.next = newNode;	
		}
	}


	public void Split(char Det) {
		
		ListString NodeS = new ListString();
		
		Node_String temp = head;
		int C = 0;
		
		for (int i = 0; i < StringSize(); i++) {
			
			if(temp.charac != Det) {
				
				NodeS.concatenar(new Node_String(temp.charac));
				
			}else {
				
				NodeS.concatenar(new Node_String(' '));
				
			}
			
			temp = temp.next;
			
		}
		
		Node_String head2 = NodeS.head;
		
	}
	

	

	public boolean Contains(char Letter) {
		
		//Clase_String Node_S = new Clase_String();
		boolean ToF = false;
		
		Node_String temp = head;
		
		for (int i = 0; i < StringSize(); i++) {
			
			if(temp.charac == Letter) {
				
				ToF = true;
				break;
				
			}else {
				
				ToF = false;
			}
			
			temp = temp.next;
			
		}	
		
		return ToF;
	}
	

	public void Subcadena(int indexBegin , int indexFinal) {

		ListString NodeS = new ListString();
	
		Node_String temp = head;
	
		int Count = 0;

		if(StringSize()<indexBegin) 
		
			System.out.println("No existe el indice");
		
		else {
		
			for (int i = 0; i < indexBegin; i++) {
				temp = temp.next;	
				Count++;	
			}
		
			NodeS.concatenar(new Node_String(temp.charac));

			for (int i = Count ; i < indexFinal - 1; i++) {
			
				temp = temp.next;
			
				NodeS.concatenar(new Node_String(temp.charac));
	
			}

		}
		Node_String head2 = NodeS.head;
	}
	

	public void printList() throws IOException {//Method that prints the contents of the list
		
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		Node_String temp = head;
		while(temp != null) {
			
			bw.write(temp.toString());
			temp = temp.next;
		}
		bw.write("\n");
		bw.flush();
	}//end method

	
	public static void main(String[] args) throws IOException {	
		
		ListString bla = new ListString();
		int tam;
		
		System.out.println(bla.StringSize());
	
		bla.concatenar(new Node_String('m'));
		bla.concatenar(new Node_String('i'));
		bla.concatenar(new Node_String('l'));
		bla.concatenar(new Node_String('a'));
		System.out.println(bla.StringSize());
		bla.printList();
		System.out.println(bla.Contains('a'));
		
		bla.Split(' ');
		bla.printList();
		

		
	}



}

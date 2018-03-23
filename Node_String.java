	/**
	* Data Structure, Node
	*	@author :Camila chacón
	*	@date 19-03-2019
	*	@version 1
	**/
	// this is father class or principal class


public class Node_String {

		public char charac; //global variable
		
		public Node_String next; //pointer
		public int value;

		
		public Node_String() {} //empty constructor
		
		public Node_String (char character) {
			
			this.charac=character;
		}
		
		
		public String toString() { //print in console
			return ""+ this.charac; 
		}
		
		
		public Node_String clone() { //clone the principal list
			Node_String clone = new Node_String (this.charac);
			return clone;
		}

	
}



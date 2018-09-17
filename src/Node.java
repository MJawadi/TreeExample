
/* Class containing left and right child of current
   node and key value*/


public class Node {

	int key;
	String name;

	Node leftChild;
	Node rightChild;

	public Node(int item, String detils) {

		this.key = item;
		this.name = detils;

	}
	
	public String toString(final int depth) {
		StringBuilder builder = new StringBuilder();
	
		

		builder.append('\n');
		builder.append(name);
		builder.append(": ");
		if (this.leftChild == null ) {
			builder.append("empty");
		}else {
			builder.append('\t');
			builder.append(leftChild.toString(depth));
		}
		if (this.rightChild == null) {
			builder.append("empty");
		}else {
			builder.append('\t');
		    builder.append(rightChild.toString(depth));
		}
		
		
		/*
		if (this.leftChild.leftChild == null) {
			
		}else {
			
		}
		if (this.leftChild.leftChild == null) {
			
		}else {
			
		}
		*/
		/*
		builder.append(leftChild.leftChild.toString(depth));
		builder.append(leftChild.rightChild.toString(depth));
		builder.append(leftChild.rightChild.toString(depth));
		builder.append(leftChild.rightChild.toString(depth));
*/

		/*
	    builder.append('\t');



	    builder.append('\t');
		
		builder.append("LeftChild: ");
		builder.append('\n');
		builder.append('\t');
		builder.append("empty");
		builder.append('\n');
		builder.append('\t');

		builder.append('\n');
		builder.append('\t');
		builder.append("RightChild: ");
		builder.append('\n');
		builder.append('\t');
		builder.append("empty");
		builder.append('\t');

		*/
		
		return builder.toString();
	}

	public Node getLeftChild() {
		return leftChild;
	}
	
	public void addLeftNode(int i, String str) {
		this.leftChild = new Node(i,str);
	}
	
	public void addRightNode(int i, String str) {
		this.rightChild = new Node(i,str);
	}

	public Node getRightChild() {
		return rightChild;
	}


	
	
}

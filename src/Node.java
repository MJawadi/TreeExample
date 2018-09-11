
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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LeftChild: ");
		builder.append(leftChild.toString());
		builder.append("RightChild: ");
		builder.append(rightChild.toString());
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

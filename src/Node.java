
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
	for(int i = 0; i < depth; i++) {
		builder.append('\t');
	}
	builder.append(name);
	builder.append(": ");
	builder.append('\n');
	for(int i = 0; i < depth; i++) {
		builder.append('\t');
	}
	
	//builder.append("LeftChild: ");
	builder.append('\n');
	if(this.leftChild == null) {
		for(int i = 0; i < depth+2; i++) {
			builder.append('\t');
		}
		builder.append("empty");
		builder.append('\n');
	} else {
		for(int i = 0; i < depth+1; i++) {
			builder.append('\t');
		}
		builder.append(leftChild.toString(depth+1));
		builder.append('\n');
	}
	
	for(int i = 0; i < depth+1; i++) {
		builder.append('\t');
	}
	
	//builder.append("RightChild: ");
	//builder.append('\n');
	if(this.rightChild == null) {
		for(int i = 0; i < depth+2; i++) {
			builder.append('\t');
		}
		//builder.append("empty");
	} else {
		for(int i = 0; i < depth; i++) {
			builder.append('\t');
		}
		builder.append(rightChild.toString(depth+1));
	}
	
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

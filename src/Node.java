
public class Node {

	int key;
	String name;

	Node leftChild;
	Node rightChild;

	public Node(int key, String name) {

		this.key = key;
		this.name = name;

	}
	
	public void setLeftNode(Node node) {
		this.leftChild = node;
	}

	public void setRightNode(Node node) {
		this.rightChild = node;
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
	
	
}

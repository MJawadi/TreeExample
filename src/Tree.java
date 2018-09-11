
public class Tree {
	
	private Node root;
	
	private int count = 0;
	
	public Tree() {
		root = new Node(getNewNumber(),"Root");
	}
	
	public Node getRoot() {
		return root;
	}
	
	public int getNewNumber() {
		return count++;
	}
	
	@Override
	public String toString() {
		return root.toString();
	}

}

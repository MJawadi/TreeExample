
public class TreeApp {

	Node root;

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		Node root = tree.getRoot();
		
		
		//  In this part add some value and making the tree with structure and sub classes
		
		// two first sub Nodes
		root.addLeftNode(tree.getNewNumber(),"Two");
		root.addRightNode(tree.getNewNumber(),"One");
		/*
                    0
                  /   \
                 /     \
                2       1 
                
        */
		
		// selecting the left Node i've just made to make sub Node under that
		Node leftChild = root.getLeftChild();
		
		
		// after selecting the left Node creating sub Nodes left and right
		leftChild.addLeftNode(tree.getNewNumber(), "Four");
		leftChild.addRightNode(tree.getNewNumber(), "Three");
		/*
                     0
                   /   \
                  /     \
                 1       2 
                / \
               /   \
              3     4
                 
    
        */
		// Like above selecting right Node to making another two or one sun Nodes
		Node rightChild = root.getRightChild();
		
		
		// Making sub Nodes for selected right Node
		rightChild.addLeftNode(tree.getNewNumber(), "Six");
		rightChild.addRightNode(tree.getNewNumber(), "Five");
		
		
		/*
		leftChild.leftChild = root.getLeftChild();
		rightChild.rightChild = root.getRightChild();
		
		leftChild.leftChild.addLeftNode(tree.getNewNumber(), "Eight");
		leftChild.leftChild.addRightNode(tree.getNewNumber(), "Seven");
		rightChild.rightChild.addLeftNode(tree.getNewNumber(), "Ten");
		rightChild.rightChild.addRightNode(tree.getNewNumber(), "Nine");
		*/
		
		
		System.out.println(tree.toString());
		
		 
		}

	}

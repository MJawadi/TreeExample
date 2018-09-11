
public class TreeApp {

	Node root;

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		Node root = tree.getRoot();
		
		
		//  In this part add some value and making the tree with structure and sub classes
		
		// two first sub Nodes
		root.addLeftNode(tree.getNewNumber(),"Erstes Kind");
		root.addRightNode(tree.getNewNumber(),"Zweites Kind");
		/*
                    0
                  /   \
                 /     \
                1       2 
                
        */
		
		// selecting the left Node i've just made to make sub Node uner that
		Node leftChild = root.getLeftChild();
		
		
		// after selecting the left Node creating sub Nodes laft and right
		leftChild.addLeftNode(tree.getNewNumber(), "Fist Son");
		leftChild.addRightNode(tree.getNewNumber(), "First Girl");
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
		rightChild.addLeftNode(tree.getNewNumber(), "Second Son");
		rightChild.addRightNode(tree.getNewNumber(), "Second Girl");
		
		System.out.println();
		
		 
		}

	}

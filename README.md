# TreeExample

get example for tree making in java
    http://www.newthinktank.com/2013/03/binary-tree-in-java/
    
    Or
    
    https://www.geeksforgeeks.org/binary-tree-set-1-introduction/

    
    
    
    	public String toString(final int depth) {
		StringBuilder builder = new StringBuilder();
		for(int i = 0; i < depth; i++) {
			//builder.append('\t');
		}
		builder.append(name);
		builder.append(": ");
		//builder.append('\n');
		for(int i = 0; i < depth; i++) {
			//builder.append('\t');
		}
		
		//builder.append("LeftChild: ");
		//builder.append('\n');
		if(this.leftChild == null) {
			for(int i = 0; i < depth+2; i++) {
				//builder.append('\t');
			}
			//builder.append("empty");
			//builder.append('\n');
		} else {
			for(int i = 0; i < depth+1; i++) {
				//builder.append('\t');
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
	private static ArrayDeque<Node> l=createArrayDeque();

    static void levelOrder(Node root){
        Node curr=null;
        if(root!=null){
           l.addLast(root);            
        }

        while(!l.isEmpty()){
            if(l.getFirst()!=null){
                curr=l.removeFirst();
                System.out.print(curr.data+" ");
            }
            if(curr.left!=null){
                 l.addLast(curr.left);
            }
            if(curr.right!=null){
                l.addLast(curr.right);
            }
        }
    }

    private static ArrayDeque<Node> createArrayDeque(){
		ArrayDeque<Node> tempArrayDeque = new ArrayDeque<Node>();
		return tempArrayDeque;
	}

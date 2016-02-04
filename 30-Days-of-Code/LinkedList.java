	public static  Node insert(Node head,int data)
	{
  	    Node newNode = new Node(data); 
        if(head!=null){
            Node last = head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }else{
            head=newNode;
        }
        return head;
	}

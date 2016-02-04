    public static Node removeDuplicates(Node head) {
      if(head!=null){
          Node start=head;
          while(start!=null){
              while(start.next!=null&&start.next.data==start.data){
                  start.next=start.next.next;
              }
              start=start.next;
          }
      }
      return head;
    }

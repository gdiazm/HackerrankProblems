private static int tempHeight=1,maxHeight=0;	
public static int getHeight(Node root){
      if(tempHeight>maxHeight){
          maxHeight=tempHeight;
      } 
      if(root.left!=null){
          tempHeight++;
          getHeight(root.left);
      }
      if(root.right!=null){
          tempHeight++;
          getHeight(root.right);
      }
      tempHeight--;
      return maxHeight;
    }

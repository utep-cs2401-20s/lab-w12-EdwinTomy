class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;

  // created a new node with empty child pointers
  myBinarySearchTreeNode(int inValue){

    myValue = inValue;
    left = null;
    right = null;

  }
  
  myBinarySearchTreeNode(int[] A){

    // creates a new Binary Search Tree rooted at the first value in the array
    myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A[0]);
    /// by inserting elements into the tree in the order they are given in A.
    for(int i = 1; i < A.length; i ++)
      tree.insert(A[i]);

  }

  // This method takes a new integer as input and decides
  // if it should be place:
  public void insert(int inValue){

    if(inValue > myValue){

      //    * as the right child,
      if(right == null)
        right = new myBinarySearchTreeNode(inValue);
      //    * or in the right subtree.
      else
        right.insert(inValue);

    }else if(inValue < myValue){

      //    * as the left child,
      if(left == null)
        left = new myBinarySearchTreeNode(inValue);
      //    * in the left subtree,
      else
        left.insert(inValue);

    }
    // If the value already exists in the tree, no action is taken.
  }

  public int size(){
    int sum = 1;

    if(right != null)
      sum += right.height();
    if(left != null)
      sum += left.height();

    return sum;
  }

  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
    int leftHeight = 0;
    int rightHeight = 0;

    if(left != null){
      leftHeight = left.height();
    }
    if(right != null){
      rightHeight = right.height();
    }

    if(rightHeight < leftHeight)
      return leftHeight + 1;
    return rightHeight + 1;

  }
  
  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

    if(search < myValue && left != null)
      return 1 + left.depth(search);
    if(search > myValue && right != null)
      return 1 + right.depth(search);
    if(search == myValue)
      return 0;

    return -1;
  }
  
  // Utility function included so you can debug your solution. 
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 

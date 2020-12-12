public class GetBSTHeight {
    public static int getHeight(Node root){
        //Write your code here
        int heightL = 0;
        int heightR = 0;
  
        if (root.left != null) {
            heightL = 1 + getHeight(root.left);
        }
        if (root.right != null) {
            heightR = 1+ getHeight(root.right);
        }
        return heightR > heightL ? heightR : heightL;
      }
    
}
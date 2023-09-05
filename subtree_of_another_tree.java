public class subtree_of_another_tree {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }



    }public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lh =height(root.left);
        int rh =height(root.right);
        return (Math.max(lh,rh)+1);}
    
    

    
    public static int diameter2(Node root){
        if(root==null){
            return 0;

        }
        int leftdia= diameter2(root.left);
        int lh =height(root.left);
        int rh =height(root.right);
        int rightdia =diameter2(root.right);
        int selfdia= lh+rh+1;
         return Math.max(selfdia, Math.max(leftdia, rightdia));
    } 
    static  class info{
        int dia; 
        int ht;
        public info(int dia ,int ht){
            this.dia =dia;
            this.ht =ht;

        }
    }
    public static info diameter(Node root){
        if(root==null){
            return new info(0,0);
        }
        info leftinfo = diameter(root.left);
        info rightinfo = diameter(root.right);
        int dia = Math.max(Math.max(leftinfo.dia, rightinfo.dia) ,leftinfo.ht  +rightinfo.ht);
        int ht= Math.max(leftinfo.ht , rightinfo.ht)+1;
        return new info(dia, ht);
    }
    public static boolean isidentical(Node node, Node subroot){
if(node==null && subroot==null){
    return true;

}
else if(node==null|| subroot==null|| node.data!=subroot.data){
return false;

}
if(!isidentical(node.left, subroot.left)){
    return false;
}
if(!isidentical(node.right, subroot.right)){
    return false;
}
return false;
    }
    public static boolean issubtree(Node root, Node subroot){
        if(root.data ==subroot.data){
            if(isidentical(root, subroot)){
                return true; 

            }
        }
       boolean leftans= issubtree(root.left, subroot);
       boolean rightans= issubtree(root.right, subroot);
       return leftans|| rightans;


    }
    public static void main(String args[]){
       
        /*
         1
        / \
       2   3
      / \  / \
     4  5  6  7  
         */
        Node root =new Node(1);
         root.left =new Node(2);
         root.right =new Node(3);
         root.left.left =new Node(4);
        root.left.right =new Node(5);
        root.right.left =new Node(6);
        root.right.right =new Node(7);
        /*
        2
       / \
      4   5

         */
        Node subroot= new Node(2);
         subroot.left= new Node(4);
         subroot.right= new Node(5);
    

System.out.println(issubtree(root, subroot));
    } 
}
 



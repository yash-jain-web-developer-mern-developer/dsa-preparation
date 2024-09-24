package Tree.Binarytree;

import java.util.LinkedList;
import java.util.Queue;

//11
// left most node at each level
//in pre order traversal first node is always leftmost
//we use level order for i=0 so it print only for first node
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Leftview {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Leftview s = new Leftview();
        s.left(root, 1);
    }

    int maxlevel = 0;

    private void left(Node root, int level) {
         if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false) {
            int count = q.size();
            for(int i=0;i<count;i++){
                Node curr = q.poll();
                if(i==0){
                    System.out.println(curr.key);  
                }
               
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                } 
            }
            
        }

    }

}

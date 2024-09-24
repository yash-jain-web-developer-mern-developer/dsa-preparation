package Tree.Binarytree.Traversal;
//8
import java.util.LinkedList;
import java.util.Queue;

//in this we use two loop 
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Levelorderlinebyline {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        Levelorderlinebyline s = new Levelorderlinebyline();
        s.levelordertrav(root);
    }

    private void levelordertrav(Node root) {
        if(root==null) return ;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        q.add(null);
        while (q.size() > 1) {
        
          
         Node curr = q.poll();
                if(curr==null){
                    System.out.println();
                    q.add(null);
                    continue;
                }
                System.out.print(curr.key + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            
            System.out.println();
        }

    }
}

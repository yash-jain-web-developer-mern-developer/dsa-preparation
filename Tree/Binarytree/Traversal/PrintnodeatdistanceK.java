package Tree.Binarytree.Traversal;
//6  
//k=0 root of binary tree
//time complexity is O(n) if internal node we print it 
//auxilary space we have root node and either its left sub tree or
//right subtree so call stack is height of tree O(h)
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class PrintnodeatdistanceK {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.right.right = new Node(5);
        PrintnodeatdistanceK s = new PrintnodeatdistanceK();
        int k = 2;
        s.printnodeatdistanceK(root, k);
    }

    public void printnodeatdistanceK(Node root, int k) {
        if (root == null) {
            return;
        }
        if (k == 0) {
            System.out.println(root.key);
        } else {
            printnodeatdistanceK(root.left, k - 1);
            printnodeatdistanceK(root.right, k - 1);
        }
    }
}

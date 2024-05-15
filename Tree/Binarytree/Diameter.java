package Tree.Binarytree;

import Tree.Binarytree.Traversal.Spiraltraversal;

//number of node between nodes of longest path 

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Diameter {
    public static void main(String[] args) {
        Node root = new Node(3);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        Diameter s = new Diameter();
        s.diameter(root);
    }

    int res = 0;

    private int diameter(Node root) {
        if (root == null)
            return 0;
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        res = Math.max(res, 1 + rh + lh);
        return 1 + Math.max(lh, rh);
    }

}

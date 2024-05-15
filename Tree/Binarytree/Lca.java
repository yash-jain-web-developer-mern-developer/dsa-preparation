package Tree.Binarytree;

// lowest common ancestor
//naive solution make two array that have all node in path then
//find common element between array then last common is lowest one
//efficient solution 
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Lca {

    public static void main(String[] args) {
        Node root = new Node(3);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        Lca s = new Lca();
        System.out.println(s.lowest(root, 7, 4).key);
        s.lowest(root, 7, 4);
    }

    private Node lowest(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }
        if (root.key == n1 || root.key == n2) {
            return root;
        }
        Node lca1 = lowest(root.left, n1, n2);
        Node lca2 = lowest(root.right, n1, n2);
        if (lca1 != null && lca2 != null) {
            return root;
        }
        if (lca1 != null) {
            return lca1;
        } else {
            return lca2;
        }
    }
}

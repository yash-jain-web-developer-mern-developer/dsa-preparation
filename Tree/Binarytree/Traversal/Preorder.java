package Tree.Binarytree.Traversal;
//3
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

public class Preorder {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        Preorder s = new Preorder();
        s.preordertrav(root);
    }

    public void preordertrav(Node root) {
        if (root != null) {
            System.out.println(root.key);
            preordertrav(root.left);
            preordertrav(root.right);
        }
    }
}

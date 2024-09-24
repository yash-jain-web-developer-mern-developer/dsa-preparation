package Tree.Binarytree.Traversal;
//4
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

public class Postorder {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        Postorder s = new Postorder();
        s.postordertrav(root);
    }

    public void postordertrav(Node root) {
        if (root != null) {
            postordertrav(root.left);

            postordertrav(root.right);
            System.out.println(root.key);
        }
    }
}

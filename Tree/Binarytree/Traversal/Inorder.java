package Tree.Binarytree.Traversal;

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

class Inorder {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        Inorder s = new Inorder();
        s.inordertrav(root);
    }

    public void inordertrav(Node root) {
        if (root != null) {
            inordertrav(root.left);
            System.out.println(root.key);
            inordertrav(root.right);
        }
    }
}

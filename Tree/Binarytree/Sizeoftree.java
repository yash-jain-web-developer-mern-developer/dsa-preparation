package Tree.Binarytree;
//9
//O(n)
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Sizeoftree {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Sizeoftree s = new Sizeoftree();
        System.out.println(s.size(root));
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + size(root.left) + size(root.right);
        }
    }
}

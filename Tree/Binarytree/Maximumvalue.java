package Tree.Binarytree;

// for max we find between root ,root.left,root.right
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Maximumvalue {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Maximumvalue s = new Maximumvalue();
        System.out.println(s.maximum(root));
    }

    private int maximum(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(root.key, Math.max(maximum(root.left), maximum(root.right)));
        }
    }

}

package Tree.Binarysearchtree;

class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        this.key = x;
    }
}

public class Search {
    public static void main(String[] args) {

    }

    boolean search(Node root, int x) {
        // O(h) time
        // O(h) space
        if (root == null) {
            return false;
        } else if (root.key == x) {
            return true;
        } else if (root.key < x) {
            return search(root.right, x);
        } else {
            return search(root.left, x);
        }
    }

    boolean searchloop(Node root, int x) {
        // O(1) space
        while (root != null) {
            if (root.key == x) {
                return true;
            } else if (root.key < x) {
                root = root.right;
            } else {
                root = root.left;
            }
        }
        return false;
    }
}

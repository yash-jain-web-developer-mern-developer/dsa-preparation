package Tree.Binarysearchtree;

//value just greater or equal
class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        this.key = x;
    }
}

public class Ceil {
    public Node floor(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key < x) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}

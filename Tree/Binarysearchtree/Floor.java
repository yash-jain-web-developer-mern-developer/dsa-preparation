package Tree.Binarysearchtree;

//smaller value than the given value
//we simply comare if root key is greater so we go left side
//if smaller so it may be a potential solution now check on right side
//O(h) time   O(1) space
class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        this.key = x;
    }
}

public class Floor {
    public static void main(String[] args) {

    }

    public Node floor(Node root, int x) {
        Node res = null;
        while (root != null) {
            if (root.key == x) {
                return root;
            } else if (root.key > x) {
                root = root.left;
            } else {
                res = root;
                root = root.right;
            }
        }
        return res;
    }
}

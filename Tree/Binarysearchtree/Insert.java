package Tree.Binarysearchtree;
//O(h)time

//O(h)space for recursive
//O(1)space iterative

class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        this.key = x;
    }
}

public class Insert {
    public static void main(String[] args) {

    }

    Node insert(Node root, int x) {
        if (root == null) {
            return new Node(x);
        }
        if (root.key > x) {
            root.left = insert(root.left, x);
        } else if (root.key < x) {
            root.left = insert(root.right, x);
        }
        return root;
    }

    Node insertloop(Node root, int x) {
        Node temp = new Node(x);
        Node parent = null, curr = root;
        while (curr != null) {
            parent = curr;
            if (curr.key > x) {
                curr = curr.left;
            } else if (curr.key < x) {
                curr = curr.right;
            } else {
                return root;
            }
        }

        if (parent == null) {
            return temp;
        }
        if (parent.key > x) {
            parent.left = temp;
        } else {
            parent.right = temp;
        }
        return root;
    }
}

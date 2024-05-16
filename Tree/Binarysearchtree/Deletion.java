package Tree.Binarysearchtree;

//leaf node deletion is easy 
//with one child is easy
//replace with closest valuei.e.., inorder successor
//if key not exist not modify
// O(h)time and space
class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        this.key = x;
    }
}

public class Deletion {
    public static void main(String[] args) {

    }

    Node delNode(Node root, int x) {
        if (root == null)
            return null;
        if (root.key > x) {
            root.left = delNode(root.left, x);
        } else if (root.key < x) {
            root.right = delNode(root.right, x);
        } else {// when we find element
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else {
                Node succ = getsucc(root);
                root.key = succ.key;
                root.right = delNode(root.right, succ.key);
            }
            return root;
        }

    }

    Node getsucc(Node root) {// to find successor
        Node curr = root.right;
        while (curr != null && curr.left != null) {
            curr = curr.left;
        }
        return curr;
    }
}

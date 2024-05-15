package Tree.Binarytree;

// left most node at each level
//in pre order traversal first node is always leftmost
//we use level order for i=0 so it print only for first node
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Leftview {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Leftview s = new Leftview();
        s.left(root, 1);
    }

    int maxlevel = 0;

    private void left(Node root, int level) {
        if (root == null) {
            return;
        }
        if (maxlevel < level) {
            System.out.println(root.key + " ");
            maxlevel = level;
        }
        left(root.left, level + 1);
        left(root.right, level + 1);

    }

}

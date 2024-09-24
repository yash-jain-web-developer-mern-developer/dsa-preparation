package Tree.Binarytree;
//13
//difference between left and right subtree less than or equal to one it is balenced
//if not balanced return -1 else return height of tree
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Heightbalanced {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Heightbalanced s = new Heightbalanced();
        System.out.println(s.Height(root));
    }

    private int Height(Node root) {
        if (root == null)
            return 0;
        int lh = Height(root.left);
        if (lh == -1)
            return -1;
        int rh = Height(root.right);
        if (rh == -1)
            return -1;
        if (Math.abs(lh - rh) > 1)
            return -1;
        else
            return Math.max(lh, rh) + 1;
    }
}

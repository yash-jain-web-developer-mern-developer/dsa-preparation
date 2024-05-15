package Tree.Binarytree;

// sum of child node equal to node value
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Childrensumproperty {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Childrensumproperty s = new Childrensumproperty();
        System.out.println(s.sumproperty(root));
    }

    private boolean sumproperty(Node root) {
        if (root == null)
            return true;
        if (root.left == null && root.right == null)
            return true;
        int sum = 0;
        if (root.left != null) {
            sum += root.left.key;
        }
        ;
        if (root.right != null) {
            sum += root.right.key;
        }
        ;
        return (root.key == sum && sumproperty(root.left) && sumproperty(root.right));
    }
}

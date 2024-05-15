package Tree.Binarytree;

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

class Implimentation {

    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(4);
        root.left.left = new Node(5);
    }
}
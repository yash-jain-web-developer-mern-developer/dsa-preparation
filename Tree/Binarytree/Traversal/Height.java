package Tree.Binarytree.Traversal;

//maximum number of node from root to leaf
//time complexity is O(n) if internal node we print it 
//auxilary space we have root node and either its left sub tree or
//right subtree so call stack is height of tree O(h)
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

class Height {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        Height s = new Height();
        System.out.println(s.height(root));
    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }
}

package Tree.Binarytree;

//using inorder traversal
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class ToDoublylinkedlist {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        ToDoublylinkedlist s = new ToDoublylinkedlist();
        System.out.println(s.convert(root));
    }

    Node prev = null;

    private Node convert(Node root) {
        if (root == null)
            return root;
        Node head = convert(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            root.right = root;
        }
        prev = root;
        convert(root.right);
        return head;
    }
}

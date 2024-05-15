package Tree.Binarytree.Traversal;

import java.util.Stack;

//we use two stack s1ands2 nodes of level1 push to s1 then pop and print it
// when we pop then push its children to s2 then we pop from s2 then push it children in s1 
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Spiraltraversal {
    public static void main(String[] args) {
        Node root = new Node(3);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        Spiraltraversal s = new Spiraltraversal();
        s.spiral(root);
    }

    private void spiral(Node root) {
        if (root == null)
            return; // NULL check

        // Create two stacks to store alternate levels
        // For levels to be printed from right to left
        Stack<Node> s1 = new Stack<Node>();
        // For levels to be printed from left to right
        Stack<Node> s2 = new Stack<Node>();

        // Push first level to first stack 's1'
        s1.push(root);

        // Keep printing while any of the stacks has some
        // nodes
        while (!s1.empty() || !s2.empty()) {
            // Print nodes of current level from s1 and push
            // nodes of next level to s2
            while (!s1.empty()) {
                Node temp = s1.peek();
                s1.pop();
                System.out.print(temp.key + " ");

                // Note that is right is pushed before left
                if (temp.right != null)
                    s2.push(temp.right);

                if (temp.left != null)
                    s2.push(temp.left);
            }

            // Print nodes of current level from s2 and push
            // nodes of next level to s1
            while (!s2.empty()) {
                Node temp = s2.peek();
                s2.pop();
                System.out.print(temp.key + " ");

                // Note that is left is pushed before right
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }
    }

}

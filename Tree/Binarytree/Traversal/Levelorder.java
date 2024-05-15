package Tree.Binarytree.Traversal;

import java.util.LinkedList;
import java.util.Queue;

//worst case we find height then print node so it O(h*N);
//enque is O(1)and dequeO(1) for every node O(n)
//auxilary space is width beause one level enter at atime in queue
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Levelorder {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.left = new Node(4);
        root.right = new Node(5);
        root.left.left = new Node(6);
        root.right.right = new Node(7);
        Levelorder s = new Levelorder();
        s.levelordertrav(root);
    }

    // we use queue ds we enque each level then take out then enque next level
    // when we take out node from queue then we enqueu its child
    private void levelordertrav(Node root) {
        if (root == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);
        while (q.isEmpty() == false) {
            Node curr = q.poll();
            System.out.println(curr.key);
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
    }
}

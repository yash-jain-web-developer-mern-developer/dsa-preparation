package Tree.Binarytree;
//we given a leaf node we burn at 0 sec then its all adjacent at

//1 sec 
//naive we find farthest node then number of node to reach is answer

class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class TImetoburn {
    public static void main(String[] args) {
        Node root = new Node(3);
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(7);
        root.left.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        TImetoburn s = new TImetoburn();
        System.out.println(s.time(root, 7, 4).key);

    }
}

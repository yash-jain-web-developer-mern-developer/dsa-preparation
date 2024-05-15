package Tree.Binarytree;

//to determine root we use preorder
class Node {
    int key;
    Node left;
    Node right;

    Node(int k) {
        this.key = k;
    }
}

public class Constructfrominandpre {
    public static void main(String[] args) {
        int in[] = { 20, 10, 40, 30, 50 };
        int pre[] = { 10, 20, 30, 40, 50 };
        Constructfrominandpre s = new Constructfrominandpre();
        System.out.println(s.construct(in, pre, 0, in.length - 1));
    }

    int preindex = 0;

    public Node construct(int in[], int pre[], int startindex, int endindex) {
        if (startindex > endindex)
            return null;
        Node root = new Node(pre[preindex++]);
        int inIndex;
        for (int i = startindex; i <= endindex; i++) {
            if (in[i] == root.key) {
                inIndex = i;
                break;
            }
        }
        root.left = construct(in, pre, startindex, endindex - 1);
        root.right = construct(in, pre, startindex + 1, endindex);
        return root;
    }
}

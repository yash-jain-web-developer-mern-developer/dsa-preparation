package Tree.Binarysearchtree.selfbalancingtree;

import java.util.Iterator;
import java.util.TreeSet;

//it is an impimentation of self balancing binary search tree
//it support search insert delte like hashing but it not support
// ceil,floor,lower,higher we get item in sorted order in traverse
//al operation in logn   and size,isempty O(1)
class Node {
    int key;
    Node left;
    Node right;

    Node(int x) {
        this.key = x;
    }
}

public class Treeset {
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
        s.add("yash");
        s.add("jain");
        System.out.println(s.lower("jain"));// if not present so get null
        System.out.println(s.higher("jain"));
        System.out.println(s.floor("jain"));
        System.out.println(s.ceiling("jain"));

        System.out.println(s);// we get item in sorted order
        System.out.println(s.contains("jain"));
        Iterator<String> i = s.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

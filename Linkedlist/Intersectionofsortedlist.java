package Linkedlist;

// simply if data equal in both the linkedlist add to new one otherwise
// increment the smaller data node
public class Intersectionofsortedlist {
    public static void main(String[] args) {

    }

    public void intersection(Node head1, Node head2) {
        Node t1 = head1;
        Node t2 = head2;
        NOde resulthead = null;
        Node restail = null;
        while (t1 != null && t2 != null) {
            if (t1.data == t2.data) {
                if (resulthead == null) {
                    resulthead = new Node(t1.data);
                    restail = resulthead;
                } else {
                    restail.next = new Node(t1.data);
                    restail = restail.next;
                }
                t1 = t1.next;
                t2 = t2.next;
            } else if (t1.data < t2.data) {
                t1 = t1.next;
            } else {
                t2 = t2.next;
            }
        }
        return resulthead;
    }
}

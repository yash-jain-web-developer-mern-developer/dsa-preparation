package Linkedlist.Fastandslowpointer;

//it have two cases
//in case of even number of nodes if 4 node so middle is 3
//we consider slow and fast pointer so fast speed=2*slow speed
//so when fast at last pointer so slow at middle
//for even fast!=null  for odd fast.next!=null
public class Middlelinkelist {
    public static void main(String[] args) {
        Middlelinkelist s = new Middlelinkelist();
        s.middle(head);
    }

    public void middle(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {// for for even && for odd
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

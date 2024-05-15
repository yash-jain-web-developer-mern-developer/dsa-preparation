package Linkedlist;

//it have two linkelist each node have one number and headpoint to last node basically
// it move in reverse orderwe add if carry come so we pass it to next node
//use insetion at end
//if length is different so answer list m=have length of maximum length list

public class Addtwonumber {
    public static void main(String[] args) {
        Addtwonumber s = new Addtwonumber();
        s.add(head1, head2);
    }

    public void add(Node l1, Node l2) {
        Node head = null;
        Node tail = null;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 == null) ? 0 : l1.data;
            int val2 = (l2 == null) ? 0 : l2.data;
            int value = val1 + val2 + carry;
            Node newnode = new Node(value % 10);
            carry = value / 10;
            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = tail.next;
            }
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        return head;
    }
}

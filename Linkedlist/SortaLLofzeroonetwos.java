package Linkedlist;

import Linkedlist.DoublyLL.Node;

// simply make three headand tail for 0,1,2 and initially all point to -1 then traverse the original linkedlist
// and simply remove from there and attach to right head
public class SortaLLofzeroonetwos {
    public static void main(String[] args) {

    }

    public void sort(Node head) {
        Node zerohead = new Node(-1);
        Node zerotail = Node(-1);
        Node onehead = new Node(-1);
        Node onetail = new Node(-1);
        Node<T> twohead = new Node(-1);
        Node twotail = new Node(-1);
        Node temp = head;
        while (temp != null) {
            node nextnode = temp.next;
            if (temp.data == 0) {
                temp.next = null;
                zerotail.next = temp;
                zerotail = zerotail.next;
            } else if (temp.data == 1) {
                temp.next = null;
                onetail.next = temp;
                onetail = onetail.next;
            } else {
                temp.next = null;
                twotail.next = temp;
                twotail = twotail.next;
            }
            temp = nextnode;
        }
        if (onehead.next == null) {
            zerotail.next = twohead.next;
        } else {
            zerotail.next = onehead.next;
            onetail.next = twohead.next;
        }
        onehead.next = null;
        twohead.next = null;
        Node t1 = zerohead;
        zerohead = zerohead.next;
        t1.next = null;
        return zerohead;
    }
}

package Linkedlist;
//we give linkedlist and value of k which tell number of node reverse together

// number of group=number of node/k;
// we maintain three pointer current nextnode and previous node these are use for reverse
// when K<count so we maintain previoshead 

import Linkedlist.DoublyLL.Node;

public class ReversecodeinKgroup {
    public static void main(String[] args) {
        ReversecodeinKgroup s = new ReversecodeinKgroup();
        s.reverse(head, 3);
    }

    public node reverse(Node head, int k) {
        Node temp = head;
        int counter = 0;
        while (temp != null) {// count number of node
            counter++;
            temp = temp.next;
        }
        int groups = counter / k;// to determine number of group
        Node prevhead = null;
        Node currhead = head;
        Node ansnode = null;
        for (int i = 0; i < groups; i++) {
            Node prev = null;
            Node cur = currhead;
            Node nextnode = null;
            for (int j = 0; j < k; j++) {
                nextnode = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextnode;
            }
            if (prevhead == null) {
                ansnode = prev;
            } else {
                prevhead.next = prev;
            }
            prevhead = currhead;
            currhead = cur;
        }
        prevhead.next = currhead;
        return ansnode;
    }
}

package Linkedlist;
//1,2,3,4,5,6->2,1,4,3,6,5

//in this we swap node not data
// consider three node prev,a,b
// a.next=b.next
// b.next=a
// prev.next=b this line not use for first two nodes

import Linkedlist.Fastandslowpointer.Middlelinkelist;

public class Pairwiseswap {
    public static void main(String[] args) {
        Middlelinkelist s = new Middlelinkelist();
        s.swap(head);
    }

    public void swap(Node head) {
        Node first = head;
        Node prev = null;
        while (first != null && first.next != null) {
            Node second = first.next;
            first.next = second.next;
            second.next = first;
            if (prev == null) {// first swap
                head = second;
            } else {
                prev.next = second;
            }
            prev = first;
            first = first.next;
        }
        return head;
    }
}

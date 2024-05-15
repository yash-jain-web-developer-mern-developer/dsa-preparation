package Linkedlist;
// oddeven index node odd index node gather first then even index node
//in case of even length even is at last node
//in case of odd length odd is at last node
public class Oddevenlinkedlist{
    public static void main(String []args){
        Oddevenlinkedlist s= new Oddevenlinkedlist();
        s.oddeven(head);
    }
    public Node oddeven(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node odd=head;
        Node even=head.next;
        Node evenhead=head.next;
        while(odd.next!=null &&even.next!=null){
            odd.next=even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
    }

}
package Linkedlist;
//simply currentnode point to prev and traverse
//also solve recursively
public class ReverseLinkedlist {
    public static void main(String[] args) {
        ReverseLinkedlist s = new ReverseLinkedlist();
        s.reverse(head);
    }
    public void reverse(Node head){
      Node current =head;
      Node prev=null;
      while(current!=null){
        Node nextcurrent=current.next;
        current.next=prev;
        prev=current;
        current=nextcurrent;
      }
      return prev;
    }
    
}

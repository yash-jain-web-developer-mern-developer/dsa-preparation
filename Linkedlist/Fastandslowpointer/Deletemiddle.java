package Linkedlist.Fastandslowpointer;

//if 1 node remove that
//if  2 node remove 2nd
//normally find even and odd technique 
public class Deletemiddle {
    Middlelinkelist s = new Middlelinkelist();s.middledelete(head);
}

public void middledelete(Node head){
    if(head==null){
        return head;
    }
    Node fast=head;
    Node slow=head;
    Node prev=null;
    while(fast!=null&&fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next;
    }
    if(prev==null){
        //single node
        head=null;

    }else{
        prev.next=slow.next;
        slow.next=null;
    }
   return head;
}

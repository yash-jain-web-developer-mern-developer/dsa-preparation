package Linkedlist;
//we take two pointer first and second at head then second increase and n 
// decrease and it will be increase upto when n=0 then increase first and second together
// first point to node that will be deleted and second point to null 
// jab bhi first ko aga badayanga to usa previous bana danga
public class RemoneNthnodefromend {
    public static void main(String[] args) {
        
    }
    public void remove(Node head,int n){
      Node first=head;
      Node second=head;
      while(n>0&&second!=null){
        n--;
        second=second.next;
      }
      if(n!=0){//when n not access
        return head;
      }
      if(second==null){//deletion at head only have 3 node
        Node temp=head;
        head=head.next;
        temp.next=null;
        return head;
      }
      Node prev=null;
      while(second!=null){
        second=second.next;
        prev=first;
        first=first.next;
      }
      prev.next=first.next;
      first.next=null;//node to be deleted;
      return head;
    }
}

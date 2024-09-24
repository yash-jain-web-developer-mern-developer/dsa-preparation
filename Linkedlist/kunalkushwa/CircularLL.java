package Linkedlist.kunalkushwa;

public class CircularLL {
    private Node head;
    private Node tail;
    int size=0;
    CircularLL(){
        this.head=null;
        this.tail=null;
    }
   class Node<T>{
      Node<T> next;
      T data;
      Node(T data){
        this.data=data;
      }
   } 
   public void insertathead(int data){
   Node <Integer>newnode=new Node(data);
    if(head==null){
        head=newnode;
        tail=newnode;
        size++;
    }
   }
}

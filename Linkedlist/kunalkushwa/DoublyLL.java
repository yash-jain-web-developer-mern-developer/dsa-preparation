package Linkedlist.kunalkushwa;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size=0;

    class Node<T>{
       T data;
       Node<T> prev=null;
       Node<T> next=null;
       Node(T data){
        this.data=data;
       }
    }
   public void insertathead(int data){
    Node <Integer>newnode=new Node(5);
     if(size==0){
        head=newnode;
        tail=newnode;
        size++;
     }else{
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        size++;
     }
   }
   public void insertattail(int data){
    Node <Integer>newnode=new Node(data);
     if(size==0){
        head=newnode;
        tail=newnode;
        size++;
     }else{
        tail.next=newnode;
        newnode.prev=tail;
        tail=newnode;
        size++;
     }
   }
   public void insertatanypos(int data,int pos){
    Node <Integer>newnode=new Node(data);
    if(pos<0||pos>size+1){
        System.out.println("wrong position");
        return;
    } 
    else if(pos==1){
       insertathead(data);
        size++;
     }else if(pos==size+1){
       insertattail(data);
        size++;
     }else{
        Node temp=head;
       
        int count=1;
        while(temp!=null&&count<pos){
            temp=temp.next;
            count++;
        }
       
        newnode.prev=temp.prev;
        newnode.next=temp;
        temp.prev.next=newnode;
        temp.prev=newnode;
        size++;
     }
   }
  
  
   public void deleteattail(){
   
    if(size==0){
      return;
    }else if(size==1){
      head=null;
      tail=null;
      size--;
    }else{
      tail=tail.prev;
      tail.next=null;
       size--;
    }
  }
  public void deleteathead(){
   if(size==0){
      return;
    }else if(size==1){
      head=null;
      tail=null;
      size--;
    }else{
      
       head=head.next;
      
       head.prev=null;
       size--;
    }
  }
  public void daleteatanypos(int pos){
   
    if(pos<=0||pos>size){
      return;
    }else if(pos==1){
        deleteathead();
    }else if(pos==size){
      deleteattail();
    }else{
        Node temp=head;
      
        int count=1;
        while(temp!=null&&count<pos){
         
         temp=temp.next;
         count++;

        }
         temp.prev.next=temp.next;
        temp.next.prev=temp.prev;
        temp.next=null;
        temp.prev=null;
        size--;
    }
  }
 public void display(){
    Node temp=head;
    while (temp.next!=null) {
        System.out.println(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("END");
 }
}

package Linkedlist.kunalkushwa;
public class SinglyLL{
    private Node head;
    private Node tail;
    private int size=0;
    private SinglyLL(){
        size++;
    }
    class Node<T> {
      T data;
      Node next;
      Node(T data){
        this.data=data;
      }
    }
   public void insertAthead(int data){
    Node<Integer> newnode=new Node(data);
        if(size==0){
           head=newnode;
           tail=newnode;
           size++;
        }else{
            newnode.next=head;
            head=newnode;
            size++;
            
        }
    }
    public void insertAttail(int data){
        Node <Integer>newnode=new Node(data);
            if(size==0){
               head=newnode;
               tail=newnode;
               size++;
            }else{
                tail.next=newnode;
                tail=newnode;
                size++;
            }
        }
        public void insertAtanypos(int data,int pos){
            
                if(pos<=0||pos>size+1){
                   System.out.println("wrong position");
                  
                }else if(pos==1){
                   insertAthead(data);
                    size++;
                }else if(pos==size+1){
                  insertAttail(data);
                  size++;
                }else{
                    Node <Integer>newnode=new Node(data);
                    int count=1;
                    Node temp=head;
                    Node prev=null;
                    while(temp!=null&&count<pos){
                        prev=temp;
                        temp=temp.next;
                        count++;
                    }
                  prev.next=newnode;
                  newnode.next=temp;
                  size++;
                }
            }
            public void display(){
                Node temp=head;
                while(temp!=null){
                     System.out.print(temp.data+"->");
                     temp=temp.next;
                }
                System.out.println("END");
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
                    size--;
                }
            }
            public void deleteattail(){
                Node temp=head;
                Node prev=null;
                 while(temp.next!=null){
                    prev=temp;
                      temp=temp.next;
                 }
                 prev.next=null;
                 tail=prev;
                 size--;
            }
           
            public void deleteatanypos(int pos){
                if(pos<=0||pos>size){
                    return;
                }else if(pos==1){
                  deleteathead();
                }else if(pos==size){
                   deleteattail();
                }else{
                    Node temp=head;
                    Node prev=null;
                    int count=1;
                    while(temp!=null&&count<pos){
                        prev=temp;
                        count++;
                        temp=temp.next;
                    }
                    prev.next=temp.next;
                    temp.next=null;
                    size--;
                }
            }
}
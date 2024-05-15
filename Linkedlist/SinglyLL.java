package Linkedlist;

// it is a data structure in which each node connect to each other
//which have two part one part store data second part store address
//1st node head of linkedlist
//last node tail of linkedlist
//ex music player,webbrowser
//two type singly and doubly
//node is a class that hold data as well as address
//pointer is always of node type and if 
public class SinglyLL {
    Node<Integer> head = null;
    int size;

    SinglyLL() {
        this.size = 0;
    }

    class Node<T> {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void insertnode(int data, int pos) {

        if (pos > size + 1 || pos <= 0) {
            System.out.println("wrong input");
            return;
        }
        if (pos == 1) {
            insertathead(data);
            size++;
        } else if (pos == size + 1) {
            insertend(data);
            size++;
        } else {
            Node<Integer> newnode = new Node<>(data);
            Node<Integer> temp = head;
            int count = 1;
            while (temp != null && count < pos - 1) {
                count++;
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
            size++;
        }

    }

    public void insertathead(int data) {
        Node<Integer> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void insertend(int data) {
        Node<Integer> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            size++;
            return;
        }
        Node<Integer> temp = head;
        while (temp.next != null) {

            temp = temp.next;
        }
        temp.next = newnode;
        size++;
    }

    public void deletehead() {
        if (head == null) {
            System.out.println("linkedlist not contain element");
            return;
        }
        Node<Integer> temp = head;
        head = head.next;
        temp.next = null;
        System.out.println("deletion at head is successfull");
        size--;
    }

    public void deletetail() {
        if (head == null) {
            System.out.println("linkedlist not contain element");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node<Integer> prev = null;
        Node<Integer> temp = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        size--;
    }

    public void updatenode(int pos, int updata) {
        if (head == null) {
            System.out.println("linkedlist not contain element");
            return;
        }
        int counter = 1;
        Node<Integer> temp = head;
        while (temp != null && counter < pos) {
            counter++;
            temp = temp.next;
        }
        if (temp != null && counter == pos) {
            temp.data = updata;

        } else {
            System.out.println("size of linkedlist is smaller than pos");
        }
    }

    public void deletepos(int pos) {
        if (pos > size || pos <= 0) {
            System.out.println("wrong input");
            return;
        }
        if (pos == 1) {
            deletehead();
        }
        if (pos == size) {
            deletetail();
        } else {
            int counter = 1;
            Node<Integer> prev = null;
            Node<Integer> temp = head;
            while (temp != null && counter < pos) {
                counter++;
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
            temp.next = null;
            size--;

        }
    }

    public void display() {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();
        list.insertathead(2);
        list.insertend(3);
        list.insertend(4);
        list.insertend(5);
        list.insertend(6);
        list.insertend(7);
        list.insertnode(35, 4);
        list.display();
        System.out.println();
        list.deletehead();
        list.deletetail();
        list.deletepos(3);
        list.display();
        System.out.println();
        list.updatenode(3, 8);
        list.display();
    }
}

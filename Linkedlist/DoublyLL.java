package Linkedlist;

public class DoublyLL {
    Node<Integer> head;
    Node<Integer> tail;
    int size;

    DoublyLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node() {
            this.next = null;
            this.prev = null;
        }

        Node(T data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void displayreverse() {
        Node<Integer> temp = tail;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.prev;
        }
        System.out.print("END");

    }

    public void displayforward() {
        Node<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");

    }

    public void insertatposition(int data, int pos) {
        if (pos > size + 1 && pos <= 0) {
            System.out.println("wrong position");
            return;
        } else if (pos == 1) {
            insertathead(data);
        } else if (pos == size + 1) {
            insertattail(data);
        } else {
            Node<Integer> newnode = new Node<>(data);
            Node<Integer> temp = head;
            int counter = 1;
            while (counter < pos - 1 && temp != null) {
                counter++;
                temp = temp.next;
            }
            Node<Integer> currentnode = temp.next;
            newnode.next = currentnode;
            currentnode.prev = newnode;
            temp.next = newnode;
            newnode.prev = temp;
            size++;
        }
        System.out.println("add at pos");
    }

    public void insertattail(int data) {
        Node<Integer> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        Node<Integer> temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        newnode.prev = temp;
        temp.next = newnode;
        tail = newnode;
        System.out.println("add at pos");
        size++;

    }

    public void insertathead(int data) {
        Node<Integer> newnode = new Node<>(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            size++;
            return;
        }
        newnode.next = head;
        head.prev = newnode;
        head = newnode;
        System.out.println("add at pos");
        size++;
    }

    public void deletehead() {
        Node<Integer> temp = head;
        if (temp == null) {
            System.out.println("no node is present");
            return;
        }
        head = head.next;
        temp.next = null;
        if (head == null) {
            tail = null;
        } else {
            head.prev = null;
        }
        size--;
    }

    public void deletetail() {

        if (head == null) {
            System.out.println("no node is present");
            return;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            size--;
            return;
        }
        Node<Integer> temp = head;
        Node<Integer> prenode = null;
        while (temp.next != null) {
            prenode = temp;
            temp = temp.next;
        }
        prenode.next = null;
        temp.prev = null;
        tail = prenode;
        size--;
    }

    public void deleteatpos(int pos) {
        Node<Integer> temp = head;
        if (temp == null) {
            System.out.println("no node is present");
            return;
        } else if (pos == 1) {
            deletehead();
            return;
        } else if (pos == size + 1) {
            deletetail();
            return;
        } else {
            int counter = 1;
            Node<Integer> temp = head;
            Node<Integer> prenode = null;
            while (temp != null && counter < pos) {
                counter++;
                prenode = temp;
                temp = temp.next;
            }
        }
        temp.prev.next = null;
        temp.prev = null;
        size--;
    }

    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertathead(2);
        list.insertattail(3);
        list.insertattail(4);
        list.insertattail(5);
        list.insertatposition(3, 2);
        list.displayreverse();
        System.out.println();
        System.out.println("-------------");
        list.displayforward();
    }
}

package Linkedlist.Fastandslowpointer;

//we simply reverse the half of list and then compare to rest half
// we take three pointer prev,fast,slow and prev point to head of reverse list
public class PalindromicLinkedlist {
    public static void main(String[] args) {
        PalindromicLinkedlist s = new PalindromicLinkedlist();
        s.palindrome(head);
    }

    public void palindrome(Node head) {
        Node prev = null;
        Node slow = head;
        Node Fast = head;
        Node newlisthead = null;
        while (Fast != null && Fast.next != null) {
            prev = slow;
            slow = slow.next;
            Fast = Fast.next.next;
            if (newlisthead == null) {
                newlisthead = new Node(prev.val);
            } else {
                Node node = new Node(prev.val);
                node.next = newlisthead;
                newlisthead = node;

            }
        }
        // if list is odd lenth
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null && newlisthead != null) {
            if (slow.val != newlisthead.val) {
                return false;
            }
            slow = slow.next;
            newlisthead = newlisthead.next;
        }
        return true;
    }
}

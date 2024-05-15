package Linkedlist.Fastandslowpointer;

//floyd cycle detection algo or hair tortooe
// fast speed=2*slow speed 
// if slow and fast meet so cycle exist
// to detect first node of cycle when slow and fast mmet then
// place slow to head and fast remain as it is so now the point where they meet 
// is a start point 
// prove
// A+B=alpha*C
// A=alpha*C-B
// -B is already done because fast is already aT node
// so number of time cycle travel is equal to alpha*C
public class DetectCycle {
  public static void main(String[] args) {
    DetectCycle s = new DetectCycle();
    s.cycle(head);
  }

  public boolean hascycle(Node head) {
    Node slow = head;
    Node fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    if (slow == fast) {
      return true;
    }
    return false;
  }

  public boolean firstnodeofcycle(Node head) {
    Node slow = head;
    Node fast = head;
    boolean found = false;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (slow == fast) {
        found = true;
        break;
      }
    }
    if (!found) {
      return null;
    }
    slow = head;
    while (slow != fast) {
      slow = slow.next;
      fast = fast.next;
    }
    return slow;
  }

}

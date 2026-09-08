/* Structure of Linked List Node
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertPos(Node head, int pos, int val) {
        Node n = new Node(val);
        if (pos == 1) {
            n.next = head;
            return n;
        }
        Node temp = head;
        for (int i=1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            n.next = temp.next;
            temp.next = n;
        }
        return head;
    }
}
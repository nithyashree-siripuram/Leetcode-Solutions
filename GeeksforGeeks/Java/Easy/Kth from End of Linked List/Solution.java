class Solution {
    public int getKthFromLast(Node head, int k) {
        // code here
        Node slow = head;
        Node fast = head;
        while(fast!=null && k!=0){
            k--;
            fast = fast.next;
        }
        if(fast==null && k!=0){
            return -1;
        }
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;

    }
}
public class LL {
    private Node head;
    private Node tail;
    private int size;
    
    public LL(int size) {
        this.size = 0;
    }

    public void indertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, LL.Node next) {
            this.value = value;
            this.next = next;
        }
    }
}

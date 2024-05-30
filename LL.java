public class LL {
    private Node head;
    private Node tail;
    private int size;
    
    public LL(int size) {
        this.size = 0;
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

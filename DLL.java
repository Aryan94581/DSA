public class DLL {
    Node head;


    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head !=null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node node = head;
        while(node != null){
            System.out.println(node.val + " -> ");
            node = node.next;
        }
    
    }





    private class Node{
        int val;
        Node next;
        Node prev;
        public Node(int value) {
            this.val = value;
        }
        public Node(int value, DLL.Node next, DLL.Node prev) {
            this.val = value;
            this.next = next;
            this.prev = prev;
        }


    }
}

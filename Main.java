public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(15);
        list.insertFirst(13);
        list.insertFirst(17);
        list.insertFirst(19);
        list.insertLast(16);
        list.insert(77, 3);
        // list.insert(66, 100); give exception 
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
    }
}

package Java.LinkedList;


public class Runner {
    public static void main(String[] args){
        LinkedList list= new LinkedList();

        list.insert(5);
        list.insert(45);
        list.insert(12);
        list.insert(85);
        list.insertAtStart(50);
        list.insertAtStart(23);
        list.insertAt(2, 63);
        list.deleteAt(2);

        list.show();
        // list.add(3,12);
    }
}


package rondomzz;

public class App {

    public static void main(String[] args) {
        node<String> obj1 = new node<>("obj1");
        node<String> obj2 = new node<>("obj2");
        node<String> obj3 = new node<>("obj3");
        LinkedList<String> ll = new LinkedList<>();
        ll.add(obj1);
        //ll.add(obj2);
        ll.print();
        ll.insertAfter(obj3, obj1);
        ll.insertAfter(obj2, obj1);
        ll.print();

    }

    public Object getGreeting() {
        return null;
    }
}

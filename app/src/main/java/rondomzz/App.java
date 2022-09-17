
package rondomzz;

public class App {

    public static void main(String[] args) {
        node<String> obj1 = new node<>("obj1");
        node<String> obj2 = new node<>("obj2");
        LinkedList<String> ll = new LinkedList<>();
        ll.add(obj1);
        ll.add(obj2);
        ll.print();
        System.out.println("this is my head - " + ll.head.data);
    }

    public Object getGreeting() {
        return null;
    }
}

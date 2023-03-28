
package rondomzz;

public class App {

    public static void main(String[] args) {
        node<String> obj1 = new node<>("obj1");
        node<String> obj2 = new node<>("obj2");
        node<String> obj3 = new node<>("obj3");
        LinkedList<String> ll = new LinkedList<>();
        ll.add(obj1);
        //ll.add(obj2);
        /*an error if you add obj2, rectify it. */
        ll.print();
        ll.insertAfter(obj3, obj1);
        ll.insertAfter(obj2, obj1);
        ll.print();


        linkedListNodes <Integer> nn = new linkedListNodes<>();
        nn.add(1);
        nn.add(2);
        nn.add(3);
        nn.remove(4);

        System.out.println(nn.next.value);
    }

    public Object getGreeting() {
        return null;
    }


}

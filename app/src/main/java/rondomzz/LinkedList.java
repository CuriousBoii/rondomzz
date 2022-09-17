package rondomzz;

public class LinkedList<T> {
    node<T> head;
    
    public void add(node<T> newNode){
        if(this.head == null){
            this.head = newNode;
        }
        else{
            node<T> now = this.head;
            while(now.next != null){
                now = now.next;
            }
            now.next = newNode;
            newNode.previous = now;
        }
    }

    public void print(){
    if(this.head != null){
        node<T> now = this.head;
        while(now.next != null){
            System.out.println(now.data);
            now = now.next;
            }
        System.out.println(now.data);
    }
    else{
        System.out.println("list is empty");
        }
    }


}

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

    public void insertAfter(node<T> newNode, node<T> atNode){
        if(this.head != null){    
            newNode.next = atNode.next;
            if(atNode.next != null){
                atNode.next.previous = newNode;
            }
            atNode.next = newNode;
            newNode.previous = atNode;
        }
        else{
            System.out.println("the list is empty or atNode doesn't exist, so i've added the node. ");
            add(newNode);
        }
    }

    public void remove(node<T> removeNode){
        
    }
}

package rondomzz;

public class linkedListNodes <T>{
    T value;
    public linkedListNodes<T> next;
    public int size;

    public linkedListNodes() {
        this.value = null;
        this.next = null;
        this.size = 0;
    }

    public T add(T value){
        linkedListNodes <T> newnode = new linkedListNodes<T>();
        newnode.value = value;
        if(this.size == 0){
            this.next = newnode;
            newnode.next = null;
        }
        else{
            linkedListNodes <T> current = this.next;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;
            newnode.next = null;
        }
        this.size++;
        return value;
    }

    public T remove(T value){
        if(this.size == 0){
            System.out.println("empty list");
        }
        else{
            linkedListNodes <T> current = this;
            while(current.next.value != value){
                current = current.next;
                if (current.next == null){
                    System.out.println("no such value in the list");
                    return value;
                }
            }
            current.next = current.next.next;
        }
        this.size--;
        return value;
    }

}
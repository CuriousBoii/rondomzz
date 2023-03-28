package rondomzz;

public class linkedListNodes <T>{
    T value;
    private linkedListNodes<T> next;
    private int size;

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
}
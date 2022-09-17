package rondomzz;

public class node <T>{
    T data;
    node<T> next, previous;
    public node(T data){
        this.data = data;
        //System.out.println(data);
    }
    /*public void nodemkr(node<T> mynode, T data){
        node<T> mynode = new node<T>(data);
    }*/
    
}

public class MyArrayStack<T> implements ArrayStack<T>{

    private int length = 0;
    private MyArrayList array = new MyArrayList();

    @Override
    public void push(Node<T> n){
        array.addNode(n);
        length++;
    }

    @Override
    public Node<T> pop(){
        if (array.size() <= 0) return null;
        Node temp = array.getLastNode();
        array.removeNode(length - 1);
        length--;
        return temp;
    }

    @Override
    public Node<T> peek(){
        return array.getLastNode();
    }

    @Override
    public int size(){
        return length;
    }

    @Override
    public boolean isEmpty(){
        return length == 0;
    }
}

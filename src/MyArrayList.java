public class MyArrayList<T> implements ArrayList<T>{

    private T data;
    private int size = (int)1e8;
    private int length = 0;
    private MyNode[] array = new MyNode[size];

    @Override
    public void addNode(Node n){
        array[length++] = n;
    }

    @Override
    public void insertNode(Node n, int i){
        for (int loop = length; loop > i; loop--) array[loop] = array[loop-1];
        array[i] = n;
    }

    @Override
    public void removeNode(Node n){
        for (int i = 0; i )
    }

    @Override
    public Node removeNode(int i) {
        return null;
    }

    @Override
    public Node getNode(int i) {
        return null;
    }

    @Override
    public Node getFirstNode() {
        return null;
    }

    @Override
    public Node getLastNode() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

public class TEST{
    public static void main(String[] args){
        MyArrayList<Integer> test = new MyArrayList<>();
        test.addNode(new MyNode(6));
        test.addNode(new MyNode(9));
        test.insertNode(new MyNode(420), 1);
        test.removeNode(new MyNode(6));
        System.out.println(test.getLastNode());
    }
}

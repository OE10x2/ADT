public class TEST{
    public static void main(String[] args){
        MyArrayList<Integer> test = new MyArrayList<>();
        test.addNode(new MyNode(6));
        test.addNode(new MyNode(9));
        test.addNode(new MyNode(9));
        test.addNode(new MyNode(9));
        test.addNode(new MyNode(6));
        test.addNode(new MyNode(9));
        test.insertNode(new MyNode(420), 1);
        test.removeNode(new MyNode(9));
        test.removeNode(3);
        for (int i = 0; i < test.size(); i++) System.out.print(test.getNode(i) + " ");
        System.out.println();

        MyArrayQueue<Integer> queue = new MyArrayQueue<>();
        queue.enqueue(new MyNode(9));
        queue.enqueue(new MyNode(6));
        queue.enqueue(new MyNode(7));
        queue.enqueue(new MyNode(8));
        queue.enqueue(new MyNode(9));
        queue.dequeue();
        System.out.println("JUST TESTING: " + queue.peek());
        while (!queue.isEmpty()) System.out.print(queue.dequeue() + " ");
        System.out.println();
    }
}

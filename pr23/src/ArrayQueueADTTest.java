public class ArrayQueueADTTest {

    public static void main(String[] args) {
        ArrayQueueADT q = new ArrayQueueADT();
        q.deQueue();
        for(int i = 1; i < 6; i ++) {
            q.enQueue(i);
        }
        q.enQueue(6);
        q.display();
        q.deQueue();
        q.display();
    }
}


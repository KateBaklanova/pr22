

public abstract class AbstractQueue {

    abstract public void enQueue(Object element);

    abstract public Object deQueue();

    abstract public boolean isEmpty();

    abstract public boolean isFull();

    abstract public void clear();
}
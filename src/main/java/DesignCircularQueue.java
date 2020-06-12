
/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
public class DesignCircularQueue {
    private final int[] queue;
    private int header = 0;
    private int footer = 0;

    /**
     * Initialize your data structure here. Set the size of the queue to be k.
     */
    public DesignCircularQueue(int k) {
        queue = new int[k];
    }

    /**
     * Insert an element into the circular queue. Return true if the operation is successful.
     */
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        footer++;
        if (footer == queue.length) {
            footer = 0;
        }
        queue[footer] = value;
        return true;
    }

    /**
     * Delete an element from the circular queue. Return true if the operation is successful.
     */
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        queue[header] = -1;
        header++;
        if (header == queue.length) {
            header = 0;
        }
        if (isEmpty()) {
            footer = -1;
        }
        return true;
    }

    /**
     * Get the front item from the queue.
     */
    public int Front() {
        return queue[header];
    }

    /**
     * Get the last item from the queue.
     */
    public int Rear() {
        return queue[footer];
    }

    /**
     * Checks whether the circular queue is empty or not.
     */
    public boolean isEmpty() {
        return header == -1;
    }

    /**
     * Checks whether the circular queue is full or not.
     */
    public boolean isFull() {
        return header + footer + 1 == queue.length;
    }
}

package data_structures.array_based.QueueAdvanced;

public class GenericQueue<T> implements QueueInterface<T> {
    // a queue to hold the array
    private T[] queue;
    // the put and get indices
    private int putloc, pullloc;

    // constructor that takes a T array and gives it to queue variable & sets indices = 0.
    public GenericQueue(T[] queue){
        this.queue = queue;
        putloc = pullloc = 0;
    }

    // Method to put an item in the queue, first tests if put and pull indices are equal, if so
    // throws exception. If not, gives the queue at this location the value passed in (i), and
    // increases the put index.
    @Override
    public void put(T i) throws QueueFullException {
        if (putloc == pullloc){
            throw new QueueFullException(queue.length);
        }
        queue[putloc++] = i;
    }

    // Method to get an item from the queue, first tests if indices are equal, if so throws exc.
    // If not, returns value of queue at current pull location, then increases index 1
    @Override
    public T pull() throws QueueEmptyException {
        if (pullloc == putloc){
            throw new QueueEmptyException();
        }
        return queue[pullloc++];
    }
}

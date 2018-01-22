package data_structures.array_based;

public class Queue {

    // create an array to hold the queue:
    private int[] queue;
    // create the get and put indices:
    private int putloc, getloc;

    // create a queue array of size size. Start put and get indices at zero.
    Queue(int size){
        queue = new int[size];
        putloc = getloc = 0;
    }

    public void put(int i) {
        if(putloc==queue.length) {
            System.out.println(" -- Queue is full.");
            return;
        }

        queue[putloc++] = i;
    }

    // Get a character from the Queue.
    public int get() {
        if(getloc == putloc) {
            System.out.println(" -- Queue is empty.");
            return 0;
        }

        return queue[getloc++];
    }
}

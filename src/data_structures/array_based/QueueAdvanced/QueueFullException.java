package data_structures.array_based.QueueAdvanced;

public class QueueFullException extends Exception {

    int size;

    QueueFullException(int size){
        this.size = size;
    }

    public String toString(){
        return "The queue is full! The max size is " + size;
    }

}

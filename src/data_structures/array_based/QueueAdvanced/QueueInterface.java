package data_structures.array_based.QueueAdvanced;

public interface QueueInterface<T> {

    void put(T i) throws QueueFullException;

    T pull() throws QueueEmptyException;

}

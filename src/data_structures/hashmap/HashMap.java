package data_structures.hashmap;

public class HashMap {

    Student[] map;
    int size;

    HashMap(int size){
        this.size = size;
        map = new Student[size];
    }

    public void put(String key, Student s){
        // get hash code by hashing the first name of the student passed to this method as key
        int hash = Math.abs(key.hashCode() % size);
        s.setKey(key);

        if (map[hash] == null) {
            map[hash] = s;
        } else {
            // if hash codes conflict, put object at end of linked list
            Student current = map[hash];

            // loop through each student until there are no more
            while (current.nextStudent!=null){

                // check if key already exists, this is because it's assumed the key will never
                // be duplicated
                if (current.getKey().equals(s.getKey())){
                    // replace key's value with new one if key is duplicate
                    current.setFirst_name(s.getFirst_name());
                    current.setLast_name(s.getLast_name());
                    return;
                }

                // go to next link in linked list
                current = current.nextStudent;
            }

            // at the end of the list, the next link becomes the newly created object
            current.nextStudent = s;
        }
    }

    // get



    // delete

    // hash function

}

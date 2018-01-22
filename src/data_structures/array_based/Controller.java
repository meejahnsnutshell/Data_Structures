package data_structures.array_based;

class ArrayBasedController {

    public static void main(String args[]) {

    //Demonstrate the stack.
        // filling the stack with characters:
        Stack stack = new Stack(5);
        stack.push('h');
        stack.push('e');
        stack.push('l');
        stack.push('l');
        stack.push('o');


        for (int i = 0; i < 5; i++ ) {
            char ch = stack.pop();
            System.out.println(ch);
        }

    // Demonstrate the Queue:
        // construct 10-element empty Queue
        Queue queue = new Queue(10);

        // put some ints into queue
        for(int i=0; i < 10; i++)
            queue.put(i + 1);

        System.out.print("Contents of queue: ");
        for(int i=0; i < 10; i++) {
            int q = queue.get();
            System.out.print(q);
        }


    }
}
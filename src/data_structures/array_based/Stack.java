package data_structures.array_based;

// Stack is a first in last out

public class Stack {

    private char[] stk;
    private int pushloc; // the (put) push index

    Stack (int size) {

        stk = new char[size]; // allocate memory for queue
        pushloc = 0;
    }

    // push a character into the stack
    void push(char ch) {

        if(pushloc==stk.length) {
            System.out.println(" – Stack is full.");
            return;
        }

        stk[pushloc++] = ch;

    }

    // pop a character from the stack
    char pop() {

        if(pushloc == 0) {
            System.out.println(" – Stack is empty.");
            return (char) 0;
        }
        return stk[--pushloc];
    }
}
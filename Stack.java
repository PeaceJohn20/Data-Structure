public class Stack {
    int size;
    int top;
    int[] array;

    Stack(int capacity) {
        top = -1;
        size = capacity;
        array = new int[size];
        //the process of adding an item to a add is called PUSH,and removing an item is called POP
        //an empty stack start from -1
    }

    boolean isFull() {
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
    }

    int pop() {
        int PreviousTop = top;
        if (isEmpty()) {
            System.out.println("Stack Underflow");

        } else {
            top--;
        }
        return PreviousTop;
    }
}

      void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("Stack: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

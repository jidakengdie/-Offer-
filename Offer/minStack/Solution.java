package minStack;

import java.util.Stack;

class Solution {
    Stack<Integer> minStack = new Stack<Integer>();
    Stack<Integer> Stack = new Stack<Integer>();

    public void push(int node) {
        Stack.push(node);
        if (minStack.empty()) {
            minStack.push(node);
        } else if (minStack.peek() > node) {
            minStack.push(node);
        }
    }

    public int pop() {
        int temp = Stack.pop();
        if (temp == minStack.peek()) {
            minStack.pop();
        }
        return temp;
    }

    public int top() {
        return Stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}

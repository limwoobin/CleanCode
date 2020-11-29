package Chapter10_Class.ex1;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;

// 응집도가 높은 클래스
public class Stack {
    private int topOfStack = 0;
    List<Integer> elements = new LinkedList<>();

    public int size() {
        return topOfStack;
    }

    public void push(int element) {
        topOfStack++;
        elements.add(element);
    }

    public int pop() {
        if (topOfStack == 0) {
            throw new EmptyStackException();
        }
        int element = elements.get(--topOfStack);
        elements.remove(topOfStack);
        return element;
    }
}

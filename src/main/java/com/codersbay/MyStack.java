package com.codersbay;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {

    int sizeOfStack;
    StackElement<T> topElement;

    public MyStack() {
        this.sizeOfStack = 0;
        this.topElement = null;
    }

    public int getSizeOfStack() {
        return sizeOfStack;
    }

    public void setSizeOfStack(int sizeOfStack) {
        this.sizeOfStack = sizeOfStack;
    }

    public StackElement<T> getTopElement() {
        return topElement;
    }

    public void setTopElement(StackElement<T> topElement) {
        this.topElement = topElement;
    }

    public int length() {
        return sizeOfStack;
    }

    public void push(T newValue) {
        StackElement<T> newElement = new StackElement<T>(newValue, topElement);
        sizeOfStack++;
        topElement = newElement;
    }

    public T pop() throws StackEmptyException {
        if (sizeOfStack == 0) {
            throw new StackEmptyException("The stack is already empty.");
        } else {
            sizeOfStack--;
            StackElement<T> oldTopElement = topElement;
            topElement = topElement.getNextElement();
            return oldTopElement.getElementValue();
        }

    }

    public T peek() throws StackEmptyException {
        if (sizeOfStack == 0) {
            throw new StackEmptyException("The stack is empty.");
        } else {
            return topElement.elementValue;
        }

    }
}

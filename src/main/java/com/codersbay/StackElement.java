package com.codersbay;

public class StackElement<T> {

    T elementValue;
    StackElement<T> nextElement;

    public StackElement(T elementValue, StackElement<T> nextElement) {
        this.elementValue = elementValue;
        this.nextElement = nextElement;
    }

    public T getElementValue() {
        return elementValue;
    }

    public void setElementValue(T elementValue) {
        this.elementValue = elementValue;
    }

    public StackElement<T> getNextElement() {
        return nextElement;
    }

    public void setNextElement(StackElement<T> nextElement) {
        this.nextElement = nextElement;
    }

}

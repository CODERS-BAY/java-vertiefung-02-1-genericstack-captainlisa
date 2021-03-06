package com.codersbay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyStackTest {

    @Test
    @DisplayName("Test that length() returns the size of the stack")
    public void testLength() {
        MyStack<Integer> testStack = new MyStack<Integer>();
        testStack.push(13);
        testStack.push(7);
        testStack.push(1234);
        Assertions.assertEquals(3, testStack.length());
    }

    @Test
    @DisplayName("Test that push() adds another element to the top")
    public void testPush() {
        MyStack<Integer> testStack = new MyStack<Integer>();
        testStack.push(13);
        testStack.push(7);
        testStack.push(1234);
        Assertions.assertEquals(1234, testStack.topElement.elementValue);
    }

    @Test
    @DisplayName("Test that peek() shows you the top element")
    public void testPeek() throws StackEmptyException {
        MyStack<String> testStack = new MyStack<String>();
        testStack.push("first");
        testStack.push("second");
        testStack.push("top element");
        Assertions.assertEquals("top element", testStack.peek());
    }

    @Test
    @DisplayName("Test that peek() shows you the top element")
    public void testPeekDoesNotChangeStack() throws StackEmptyException {
        MyStack<String> testStack = new MyStack<String>();
        testStack.push("first");
        testStack.push("second");
        testStack.push("top element");
        Assertions.assertEquals(3, testStack.getSizeOfStack());
        testStack.peek();
        Assertions.assertEquals(3, testStack.getSizeOfStack());
    }

    @Test
    @DisplayName("Test that peek() on an empty stack throws exception")
    public void testPeekWithEmptyStack() {
        MyStack<Boolean> testStack = new MyStack<Boolean>();
        Assertions.assertThrows(StackEmptyException.class, () -> {
            testStack.peek();
        });
    }

    @Test
    @DisplayName("Test that pop() on an empty stack throws exception")
    public void testPopWithEmptyStack() {
        MyStack<Double> testStack = new MyStack<Double>();
        Assertions.assertThrows(StackEmptyException.class, () -> {
            testStack.pop();
        });
    }

    @Test
    @DisplayName("Test that pop() gives back the value of the top element")
    public void testPop() throws StackEmptyException {
        MyStack<Integer> testStack = new MyStack<Integer>();
        testStack.push(2);
        Assertions.assertEquals(2, testStack.pop());
    }

    @Test
    @DisplayName("Test that pop() gives back the value of the top element")
    public void testPopChangesSizeOfStack() throws StackEmptyException {
        MyStack<Integer> testStack = new MyStack<Integer>();
        Assertions.assertEquals(0, testStack.getSizeOfStack());
        testStack.push(2);
        Assertions.assertEquals(1, testStack.getSizeOfStack());
    }

    @Test
    @DisplayName("Test that pop() gives back the value of the top element")
    public void testPushAndPopCanFillAndEmptyAStackCompletely() throws StackEmptyException {
        MyStack<Integer> testStack = new MyStack<Integer>();
        testStack.push(2);
        testStack.push(65);
        testStack.push(345);
        testStack.push(6);
        Assertions.assertEquals(4, testStack.getSizeOfStack());
        int stackSize = testStack.getSizeOfStack();
        for (int i = 0; i < stackSize; i++) {
            testStack.pop();
        }
        Assertions.assertEquals(0, testStack.getSizeOfStack());
    }
}

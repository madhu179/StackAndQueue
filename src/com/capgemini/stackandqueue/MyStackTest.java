package com.capgemini.stackandqueue;

import org.junit.Assert;
import org.junit.Test;


public class MyStackTest {
	@Test
	public void given3NodesAddingToStackAreAddedToTopShouldPassTest() {
		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> firstNode = new Node<>(70);
		MyStack myStack= new MyStack();

		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);
		
		INode topElement = myStack.peak();

		myStack.printStack();

		boolean result = topElement.equals(thirdNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NodesPoppingTopElementShouldPassTest() {
		Node<Integer> thirdNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> firstNode = new Node<>(70);
		MyStack myStack = new MyStack();

		myStack.push(firstNode);
		myStack.push(secondNode);
		myStack.push(thirdNode);

		myStack.printStack();
		INode topElement = myStack.peak();
		INode poppedElement = myStack.pop();

		while (!myStack.isEmpty()) {
			myStack.printStack();
			topElement = myStack.peak();
			poppedElement = myStack.pop();
		}

		boolean result = topElement.equals(poppedElement);
		Assert.assertTrue(result);
	}

}

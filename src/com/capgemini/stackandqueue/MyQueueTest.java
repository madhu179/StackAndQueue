package com.capgemini.stackandqueue;

import org.junit.Assert;
import org.junit.Test;

public class MyQueueTest {
	@Test
	public void given3NodesAddingToQueueAreAppendedShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyQueue myQueue = new MyQueue();

		myQueue.enQueue(firstNode);
		myQueue.enQueue(secondNode);
		myQueue.enQueue(thirdNode);

		INode begningElement = myQueue.peak();

		myQueue.printQueue();

		boolean result = begningElement.equals(firstNode);
		Assert.assertTrue(result);
	}
	
	@Test
	public void given3NodesDequeingTopElementShouldPassTest() {
		Node<Integer> firstNode = new Node<>(56);
		Node<Integer> secondNode = new Node<>(30);
		Node<Integer> thirdNode = new Node<>(70);
		MyQueue myQueue = new MyQueue();

		myQueue.enQueue(firstNode);
		myQueue.enQueue(secondNode);
		myQueue.enQueue(thirdNode);

		INode begningElement = myQueue.peak();
		
		myQueue.printQueue();
		INode dequeuedElement=myQueue.deQueue();
		myQueue.printQueue();

		boolean result = begningElement.equals(dequeuedElement);
		Assert.assertTrue(result);
	}

}

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

		INode topElement = myQueue.peak();

		myQueue.printQueue();

		boolean result = topElement.equals(firstNode);
		Assert.assertTrue(result);
	}

}

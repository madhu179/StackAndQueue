package com.capgemini.stackandqueue;

public class MyQueue {
	private MyLinkedList myLinkedList;

	MyQueue() {
		myLinkedList = new MyLinkedList();
	}

	public void enQueue(INode newNode) {
		myLinkedList.appendNode(newNode);
	}

	public INode deQueue() {

		return myLinkedList.pop();
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public void printQueue() {
		myLinkedList.printNodes();
	}

}

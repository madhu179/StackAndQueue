package com.capgemini.stackandqueue;

public class MyStack {
	private MyLinkedList myLinkedList;

	MyStack() {
		myLinkedList = new MyLinkedList();
	}

	public void push(INode newNode) {
		myLinkedList.addNode(newNode);
	}

	public INode peak() {
		return myLinkedList.head;
	}

	public INode pop() {

		return myLinkedList.pop();
	}

	public boolean isEmpty() {

		return myLinkedList.size() == 0 ? true : false;
	}

	public void printStack() {
		myLinkedList.printNodes();
	}

}

package com.capgemini.stackandqueue;

public interface INode<K> {

	void setKey(K key);

	K getKey();

	void setNext(INode node);

	INode getNext();

}

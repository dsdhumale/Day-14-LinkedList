package com.Bridgelabz.Day14.LinkedList;

public interface INode<K> {
	void setKey(K Key);

	K getKey();

	void setNext(INode<K> next);

	INode<K> getNext();

}

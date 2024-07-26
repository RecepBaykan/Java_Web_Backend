package SortingAlgorithm;

public class Main {

	
	
}


class Node {
	
	Node next;
	
}


class Cocuk extends Node implements INode{
	
	String adi;
}


class Cocuk2 extends Node implements INode{
	String adi;
	String soyadi;
}


interface INode{
	
	INode next = null;
	
	
	
	
}
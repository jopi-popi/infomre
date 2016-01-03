package hr.fer.tel.infomre.labosProfila;

public class Values {
	private char currentNode;
	private char neighbourNode;
	private int cost;
	private char connectivity;
	
	public char getCurrentNode() {
		return currentNode;
	}
	
	public char getNeighbourNode() {
		return neighbourNode;
	}
	
	public int getCost() {
		return cost;
	}
	
	public char getConnectivity(){
		return connectivity;
	}
	
	public Values (char currentNode,char neighbourNode, int cost, char connectivity) {
		this.currentNode = currentNode;
		this.neighbourNode = neighbourNode;
		this.cost = cost;
		this.connectivity = connectivity;
	}
	
	public Values() {
		
	}
	
	
}

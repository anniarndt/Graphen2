package graphen;

import java.util.ArrayList;

public class Edge {
	private Node firstNode;
	private Node secondNode;

	public Edge(Node firstNode, Node secondNode) {

		this.firstNode = firstNode;
		this.secondNode = secondNode;
	}

	public Node getFirstNode() {
		return firstNode;
	}

	public Node getSecondNode() {
		return secondNode;
	}

	public Node[] getNodes() {
		return getNodes();

	}
	public String toString() {
		return ( firstNode + "--" + secondNode);
	}

}

package graphen;

import java.awt.List;
import java.util.ArrayList;

public class Graph {
	private ArrayList<Node> nodes = new ArrayList<Node>();
	private ArrayList<Edge> edges = new ArrayList<Edge>();

	public Graph(ArrayList<Node> nodes, ArrayList<Edge> edges) {
		this.nodes = nodes;
		this.edges = edges;
	}

	public ArrayList<Node> getNodes() {
		return nodes;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	public void addEdge(Edge newEdge) {

		edges.add(newEdge);

	}

	public void removeEdge(Edge lastEdge) {
		edges.remove(lastEdge);
	}

	public void addNode(Node newNode) {
		nodes.add(newNode);
	}

	public void removeNode(Node lastNode) {
		nodes.remove(lastNode);
	}

	String breadthFirstSearch(Node startNode) {
		String traversalList = new String();
		ArrayList<Node> visitedNodesList = new ArrayList<Node>();
		breadthFirstSearch(startNode);
		return traversalList;

	}

	public void visitBreadthFirstSearch(Node startNode) {
		ArrayList nextNodesToVisit = new ArrayList<Node>();
		for (Node nextNode : nodes) {
			System.out.println(nextNode);

		}
	}

	public ArrayList<Node> neighborNodeTo(Node next2, ArrayList<Node> nodes2, ArrayList<Edge> edges) {
		int a = 2;
		int i = nodes2.indexOf(next2);

		if (i == -1 || i == nodes2.size() - 1) {
			return null;
		}
		Node next = nodes2.get(i + 1);

		ArrayList<Node> neighbornodes = null;
		neighborNodeTo(next, nodes2, edges);
		return neighbornodes;
	}

	public StringBuffer neighborNodeFrom(Node startNode) {
		// müsste mir eine Liste mit Knoten zurückgeben, also eine Liste mit
		// Nachbarknoten
		StringBuffer traversallist = null;
		int i = nodes.indexOf(startNode);
		System.out.println(i);
		if (i == -1 || i == nodes.size() - 1) {
			return null;
		}

		if (i == 0) {
			traversallist.append(startNode.toString());
			return traversallist;
		}
		Node before = nodes.get(i - 1);
		String befores = before.toString();
		System.out.println(befores);
		return traversallist;
	}

	public String DFS(Node startNode, Node goalNode, ArrayList<Node> nodes, ArrayList<Edge> edgi) {
		boolean found = false;
		while (found == false) {
			ArrayList<Node> neighbour = Adjazenzliste(startNode, nodes, edgi);
			System.out.println(neighbour.toString());
			for (Node nodi : neighbour) {
				if (neighbour.contains(nodi)) {

					return "Gefunden";
				}
			}

		}
		return null;
	}

	public String BFS(Node startNode, Node goalNode, ArrayList<Node> nodes, ArrayList<Edge> edgi) {
		boolean found = false;
		int i = 0;
		while (found == false) {
			ArrayList<Node> neighbour = Adjazenzliste(startNode, nodes, edgi);

			Node nodichild1 = findChild(startNode, goalNode, nodes, edgi, i);
			System.out.println(nodichild1);

			for (Node nodi : neighbour) {

				if (neighbour.contains(goalNode) || nodichild1.equals(goalNode)) {

					return "Gefunden";
				}
			}
			BFS(nodichild1, goalNode, nodes, edgi);
		}
		// 1. Knoten bestimmen, wo die Suche bgeinnen soll: Node searchedObject
		// Entnimm einen Knoten der Warteschlange
		return "Gefunden";
	}

	public Node findChild(Node startNode, Node goalNode, ArrayList<Node> nodes, ArrayList<Edge> edgi, int i) {
		ArrayList<Node> children = Adjazenzliste(startNode, nodes, edgi);
		// System.out.println(children.toString());
		Node nodi = children.get(i);
		return nodi;
	}

	public ArrayList<Node> Adjazenzliste(Node startNode, ArrayList<Node> nodes, ArrayList<Edge> edgi) {
		int length = edgi.size();
		ArrayList<Node> foundNodes = new ArrayList<>();
		Edge wedgiI;
		Edge wedgiII;

		for (int e = 0; e < length; e++) {
			wedgiI = edgi.get(e);

			if (edgi.contains(wedgiI) || edgi.contains(wedgiI)) {
				Node nodiI = wedgiI.getFirstNode();
				Node nodi2I = wedgiI.getSecondNode();

				if (nodiI.equals(startNode) || nodi2I.equals(startNode)) {

					// System.out.println(nodi2I);
					if (!foundNodes.contains(nodi2I) || !foundNodes.contains(nodiI)) {
						foundNodes.add(nodiI);
						foundNodes.add(nodi2I);

					}

				}

			}
		}
		while (foundNodes.contains(startNode)) {
			foundNodes.remove(startNode);
		}

		return foundNodes;
	}

}

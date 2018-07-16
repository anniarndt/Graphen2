package graphen;

public class WeightedEdge extends Edge {
	private double weight;
	private Node firstNode;
	private Node secondNode;

	public double getWeight() {
		return weight;
	}

	public WeightedEdge(Node firstNode, Node secondNode, double weight) {
		super(firstNode, secondNode);
		this.weight = weight;
		this.firstNode = firstNode;
		this.secondNode = secondNode;
		// TODO Automatisch generierter Konstruktorstub

	}
	@Override
	public String toString() {
		return ( firstNode + "-" + weight + "-" + secondNode);
	}

}

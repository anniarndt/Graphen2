package graphen;

public class WeightedDirectedEdge extends WeightedEdge {
double weight;
private Node from;
private Node to;
	public WeightedDirectedEdge(Node from, Node to, double weight) {
		super(from, to, weight);
		this.weight = weight;
		this.from = from;
		this.to = to;
		// TODO Auto-generated conNostructor stub
	}

	public Node getFrom() {
		return this.getFirstNode();
	}
	public double getWeight() {
		return weight;
	}

	public Node getTo() {
		return this.getSecondNode();
	}

}

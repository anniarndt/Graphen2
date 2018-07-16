package graphen;

import java.util.ArrayList;

public class DirectedEdge extends Edge {

	public Node getFrom() {
		return getFirstNode();
	}

	public DirectedEdge(Node to, Node from) {
		super(from, to);

	}

	public Node getTo() {
		return getSecondNode();
	}
}

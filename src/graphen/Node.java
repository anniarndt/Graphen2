package graphen;

import java.util.ArrayList;

public class Node {
	private Object obj;
	public ArrayList<Node> nachbarn ;

	public Node(Object obj) {
		super();
		this.obj = obj;
		this.nachbarn = new ArrayList<Node>();
	}

	public Object getObj() {
		return obj;
	}

	/*
	 * public void setObj(Object obj) { this.obj = obj; }
	 */

	public String toString() {
		return "{" + obj + "}";
	}

}

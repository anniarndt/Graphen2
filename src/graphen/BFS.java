package graphen;

import java.awt.List;
import java.util.ArrayList;

public class BFS {
	private StringBuffer traversalList;
	private ArrayList<Node> visitedNodesList;

	BFS(Node startnode) {
		traversalList = new StringBuffer();
		visitedNodesList = new ArrayList<Node>();
		traversalList.append(startnode);
		visitedNodesList.add(startnode);

	}

	public void visitDFS(Node startnode) {

		ArrayList<Node> nachbarnvonstartnode = startnode.nachbarn; // eine ArrayList mit den Nachbarn
		Node nextNode = null;
		int i;
		for ( i = 0; i < nachbarnvonstartnode.size(); i++) {
			 nextNode= startnode.nachbarn.get(i);
			Node nextNodeToVisit = startnode.nachbarn.get(1);
			System.out.println("nextNodeToVisit ist" + startnode.nachbarn.get(i));
			if (!visitedNodesList.contains(nextNode)) {
				traversalList.append(i);
				System.out.println(nextNode + "wurde besucht");
				System.out.println(nextNode.nachbarn.toString()); // alle Felder an sich sollten private sein
				visitedNodesList.add(nextNode);
				nachbarnvonstartnode.add(nextNode);
				
			}

		}
		System.out.println(nextNode);
		if(nextNode != null) {
			visitDFS(nextNode);
			System.out.println(i);
			System.out.println("!!");
			
			
		}else {
		
		}
		

	}

}

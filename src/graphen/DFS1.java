package graphen;

import java.awt.List;
import java.util.ArrayList;

public class DFS1 {
	private StringBuffer traversalList;
	private ArrayList<Node> visitedNodesList;

	DFS1(Node startnode) {
		traversalList = new StringBuffer();
		visitedNodesList = new ArrayList<Node>();
		traversalList.append(startnode);
		visitedNodesList.add(startnode);
		
		 

	}

	public void visitBFS(Node startnode) {
	
		ArrayList<Node>  nachbarnvonstartnode = startnode.nachbarn; // eine ArrayList mit den Nachbarn
		
			for (int i=0; i< nachbarnvonstartnode.size(); i++) {
				Node nextNode = startnode.nachbarn.get(i);
				Node nextNodeToVisit = startnode.nachbarn.get(1);
				if (!visitedNodesList.contains(nextNode)) {
					traversalList.append(i);
					System.out.println(nextNode + "wurde besucht");
					visitedNodesList.add(nextNode);
					nachbarnvonstartnode.add(nextNode);
					visitBFS(nextNode);
				}
		
		

			}
			
			// neue Runde starten
			
			
		
		
		
	}

}

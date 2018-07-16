package graphen;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Knoten erstellen
		Node fnode = new Node("Frankfurt");
		Node wnode = new Node("Wuerzburg");
		Node enode = new Node("Erfurt");
		Node nnode = new Node("Nürnberg");
		Node snode = new Node("Stuttgart");
		Node kasnode = new Node("Kassel");
		Node münode = new Node("München");
		Node anode = new Node("Augsburg");
		Node karnode = new Node("Karlsruhe");
		Node manode = new Node("Mannheim");

		// die dazugehörigen Kanten(verbindungen) erstellen

		WeightedEdge edge1 = new WeightedEdge(fnode, manode, 85); // richtig
		//ArrayList<ArrayList<Node>> nachbarnvonnachbarn = new ArrayList<ArrayList<Node>>();
		fnode.nachbarn.add(manode);
		fnode.nachbarn.add(kasnode);
		kasnode.nachbarn.add(münode);
		manode.nachbarn.add(fnode);
		WeightedEdge edge2 = new WeightedEdge(manode, karnode, 80); // richtig	
		manode.nachbarn.add(karnode);
		karnode.nachbarn.add(manode);
		// syntax knoten.nachbarn.toString() --> gibt die Nachbarn zurück
		
		WeightedEdge edge3 = new WeightedEdge(karnode, anode, 250); // richitg 
		karnode.nachbarn.add(anode);
		anode.nachbarn.add(karnode);
		WeightedEdge edge4 = new WeightedEdge(anode, münode, 84);
		anode.nachbarn.add(münode);
		münode.nachbarn.add(anode);
		WeightedEdge edge5 = new WeightedEdge(münode, nnode, 167);
		münode.nachbarn.add(nnode);
		nnode.nachbarn.add(münode);
		WeightedEdge edge6 = new WeightedEdge(münode, kasnode, 502);
		münode.nachbarn.add(kasnode);
		kasnode.nachbarn.add(münode);
		WeightedEdge edge7 = new WeightedEdge(kasnode, fnode, 173);
		kasnode.nachbarn.add(fnode);
		fnode.nachbarn.add(kasnode);
		WeightedEdge edge8 = new WeightedEdge(fnode, wnode, 217);
		fnode.nachbarn.add(wnode);
		wnode.nachbarn.add(fnode);
		WeightedEdge edge9 = new WeightedEdge(wnode, enode, 186);
		wnode.nachbarn.add(enode);
		enode.nachbarn.add(wnode);
		WeightedEdge edge10 = new WeightedEdge(wnode, nnode, 103);
		wnode.nachbarn.add(nnode);
		nnode.nachbarn.add(wnode);
		WeightedEdge edge11 = new WeightedEdge(nnode, snode, 183);
		nnode.nachbarn.add(snode);
		snode.nachbarn.add(wnode);
		ArrayList<Node> arraylistnodes = new ArrayList<Node>();
		arraylistnodes.add(fnode);
		arraylistnodes.add(wnode);
		arraylistnodes.add(enode);
		arraylistnodes.add(nnode);
		arraylistnodes.add(snode);
		arraylistnodes.add(kasnode);
		arraylistnodes.add(münode);
		arraylistnodes.add(anode);
		arraylistnodes.add(karnode);
		arraylistnodes.add(manode);

		ArrayList<Edge> arraylistedges = new ArrayList<Edge>();
		arraylistedges.add(edge1);
		arraylistedges.add(edge2);
		arraylistedges.add(edge3);
		arraylistedges.add(edge4);
		arraylistedges.add(edge5);
		arraylistedges.add(edge6);
		arraylistedges.add(edge7);
		arraylistedges.add(edge8);
		arraylistedges.add(edge9);
		arraylistedges.add(edge10);
		arraylistedges.add(edge11);
		Graph Graph1 = new Graph(arraylistnodes, arraylistedges);
		
		
		Node startnode = wnode;
		DFS1 b = new DFS1(startnode);
		BFSLukas b1 = new BFSLukas();
		System.out.println("Der startknoten ist" + startnode);
		
		b1.listBFS(wnode);
		
		
	}
	

}


import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;


public class BFSLukas {

	public List<Node> listBFS(Node wnode) {
		List<Node> result = new LinkedList<>(); // Liste sortiert nach Reihenfolge des Besuchs
		Set<Node> visitedNodes = new HashSet<>(); // Menge der Knoten die besucht wurden (gleicher Inhalt wie result)
		Queue<Node> toDoQ = new LinkedList<>(); // 'to-do'-Schlange der erreichbaren Knoten

		toDoQ.add(wnode); // beginne beim Startknoten

		while (!toDoQ.isEmpty()) { // während erreichbare Knoten verfügbar sind
			Node current = toDoQ.poll(); // nehme den nächsten Knoten, ...
			visitedNodes.add(current); // vermerke ihn als 'besucht', ...
			result.add(current); // füge ihn der Ergebnisliste an, ...

			for (Node neighbour : current.getNeighbors()) // und nimm alle nachbarn, ...
				if (!visitedNodes.contains(neighbour)) // die noch nicht besucht wurden, ..
					toDoQ.add(neighbour); // und hänge sie an die Schlange an
		}

		return result; // fertig :)
	}

	public interface Node {
		List<Node> getNeighbors();
	}

}
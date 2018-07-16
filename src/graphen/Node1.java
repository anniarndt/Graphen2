package graphen;

import java.awt.List;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class Node1 {

    private final String name;
    private final Set<Node1> neighbors; // ein Set erlaubt nicht zweimal dasselbe Element zu enthalten - man kann nicht zweimal denselben Knoten als Nachbar haben

    public Node1(String name) {
        this.name = name;
neighbors = new HashSet<>(); 
    }

    public boolean addNeighbor(Node1 node) {
        Objects.requireNonNull(node); // falls es null ist, wird eine Exception geworfen und wenn nicht, dann passiert nichts
        if (this.equals(node))
            throw new IllegalArgumentException();
        return neighbors.add(node); // gibt zurück, ob das Hinzufügen geklappt hat → dann true , wenn nicht → dann false
    }

    public boolean removeNode(Node1 node) {
        Objects.requireNonNull(node);
        if (this.equals(node))
            return false;
        return neighbors.remove(node);
    }

    public Set<Node1> getNeighbors() {
        return Collections.unmodifiableSet(neighbors); // unmodifiable gibt ein Set zurück, dass man lesen, aber nicht verändern (modify) kann!!
    }

    public String toString() {
        return getClass().getName() + "[name=" + name + "]";
    }

}

public class GraphUtil { // GraphUtil bietet hilfreiche Methoden für einen Graphen an

    public static List<Node1> traverseBreadth(Node start) {
        List<Node1> result = new LinkedList<>(); // die zeigt an, nach der Reihenfolge des Besuches

        Queue<Node> toDoQ = new LinkedList<>(); // to-do-Schlange der zu erreichenden Knoten
        toDoQ.add(start); // tODo-queue hat als ersten Eintrag den Wert, bei dem ich starte

        while (!toDoQ.isEmpty()) { // solange die To-DO-Queue nicht leer ist 
            Node current = toDoQ.poll(); // die Methode poll entfernt ein Element

            if (result.contains(neighbor))
                continue;

            result.add(current);
            for (Node neighbor : current.getNeighbors())
                toDoQ.add(neighbor);
        }

        return result;
    }
}

public class Main {

    public static void main(String[]args) {
        Node1 fnode = new Node1("Frankfurt");
        Node1 wnode = new Node1("Wuerzburg");
        Node1 mnode = new Node1 ("Mannheim");
        Node1 knode = new Node1 ("Karlsruhe");

        fnode.addNeighbor(wnode);
        wnode.addNeighbor(fnode);

        fnode.addNeighbor(mnode);
        mnode.addNeighbor(fnode);

        wnode.addNeighbor(mnode);
        mnode.addNeighbor(wnode);

        knode.addNeighbor(mnode);
        mnode.addNeighbor(knode);
        neighbours.get(knode);
        List<Node> traverseOrder = GraphUtil.traverseBreadth(fnode);
        System.out.println(traverseOrder);
    }
}

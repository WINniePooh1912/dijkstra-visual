/* @sly */

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {	
    private List<List<Edge>> data;
	
    public AdjacencyList(int size) {
        data = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            data.add(new ArrayList<>());
        }
    }
	
    public void addEdge(int source, int dest, double weight, boolean directed) {
        data.get(source).add(new Edge(dest, weight));

        if(!directed) {
            data.get(dest).add(new Edge(source, weight));
        }
    }

    public boolean isEdge(int source, int dest) {
        if(data.get(source).contains(new Edge(dest, 0)) || data.get(dest).contains(new Edge(source, 0))) {
            return true;
        }

        return false;
    }

    public List<Edge> getEdgeList(int source) {
        return data.get(source);
    }
	
    public int size() { 
        return data.size(); 
    }
}

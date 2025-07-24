import java.util.ArrayDeque;
import java.util.Queue;

public class Bellman_Ford extends Graph {
    Path solutionPath; 



    Bellman_Ford(String name) {
        super(name);
        this.solutionPath = new Path(this.NbVertices);
        int chemin[] = new int[this.NbVertices];
        Float distance[] = new Float[this.NbVertices];
        ;
        for (int i = 0; i < chemin.length; i++) {

            chemin[i] = 0;
            distance[i] = Float.MAX_VALUE;
        }
        this.solutionPath.path = chemin;
        this.solutionPath.cost = distance;
    }

    // Il y'a un problème de marquage

    public void resolve() {
        float neighbourValue;
        for(int i = 0; i < this.NbVertices; i++){
            for (int j = 0; j < this.NbVertices; j++) {
                neighbourValue = this.AdjacencyMatrix[i][j];
                if (neighbourValue > 0 || neighbourValue < 0) {
                    if (neighbourValue + this.solutionPath.cost[i] < this.solutionPath.cost[j]) {
                        this.solutionPath.cost[j] =  neighbourValue + this.solutionPath.cost[i];
                        this.solutionPath.path[j] = i;
                    }
                }
            }
        }

    }

    public void isnegativeCycle() {
        float neighbourValue;
        for (int i = 0; i < this.NbVertices; i++) {
            for (int j = 0; j < this.NbVertices; j++) {
               neighbourValue = this.AdjacencyMatrix[i][j];
                if (neighbourValue > 0 || neighbourValue < 0) {
                    if (neighbourValue + this.solutionPath.cost[i] < this.solutionPath.cost[j]) {
                        if(this.path.)
              
                    }
                }
            }
        }
            }
        }
        System.out.println("Le graphe ne contient pas de cycle négatif");
    }

    public void displayPath() {
        System.out.println("Le graph est: ");
        displayGraph();
        System.out.println("La solution est: ");

        for (int i = 0; i < this.NbVertices; i++) {
            System.out.println(this.solutionPath.path[i]);

        }
    }
}
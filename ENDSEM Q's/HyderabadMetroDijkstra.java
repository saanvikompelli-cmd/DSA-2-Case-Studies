import java.util.*;

class Edge {
    int to;
    int weight;

    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class HyderabadMetroDijkstra {

    static int dijkstra(
            List<List<Edge>> graph,
            int source,
            int destination) {

        int n = graph.size();

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                        (a,b) ->
                                Integer.compare(a[0], b[0]));

        dist[source] = 0;
        pq.offer(new int[]{0, source});

        while(!pq.isEmpty()) {

            int[] cur = pq.poll();

            int d = cur[0];
            int u = cur[1];

            if(d > dist[u])
                continue;

            if(u == destination)
                return d;

            for(Edge e : graph.get(u)) {

                int v = e.to;
                int nd = d + e.weight;

                if(nd < dist[v]) {

                    dist[v] = nd;

                    pq.offer(
                            new int[]{nd, v});
                }
            }
        }

        return -1;
    }

    static void addEdge(
            List<List<Edge>> graph,
            int u,
            int v,
            int w) {

        graph.get(u).add(new Edge(v,w));
        graph.get(v).add(new Edge(u,w));
    }

    public static void main(String[] args) {

        int n = 7;

        List<List<Edge>> graph =
                new ArrayList<>();

        for(int i=0;i<n;i++)
            graph.add(new ArrayList<>());

        addEdge(graph,0,1,8);
        addEdge(graph,1,2,6);
        addEdge(graph,2,3,10);
        addEdge(graph,1,4,7);
        addEdge(graph,4,5,9);
        addEdge(graph,5,6,12);
        addEdge(graph,1,5,15);

        int result =
            dijkstra(graph,0,6);

        System.out.println(
            "Shortest Time = "
            + result + " minutes");
    }
}
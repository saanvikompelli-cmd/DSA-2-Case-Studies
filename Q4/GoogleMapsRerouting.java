import java.util.*;

class Edge {
    int to;
    int weight;

    Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }
}

public class GoogleMapsRerouting {

    static final int INF = Integer.MAX_VALUE;

    static int[] dijkstra(int n,
                          List<List<Edge>> adj,
                          int source,
                          int[] parent) {

        int[] dist = new int[n];
        Arrays.fill(dist, INF);

        PriorityQueue<int[]> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                Integer.compare(a[0], b[0]));

        dist[source] = 0;
        pq.offer(new int[]{0, source});

        while (!pq.isEmpty()) {

            int[] top = pq.poll();

            int d = top[0];
            int u = top[1];

            if (d > dist[u])
                continue;

            for (Edge e : adj.get(u)) {

                int v = e.to;
                int w = e.weight;

                if (dist[u] + w < dist[v]) {

                    dist[v] = dist[u] + w;
                    parent[v] = u;

                    pq.offer(new int[]{
                            dist[v], v
                    });
                }
            }
        }

        return dist;
    }

    static void addEdge(
            List<List<Edge>> adj,
            int u,
            int v,
            int w) {

        adj.get(u).add(new Edge(v, w));
        adj.get(v).add(new Edge(u, w));
    }

    static void printPath(
            int destination,
            int[] parent,
            String[] names) {

        List<String> path =
                new ArrayList<>();

        while (destination != -1) {

            path.add(names[destination]);
            destination =
                    parent[destination];
        }

        Collections.reverse(path);

        System.out.println(
                String.join(" -> ", path));
    }

    public static void main(String[] args) {

        String[] names = {
                "IND", "KOR", "MGR",
                "HSR", "BTM", "JPN",
                "SRJ", "EC"
        };

        int n = 8;

        List<List<Edge>> adj =
                new ArrayList<>();

        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());

        addEdge(adj,0,1,8);
        addEdge(adj,0,5,14);
        addEdge(adj,1,2,6);
        addEdge(adj,1,3,5);
        addEdge(adj,2,4,9);
        addEdge(adj,2,3,7);
        addEdge(adj,3,4,4);
        addEdge(adj,3,6,6);
        addEdge(adj,5,6,8);
        addEdge(adj,6,7,15);
        addEdge(adj,4,7,12);

        int[] parent =
                new int[n];

        Arrays.fill(parent,-1);

        int[] dist =
                dijkstra(n, adj, 1, parent);

        System.out.println(
                "Shortest Distance = "
                        + dist[7]);

        System.out.print(
                "Path: ");

        printPath(7,parent,names);
    }
}
package com.graph;

import java.util.*;

public class Graph {
    public static void createGraph(ArrayList<Edge>[]graph){
        //Sabse pahle har ek index pe arraylist dalna hoga pahle se null hoga
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        //0 Se Jane Wala Graph

        //0 Se Jane Wala Graph
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,4,1));
        //2 Se Jane Wala Graph

        graph[2].add(new Edge(2,3,1));
        graph[2].add(new Edge(2,6,1));

        //3 Se Jane Wala
        graph[3].add(new Edge(3,5,1));
        graph[3].add(new Edge(3,6,1));

        //4 se Jane Wala
        graph[4].add(new Edge(4,5,1));
        graph[5].add(new Edge(5,6,1));


    }

    //Print Neighbour
    public static void printNeighbour(ArrayList<Edge>[]graph){
        for(int i=0;i<graph[2].size();i++){
            Edge e=graph[2].get(i);
            System.out.println(e.des);
        }
    }

    //BFS Traversal on Graph

    public static void bfs(ArrayList<Edge>[]graph){
     Queue<Integer>q=new LinkedList<>();
     boolean visit[]=new boolean[graph.length];
     q.add(0);
     while(!q.isEmpty()){
         int curr=q.remove();
         if(!visit[curr]){
             System.out.print(curr+" ");
             visit[curr]=true;
             for(int i=0;i< graph[curr].size();i++){
                 Edge e=graph[curr].get(i);
                 q.add(e.des);
             }
         }
     }
    }

    //DFS Traversal on graph

    public static void dfs(ArrayList<Edge>[]graph,int curr,boolean visit[]){
        System.out.print(curr+" ");
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.des]){
                dfs(graph,e.des,visit);
            }
        }
    }

    //Check Source To destination Path Hai ya nhi

    public static boolean hashPath(ArrayList<Edge>[]graph,int src,int des,boolean visit[]){
        if(src==des){
            return true;
        }
        visit[src]=true;
        for(int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            if(!visit[e.des] && hashPath(graph,e.des,des,visit))return true;
        }

        return false;
    }

    //Connected Component Print Using BFS

    public static void bfs1(ArrayList<Edge>[]graph){
        boolean visit[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]) {
                bfsUtil(graph, visit);
            }
        }
    }

    public static void bfsUtil(ArrayList<Edge>[]graph,boolean visit[]){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visit[curr]){
                System.out.print(curr+" ");
                visit[curr]=true;
                for(int i=0;i< graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }

    //Connected Component Print Using DFS
    public static void dfs1(ArrayList<Edge>[]graph){
        boolean visit[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                dfsUtil(graph,i,visit);
            }
        }
    }
    public static void dfsUtil(ArrayList<Edge>[]graph,int curr,boolean visit[]){
        System.out.print(curr+" ");
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.des]){
                dfs(graph,e.des,visit);
            }
        }
    }

    //Detect Cycle in Graph Using DFS
    public static boolean detectCycle(ArrayList<Edge>[]graph){
        boolean visit[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                if(detectCycleUtil(graph,visit,i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visit, int curr, int par) {
        visit[curr]=true;
        for(int i=0;i<graph.length;i++){
            Edge e=graph[curr].get(i);
            //case 1 agar hamara neighbour visit nhi hai
            if(!visit[e.des]){
                if(detectCycleUtil(graph,visit,e.des,par)){
                    return true;
                }
            }

            //case 2 hamara neighbour visit hai or parent nhi hai
            else if(visit[e.des] && e.des!=par){
                return true;
            }

            //case 3 agr neighbour visit hai or parent bhi hai
            //Do Nothing
        }
        return false;
    }

    //Bipartite Graph or Not

    public static boolean isBipartite(ArrayList<Edge>[]graph){
        int col[]=new int [graph.length];
        for(int i=0;i<col.length;i++){
            col[i]=-1;
            //-1 No color
            //0 Yellow color
            //1 Blue color
        }

        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(col[i]==-1){
                q.add(i);
                col[i]=0;
            }
            while(!q.isEmpty()){
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++){
                    Edge e=graph[curr].get(j);
                    if(col[e.des]==-1){
                        int nxtcolor=col[curr]==0 ? 1 : 0;
                        col[e.des]=nxtcolor;
                        q.add(e.des);
                    }
                    else if(col[e.des]==col[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //Cycle Detection in Directed Graph Using DFS
    public static  boolean cycleinDirectedGraph(ArrayList<Edge>[]graph){
        boolean visit[]= new boolean[graph.length];
        boolean stack[]= new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                if( cycleinDirectedGraphUtil(graph,visit,stack,i)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean cycleinDirectedGraphUtil(ArrayList<Edge>[] graph, boolean[] visit, boolean[] stack, int curr) {
        visit[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.des]==true)return true;
            if(!visit[e.des] && cycleinDirectedGraphUtil(graph,visit,stack,e.des)){
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    //Topological Sort Using DFS
    public static void topologicalSort(ArrayList<Edge>[]graph){
        boolean visit[]=new boolean[graph.length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!visit[i]){
                topologicalSortUtil(graph,visit,st,i);
            }
        }
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    private static void topologicalSortUtil(ArrayList<Edge>[] graph, boolean[] visit, Stack<Integer> st, int curr) {
        visit[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!visit[e.des]){
                topologicalSortUtil(graph,visit,st,e.des);
            }
        }
        st.push(curr);
    }

    //Print All Path From Source To Target (Directed Graph)
    public static void printAllPath(ArrayList<Edge>[]graph,int src,int tar,String path){
        if(src==tar){
            System.out.println(path+tar);
            return;
        }

        for (int i=0;i<graph[src].size();i++){
            Edge e=graph[src].get(i);
            printAllPath(graph,e.des,tar,path+src);
        }
    }

    //Dijikstra Algorithm
    static class Pair implements Comparable<Pair>{
        int n;
        int path;
        public Pair(int n,int path){
            this.n=n;
            this.path=path;
        }

        @Override
        public int compareTo(Pair p2){
            return this.path-p2.path;
        }
    }

    public static void dijikstra(ArrayList<Edge>[]graph, int src){
        int dist[]=new int[graph.length];
        for(int i=0;i< graph.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        boolean visit[]=new boolean[graph.length];
        PriorityQueue<Pair>pq=new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            if(!visit[curr.n]){
                visit[curr.n]=true;
                for(int i=0;i<graph[curr.n].size();i++){
                    Edge e=graph[curr.n].get(i);
                    int u=e.src;
                    int v=e.des;
                    int wt=e.wt;

                    if(dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                        pq.add(new Pair(v,dist[v]));
                    }
                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }

    // Prims Algorithm
    static class Pair1 implements Comparable<Pair1>{
        int v;
        int cost;

        public Pair1(int v,int cost){
            this.v=v;
            this.cost=cost;
        }
        @Override
        public int compareTo(Pair1 p2){
            return this.cost-p2.cost;
        }
    }

    public static void primsAlgorith(ArrayList<Edge>[]graph){
        boolean vis[]=new boolean[graph.length];
        PriorityQueue<Pair1>pq=new PriorityQueue<>();
        pq.add(new Pair1(0,0));
        int finalcost=0;
        while(!pq.isEmpty()){
            Pair1 curr=pq.remove();
            if(!vis[curr.v]){
                vis[curr.v]=true;
                finalcost+=curr.cost;

                for(int i=0;i<graph[curr.v].size();i++){
                    Edge e=graph[curr.v].get(i);
                    pq.add(new Pair1(e.des,e.wt));
                }
            }
        }
        System.out.println(finalcost);
    }

    //Bellmanford Algorithm
    public static void bellmanFord(ArrayList<Edge>[]graph,int src){
        int dist[]=new int[graph.length];
        for(int i=0;i<dist.length;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        int V=graph.length;
        for(int i=0;i<V-1;i++){
            for(int j=0;j<graph.length;j++){
                for(int k=0;k<graph[j].size();k++){
                    Edge e=graph[j].get(k);
                    int u=e.src;
                    int v=e.des;
                    int wt=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]){
                        dist[v]=dist[u]+wt;
                    }

                }
            }
        }

        for(int i=0;i<dist.length;i++){
            System.out.print(dist[i]+" ");
        }
    }

    //Cheapest Flights within K Stops
    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }


    public static int  chepeastFlights(int n,ArrayList<Edge>[]graph,int src,int des,int k){
        int dist[]=new int[n];
        for(int i=0;i<n;i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;
            }
        }
        Queue<Info>q=new LinkedList<>();
        q.add(new Info(src,0,0));
        while(!q.isEmpty()){
            Info curr=q.remove();
            if(curr.stops>k){
                break;
            }
            for(int i=0;i<graph[curr.v].size();i++){
                Edge e=graph[curr.v].get(i);
                int u=e.src;
                int v=e.des;
                int wt=e.wt;
                if(curr.cost+wt < dist[v] && curr.stops<=k){
                    dist[v]=curr.cost+wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }
        return 0;//kuchh bhi
    }




    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        //bfs(graph);
        //System.out.println();
       // dfs(graph,0,new boolean[V]);
        //System.out.println( hashPath(graph,1,5,new boolean[V]));
       // System.out.println(detectCycle(graph));
        //System.out.println(isBipartite(graph));
       // System.out.println(cycleinDirectedGraph(graph));
       // topologicalSort(graph);
        //printAllPath(graph,1,6,"");
        //dijikstra(graph,0);
      //  primsAlgorith(graph);
      //  bellmanFord(graph,0);
        int a=(int)1e9;
        System.out.println(a);
        System.out.println(Integer.MAX_VALUE);
    }
}

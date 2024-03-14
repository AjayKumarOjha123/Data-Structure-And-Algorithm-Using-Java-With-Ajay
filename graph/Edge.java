package com.graph;

 class Edge {
    int src;
    int des;
    int wt;

    Edge(int src,int des,int wt){
        this.src=src;
        this.des=des;
        this.wt=wt;
    }

     @Override
     public String toString() {
         return "Edge{" +
                 "src=" + src +
                 ", des=" + des +
                 ", wt=" + wt +
                 '}';
     }
 }

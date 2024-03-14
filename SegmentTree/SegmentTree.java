package com.SegmentTree;

public class SegmentTree {
    static int tree[];

    public static void init(int n){
        tree=new int[4*n];
    }

    //Construct Segment Tree

    public static int constructSegmentTree(int arr[],int i,int start,int end){
        if(start==end){
            tree[i]=arr[start];
            return arr[start];
        }
        int mid=(start+end)/2;
        constructSegmentTree(arr,2*i+1,start,mid);
        constructSegmentTree(arr,2*i+2,mid+1,end);
        tree[i]=tree[2*i+1]+tree[2*i+2];
        return tree[i];
    }

    //Get Sum Within Range
    public static int  getSum(int arr[],int qi,int qj){
        int n=arr.length;
        return getSumUtil(0,qi,qj,0,n-1);
    }

    private static int getSumUtil(int i, int qi, int qj, int si, int sj) {
        //case 1 No Overlap
        if(qj<=si || qi>=sj){
            return 0;
        }
        //complete overlap
        else if(si>=qi && sj<=qj){
            return tree[i];
        }
        //partially overlap
        else{
            int mid=(si+sj)/2;
            int left=getSumUtil(2*i+1,qi,qj,si,mid);
            int right=getSumUtil(2*i+2,qi,qj,mid+1,sj);
            return left+right;
        }
    }

    //Update On Segment Tree
    public static void update(int arr[],int idx,int newVal){
        int n=arr.length;
        int diff=newVal-arr[idx];
        arr[idx]=newVal;
        updateUtil(0,0,n-1,idx,diff);
    }

    private static void updateUtil(int i, int si, int sj, int idx, int diff) {
        if(idx<si || idx>sj){
            return;
        }
        tree[i]+=diff;
        if(si!=sj){
            int mid=(si+sj)/2;
            updateUtil(2*i+1,si,mid,idx,diff);
            updateUtil(2*i+2,mid+1,sj,idx,diff);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        init(arr.length);
        constructSegmentTree(arr,0,0,arr.length-1);
//        for(int i=0;i<tree.length;i++){
//            System.out.print(tree[i]+" ");
//        }
        System.out.println( getSum(arr,2,5));
        update(arr,2,2);
        System.out.println(getSum(arr,2,5));
    }
}

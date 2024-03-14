package com.BinarySearch.BinarySearch_On_Answer;

public class Book_Allocation_Problem {
    public static int book_Allocation_Problem(int book[],int student){
        int n=book.length;
        if(n<student){
            return -1;
        }
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<book.length;i++){
            sum+=book[i];
            max=Math.max(max,book[i]);
        }
        for(int i=max;i<=sum;i++){
            if(allocateBook(book,i)==student){
                return i;
            }
        }
        return max;
    }

    public static int allocateBook(int[] book, int max) {
        int page=0; int student=1;
        for(int i=0;i<book.length;i++){
            if(page+book[i]<=max){
                page+=book[i];
            }
            else{
                student++;
                page=book[i];
            }
        }
        return student;
    }
    public static void main(String[] args) {
      int arr[]={15, 10 ,19 ,10 ,5 ,18, 7};
      int s=5;
      System.out.println(book_Allocation_Problem(arr,s));
    }
}

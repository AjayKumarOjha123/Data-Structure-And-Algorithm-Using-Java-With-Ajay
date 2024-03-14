package com.Heaps.easy;

import java.util.PriorityQueue;

public class Priority_For_Objects {
    static class Student implements Comparable<Student>{
        String name;
        int roll;

        Student(String name ,int roll){
            this.name=name;
            this.roll=roll;
        }
       @Override
        public int compareTo(Student s2){
            return this.name.compareTo(s2.name);
       }
    }
    public static void main(String[] args) {
        PriorityQueue<Student>pq=new PriorityQueue<>();
        pq.add(new Student("Ajby",10));
        pq.add(new Student("Ajan",8));
        pq.add(new Student("Ajci",34));

        while(!pq.isEmpty()){
            System.out.println("Name : "+pq.peek().name +" Roll : "+pq.peek().roll);
            pq.remove();
        }
    }
}

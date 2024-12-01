package nov.ex_04112024_CF_Set_PQ_Map;

import java.util.PriorityQueue;

public class Lab211_Queue {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer("1");
        pq.add("2");
        pq.add("3");
        pq.offer("4");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
        System.out.println(pq);
    }
}

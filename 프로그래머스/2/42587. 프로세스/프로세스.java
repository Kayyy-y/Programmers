import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> priQueue = new LinkedList<>();
        Queue<Integer> orderQueue = new LinkedList<>();
        List<Integer> order = new ArrayList<>();
        
        for (int i = 0; i < priorities.length; i++) {
            priQueue.add(priorities[i]);
            orderQueue.add(i);
        }

        while (priQueue.peek() != null) {
            int value = priQueue.poll();
            int orderValue = orderQueue.poll();

            if (priQueue.stream().filter(number -> number > value).count() == 0) {
                order.add(orderValue);
            } else {
                priQueue.add(value);
                orderQueue.add(orderValue);
            }
        }

        return order.indexOf(location) + 1;
    }
}
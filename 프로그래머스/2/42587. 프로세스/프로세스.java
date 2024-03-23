import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {

      // 큐 사용!
        Queue<Integer> priQueue = new LinkedList<>();
        Queue<Integer> orderQueue = new LinkedList<>();
        List<Integer> order = new ArrayList<>();

      // order를 저장할 큐도 같이 생성
        for (int i = 0; i < priorities.length; i++) {
            priQueue.add(priorities[i]);
            orderQueue.add(i);
        }

      // priQueue의 모든 값이 사라질 때까지 orderQueue를 생성
      // 1번 규칙
        while (priQueue.peek() != null) {
            int value = priQueue.poll();
            int orderValue = orderQueue.poll();
      // 2번 규칙
            if (priQueue.stream().filter(number -> number > value).count() == 0) {
                order.add(orderValue);
      // 3번 규칙
            } else {
                priQueue.add(value);
                orderQueue.add(orderValue);
            }
        }
      // 순서는 +1 필요
        return order.indexOf(location) + 1;
    }
}

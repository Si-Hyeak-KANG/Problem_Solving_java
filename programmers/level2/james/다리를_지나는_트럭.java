package level2.james;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를_지나는_트럭 {

    public static void main(String[] args) {

        다리를_지나는_트럭 test = new 다리를_지나는_트럭();
        int result = test.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println(result);

        int result2 = test.solution(100, 100, new int[]{10});
        System.out.println(result2);

        int result3 = test.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        System.out.println(result3);

        int result4 = test.solution(5, 5, new int[]{2,2,2,2,1,1,1,1,1});
        System.out.println(result4);
    }

    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int count = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int index = 0;

        while (index < getLength(truck_weights)) {
            int currTruck = truck_weights[index];
            int currWeightInBridge = bridge.stream().mapToInt(m -> m).sum();
            int expectWeight = currWeightInBridge + currTruck;

            if (bridge.size() < bridge_length) {
                if (expectWeight <= weight) {
                    bridge.add(currTruck);
                    count++;
                    index++;
                } else {
                    bridge.poll();
                    count += bridge_length - 1;
                }
            } else {
                bridge.poll();
            }
        }
        count += bridge_length;
        return count;
    }

    private int getLength(int[] truck_weights) {
        return truck_weights.length;
    }
}

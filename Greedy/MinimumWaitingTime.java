import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinimumWaitingTime {
    int minimizeWaitingTime(List<Integer> serviceTimes) {
        Collections.sort(serviceTimes);

        int minWaitingTime = 0, temp = 0;
        for(int i=1;i<serviceTimes.size();++i) {
            temp += serviceTimes.get(i-1);
            minWaitingTime += temp;
        }
        return minWaitingTime;
    }

    public static void main(String[] args) {
        MinimumWaitingTime obj = new MinimumWaitingTime();

        ArrayList<Integer> tasks = new ArrayList<>(Arrays.asList(2,5,2,3));
        System.out.println(obj.minimizeWaitingTime(tasks));
    }
}

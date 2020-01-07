import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Greedy 18.1
 */
public class Greedy_18_1 {
    List<Integer> optimum_assignment(List<Integer> tasks, int N) {
        Collections.sort(tasks);
        List<Integer> assignment = new ArrayList<>();

        int optimum_time = 0;
        for(int i=0;i<N/2;++i) {
            assignment.add(tasks.get(i));
            assignment.add(tasks.get(N-i-1));
        }
        return assignment;
    }

    public static void main(String[] args) {
        Greedy_18_1 obj = new Greedy_18_1();

        ArrayList<Integer> tasks = new ArrayList<>(Arrays.asList(5, 2, 1, 6 ,4, 4));
        int N = 6;
        System.out.println(obj.optimum_assignment(tasks, N));
    }
}

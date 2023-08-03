import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> li = new ArrayList<Integer>();


        int maxAt = 0;

        // game loop
        while (true) {

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain.
                li.add(mountainH);
                System.err.println(li);
            }
            //List<Integer> sortedList = li.stream().sorted().collect(Collectors.toList());
            //System.err.println(sortedList);

            //sortedList = li.stream().sorted().collect(Collectors.toList());
            //System.out.println(5);

            for (int i = 0; i < li.size(); i++) {
                maxAt = li.get(i) > li.get(maxAt) ? i : maxAt;
            }

            System.out.println(maxAt);

            li.clear();

        }
    }
}
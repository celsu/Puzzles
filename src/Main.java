import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        ArrayList<Integer> li = new ArrayList<Integer>();
        li.add(2);
        li.add(3);
        li.add(7);
        li.add(5);
        li.add(1);
        li.add(0);
        li.add(8);
        li.add(4);

        int maxAt = 0;

        //game loop

            for (int i = 0; i < 8; i++) {
                //int mountainH = in.nextInt(); // represents the height of one mountain.
                //li.add(mountainH);
                //System.err.println(li);
            }
            //PEGA O INDEX DO MAIOR VALOR *PEGA O INDEX, NAO O VALOR*
            for (int i = 0; i < li.size(); i++) {
                //VERIFICA
                maxAt = li.get(i) > li.get(maxAt) ? i : maxAt;

                //System.out.println("maxt: "+maxAt);
                //System.out.println("i: "+i);
            }
            System.out.println(maxAt);
            li.clear();

            //HELP STREAM!!!
            //List<Integer> sortedList = li.stream().sorted().collect(Collectors.toList());

    }
}




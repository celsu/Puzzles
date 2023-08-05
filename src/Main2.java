import java.util.ArrayList;

public class Main2 {
    public static void main(String args[]) {

        String s = "Batteryi";

        StringBuilder type_hold = new StringBuilder(s);
        long vowel_num = type_hold.toString().toLowerCase().chars()
                .filter(it -> "aeiou".indexOf(it) != -1).count();

        System.out.println(vowel_num);
    }
}
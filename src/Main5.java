import java.util.*;

public class Main5 {

    public static void main(String[] args) {

        /*REVERTER PALAVRAS STRING

        String s = "the sky is blue";
        String[] sa;
        List<String> re;

        sa = s.split(" ");
        re = Arrays.asList(sa);
        Collections.reverse(re);
        re.forEach(System.out::println);*/

        String ro = "LVIII";
        char[] n = new char[0];

        for(int i=0;i<ro.length();i++){
            n[i] = ro.charAt(i);
            System.out.println(n[i]);

        }
    }
}

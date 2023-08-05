import java.util.ArrayList;

public class Main2 {
    public static void main(String args[]) {

        //https://docs.oracle.com/javase/8/docs/api/?java/lang/StringBuilder.html

        String s = "Battery";

        StringBuilder sb = new StringBuilder(s);
        int soma = 0;


        for (int i = 0; i < sb.length(); i++) {
            //System.out.println(sb.charAt(i));
            if(sb.charAt(i) == 'a') soma = soma + 1;
            if(sb.charAt(i) == 'e') soma = soma + 2;
            if(sb.charAt(i) == 'i') soma = soma + 3;
            if(sb.charAt(i) == 'o') soma = soma + 4;
            if(sb.charAt(i) == 'u') soma = soma + 5;
        }

        System.out.println("A soma e: "+soma);





        //Metodo Chars retorna Int
        //long vowel_num = type_hold.toString().toLowerCase().chars().filter(it -> "aeiou".indexOf(it) != -1).count();
    }
}
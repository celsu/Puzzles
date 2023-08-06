import java.util.ArrayList;

public class Main2 {
    public static void main(String args[]) {
        //https://docs.oracle.com/javase/8/docs/api/?java/lang/StringBuilder.html

        String s = "Bea";

        StringBuilder sb = new StringBuilder(s);
        int totalWeight = 0;
        String vowels = "AEIOU";

        //FOR SIMPLES
       /* for (int i = 0; i < sb.length(); i++) {
            //System.out.println(sb.charAt(i));
            if(sb.charAt(i) == 'a') totalWeight += 1;
            if(sb.charAt(i) == 'e') totalWeight += 2;
            if(sb.charAt(i) == 'i') totalWeight += 3;
            if(sb.charAt(i) == 'o') totalWeight += 4;
            if(sb.charAt(i) == 'u') totalWeight += 5;
        }*/

        //Usando swtich case
        for (char c : s.toUpperCase().toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                switch (c) {
                    case 'A':
                        totalWeight += 2;
                        break;
                    case 'E':
                        totalWeight += 1;
                        break;
                    case 'I':
                        totalWeight += 4;
                        break;
                    case 'O':
                        totalWeight += 3;
                        break;
                    case 'U':
                        totalWeight += 5;
                        break;
                }
            }
        }
        //valueof "converte" o char no string para ser comparado
               /* for (char c : input.toUpperCase().toCharArray()) {
                    if (vowels.contains(String.valueOf(c))) {
                        totalWeight += vowels.indexOf(c) + 1;
                    }
                }*/

        System.out.println("A soma e: "+totalWeight);

        //Metodo Chars retorna Int
        /*long vowel_num = type_hold.toString().toLowerCase().chars()
         .filter(it -> "aeiou".indexOf(it) != -1).count();*/
    }
}
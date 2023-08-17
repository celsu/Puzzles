import java.util.ArrayList;
import java.util.List;

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

        //SWITCH CASE
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
        //valueof "CONVERTE" O CHAR NO STRING PARA SER COMPARADO
               /* for (char c : input.toUpperCase().toCharArray()) {
                    if (vowels.contains(String.valueOf(c))) {
                        totalWeight += vowels.indexOf(c) + 1;
                    }
                }*/

        System.out.println("A soma e: "+totalWeight);

        //METODO CHARS RETORNA INT
        /*long vowel_num = type_hold.toString().toLowerCase().chars()
         .filter(it -> "aeiou".indexOf(it) != -1).count();*/


        //PEGAR NUMEROS PAR E SOMA-LOS NO RANGE DADO EM N
            /*int N = 10;
            int sum = 0;
            for (int i = 2; i <= N; i += 2) {
                sum += i;
            }
            System.out.println(sum);*/


        //String[] celso = new String[5];
        ArrayList ce = new ArrayList<>();
        for(int i=0;i<ce.size();i++){
            ce.add("lala");
        }



    //VERIFICAR NUMERO IMPAR
        ArrayList <Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        for(int i=0; i<l1.size(); i++){
            if(l1.get(i)%2==0){
                l1.remove(l1.get(i));
            }
        }

        l1.stream().filter(h -> h%2!=0).forEach(System.out::println);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        for(int i=0; i<l1.size(); i++){
            if(l1.get(i)%2==0){
                l1.remove(l1.get(i));
            }
        }

        l1.stream().filter(h -> h%2!=0).forEach(System.out::println);



    }
}
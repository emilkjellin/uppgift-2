import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array2 = new String[5];
        array2[0] = "leksak1";
        array2[1] = "leksak2";
        array2[2] = "leksak3";
        array2[3] = "leksak4";
        array2[4] = "leksak5";


        String[] array = new String[5];
        array[0] = "Empan";
        array[1] = "Wilmer Odling";
        array[2] = "Lampan";
        array[3] = "Limpan";
        array[4] = "Seldis";


        Integer[] array1 = new Integer[5];
        array1[0] = 2;
        array1[1] = 4;
        array1[2] = 6;
        array1[3] = 8;
        array1[4] = 10;
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i] + " ger "+ array2[i] +" betyget " + array1[i]);
        }
        ArrayList<String> cities = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

       while (true) {
           try {
               System.out.println("Tell me a city");
               cities.add(scan.nextLine());

               if (Objects.equals(cities.getLast(), "exit")) {
                   break;
               }

               System.out.println();
               for (String city : cities) {
                   System.out.println(city);
               }
               System.out.println();

           } catch (Exception e) {
               System.out.println("Try again");
               System.out.println();
           }
       }
    }
}
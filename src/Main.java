import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        //Integer arr[] = new Integer[50];

        Set<Integer> set = new HashSet<>();

        while (set.size() <= 49) {
            set.add(random.nextInt(1000));
        }

        System.out.println(set.size());

        /*Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        */
        // wyswietlanie max i min
        Integer max = Collections.max(set);
        System.out.println("The highest number is: " + max);
        Integer min = Collections.min(set);
        System.out.println("The smallest number is: "+ min);

        //wyswietlanie sredniej

        double sum = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            sum += iterator.next();
        }
        System.out.println("Values bigger than average: ");
        double average = sum/set.size();
        for (int y :set){
            if(y > average){
                System.out.print(y + " ");
            }
        }
        System.out.println();
        System.out.printf("Average %.2f", average);

        //drukowanie wartości większych od średniej
        System.out.println();
        //System.out.println("Values bigger than average: ");
       /* double sum1 = 0;
        Iterator<Integer> iterator1 = set.iterator();
        while (iterator1.hasNext()){
            sum1 += iterator1.next();
        }
        double average1 = sum1/set.size();
        for (int y :set){
            if(y > average1){
                System.out.print(y + " ");
            }
        }
        */

    }
}

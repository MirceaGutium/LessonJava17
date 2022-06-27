package Arrays3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Arrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String [] intStrings = line.split(" ");

        List <Integer> ints = new ArrayList<>();
        for (String intString : intStrings){
            ints.add(Integer.valueOf(intString));

        }
int n = scanner.nextInt();
int smallestDifference = Integer.MAX_VALUE;
List<Integer> result = new ArrayList<>();
        for (Integer anInt : ints) {
                int diff = Math.abs(n - anInt);
            if (diff < smallestDifference){
                smallestDifference = diff;
                result.clear();
                result.add(anInt);

            }else if (diff == smallestDifference){
                result.add(anInt);

            }

        }
        System.out.println (result);

    }
}

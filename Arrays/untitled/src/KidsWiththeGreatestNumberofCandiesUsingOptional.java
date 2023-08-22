import java.util.*;

public class KidsWiththeGreatestNumberofCandiesUsingOptional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of digits to be filled in the array");
        int n = sc.nextInt();
        Integer[] array = new Integer[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Input array is " + Arrays.toString(array));
        System.out.println("Enter the number of extra candies");
        int extraCandies = sc.nextInt();
        System.out.println((greatestNumberOfCandies(array, extraCandies)));
    }

    public static List<Boolean> greatestNumberOfCandies(Integer[] array, int extraCandies) {
        int max = Integer.MIN_VALUE;
        List<Integer> answer = Arrays.asList(array);
        List<Boolean> result = new ArrayList<Boolean>(array.length);
        Optional<Integer> maxNumber =  answer.stream().max((i,j)->i.compareTo(j));
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i : array) {
            if ((i + extraCandies) >= max) {
                result.add(true);
            }
            else
                result.add(false);
        }
        return result;
    }

}

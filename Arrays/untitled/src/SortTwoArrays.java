import java.util.Arrays;

public class SortTwoArrays {
    public static void main(String[] args){
        int[] a = {0,2,5,8};
        int[] b = {1,6,7};
        int temp = 0;
        for(int i =0; i<a.length; i++){
            if(a[i] > b[i]){
                temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}

import java.util.Arrays;

public class SortArrays {
    public static void main(String[] args){
        int[] a = {3,5,6,8,1};
        int j = -1, temp = 0;
        for(int i =0; i<a.length;i++){
            if(a[i]%2 == 0){
                j++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

public class FirstArrayLR {
    public static void main(String[] args) {  	 	int[] inpArr= {3,5,6,8,1,2};  	 	int j = -1,temp;
        for (int i = 0; i < inpArr.length; i++) {             if (inpArr[i] % 2 == 0) {
            j++;
            temp = inpArr[i];                 inpArr[i] = inpArr[j];                 inpArr[j] = temp;
        }
        }
        for(int a:inpArr) {
            System.out.print(a+" ");
        }
    }
}

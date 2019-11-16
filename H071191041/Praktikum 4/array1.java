import java.util.Scanner;
class array1{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int sum1 = 0;
        int sum2 = 0;
        int m = in.nextInt();
        int[] array1 = new int [m];

        //input deret1
        for (int i = 0; i < m; i++){
            array1[i] = in.nextInt();
            sum1+= array1[i];
        }

        //input deret2
        int n = in.nextInt();
        int[] array2 = new int [n];
        for (int i = 0; i < n; i++){
            array2[i] = in.nextInt();
            sum2+= array2[i];
        }

        int same = 0;
        //output
        for ( int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if ( array1[i] == array2[j]){
                    same+= array1[i];
                }
            }
        }
        
        int total = sum1 + sum2 - same;
        System.out.println(total);
    }
}
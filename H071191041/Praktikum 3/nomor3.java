import java.util.Scanner;
class nomor3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 0;a <= n;i++){
            System.out.print(a+" ");
            i = a+b;
            a = b;
            b = i;
        }
    }
}
import java.util.Scanner;
class method3{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = Integer.MAX_VALUE;
        int n = in.nextInt();
        in.close();
        myDay(n);
    }
    static void myDay(int n){
        int tahun = n / 365;
        System.out.println(tahun + "tahun");
        n = n % 365;
        int bulan = n / 30;
        System.out.println(bulan + "bulan");
        n = n % 30;
        int hari = n / 1;
        System.out.println(hari + "hari");
    }
}
import java.util.Scanner;
class nomor4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int harga = in.nextInt();
        int uang = in.nextInt();
        int kembalian = in.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int f = 0;
        int g = 0;

        while (kembalian > 0){
            if (kembalian >= 100000){
                kembalian -= 100000;
                a++;
            }else if (kembalian >= 50000){
                kembalian -= 50000;
                b++;
            }else if (kembalian >= 20000){
                kembalian -= 20000;
                c++;
            }else if (kembalian >= 10000){
                kembalian -= 10000;
                d++;
            }else if (kembalian >= 5000){
                kembalian -= 5000;
                e++;
            }else if (kembalian >= 2000){
                kembalian -= 2000;
                f++;
            }else if (kembalian >= 1000){
                kembalian -= 1000;
                g++;
            }
        }System.out.println(a + "uang Rp. 100.000");
         System.out.println(b + "uang Rp. 50.000");
         System.out.println(c + "uang Rp. 20.000");
         System.out.println(d + "uang Rp. 10.000");
         System.out.println(e + "uang Rp. 5.000");
         System.out.println(f + "uang Rp. 2.000");
         System.out.println(g + "uang Rp. 1.000");
    }
}
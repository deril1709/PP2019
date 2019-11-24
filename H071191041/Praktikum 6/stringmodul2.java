import java.util.Scanner;

class stringmodul2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata = in.nextLine();

        char[] a = kata.toCharArray();

        String hasil = "";
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                hasil += a[i];
            } else {
                hasil += Character.codePointAt(a, i);
            }
        }

        int panjang = hasil.length();
        double jumlah = Math.ceil(panjang / 16.0);
        int b = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < jumlah; j++) {
                if (b < panjang) {
                    System.out.print(hasil.charAt(b++));
                } else {
                    System.out.print("?");
                }
            }
            if (i % 4 == 3) {
                System.out.println();
            } else {
                System.out.print(' ');
            }
        }
    }
}
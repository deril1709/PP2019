import java.util.Scanner;
import java.util.Random;

class method2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    public static String generateSerial(int n, int m) {
        String str = "";
        Random random = new Random();
        int acak;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                acak = random.nextInt(10);
                str += String.valueOf(acak);
            }
            str += 1 == n-1 ? "\n" : "-";
        }
        return str;
    }
}
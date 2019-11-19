import java.util.InputMismatchException;
import java.util.Scanner;
class method1 {
    public static int cariFPB(int x, int y) {
        return (y == 0) ? x : cariFPB(y, x % y);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            int x,y,hasil;
            x = in.nextInt();
            y = in.nextInt();

            hasil = cariFPB(x, y);

            System.out.println("\nFPB dari "+Integer.toString(x) +" dan "+Integer.toString(y)+" = "+Integer.toString(hasil));
        } catch (InputMismatchException e) {
            System.out.println("Error!");
        }finally {
            in.close();
        }
    }
}
import java.util.Scanner;
class praktikum1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        String hasil = "";
        if( x < 0 && y > 0){
            if (x + y < 0){
                hasil = "Q1";
            }
            else if (x + y > 0) {
                hasil = "Q2";
            }else{
                hasil = "garis Q1 dan Q2";
            }
        }
        if (x > 0 && y > 0){
            if (x < y) {
                hasil = "Q3";
            }else if (x > y){
                hasil = "Q4";
            }else{
                hasil = "garis Q3 dan Q4";
            }
        }if (x > 0 && y < 0){
            if (x + y > 0) {
                hasil = "Q5";
            }else if (x + y < 0){
                hasil = "Q6";
            }else{
                hasil = "garis Q5 dan Q6";
            }
        }if (x < 0 && y < 0){
            if (x - y > 0) {
                hasil = "Q7";
            }else if (x - y < 0){
                hasil = "Q8";
            }else{
                hasil = "garis Q7 dan Q8";
            }
        

        }if (x == 0 && y > 0) {
            hasil = "garis Q2 dan Q3";
        }else if (x == 0 && y > 0){
            hasil = "garis Q4 dan Q5";
        }else if (x == 0 && y < 0){
            hasil = "garis Q6 dan Q7";
        }else if (y == 0 && x < 0){
            hasil = "garis Q8 dan Q1";
        }else if (y == 0 && x == 0){
            hasil = "titik pusat";
        }
        System.out.println("Titik("+x+"," +y+")berada pada " + hasil);
    } 





}    
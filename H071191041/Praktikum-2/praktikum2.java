import java.util.Scanner;
class praktikum2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam1 = input.nextInt()*60;
        int menit1 = input.nextInt();
        int jam2 = input.nextInt()*60;
        int menit2 = input.nextInt();
        int jam;
        int menit;
        if(jam1 + menit1 > jam2 + menit2){
            jam = ((jam2 + menit2) + (24*60) - (jam1 + menit1));
            System.out.printf("%02d : %02d\n",(jam/60), jam - (jam/60)*60);

        }else if((jam1 + menit1) == (jam2 + menit2)){
            jam = Math.abs(((jam1 + menit1) - (jam2 + menit2))/60)+ 24;
            menit = 0;
            System.out.printf("%02d : %02d", jam, menit);
        }
        
        
        else{
            jam = Math.abs(((jam1 + menit1) - (jam2 + menit2))/60);
            menit = 60 - Math.abs(menit1 - menit2);
            System.out.printf("%02d : %02d\n",jam,menit);
        }
    }
}
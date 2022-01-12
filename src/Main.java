import java.util.Scanner;

public class Main {

    static boolean prime(int num, int i){
        if(num < 2){
            return false;
        }
        if(i >= num/2){
            return true;
        }
        if(num%i == 0){
            return false;
        }
        return prime(num, i+1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Girin : ");
        int num = scanner.nextInt();
        boolean b = prime(num, 2);
        if(b){
            System.out.println("Girdiğiniz " + num +
                    " sayısı asaldır.");
        }else{
            System.out.println("Girdiğiniz " + num +
                    " sayısı asal sayı değildir. ");
        }
    }
}

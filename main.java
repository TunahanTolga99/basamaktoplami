import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int x;
        int y = 0 ;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Sayıyı Giriniz : ");
        x = input.nextInt();
        while (x != 0){
            total += (x%10);
            x/=10;
            y++;
        }
        System.out.print("Basamakların Toplamı : "+ total);
        }
    }





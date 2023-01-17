import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number, total = 0;

        System.out.print("Sayıyı giriniz :");
        number = input.nextInt();

        for (int i = 1; i<number; i++){
            if (number % i == 0){
                total += i;
            }else{
                total = total;
            }
        }
        System.out.println("Kendisi hariç bölenleri toplamı :" + total);

        if (total == number){
            System.out.print(number + " " + "bir mükemmel sayıdır.");
        }else{
            System.out.print(number + " " + "mükemmel sayı değildir.");
        }
    }
}
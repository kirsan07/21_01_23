import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string1 = scanner.nextLine().split("[\\d\\w,] ");
        String[] string2 = scanner.nextLine().split("[\\d\\w,] ");
        int length1 = string1.length;
        int length2 = string2.length;
        
        if ((length1/2) < 10){
            System.out.println("Easy");
        } else{
            System.out.println("Hard");
        }

        if ((length2/2) < 10){
            System.out.println("Easy");
        } else{
            System.out.println("Hard");
        }
    }
}
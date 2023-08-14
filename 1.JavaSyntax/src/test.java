import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String string = scanner.nextLine();
            if(string.equals("мама")) {
                System.out.println("мама найдена");
                break;

            }else {
                System.out.println(string + " это не мама");
                System.out.println("где же мама?");
            }
        }
    }
}

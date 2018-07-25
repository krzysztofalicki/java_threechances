import java.util.Scanner;

public class DoTrzechRazySztuka {

    public static void isFloat() {
        Scanner scanner = new Scanner(System.in);
        int x = 3;
        while(x>0) {
            try {
                System.out.println("Podaj wartość typu float: ");
                String str = scanner.nextLine();
                Float value = Float.parseFloat(str);
                System.out.println(value);
                x = 0;
            } catch (NumberFormatException e) {
                System.out.println("Błąd!");
                x--;
            }
        }
    }

    public static void main(String[] args) {

        isFloat();

    }
}

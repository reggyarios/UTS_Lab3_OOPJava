import java.util.Scanner;

public class Perhuruf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan string yang ingin dibalik: ");
        String str = input.nextLine();

        String reversed = reverseString(str);
        System.out.println("Hasil pembalikan string: " + reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}

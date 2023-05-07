import java.util.Scanner;

public class Perkata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan string yang ingin dibalik urutan katanya: ");
        String str = input.nextLine();

        String reversed = reverseWordOrder(str);
        System.out.println("Hasil pembalikan urutan kata: " + reversed);
    }

    public static String reverseWordOrder(String str) {
        String[] words = str.split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i] + " ");
        }

        return sb.toString().trim();
    }
}

import java.util.Scanner;

public class Main {

    // Manual Array Set.
    private static int[] myArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 0-9 arasında bir sayı girin: ");
        int index = scanner.nextInt();

        // Printing Results
        String result = getElementAtIndex(index);
        System.out.println(result);
    }
    public static String getElementAtIndex(int index) {
        try {
            int element = myArray[index];
            return "İndeksteki eleman: " + element;
        } catch (ArrayIndexOutOfBoundsException e) {
            // ıf there's an exception then show error messsage.

            return "Hata: İndeks dizi boyutunun dışında.";
        }
    }
}
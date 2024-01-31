public class PolaBintang {
    public static void main(String[] args) {
        int bintang = 5; // Jumlah baris
        for (int b = 1; b <= bintang; b++) {
            for (int i = 1; i <= b; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class PolaAngka {
    public static void main(String[] args) {
        int n = 5; // Jumlah baris
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

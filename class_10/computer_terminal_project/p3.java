public class p3 {
    public static void main(String[] args) {
        int n = 5, a = 6;
        for (int i = 1; i <= n; i++) {
            a--;
            for (int j = n; j > i; j--) {
                System.out.print("   ");
            }
            if(i % 2 == 1){
                for (int k = 1; k <= i; k++) {
                    System.out.print((n - k + 1) + "  ");
                }
            }
            if(i % 2 == 0){
                for (int p = 1; p <= i; p++){
                    System.out.print(a + "  ");
                }
            }
            System.out.println();
        }
    }
}
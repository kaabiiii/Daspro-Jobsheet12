import java.util.Scanner;

public class Percobaan2 {
    public static void main(String[] args) {
        int bilangan, pangkat;
        Scanner sc = new Scanner(System.in);
        System.out.println("Bilangan yang dihitung:");
        bilangan = sc.nextInt();
        System.out.println("Pangkat:");
        pangkat = sc.nextInt();

        System.out.print("Proses perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(" = " + hasil);
    }

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1"); 
            return 1;
        } else {
            System.out.print(x); 
            if (y >= 1) { 
                System.out.print("x"); 
            }
            return x * hitungPangkat(x, y - 1);
        }
    }
}

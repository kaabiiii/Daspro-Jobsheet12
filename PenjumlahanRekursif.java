import java.util.Scanner;
public class PenjumlahanRekursif {
    static int jumlahRekursif(int n){
        int temp = n;
        if(n == 0){
            temp = n;
        }else{
            temp += (jumlahRekursif(n - 1));
        }
        return temp;
    }

    static void  tampilJumlah(int n){
        if(n == 0){
        }else{
            tampilJumlah(n-1);
            System.out.print(n + "+");
        }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan Angka: ");
        angka = sc.nextInt();
        tampilJumlah(angka);
        System.out.println(  "\b=" + jumlahRekursif(angka));
    }
}
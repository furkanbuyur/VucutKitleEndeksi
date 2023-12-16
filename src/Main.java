import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double boy,endeks;
        int kilo;
        System.out.print("Boyunuzu Metre Cinsinden Girin :");
        boy = inp.nextDouble();
        System.out.print("Kilonuzu Kg Cinsinden Girin :");
        kilo = inp.nextInt();

            endeks = kilo/(boy*boy);
        System.out.print("Vücut Kitle Endeksiniz: "+endeks);


    }
}
import java.util.Scanner;

public class Sicaklik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si;
        System.out.println("Sicaklik:");
        si = sc.nextInt();
        if (si < 5) {
            System.out.println("Kayak yapabilirsin.");
        }
        if (si >= 5 && si <= 25) {
            System.out.println("Hava piknik için uygun.");
        }
        else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
    }
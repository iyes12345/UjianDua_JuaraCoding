package ujiandua;

public class nomersatu {
    public static void main(String[] args) {
        String angka = "1_3_5_7_9";
        int panjang = angka.length();
        for (int i = 0; i <= angka.length()/2; i++){
            for (int j = i; j < panjang; j++){
                System.out.print(angka.charAt(j));
            }
            System.out.println();
            panjang--;
        }
    }
}
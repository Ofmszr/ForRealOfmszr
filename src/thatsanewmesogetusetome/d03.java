package thatsanewmesogetusetome;

import java.util.Scanner;

public class d03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Doğum yılınız nedir : ");
        int dogumyili =scan.nextInt();
        int yas=2023 - dogumyili;
        System.out.println("Yaşınız : "+yas);

    }
}

package day06.jungolLoop3;


import java.util.Scanner;

public class Main_553 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //입력기 생성을 위해 스캐너 클래스만들기
        int n = in.nextInt();
        char ch = 'A';

        for (int row = 0; row < n; row++) {   //행  반복
            for (int column = 0; column < n - row; column++) {
                System.out.print(ch++);
            }
           System.out.println();

        }
    }


}


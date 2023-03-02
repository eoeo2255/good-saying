package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> 명언집 = new ArrayList<>();

        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.printf("명령)");
            String input = sc.nextLine();
            if (input.equals("등록")){
                System.out.printf("명언:");
                String 명언 = sc.nextLine();
                System.out.printf("작가:");
                String 작가 = sc.nextLine();
                저장소.저장();
                System.out.println(저장소.인덱스+"번 명언이 등록되었습니다.");
            }
            if (input.equals("목록")){

            }
            if (input.equals("종료")){
                break;
            }
        }

    }
}

class 저장소{
    static String 명언;
    static String 작가;
    static int 인덱스;

    static int 저장 (){

        인덱스++;
        return 인덱스;
    }
}

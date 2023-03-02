package org.example;

import org.example.goodSaying.entity.Goodsaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private final Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");
        int 인덱스 =0;
        List<Goodsaying> 명언집 = new ArrayList<>();

        while(true){
            System.out.printf("명령)");
            String input = sc.nextLine();

            if (input.equals("종료")){
                break;
            }
            else if (input.equals("등록")){
                System.out.printf("명언:");
                String 명언 = sc.nextLine();
                System.out.printf("작가:");
                String 작가 = sc.nextLine();
                인덱스++;
                System.out.println(인덱스+"번 명언이 등록되었습니다.");

                Goodsaying 저장소 = new Goodsaying(인덱스, 명언, 작가);
                명언집.add(저장소);

            } else if (input.equals("목록")){
                System.out.printf("번호 / 작가 / 명언\n----------------------\n");

                for(int i =명언집.size()-1; i>=0; i--){
                    Goodsaying 저장소 = 명언집.get(i);
                    System.out.printf("%d / %s / %s\n", 저장소.get인덱스(),저장소.get명언(), 저장소.get작가());
                }
            }
        }
    }

}

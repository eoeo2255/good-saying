package org.example.goodSaying.controller;

import org.example.goodSaying.entity.Goodsaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodSayingController {
    private Scanner sc;
    private int 인덱스;
    private List<Goodsaying> 명언집;
    public GoodSayingController(Scanner sc) {
        this.sc = sc;
        int 인덱스 =0;
        List<Goodsaying> 명언집 = new ArrayList<>();
    }

    public void save() {
        System.out.printf("명언:");
        String 명언 = sc.nextLine();
        System.out.printf("작가:");
        String 작가 = sc.nextLine();
        인덱스++;
        System.out.println(인덱스+"번 명언이 등록되었습니다.");

        Goodsaying 저장소 = new Goodsaying(인덱스, 명언, 작가);
        명언집.add(저장소);
    }

    public void list() {
        System.out.printf("번호 / 작가 / 명언\n----------------------\n");

        for(int i =명언집.size()-1; i>=0; i--){
            Goodsaying 저장소 = 명언집.get(i);
            System.out.printf("%d / %s / %s\n", 저장소.get인덱스(),저장소.get명언(), 저장소.get작가());
        }
    }
    public void delete() {


        System.out.printf("%d번 명언이 삭제되었습니다.\n",저장소.get인덱스());
    }
}
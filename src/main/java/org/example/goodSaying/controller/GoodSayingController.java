package org.example.goodSaying.controller;

import org.example.Rq;
import org.example.goodSaying.entity.Goodsaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodSayingController {
    private Scanner sc;
    private int id;
    private List<Goodsaying> 명언집;
    public GoodSayingController(Scanner sc) {
        this.sc = sc;
        int id =0;
        명언집 = new ArrayList<>();
    }

    public void save() {
        System.out.printf("명언:");
        String 명언 = sc.nextLine();
        System.out.printf("작가:");
        String 작가 = sc.nextLine();
        id++;
        System.out.println(id+"번 명언이 등록되었습니다.");

        Goodsaying 저장소 = new Goodsaying(id, 명언, 작가);
        명언집.add(저장소);
    }

    public void list() {
        System.out.printf("번호 / 작가 / 명언\n----------------------\n");

        for(int i =명언집.size()-1; i>=0; i--){
            Goodsaying 저장소 = 명언집.get(i);
            System.out.printf("%d / %s / %s\n", 저장소.getid(),저장소.get명언(), 저장소.get작가());
        }
    }

    public void delete(Rq rq) {
        int id = rq.getIntparam("id",-1);

        if (id == -1){
            System.out.println("id를 입력하세요.");
        }
        //입력된 id와 일치하는 저장소객체 찾기
        Goodsaying 저장소 = findByid(id);
        if (저장소 == null){
            System.out.printf("%d번 명언은 존재하지 않습니다.\n",id);
            return;
        }
        //찾은 객체를 삭제
        명언집.remove(저장소);
        System.out.printf("%d번 명언이 삭제되었습니다.\n",id);
    }

    private Goodsaying findByid(int id) {
        for (Goodsaying 저장소 : 명언집){
            if (저장소.getid() == id) {
                return 저장소;
            }
        }
        return null;
    }

    public void modify(Rq rq) {
        int id = rq.getIntparam("id",-1);
        if (id == -1){
            System.out.println("id를 입력하세요.");
        }
        Goodsaying 저장소 = findByid(id);
        if (저장소 == null){
            System.out.printf("%d번 명언은 존재하지 않습니다.\n",id);
            return;
        }

        System.out.printf("명언(기존): %s\n명언:",저장소.get명언());
        String 명언 = sc.nextLine();
        System.out.printf("작가(기존): %s\n작가:",저장소.get작가());
        String 작가 = sc.nextLine();
        저장소.set명언(명언);
        저장소.set작가(작가);

        System.out.printf("%d번 명언이 수정되었습니다.\n",id);
    }
}

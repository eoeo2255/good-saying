package org.example;

import org.example.goodSaying.controller.GoodSayingController;
import org.example.system.controller.SystemController;
import java.util.Scanner;

public class App {
    private final Scanner sc;
    public App(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        System.out.println("== 명언 앱 ==");

        SystemController systemController = new SystemController();
        GoodSayingController goodSayingController = new GoodSayingController(sc);

        while(true){
            System.out.printf("명령)");
            String input = sc.nextLine();
            Rq rq = new Rq(input);

            switch (rq.getInputOrder()){
                case "종료":
                    systemController.off();
                    return; //아예 함수 자체를 끝낸다.

                case "등록":
                    goodSayingController.save();
                    break;

                case "목록":
                    goodSayingController.list();
                    break;

                case "삭제":
                    goodSayingController.delete(rq);

                case "수정":
                    goodSayingController.modify(rq);
            }
        }
    }

}

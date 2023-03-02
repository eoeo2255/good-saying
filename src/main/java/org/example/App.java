package org.example;

import org.example.goodSaying.controller.GoodSayingController;

import org.example.system.controller.SystemController;

import java.util.HashMap;
import java.util.Map;
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

            if (input.equals("종료")){
                systemController.off();
                break;
            }
            else if (input.equals("등록")){
                goodSayingController.save();
            } else if (input.equals("목록")){
                goodSayingController.list();
            } else if (input.startsWith("삭제")) {
                Rq rq = new Rq(input);

                goodSayingController.delete();
            }
        }
    }

}

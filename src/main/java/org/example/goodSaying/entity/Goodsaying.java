package org.example.goodSaying.entity;

public class Goodsaying {
    private int 인덱스;
    private String 명언;
    private String 작가;
    public Goodsaying(int 인덱스, String 명언, String 작가) {
        this.인덱스 = 인덱스;
        this.명언 = 명언;
        this.작가 = 작가;
    }

    public int get인덱스() {
        return 인덱스;
    }

    public String get명언() {
        return 명언;
    }

    public String get작가() {
        return 작가;
    }
}

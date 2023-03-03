package org.example.goodSaying.entity;

public class Goodsaying {
    private int id;
    private String 명언;
    private String 작가;
    public Goodsaying(int id, String 명언, String 작가) {
        this.id = id;
        this.명언 = 명언;
        this.작가 = 작가;
    }

    public int getid() {
        return id;
    }

    public String get명언() {
        return 명언;
    }

    public String get작가() {
        return 작가;
    }
}

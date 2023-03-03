package org.example;

import java.util.HashMap;
import java.util.Map;

public class Rq {
    private String inputOrder;
    Map<String, String> inputVal;
    public Rq(String input){
        String[] inputBits = input.split("\\?",2); //삭제와 id=1&다른조건
        inputOrder = inputBits[0]; //삭제
        inputVal = new HashMap<>();

        if (inputBits.length == 1) return;

        String[] param = inputBits[1].split("&");//id=1과 다른조건

        for (String keyval : param) {
            String[] paramBits = keyval.split("=",2);

            if(paramBits.length == 1) continue;

            String key = paramBits[0];
            String value = paramBits[1];
            inputVal.put(key, value);
        }
    }

    public String getInputOrder() {
        return inputOrder;
    }
    public String getparam(String name){
        return inputVal.get(name);
    }

    public int getIntparam(String id, int defaultValue) {
        try {
            return Integer.parseInt(getparam("id"));
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }
}

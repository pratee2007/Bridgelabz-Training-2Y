package Logical_problems;

import java.util.HashMap;

public class DemoMap {
    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Abhay",20);
        map.put("Robin",21);
        System.out.println("Abhay's age : "+ map.get("Abhay"));
        System.out.println("Robin's age : "+ map.get("Robin"));
    }
}

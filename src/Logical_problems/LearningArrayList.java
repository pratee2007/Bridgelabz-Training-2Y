package Logical_problems;

import java.util.ArrayList;
import java.util.List;

public class LearningArrayList {
    static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < 20;i++) list.add(i+1);
        System.out.println(list.toString());
    }
}

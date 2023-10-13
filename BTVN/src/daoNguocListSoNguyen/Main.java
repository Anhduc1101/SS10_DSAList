package daoNguocListSoNguyen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(5);
        list.add(15);
        list.add(55);
        list.add(95);
        list.add(75);
        list.add(65);
        list.add(45);
        list.add(25);
        list.add(35);
            List<Integer>newList=new ArrayList<>();
        for (int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
            System.out.println(newList);
    }
}

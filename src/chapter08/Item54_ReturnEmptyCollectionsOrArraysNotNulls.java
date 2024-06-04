package chapter08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Item54_ReturnEmptyCollectionsOrArraysNotNulls {
    public static void main(String[] args) {
        List<String> list1 = getList(true);
        System.out.println("list1: " + list1);

        List<String> list2 = getList(false);
        System.out.println("list2: " + list2);

        // null 체크 없이 바로 사용 가능
        for (String item : list1) {
            System.out.println("item: " + item);
        }

        // null 체크 없이 바로 사용 가능
        for (String item : list2) {
            System.out.println("item: " + item);
        }
    }

    public static List<String> getList(boolean isEmpty) {
        if (isEmpty) {
            return Collections.emptyList();
        } else {
            List<String> list = new ArrayList<>();
            list.add("apple");
            list.add("banana");
            return list;
        }
    }
}

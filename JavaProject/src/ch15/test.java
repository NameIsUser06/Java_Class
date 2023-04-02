package ch15;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<String, String>();

        hashMap.put("soccer", "축구");
        hashMap.put("baseball", "야구");
        hashMap.put("basketball", "농구");

        System.out.println(hashMap.get("soccer")); // 축구
        System.out.println(hashMap.remove("baseball")); // 야구
        System.out.println(hashMap); // {soccer=축구, basketball=농구}
        System.out.println(hashMap.size()); // 2

    }
}

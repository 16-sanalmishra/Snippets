package com.java.Imp;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,2,5,7,3};
        Map<Integer,Boolean> map = new HashMap<>();
        int k = 10;
        boolean result =false;
        for (int j : arr) {
            int rem = k - j;
            if (map.containsKey(rem)) {
                result = true;
            }
            map.put(j, true);
        }
        if(result){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }


    }
}

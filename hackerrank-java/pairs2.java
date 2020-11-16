package com.margieblair;

import java.util.Arrays;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
    //    System.out.println(pairs(2,  new int[]{1,5,3,4,2}));
            System.out.println(pairs(2,  new int[]{1, 3, 5, 8, 6, 4, 2, 4}));
        }

        static int pairs(int k, int[] arr) {
            Arrays.sort(arr);
            HashMap<Integer, Integer> indexMap = new HashMap<>();
            int counter = 0;
            for (int i = 0; i < arr.length; i++) {
              if(!indexMap.containsKey(arr[i])) indexMap.put(arr[i], 1);
              else indexMap.put(arr[i], indexMap.get(arr[i]) + 1);
            }
            System.out.println(indexMap);
            
            for (int i = 0; i < arr.length; i++) {
                if(indexMap.containsKey(arr[i] + k)){
                    counter += (indexMap.get(arr[i]+k));
                }
            }
            System.out.println(Arrays.toString(arr));
            return counter;
        }
    }


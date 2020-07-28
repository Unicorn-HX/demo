package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wanghaoxin
 * @description 迷你代码题
 * @copyright Copyright (C) 2020 XXXX, Inc. All rights reserved. <br>
 * @company 广州XX科技有限公司
 * @date 2020年 07月28日 21:35:29
 */
public class MiniCode {
    // 定义数字与字母映射关系
    Map<Integer, String> numberMapping = new HashMap<Integer, String>() {{
        put(2, "ABC");
        put(3, "DEF");
        put(4, "GHI");
        put(5, "JKL");
        put(6, "MNO");
        put(7, "PQRS");
        put(8, "TUV");
        put(9, "WXYZ");
    }};

    /**
     * desc: 递归调用
     * @param resultList 结果列表
     * @param combination 字母组合
     * @param index arr数组下标，每次循环加一
     * @param arr 数字数组
     * @author wanghaoxin
     * @date 2020-07-28 21:3:29
     */
    public void combiningLetter(List<String> resultList, String combination, Integer index, Integer[] arr) {
        if (arr.length == index) {
            resultList.add(combination);
        } else {
            // 根据具体数字获取映射的字母
            String letters = numberMapping.get(arr[index]);
            // 为空则跳过
            if (null == letters) {
                combiningLetter(resultList, combination, index + 1, arr);
            } else {
                // 不为空则递归调用，组合字母
                for(int i = 0; i < letters.length(); i++) {
                    String letter = numberMapping.get(arr[index]).substring(i, i + 1);
                    combiningLetter(resultList,combination + letter, index + 1, arr);
                }
            }
        }
    }

    /**
     * desc: 迷你题-返回字母组合
     * @param arr 数字数组
     * @return java.util.List<java.lang.String>
     * @author wanghaoxin
     * @date 2020-07-28 23:05:26
     */
    public List<String> getLetterCombinations(Integer...arr) {
        // 结果列表
        List<String> resultList = new ArrayList<>();
        if (arr.length != 0) {
            combiningLetter(resultList, "", 0, arr);
        }
        return resultList;
    }
}
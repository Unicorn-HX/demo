package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

/**
 * @author wanghaoxin
 * @description 迷你代码测试类
 * @copyright Copyright (C) 2020 XXXX, Inc. All rights reserved. <br>
 * @company 广州XX科技有限公司
 * @date 2020年 07月28日 23:11:53
 */
@RunWith(JUnit4.class)
public class MiniCodeTest {

    private MiniCode miniCode = new MiniCode();

    /**
     * desc: 测试方法
     * @author wanghaoxin
     * @date 2020-07-28 23:57:07
     */
    @Test
    public void testLetterCombinations() {
        List<String> result1 = miniCode.getLetterCombinations(0, 1, 3, 4);
        System.out.println("0, 1, 3, 4 运行结果");
        result1.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");

        List<String> result2 = miniCode.getLetterCombinations(2, 3, 4);
        System.out.println("2, 3, 4 运行结果");
        result2.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");

        List<String> result3 = miniCode.getLetterCombinations(0);
        System.out.println("0 运行结果");
        result3.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");

        List<String> result4 = miniCode.getLetterCombinations(0, 9);
        System.out.println("0, 9 运行结果");
        result4.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");

        List<String> result5 = miniCode.getLetterCombinations(2);
        System.out.println("2 运行结果");
        result5.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");

        List<String> result6 = miniCode.getLetterCombinations(2, 3);
        System.out.println("2, 3 运行结果");
        result6.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");

        List<String> result7 = miniCode.getLetterCombinations(2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("2, 3, 4, 5, 6, 7, 8, 9 运行结果");
        result7.forEach(item -> System.out.print(item + " "));
        System.out.println("");
        System.out.println("");
    }

}
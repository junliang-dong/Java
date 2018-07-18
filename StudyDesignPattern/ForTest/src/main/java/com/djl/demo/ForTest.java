package com.djl.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by dongjunliang on 2018-6-1.
 */
public class ForTest {
    public static void main(String[] args) {
//        System.out.println(Arrays.asList("Safari"));
        String fileName = "D:/WorkSpace/log.txt";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            String[] words = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
            for (int i = 0; i < 20000; i++) {
                String word = "";
                for (int j = 0; j < (int) (Math.random() * 10 + 5); j++) {
                    word += words[(int) (Math.random() * 26)];
                }
                word += " ";
                out.write(word);
                if (i % 10 == 0) {
                    out.newLine();
                }
            }
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * 使用BufferedWriter类写文本文件
     */
    public static void writeMethod3(String str) {
        String fileName = "D:/WorkSpace/log.txt";
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
            out.write(str);
            out.newLine();  //注意\n不一定在各种计算机上都能产生换行的效果
            out.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

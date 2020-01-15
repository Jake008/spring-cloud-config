package com.example.swb.controller;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Test {

    private static final Integer ONE = 1;
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        /* 读取数据 */
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(new File("D:/mywork/file.txt")),
                    "UTF-8"));
            String lineTxt = null;
            while ((lineTxt = br.readLine()) != null) { //数据以逗号分隔
                String[] names = lineTxt.split(",");
                for (String name : names) {
                    if (map.keySet().contains(name)) {
                        map.put(name, (map.get(name) + ONE));
                    } else {
                        map.put(name, ONE);
                    }
                }
            }
            br.close();
        } catch (Exception e) {
            System.err.println("read errors :" + e);
        }

        /* 输出数据 */
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("D:/mywork/file.txt")),
                    "UTF-8"));

            for (String name : map.keySet()) {
                bw.write(name + " " + map.get(name));
                bw.newLine();
            }
            System.out.println(bw);
            bw.close();
        } catch (Exception e) {
            System.err.println("write errors :" + e);
        }
    }

}

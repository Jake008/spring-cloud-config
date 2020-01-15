package com.example.swb.suanfa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceIps {

    public static final List<String> LIST =  new ArrayList<>();
    static {
        LIST.add("192.168.1.1");
        LIST.add("192.168.1.2");
        LIST.add("192.168.1.3");
        LIST.add("192.168.1.4");
        LIST.add("192.168.1.5");
        LIST.add("192.168.1.6");
        LIST.add("192.168.1.7");
        LIST.add("192.168.1.8");
        LIST.add("192.168.1.9");
        LIST.add("192.168.1.10");
    }
    //根据每台服务器的性能不同，可以分配权重
    public static final Map<String, Integer> WEIGHT_LIST =  new HashMap<>();
    //权重是50
    static {
        WEIGHT_LIST.put("192.168.1.1",2);
        WEIGHT_LIST.put("192.168.1.1",8);
        WEIGHT_LIST.put("192.168.1.1",1);
        WEIGHT_LIST.put("192.168.1.1",9);
        WEIGHT_LIST.put("192.168.1.1",3);
        WEIGHT_LIST.put("192.168.1.1",7);
        WEIGHT_LIST.put("192.168.1.1",4);
        WEIGHT_LIST.put("192.168.1.1",6);
        WEIGHT_LIST.put("192.168.1.1",2);
        WEIGHT_LIST.put("192.168.1.1",8);
    }
}

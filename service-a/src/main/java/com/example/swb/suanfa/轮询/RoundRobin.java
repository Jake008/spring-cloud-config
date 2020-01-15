package com.example.swb.suanfa.轮询;

import com.example.swb.suanfa.Sequence;
import com.example.swb.suanfa.ServiceIps;

/**
 * 轮询算法
 */
public class RoundRobin {

    public static  String getServer() {
        int totalWeight = 0;//总权重
        Object[] weights = ServiceIps.WEIGHT_LIST.values().toArray();
        for (int i = 0; i < weights.length; i++) {
            Integer weight = (int) weights[i];
            totalWeight += weight;
        }
        Integer seq = Sequence.getSequenceAndCreat();
        int pos = seq % totalWeight;
        for (String ip : ServiceIps.WEIGHT_LIST.keySet()) { //循环ip
            Integer weight = ServiceIps.WEIGHT_LIST.get(ip);
            if (pos <= weight) {
                return ip;
            }
            pos = pos - weight;
        }
        return null;
    }
}

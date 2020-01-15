package com.example.swb.suanfa.随机;

import com.example.swb.suanfa.ServiceIps;

/**
 * 随机算法
 */
public class Random {
    //随机算法
    public static  String getServer() {
        int totalWeight = 0;//总权重
        boolean sameWeight = true;
        Object[] weights = ServiceIps.WEIGHT_LIST.values().toArray();
        for (int i = 0; i < weights.length; i++) {
            Integer weight = (int) weights[i];
            totalWeight += weight;
            if (sameWeight && i > 0 && !weight.equals(weights[i - 1])) { //表示权重不相等，那么就需要用权重随机算法
                sameWeight = false;
            }
        }
        if (!sameWeight) { //权重随机算法
            java.util.Random random = new java.util.Random();
            int pos = random.nextInt(totalWeight);
            for (String ip : ServiceIps.WEIGHT_LIST.keySet()) { //循环ip
                Integer weight = ServiceIps.WEIGHT_LIST.get(ip);
                if (pos <= weight) {
                    return ip;
                }
                pos = pos - weight;
            }
        }
            //普通随机算法
            java.util.Random random = new java.util.Random();
            int pos = random.nextInt(ServiceIps.WEIGHT_LIST.size());
            return (String) ServiceIps.WEIGHT_LIST.keySet().toArray()[pos];
    }

    //随机权重算法

    public static void main(String[] args) {
        for (int i= 0; i<10; i++) {
            System.out.println(getServer());
        }
    }
}

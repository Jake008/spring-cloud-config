/*
package com.example.swb.util;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

*/
/**
 * 自定义负载均衡策略
 *//*

public class MyRule extends AbstractLoadBalancerRule {

    Random rand;

    private int nowIndex = -1;
    private int lastIndex = -1;
    private int skipIndex = -1;



    public MyRule(Random rand) {
        this.rand = rand;
    }

    protected int chooseRandomInt(int serverCount) {
        return ThreadLocalRandom.current().nextInt(serverCount);
    }


    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }

    */
/**
     * 伪随机，当一个小标（微服务）连续调用两次，第三次如果还是他，那么就再随机一次
     * @param
     * @return
     *//*

    public Server choose(ILoadBalancer lb,) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

                int index = this.chooseRandomInt(serverCount);
                server = (Server)upList.get(index);
                lastIndex = nowIndex;
                if (nowIndex == lastIndex) {
                    skipIndex = nowIndex;
                }


                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }
}
*/

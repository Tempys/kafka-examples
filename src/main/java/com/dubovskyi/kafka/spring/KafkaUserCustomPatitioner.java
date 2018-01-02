package com.dubovskyi.kafka.spring;


import org.apache.kafka.clients.producer.Partitioner;
import org.apache.kafka.common.Cluster;

import java.util.Map;

public class KafkaUserCustomPatitioner implements Partitioner {

    @Override
    public int partition(String s, Object key, byte[] bytes, Object o1, byte[] bytes1, Cluster cluster) {

        int partition = 0;
        String campaignId = (String) key;



       // campaign.hashCode() % cluster.
        // Find the id of current user based on the username

        // If the userId not found, default partition is 0
        /*if (userId != null) {
            partition = userId;

        }*/
        return partition;
    }

    @Override
    public void close() {

    }

    @Override
    public void configure(Map<String, ?> map) {

    }
}

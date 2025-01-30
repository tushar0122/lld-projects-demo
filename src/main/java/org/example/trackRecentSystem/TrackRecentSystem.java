package org.example.trackRecentSystem;

import org.example.trackRecentSystem.model.Item;

import java.util.Random;

public class TrackRecentSystem {

    public static  void main(String args[]){
        var trackingSystem = LRUCache.builder().limit(10).build();
        Item[] list = new Item[100];
        var rand = new Random();
        for(int i=0;i<25;i++){
            list[i] = new Item();
            list[i].setItemId((rand.nextInt(1, 15)));
            System.out.println(list[i].getItemId()+" ");
            trackingSystem.add(list[i]);
            trackingSystem.display();
        }
    }
}

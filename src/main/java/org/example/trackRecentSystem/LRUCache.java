package org.example.trackRecentSystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.trackRecentSystem.model.Item;

import java.util.LinkedHashSet;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LRUCache {

    @Builder.Default
    private LinkedHashSet<Item> cache = new LinkedHashSet<Item>();

    @Builder.Default
    private  int limit = 10;

    void add(Item item){
        if(cache.contains(item)){
            cache.remove(item);
        }
        cache.add(item);
        if(cache.size()>limit){
            var iterator = cache.iterator();
            if(iterator.hasNext()){
                iterator.next();
                iterator.remove();
            }
        }
    }

    void display(){
        for(Item i: cache){
            System.out.print(i.getItemId()+" ");
        }
        System.out.println();
    }
}

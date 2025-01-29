package org.example.trackRecentSystem;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.LinkedHashSet;
import java.util.Objects;

@Data
class Item {
    private String itemName;
    private int itemId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return itemId == item.getItemId() && Objects.equals(itemName, item.getItemName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(itemId, itemName);
    }

    // To display Item for testing purposes
    @Override
    public String toString() {
        return "Item{id=" + itemId + ", name='" + itemName + "'}";
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TrackRecentSystem {

    @Builder.Default
    private LinkedHashSet<Item> lruCache = new LinkedHashSet<Item>();

    @Builder.Default
    private  int limit = 10;

    void add(Item item){
        if(lruCache.contains(item)){
            lruCache.remove(item);
        }
        lruCache.add(item);
        if(lruCache.size()>limit){
            var iterator = lruCache.iterator();
            if(iterator.hasNext()){
                iterator.next();
                iterator.remove();
            }
        }
    }

    void display(){
        for(Item i: lruCache){
            System.out.print(i.getItemId()+" ");
        }
        System.out.println();
    }
}

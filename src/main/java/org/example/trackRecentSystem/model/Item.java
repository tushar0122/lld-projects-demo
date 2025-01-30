package org.example.trackRecentSystem.model;

import lombok.Data;

import java.util.Objects;

@Data
public class Item {
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

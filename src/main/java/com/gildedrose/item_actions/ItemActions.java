package com.gildedrose.item_actions;

import com.gildedrose.Item;

public class ItemActions {

    Item item;
    public final int minQuality = 0;
    public final int maxQuality = 50;

    public ItemActions(Item item) {
        this.item = item;
    }

    public void updateSellIn() {
        item.sellIn--;
    }

    public void updateQuality() {
        if (item.sellIn >= 0) {
            item.quality--;
        } else {
            item.quality = item.quality - 2;
        }
    }

    public void checkQualityIsValid() {
        if (item.quality > maxQuality) {
            item.quality = maxQuality;
        }
        if (item.quality < minQuality) {
            item.quality = minQuality;
        }
    }
}

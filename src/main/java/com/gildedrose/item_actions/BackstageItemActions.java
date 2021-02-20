package com.gildedrose.item_actions;

import com.gildedrose.Item;

public class BackstageItemActions extends ItemActions {
    public BackstageItemActions(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (item.sellIn <= 0) {
            item.quality = 0;
        } else {
            if (item.sellIn < 5 && item.quality < this.maxQuality) {
                item.quality++;
            }
            if (item.sellIn < 10 && item.quality < this.maxQuality) {
                item.quality++;
            }

            item.quality++;

        }
    }
}

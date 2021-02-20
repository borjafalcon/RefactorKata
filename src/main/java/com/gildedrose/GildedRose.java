package com.gildedrose;

import com.gildedrose.item_actions.ItemActions;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            ItemActions itemActions = ItemFactory.getItemActions(item);
            itemActions.updateSellIn();
            itemActions.updateQuality();
            itemActions.checkQualityIsValid();
        }
    }
}
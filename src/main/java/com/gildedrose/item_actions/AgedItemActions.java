package com.gildedrose.item_actions;

import com.gildedrose.Item;

public class AgedItemActions extends ItemActions {
    public AgedItemActions(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        item.quality++;
    }
}

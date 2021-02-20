package com.gildedrose.item_actions;

import com.gildedrose.Item;

public class ConjuredItemActions extends ItemActions {
    public ConjuredItemActions(Item item) {
        super(item);
    }

    public void updateQuality() {
        super.updateQuality();
        super.updateQuality();
    }
}

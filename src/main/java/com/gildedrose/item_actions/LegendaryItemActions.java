package com.gildedrose.item_actions;

import com.gildedrose.Item;

public class LegendaryItemActions extends ItemActions {
    public LegendaryItemActions(Item item) {
        super(item);
    }

    public void updateSellIn() {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            System.out.println("Ragnaros the Fire Lord is mad about you trying to sell his weapon.");
            System.out.println("He says to you: DIE INSECT!!!!.");
        }
    }

    public void updateQuality() {
        //
    }

    public void checkQualityIsValid() {
        //
    }
}

package com.gildedrose;

import com.gildedrose.item_actions.*;

import java.util.Arrays;
import java.util.List;

public class ItemFactory {
    public final static List<String> AGED_ITEMS = Arrays.asList(
            "Aged Brie"
    );
    public final static List<String> LEGENDARY_ITEMS = Arrays.asList(
            "Sulfuras, Hand of Ragnaros"
    );
    public final static List<String> BACKSTAGE_PASSES = Arrays.asList (
            "Backstage passes to a TAFKAL80ETC concert"
    );
    public final static List<String> CONJURED_ITEMS = Arrays.asList (
        "Conjured Mana Cake",
        "Conjured Fiery Axe"
    );

    public static boolean isCommonItem(Item item) {
        return !(AGED_ITEMS.contains(item.name) &&
                LEGENDARY_ITEMS.contains(item.name) &&
                BACKSTAGE_PASSES.contains(item.name) &&
                CONJURED_ITEMS.contains(item.name));
    }

    public static ItemActions getItemActions(Item item) {
        if (AGED_ITEMS.contains(item.name)) {
            return new AgedItemActions(item);
        }
        if (LEGENDARY_ITEMS.contains(item.name)) {
            return new LegendaryItemActions(item);
        }
        if (BACKSTAGE_PASSES.contains(item.name)) {
            return new BackstageItemActions(item);
        }
        if (CONJURED_ITEMS.contains(item.name)) {
            return new ConjuredItemActions(item);
        }

        return new ItemActions(item);
    }
}

package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConjuredItemTest {

    GildedRose gildedRose;

    @Before
    public void prepareParameters() {
        Item[] items = new Item[] {
                new Item("Conjured Mana Cake", 10, 20),
                new Item("Conjured Fiery Axe", 0, 20)
        };
        gildedRose = new GildedRose(items);
    }

    @Test
    public void conjuredItemQuality_oneDayLessToSellIn_qualityDecreasesByDouble() {
        gildedRose.updateQuality();
        assertEquals(18, gildedRose.items[0].quality);
    }

    @Test
    public void conjuredItemQuality_expiredSellIn_qualityDecreasesByDouble() {
        gildedRose.updateQuality();
        assertEquals(16, gildedRose.items[1].quality);
    }
}

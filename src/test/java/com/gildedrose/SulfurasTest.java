package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SulfurasTest {

    GildedRose gildedRose;

    @Before
    public void prepareParameters() {
        Item[] items = new Item[] {
                new Item("Sulfuras, Hand of Ragnaros", 0, 80) //
        };
        gildedRose = new GildedRose(items);
    }

    @Test
    public void sulfurasQuality_oneDayLessToSellIn_qualityIsRighty() {
        gildedRose.updateQuality();
        assertEquals(80, gildedRose.items[0].quality);
    }

    @Test
    public void sulfurasSellIn_updateQuality_DoesNotSellIn() {
        gildedRose.updateQuality();
        assertEquals(0, gildedRose.items[0].sellIn);
    }
}

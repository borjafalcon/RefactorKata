package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AgedBrieTest {

    GildedRose gildedRose;

    @Before
    public void prepareParameters() {
        Item[] items = new Item[] {
                new Item("Aged Brie", 2, 0)
        };
        gildedRose = new GildedRose(items);
    }

    @Test
    public void agedBrieQuality_oneDayLessToSellIn_qualityIncreasesByOne() {
        gildedRose.updateQuality();
        assertEquals(1, gildedRose.items[0].quality);
    }

    @Test
    public void agedBrieQuality_updateQuality_qualityIsNeverMoreThan50() {
        for(int a = 75; a > 0; a--) {
            gildedRose.updateQuality();
        }
        assertEquals(50, gildedRose.items[0].quality);
    }
}

package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BackstagePassTest {

    GildedRose gildedRose;

    @Before
    public void prepareParameters() {
        Item[] items = new Item[] {
            new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
            new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
            new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)
        };
        gildedRose = new GildedRose(items);
    }

    @Test
    public void backstageQuality_moreThan10DaysToSellIn_qualityIncreaseBy1() {
        gildedRose.updateQuality();
        assertEquals(21, gildedRose.items[0].quality);
    }

    @Test
    public void backstageQuality_between5To10DaysToSellIn_qualityIncreasesBy2() {
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.items[1].quality);
    }

    @Test
    public void backstageQuality_lessThan5DaysToSellIn_qualityIncreasesBy3() {
        gildedRose.updateQuality();
        assertEquals(50, gildedRose.items[2].quality);
    }

    @Test
    public void backstageQuality_afterConcert_qualityIs0() {
        for(int a = 25; a > 0; a--) {
            gildedRose.updateQuality();
        }
        assertEquals(0, gildedRose.items[0].quality);
        assertEquals(0, gildedRose.items[1].quality);
        assertEquals(0, gildedRose.items[2].quality);
    }
}

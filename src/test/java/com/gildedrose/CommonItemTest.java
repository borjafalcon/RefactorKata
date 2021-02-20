package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class CommonItemTest {

    GildedRose gildedRose;

    @Before
    public void prepareParameters() {
        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 20),
                new Item("+10 Dexterity Vest", 0, 20)
        };
        gildedRose = new GildedRose(items);
    }

    @Test
    public void itemSellIn_updateQuality_sellInDecreasesByOne() {
        gildedRose.updateQuality();
        assertEquals(9, gildedRose.items[0].sellIn);
    }

    @Test
    public void itemQuality_oneDayLessToSellIn_qualityDecreasesByOne() {
        gildedRose.updateQuality();
        assertEquals(19, gildedRose.items[0].quality);
    }

    @Test
    public void itemQuality_expiredSellIn_qualityDecreasesByDouble() {
        gildedRose.updateQuality();
        assertEquals(18, gildedRose.items[1].quality);
    }

    @Test
    public void itemQuality_updateQuality_qualityNoLessThanZero() {
        for(int a = 25; a > 0; a--) {
            gildedRose.updateQuality();
        }
        assertEquals(0, gildedRose.items[0].quality);
    }

    @Test
    public void item_checkItemType_isCommonItem() {
        assertTrue(ItemFactory.isCommonItem(gildedRose.items[1]));
    }
}

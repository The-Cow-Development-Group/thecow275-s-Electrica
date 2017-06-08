package com.thecow275.electrica.items.BaseItem1102;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ModItems1102 {
    public static ItemBase itemregistertest;
    public static ItemBase ingotcopper;
    public static ItemBase ingottin;


    public static void init() {
        ingottin = register(new ItemBase("ingottin").setCreativeTab(CreativeTabs.MATERIALS));
        itemregistertest = register(new ItemBase("alphacopper").setCreativeTab(CreativeTabs.MATERIALS));
        ingotcopper = register(new ItemBase("ingotcopper").setCreativeTab(CreativeTabs.MATERIALS));
        OreDictionary.registerOre("ingottin", ingottin);
        OreDictionary.registerOre("ingotcopper", ingotcopper);
        OreDictionary.registerOre("alphacopper", itemregistertest);
    }

    private static <T extends Item> T register (T item) {
        GameRegistry.register(item);

        if (item instanceof ItemModelProvider) {
            ((ItemModelProvider)item).registerItemModel(item);
        }
        return item;
    }
}

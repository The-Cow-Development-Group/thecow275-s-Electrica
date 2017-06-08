package com.thecow275.electrica.items.Items;

import com.thecow275.electrica.items.ItemTypes.*;
import com.thecow275.electrica.items.BaseItem1102.*;
import com.thecow275.electrica.items.ToolTypes.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;

import static net.minecraftforge.fml.common.registry.GameRegistry.register;

public class Ingots {
    // public static Item ingottin;
    // public static Item ingotcopper;
    public static Item ingotbronze;
    public static Item ingotsilver;
    public static Item dustbronze;
    public static ItemBase ingotcopper;



    public static void createItems(){
        //GameRegistry.registerItem(ingottin = new BasicItem("ingottin"), "ingottin"); //tin Ingot
        //GameRegistry.registerItem(ingotcopper = new BasicItem("ingotcopper"), "ingotcopper"); // copper Ingot
        GameRegistry.registerItem(ingotbronze = new BasicItem("ingotbronze"), "ingotbronze"); // bronze Ingot
        GameRegistry.registerItem(ingotsilver = new BasicItem("ingotsilver"), "ingotsilver"); // silver Ingot
        GameRegistry.registerItem(dustbronze = new BasicItem("dustbronze"), "dustbronze");

        //OreDictionary.registerOre("ingotcopper", ingotcopper);
        OreDictionary.registerOre("ingotsilver", ingotsilver);
        //OreDictionary.registerOre("ingottin", ingottin);
        OreDictionary.registerOre("ingotbronze", ingotbronze);
        OreDictionary.registerOre("dustbronze", dustbronze);
    }

}

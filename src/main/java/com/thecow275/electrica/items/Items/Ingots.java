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
    // public static Item ingotTin;
    // public static Item ingotCopper;
    public static Item ingotBronze;
    public static Item ingotSilver;
    public static Item dustBronze;
    public static ItemBase ingotCopper;



    public static void createItems(){
        //GameRegistry.registerItem(ingotTin = new BasicItem("ingotTin"), "ingotTin"); //Tin Ingot
        //GameRegistry.registerItem(ingotCopper = new BasicItem("ingotCopper"), "ingotCopper"); // Copper Ingot
        GameRegistry.registerItem(ingotBronze = new BasicItem("ingotBronze"), "ingotBronze"); // Bronze Ingot
        GameRegistry.registerItem(ingotSilver = new BasicItem("ingotSilver"), "ingotSilver"); // Silver Ingot
        GameRegistry.registerItem(dustBronze = new BasicItem("dustBronze"), "dustBronze");

        //OreDictionary.registerOre("ingotCopper", ingotCopper);
        OreDictionary.registerOre("ingotSilver", ingotSilver);
        //OreDictionary.registerOre("ingotTin", ingotTin);
        OreDictionary.registerOre("ingotBronze", ingotBronze);
        OreDictionary.registerOre("dustBronze", dustBronze);
    }

}

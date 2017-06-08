package com.thecow275.electrica.items.Items;

import com.thecow275.electrica.items.ItemTypes.*;
import com.thecow275.electrica.items.ToolTypes.*;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.oredict.OreDictionary;
public final class ModItems {


    public static Item pickaxecopper;
	public static Item axecopper;

    public static Item helmetcopper;
	public static Item chestplatecopper;



    public static Item leggingscopper;
    public static Item bootscopper;


	public static Item hoecopper;
    public static Item swordcopper;
    public static Item shovelcopper;

	//public static ToolMaterial copper = EnumHelper.addToolMaterial("copper", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);


    //below this line are the sword materials
    public static ToolMaterial coppersword = EnumHelper.addToolMaterial("coppersword", 0, 500, 1.0F, 2.0F, 14);


    //below this line are the pickaxe materials
    public static ToolMaterial copperpickaxe = EnumHelper.addToolMaterial("copperpickaxe", 2, 500, 6.0F, 2.0F, 14);


    //below this line are the shovel a.k.a spade materials
    public static ToolMaterial coppershovel = EnumHelper.addToolMaterial("coppershovel", 2, 500, 6.0F, 2.0F, 14);


    //below this line are the axe materiala
    public static ToolMaterial copperaxe = EnumHelper.addToolMaterial("copperaxe", 2, 500, 6.0F, 2.0F, 14);


    //balow this line are the hoe materials
    public static ToolMaterial copperhoe = EnumHelper.addToolMaterial("copperhoe", 0, 500, 6.0F, 2.0F, 14);

    public static BasicItem19 basicitem;
    public static BasicItem19 baseitem;



    //below this line are the armor materials
	public static ItemArmor.ArmorMaterial copperarmor = EnumHelper.addArmorMaterial("copperarmor", "electrica:copperarmor", 16, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ItemArmor.ArmorMaterial bronzearmor = EnumHelper.addArmorMaterial("bronzearmor", "electrica:bronzearmor", 16, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static void init(){
	    basicitem = new BasicItem19("basicitem");
        baseitem = new BasicItem19("baseitem");
    }

    public static void createItems(){

	    //below this line are the ingot items




        // 1.11 Readynes Test Item

        //below this line are the pickaxe tools
        GameRegistry.registerItem(pickaxecopper = new PickaxeMod("pickaxecopper", copperpickaxe), "pickaxecopper"); //copper pickaxe

        //below this line are the axe tools
        GameRegistry.registerItem(axecopper = new AxeMod("axecopper", copperaxe), "axecopper");

        //below this line are the hoe tools
        GameRegistry.registerItem(hoecopper = new HoeMod("hoecopper", copperhoe), "hoecopper");

        //below this line are the sword weapon tools
        GameRegistry.registerItem(swordcopper = new SwordMod("swordcopper", coppersword), "swordcopper");

        //below this line are the shovel tools
        GameRegistry.registerItem(shovelcopper = new ShovelMod("shovelcopper", coppershovel), "shovelcopper");
        //below this line is the copper armor groups
        // helmet
        GameRegistry.registerItem(helmetcopper = new ItemModArmor("helmetcopper", copperarmor, 1, EntityEquipmentSlot.HEAD), "helmetcopper");

        // ChestPlate
        GameRegistry.registerItem(chestplatecopper = new ItemModArmor("chestplatecopper", copperarmor, 1, EntityEquipmentSlot.CHEST), "chestplatecopper");
        // Leggings
        GameRegistry.registerItem(leggingscopper = new ItemModArmor("leggingscopper", copperarmor, 2, EntityEquipmentSlot.LEGS), "leggingscopper");
        // Boots
        GameRegistry.registerItem(bootscopper = new ItemModArmor("bootscopper", copperarmor, 1, EntityEquipmentSlot.FEET), "bootscopper");
    }
}

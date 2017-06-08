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


    public static Item pickaxeCopper;
	public static Item axeCopper;

    public static Item helmetCopper;
	public static Item chestplateCopper;



    public static Item leggingsCopper;
    public static Item bootsCopper;


	public static Item hoeCopper;
    public static Item swordCopper;
    public static Item shovelCopper;

	//public static ToolMaterial Copper = EnumHelper.addToolMaterial("Copper", harvestLevel, durability, miningSpeed, damageVsEntities, enchantability);


    //below this line are the sword materials
    public static ToolMaterial CopperSword = EnumHelper.addToolMaterial("CopperSword", 0, 500, 1.0F, 2.0F, 14);


    //below this line are the pickaxe materials
    public static ToolMaterial CopperPickaxe = EnumHelper.addToolMaterial("CopperPickaxe", 2, 500, 6.0F, 2.0F, 14);


    //below this line are the shovel a.k.a spade materials
    public static ToolMaterial CopperShovel = EnumHelper.addToolMaterial("CopperShovel", 2, 500, 6.0F, 2.0F, 14);


    //below this line are the axe materiala
    public static ToolMaterial CopperAxe = EnumHelper.addToolMaterial("CopperAxe", 2, 500, 6.0F, 2.0F, 14);


    //balow this line are the hoe materials
    public static ToolMaterial CopperHoe = EnumHelper.addToolMaterial("CopperHoe", 0, 500, 6.0F, 2.0F, 14);

    public static BasicItem19 basicitem;
    public static BasicItem19 baseitem;



    //below this line are the armor materials
	public static ItemArmor.ArmorMaterial CopperArmor = EnumHelper.addArmorMaterial("CopperArmor", "electrica:copperarmor", 16, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);
	public static ItemArmor.ArmorMaterial BronzeArmot = EnumHelper.addArmorMaterial("BronzeArmor", "electrica:bronzearmor", 16, new int[] {3, 8, 6, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0);
	public static void init(){
	    basicitem = new BasicItem19("basicitem");
        baseitem = new BasicItem19("baseitem");
    }

    public static void createItems(){

	    //below this line are the ingot items




        // 1.11 Readynes Test Item

        //below this line are the pickaxe tools
        GameRegistry.registerItem(pickaxeCopper = new PickaxeMod("pickaxeCopper", CopperPickaxe), "pickaxeCopper"); //Copper Pickaxe

        //below this line are the axe tools
        GameRegistry.registerItem(axeCopper = new AxeMod("axeCopper", CopperAxe), "axeCopper");

        //below this line are the hoe tools
        GameRegistry.registerItem(hoeCopper = new HoeMod("hoeCopper", CopperHoe), "hoeCopper");

        //below this line are the sword weapon tools
        GameRegistry.registerItem(swordCopper = new SwordMod("swordCopper", CopperSword), "swordCopper");

        //below this line are the shovel tools
        GameRegistry.registerItem(shovelCopper = new ShovelMod("shovelCopper", CopperShovel), "shovelCopper");
        //below this line is the copper armor groups
        // helmet
        GameRegistry.registerItem(helmetCopper = new ItemModArmor("helmetCopper", CopperArmor, 1, EntityEquipmentSlot.HEAD), "helmetCopper");

        // ChestPlate
        GameRegistry.registerItem(chestplateCopper = new ItemModArmor("chestplateCopper", CopperArmor, 1, EntityEquipmentSlot.CHEST), "chestplateCopper");
        // Leggings
        GameRegistry.registerItem(leggingsCopper = new ItemModArmor("leggingsCopper", CopperArmor, 2, EntityEquipmentSlot.LEGS), "leggingsCopper");
        // Boots
        GameRegistry.registerItem(bootsCopper = new ItemModArmor("bootsCopper", CopperArmor, 1, EntityEquipmentSlot.FEET), "bootsCopper");
    }
}

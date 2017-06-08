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
/**
 * Created by Juho on 3.9.2016.
 */
public class Hammers {
    public static Item hammerBronze;
    //below this line are the hammer materials
    public static ToolMaterial BronzeHammer = EnumHelper.addToolMaterial("BronzeHammer", 0, 500, 5.0F, 4.0F, 12);

    public static void createItems() {
        //below this line are the hammer tools
        GameRegistry.registerItem(hammerBronze = new HammerMod("hammerBronze", BronzeHammer), "hammerBronze"); //Bronze Hammer Alpha 0.0.10b
    }
    }

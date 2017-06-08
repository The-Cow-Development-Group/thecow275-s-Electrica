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
    public static Item hammerbronze;
    //below this line are the hammer materials
    public static ToolMaterial bronzehammer = EnumHelper.addToolMaterial("bronzehammer", 0, 500, 5.0F, 4.0F, 12);

    public static void createItems() {
        //below this line are the hammer tools
        GameRegistry.registerItem(hammerbronze = new HammerMod("hammerbronze", bronzehammer), "hammerbronze"); //bronze hammer Alpha 0.0.10b
    }
}


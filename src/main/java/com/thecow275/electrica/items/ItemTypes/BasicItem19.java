package com.thecow275.electrica.items.ItemTypes;


import com.thecow275.electrica.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BasicItem19 extends Item{
    public BasicItem19(String UnRegisteredName) {
        setRegistryName(UnRegisteredName);
        setUnlocalizedName(Main.MODID + UnRegisteredName);
        setCreativeTab(CreativeTabs.MATERIALS);
        GameRegistry.register(this);

    }

}

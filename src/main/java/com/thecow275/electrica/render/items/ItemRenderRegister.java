package com.thecow275.electrica.render.items;

import com.thecow275.electrica.Main;
import com.thecow275.electrica.items.Items.Hammers;
import com.thecow275.electrica.items.Items.Ingots;
import com.thecow275.electrica.items.Items.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {
	
	public static void registerItemRenderer(){
		// ingot item render register
		//reg(Ingots.ingotTin);
		// reg(Ingots.ingotcopper);
        reg(Ingots.ingotbronze);
        reg(Ingots.ingotsilver);
        // blah blah item render register
		reg(ModItems.pickaxecopper);
		reg(ModItems.axecopper);
		reg(ModItems.helmetcopper);
		reg(ModItems.chestplatecopper);
        reg(ModItems.bootscopper);
        reg(ModItems.leggingscopper);
		reg(Hammers.hammerbronze);
		reg(ModItems.hoecopper);
        reg(ModItems.swordcopper);
		reg(ModItems.shovelcopper);
		reg(ModItems.baseitem);
		reg(ModItems.basicitem);

        reg(Ingots.dustbronze);
	}
	public static String modid = Main.MODID;
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}

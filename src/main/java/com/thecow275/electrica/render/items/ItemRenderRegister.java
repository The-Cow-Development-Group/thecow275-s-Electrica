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
		// reg(Ingots.ingotCopper);
        reg(Ingots.ingotBronze);
        reg(Ingots.ingotSilver);
        // blah blah item render register
		reg(ModItems.pickaxeCopper);
		reg(ModItems.axeCopper);
		reg(ModItems.helmetCopper);
		reg(ModItems.chestplateCopper);
        reg(ModItems.bootsCopper);
        reg(ModItems.leggingsCopper);
		reg(Hammers.hammerBronze);
		reg(ModItems.hoeCopper);
        reg(ModItems.swordCopper);
		reg(ModItems.shovelCopper);
		reg(ModItems.baseitem);
		reg(ModItems.basicitem);

        reg(Ingots.dustBronze);
	}
	public static String modid = Main.MODID;
	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}

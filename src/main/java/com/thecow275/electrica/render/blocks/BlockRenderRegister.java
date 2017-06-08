package com.thecow275.electrica.render.blocks;

import com.thecow275.electrica.blocks.ModBlocks;
import com.thecow275.electrica.Main;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class BlockRenderRegister {
	public static String modid = Main.MODID;
		public static void registerBlockRenderer(){
			reg(ModBlocks.orecopper);
			reg(ModBlocks.oretin);
			reg(ModBlocks.blockcopper);
			reg(ModBlocks.blockbronze);
			reg(ModBlocks.blocktin);
			reg(ModBlocks.reinforcedglassbronze);
			reg(ModBlocks.bronzeenrichedsand);
			reg(ModBlocks.oresilver);
            reg(ModBlocks.blocksilver);
		}
		public static void reg(Block block){
			Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
			.register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		}
}

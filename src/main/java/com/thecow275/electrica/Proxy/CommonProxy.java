package com.thecow275.electrica.Proxy;

import com.thecow275.electrica.Main;
import com.thecow275.electrica.blocks.ModBlocks;
import com.thecow275.electrica.crafting.ModCrafting;
import com.thecow275.electrica.items.Items.Hammers;
import com.thecow275.electrica.items.Items.Ingots;
import com.thecow275.electrica.items.Items.ModItems;
import com.thecow275.electrica.world.thecow275WorldGen;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import	net.minecraftforge.fml.common.event.FMLInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy extends Main {

	public void preInit(FMLPreInitializationEvent e){
		ModItems.init();
		ModItems.createItems();
		Hammers.createItems();
		Ingots.createItems();
		ModBlocks.createBlocks();
	}
	public void Init(FMLInitializationEvent e){
	 ModCrafting.initCrafting();
	 GameRegistry.registerWorldGenerator(new thecow275WorldGen(), 0);
	}
	public void postInit(FMLPostInitializationEvent e){
		
	}

	public void registerItemRenderer(Item item, int meta, String id) {

	}
}

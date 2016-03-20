package com.thecow275mod.mod.items;

import com.thecow275mod.mod.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ElectricaItems {
	public static Item ingot_copper;


	public static void init() {
		ingot_copper = new Item().setUnlocalizedName("ingot_copper").setCreativeTab(CreativeTabs.tabMaterials);
	}
	public static void register(){
		GameRegistry.registerItem(ingot_copper, ingot_copper .getUnlocalizedName().substring(5));
	}
	public static void registerRenders(){
		registerRender(ingot_copper);
	}
public static void registerRender(Item item){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory" ));
		
	}
	
}

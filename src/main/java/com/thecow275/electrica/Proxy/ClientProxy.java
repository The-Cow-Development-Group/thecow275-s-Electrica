package com.thecow275.electrica.Proxy;
import com.thecow275.electrica.Main;
import com.thecow275.electrica.items.BaseItem1102.ItemModelProvider;
import com.thecow275.electrica.render.blocks.BlockRenderRegister;
import com.thecow275.electrica.render.items.ItemRenderRegister;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import com.thecow275.electrica.items.BaseItem1102.ModItems1102;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import	net.minecraftforge.fml.common.event.FMLInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
    @Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){

	    super.preInit(event);

            ModItems1102.init();

        }

	@Override
	public void Init(FMLInitializationEvent e){
		super.Init(e);
		ItemRenderRegister.registerItemRenderer();
		BlockRenderRegister.registerBlockRenderer();


	}
	@Override
	public void postInit(FMLPostInitializationEvent e){
		super.postInit(e);
	}

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Main.MODID + ":" + id, "inventory"));
	}
}

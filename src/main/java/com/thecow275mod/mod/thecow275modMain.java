package com.thecow275mod.mod;
import com.thecow275mod.mod.items.ElectricaItems;
import com.thecow275mod.mod.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class thecow275modMain {

@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
public static CommonProxy proxy;
@EventHandler
public void preInit(FMLPreInitializationEvent Event) {
	
}

@EventHandler
public void init(FMLInitializationEvent event) {
	ElectricaItems.init();
	ElectricaItems.register();
}

@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

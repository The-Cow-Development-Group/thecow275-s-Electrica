package com.thecow275.electrica;

import com.thecow275.electrica.Proxy.CommonProxy;
import  net.minecraftforge.fml.common.Mod;
import  net.minecraftforge.fml.common.Mod.EventHandler;
import  net.minecraftforge.fml.common.Mod.Instance;
import	net.minecraftforge.fml.common.SidedProxy;
import	net.minecraftforge.fml.common.event.FMLInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import	net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION, updateJSON = "https://raw.githubusercontent.com/thecow275/OpenElectrica/master/update.json")
public class Main {

	public static final String MODID = "electrica";
	public static final String MODNAME = "Electrica";
	public static final String VERSION = "Alpha 0.4.0a";
	@SidedProxy(clientSide="com.thecow275.electrica.Proxy.ClientProxy",
			serverSide="com.thecow275.electrica.Proxy.ServerProxy")
	public static CommonProxy proxy;
	@Instance(MODID)
	public static Main instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e){
		System.out.println(MODNAME + " is PreIniting");
		proxy.preInit(e);
	}
	@EventHandler
	public void Init(FMLInitializationEvent e){
		proxy.Init(e);
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent e){
		proxy.postInit(e);
	}



}

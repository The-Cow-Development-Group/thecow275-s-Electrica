package com.thecow275.electrica.blocks;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public final class ModBlocks {

	public static Block orecopper;
	public static Block oretin;
	public static Block blockcopper;
    public static Block blocktin;
    public static Block blockbronze;
    public static Block reinforcedglassbronze;
	public static Block bronzeenrichedsand;
	public static Block oresilver;
    public static Block blocksilver;

	
	public static void createBlocks(){
	GameRegistry.registerBlock(orecopper = new BasicBlock("orecopper").setLightLevel(0.0f), "orecopper");
	GameRegistry.registerBlock(oretin = new BasicBlock("oretin").setLightLevel(0.0f), "oretin");
	GameRegistry.registerBlock(blockcopper = new BasicBlock("blockcopper").setLightLevel(0.0f), "blockcopper");
        GameRegistry.registerBlock(blocktin = new BasicBlock("blocktin"), "blocktin");
	GameRegistry.registerBlock(blockbronze = new BasicBlock("blockbronze"), "blockbronze");
		GameRegistry.registerBlock(bronzeenrichedsand = new BasicBlock("bronzeenrichedsand"), "bronzeenrichedsand");
		GameRegistry.registerBlock(reinforcedglassbronze = new SeeTroughBlock("reinforcedglassbronze"), "reinforcedglassbronze");
        GameRegistry.registerBlock(oresilver = new BasicBlock("oresilver"), "oresilver");
        GameRegistry.registerBlock(blocksilver = new BasicBlock("blocksilver"), "blocksilver");

        OreDictionary.registerOre("orecopper", orecopper);
        OreDictionary.registerOre("oretins", oretin);
        OreDictionary.registerOre("oresilver", oresilver);
        OreDictionary.registerOre("blockcopper", blockcopper);
        OreDictionary.registerOre("blocktin", blocktin);
        OreDictionary.registerOre("blockbronze", blockbronze);
        OreDictionary.registerOre("blocksilver", blocksilver);
        OreDictionary.registerOre("reinforcedglassbronze", reinforcedglassbronze);
        OreDictionary.registerOre("bronzeenrichedsand", bronzeenrichedsand);
    }
}

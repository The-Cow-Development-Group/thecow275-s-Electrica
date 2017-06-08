package com.thecow275.electrica.crafting;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import static com.thecow275.electrica.blocks.ModBlocks.*;
import static com.thecow275.electrica.items.BaseItem1102.ModItems1102.ingotcopper;
import static com.thecow275.electrica.items.BaseItem1102.ModItems1102.ingottin;
import static com.thecow275.electrica.items.Items.Hammers.*;
import static com.thecow275.electrica.items.Items.Ingots.*;
import static com.thecow275.electrica.items.BaseItem1102.ModItems1102.*;
import static com.thecow275.electrica.items.Items.ModItems.*;


public final class ModCrafting {
	public static void initCrafting(){
		//shapeless recipe for making  Copper Block out of four Copper Ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(ingotbronze,
                "***",
                "***",
                "***",
                '*', "dustbronze"));

        GameRegistry.addRecipe(new ShapedOreRecipe(blocktin,
			"###",
			"###",
			"###",
			'#', "ingottin"));
        GameRegistry.addRecipe(new ShapedOreRecipe(blockbronze,
                "###",
                "###",
                "###",
                '#', "ingotbronze"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotcopper,9), new Object[]{
            "blockCopper"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotbronze,9), new Object[]{
            "blockbronze"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingottin,9), new Object[]{
            "blockTin"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotsilver,9), new Object[]{
            "blocksilver"
        }));
	// shaped recipe for making Copper Ore out of 3 iron ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(orecopper,
			"#  ",
			" # ",
			"  #",
			'#', "blockDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(hoecopper,
				"aa ",
				" b ",
				" b ",
				'a', "ingotcopper", 'b', "stickWood"));

		GameRegistry.addRecipe(new ShapedOreRecipe(swordcopper,
				" a ",
				" a ",
				" b ",
				'a', "ingotcopper", 'b', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(shovelcopper,
				" a ",
				" b ",
				" b ",
				'a', "ingotcopper", 'b', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(pickaxecopper,
			"aaa",
			" b ",
			" b ",
			'a', "ingotcopper", 'b', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(axecopper,
			"aa ",
			"ab ",
			" b ",
			'a', "ingotcopper", 'b', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(blockcopper,
			"ddd",
			"ddd",
			"ddd",
			'd', "ingotcopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(blocksilver,
                "###",
                "###",
                "###",
                '#', "ingotsilver"));
        GameRegistry.addRecipe(new ShapedOreRecipe(hammerbronze,
                "AAA",
                "AVA",
                " V ",
                'A', "ingotbronze", 'V', "stickWood"
                ));
       // GameRegistry.addRecipe(new ShapelessOreRecipe(ingotbronze,
       //         "dd",
       //         "ad",
       //         'd', "ingotCopper", 'a', "ingotTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotbronze,4), new Object[]{
                "ingotcopper", "ingottin", "ingotcopper", "ingotcopper"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(dustbronze,9), new Object[]{
            "ingotbronze"
        }));
        GameRegistry.addRecipe(new ShapedOreRecipe(helmetcopper,
                "ddd",
                "d d",
                "   ",
                'd', "ingotcopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(chestplatecopper,
                "d d",
                "ddd",
                "ddd",
                'd', "ingotcopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(leggingscopper,
				"ddd",
				"d d",
				"d d",
				'd', "ingotcopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(bootscopper,
				"   ",
				"d d",
				"d d",
				'd', "ingotcopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.SADDLE,
				"aaa",
		        "ada",
		        "isi",
		        'd', "blockDiamond", 'a', "leather", 'i', "ingotIron", 's', "gemEmerald"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(bronzeenrichedsand,
                "aba",
                "bab",
                "aba",
                'a', "sand", 'b', "ingotbronze"));
	// smelting recipe for making copper ingots out of copper ore
	GameRegistry.addSmelting(orecopper, new ItemStack(ingotcopper), 1.0f);
	GameRegistry.addSmelting(oretin, new ItemStack(ingottin), 1.0f);
    GameRegistry.addSmelting(bronzeenrichedsand, new ItemStack(reinforcedglassbronze), 20.0f);
        GameRegistry.addSmelting(oresilver, new ItemStack(ingotsilver), 1.0f);


	}
	}

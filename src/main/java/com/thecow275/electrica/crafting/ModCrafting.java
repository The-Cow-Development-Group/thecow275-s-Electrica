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
        GameRegistry.addRecipe(new ShapedOreRecipe(ingotBronze,
                "***",
                "***",
                "***",
                '*', "dustBronze"));

        GameRegistry.addRecipe(new ShapedOreRecipe(blockTin,
			"###",
			"###",
			"###",
			'#', "ingottin"));
        GameRegistry.addRecipe(new ShapedOreRecipe(blockBronze,
                "###",
                "###",
                "###",
                '#', "ingotBronze"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotcopper,9), new Object[]{
            "blockCopper"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotBronze,9), new Object[]{
            "blockBronze"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingottin,9), new Object[]{
            "blockTin"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotSilver,9), new Object[]{
            "blockSilver"
        }));
	// shaped recipe for making Copper Ore out of 3 iron ingots
        GameRegistry.addRecipe(new ShapedOreRecipe(oreCopper,
			"#  ",
			" # ",
			"  #",
			'#', "blockDiamond"));
		GameRegistry.addRecipe(new ShapedOreRecipe(hoeCopper,
				"aa ",
				" b ",
				" b ",
				'a', "ingotcopper", 'b', "stickWood"));

		GameRegistry.addRecipe(new ShapedOreRecipe(swordCopper,
				" a ",
				" a ",
				" b ",
				'a', "ingotcopper", 'b', "stickWood"));
		GameRegistry.addRecipe(new ShapedOreRecipe(shovelCopper,
				" a ",
				" b ",
				" b ",
				'a', "ingotcopper", 'b', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(pickaxeCopper,
			"aaa",
			" b ",
			" b ",
			'a', "ingotcopper", 'b', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(axeCopper,
			"aa ",
			"ab ",
			" b ",
			'a', "ingotcopper", 'b', "stickWood"));
        GameRegistry.addRecipe(new ShapedOreRecipe(blockCopper,
			"ddd",
			"ddd",
			"ddd",
			'd', "ingotcopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(blockSilver,
                "###",
                "###",
                "###",
                '#', "ingotSilver"));
        GameRegistry.addRecipe(new ShapedOreRecipe(hammerBronze,
                "AAA",
                "AVA",
                " V ",
                'A', "ingotBronze", 'V', "stickWood"
                ));
       // GameRegistry.addRecipe(new ShapelessOreRecipe(ingotBronze,
       //         "dd",
       //         "ad",
       //         'd', "ingotCopper", 'a', "ingotTin"));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ingotBronze,4), new Object[]{
                "ingotcopper", "ingottin", "ingotcopper", "ingotcopper"
        }));
        GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(dustBronze,9), new Object[]{
            "ingotBronze"
        }));
        GameRegistry.addRecipe(new ShapedOreRecipe(helmetCopper,
                "ddd",
                "d d",
                "   ",
                'd', "ingotcopper"));
        GameRegistry.addRecipe(new ShapedOreRecipe(chestplateCopper,
                "d d",
                "ddd",
                "ddd",
                'd', "ingotcopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(leggingsCopper,
				"ddd",
				"d d",
				"d d",
				'd', "ingotcopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(bootsCopper,
				"   ",
				"d d",
				"d d",
				'd', "ingotcopper"));
		GameRegistry.addRecipe(new ShapedOreRecipe(Items.SADDLE,
				"aaa",
		        "ada",
		        "isi",
		        'd', "blockDiamond", 'a', "leather", 'i', "ingotIron", 's', "gemEmerald"));
	    GameRegistry.addRecipe(new ShapedOreRecipe(BronzeEnrichedSand,
                "aba",
                "bab",
                "aba",
                'a', "sand", 'b', "ingotBronze"));
	// smelting recipe for making copper ingots out of copper ore
	GameRegistry.addSmelting(oreCopper, new ItemStack(ingotcopper), 1.0f);
	GameRegistry.addSmelting(oreTin, new ItemStack(ingottin), 1.0f);
    GameRegistry.addSmelting(BronzeEnrichedSand, new ItemStack(reinforcedGlassBronze), 20.0f);
        GameRegistry.addSmelting(oreSilver, new ItemStack(ingotSilver), 1.0f);


	}
	}

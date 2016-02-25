package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;




@Mod(modid = ExampleMod.MODID,name="Oeasy", version = "1.0")
public class ExampleMod
{
	public static final String MODID = "generic";
	public static Item item1;
	public static Item genericIngot;
	public final static Block genericDirt = new GenericBlock(Material.ground)
    .setHardness(0.5F).setStepSound(Block.soundTypeGravel)
    .setUnlocalizedName("genericDirt").setCreativeTab(CreativeTabs.tabBlock);
	public final static Block genericOre = new GenericOre(Material.rock);

    @Instance(value = ExampleMod.MODID) //Tell Forge what instance to use.
    public static ExampleMod instance;

	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
    	System.out.println("DIRT BLOCK >> "+Blocks.dirt.getUnlocalizedName());
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
            item1 = new GenericItem();
            GameRegistry.registerItem(item1, "item1");
            
            genericIngot = new GenericItem().setMaxStackSize(16).setUnlocalizedName("genericIngot");
            GameRegistry.registerItem(genericIngot, "genericIngot");
    
            GameRegistry.registerBlock(genericDirt, "genericDirt");
    
            //MinecraftForge..setBlockHarvestLevel(genericOre, "pickaxe", 3);
            GameRegistry.registerBlock(genericOre, "genericOre");
    
    }
    
}

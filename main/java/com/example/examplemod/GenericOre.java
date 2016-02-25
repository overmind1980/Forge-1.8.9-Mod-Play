package com.example.examplemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class GenericOre extends Block 
{
        public GenericOre(Material material) 
        {
                super(material);
                setHardness(4.0F); // 33% harder than diamond
                setStepSound(Block.soundTypePiston); // sounds got renamed, look in Block class for what blocks have what sounds
                setUnlocalizedName("genericOre"); // changed in 1.7
                setCreativeTab(CreativeTabs.tabBlock);
        }
        //If the block's drop is an item.
        @Override
        public boolean removedByPlayer(World world, BlockPos pos, EntityPlayer player, boolean willHarvest)
        {
            //return world.setBlockToAir(pos);
        	
        	//Entity entityIn = new EntityCow(world);
        	//world.setSpawnPoint(pos);
            world.rainingStrength ++;
        	return true;
        }
        
}
package com.example.examplemod.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.example.examplemod.ExampleMod;

public final class ItemRenderRegister {

	public static void registerItemRenderer() {
		reg(ModItems.tutorialItem);
	}

	//==========================================================================

	public static String modid = ExampleMod.MODID;

	public static void reg(Item item) {
		System.out.print("\nRegisting -===="+modid + ":" + item.getUnlocalizedName().substring(5)+"============\n");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modid + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		System.out.print("\nAfter Registing -===="+modid + ":" + item.getUnlocalizedName().substring(5)+"============\n");
		ModelBakery.addVariantName(item, "examplemod:tutorial_item");

	}
}

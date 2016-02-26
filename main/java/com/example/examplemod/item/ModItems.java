package com.example.examplemod.item;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.GenericItem;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class ModItems {

	public static Item tutorialItem;

	public static void createItems() {
		tutorialItem = new GenericItem();
		GameRegistry.registerItem(tutorialItem, "tutorial_item");
	}

}

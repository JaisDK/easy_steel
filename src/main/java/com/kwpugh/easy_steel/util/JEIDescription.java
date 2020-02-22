package com.kwpugh.easy_steel.util;

import com.kwpugh.easy_steel.EasySteel;
import com.kwpugh.easy_steel.lists.ItemList;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class JEIDescription implements IModPlugin
{
	static ResourceLocation plugin = new ResourceLocation(EasySteel.modid, "plugin");

	@Override
	public ResourceLocation getPluginUid()
	{
		return plugin;
	}

	@Override
	public void registerRecipes(IRecipeRegistration registry)
	{
		registry.addIngredientInfo(new ItemStack(ItemList.crack_hammer), VanillaTypes.ITEM, 
				"item.easy_steel.crack_hammer.jei.line1",
				" ",
				"item.easy_steel.crack_hammer.jei.line2",
				" ",
				"item.easy_steel.crack_hammer.jei.line3",
				" ",
				"item.easy_steel.crack_hammer.jei.line4");

		registry.addIngredientInfo(new ItemStack(ItemList.hand_shovel), VanillaTypes.ITEM, 
				" ",
				"item.easy_steel.hand_shovel.jei.line1",
				" ",
				"item.easy_steel.hand_shovel.jei.line2",
				" ",
				"item.easy_steel.hand_shovel.jei.line3",
				" ",
				"item.easy_steel.hand_shovel.jei.line4");
				
		registry.addIngredientInfo(new ItemStack(ItemList.sharp_flint), VanillaTypes.ITEM, 
				"item.easy_steel.sharp_flint.jei.line1",
				" ",
				"item.easy_steel.sharp_flint.jei.line2",
				" ",
				"item.easy_steel.sharp_flint.jei.line3");
	}
}
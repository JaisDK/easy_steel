//package com.kwpugh.easy_steel.items.bronze;
//
//import java.util.List;
//
//import javax.annotation.Nullable;
//
//import com.kwpugh.easy_steel.init.ItemInit;
//
//import net.minecraft.client.util.ITooltipFlag;
//import net.minecraft.item.HoeItem;
//import net.minecraft.item.IItemTier;
//import net.minecraft.item.ItemStack;
//import net.minecraft.util.text.ITextComponent;
//import net.minecraft.util.text.TextFormatting;
//import net.minecraft.util.text.TranslationTextComponent;
//import net.minecraft.world.World;
//import net.minecraftforge.api.distmarker.Dist;
//import net.minecraftforge.api.distmarker.OnlyIn;
//
//public class BronzeHoe extends HoeItem
//{
//	public BronzeHoe(IItemTier tier, float attackSpeedIn, Properties builder)
//	{
//		super(tier, attackSpeedIn, builder);
//	}
//
//	@Override
//	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
//	{
//		return true;
//	}
//
//	@Override
//	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
//	{
//		return repair.getItem() == ItemInit.BRONZE_INGOT.get();
//	}
//	
//	@OnlyIn(Dist.CLIENT)
//	public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn)
//	{
//		super.addInformation(stack, worldIn, tooltip, flagIn);
//		tooltip.add((new TranslationTextComponent("item.easy_steel.bronze.line1").func_240699_a_(TextFormatting.GREEN)));
//	}
//}

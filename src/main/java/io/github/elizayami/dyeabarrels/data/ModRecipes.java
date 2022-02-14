package io.github.elizayami.dyeabarrels.data;

import java.util.function.Consumer;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.init.BlockInit;
import io.github.elizayami.dyeabarrels.init.TagInit;
import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;

public class ModRecipes extends RecipeProvider
{
	public ModRecipes(DataGenerator generatorIn) 
	{
		super(generatorIn);
	}
	
	private ResourceLocation rl(String s) 
	{
		return new ResourceLocation(Dyeabarrels.MOD_ID, s);
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) 
	{
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.BLACK.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.BLACK_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("black_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.BLUE.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.BLUE_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("blue_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.CYAN.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.CYAN_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("cyan_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.GRAY.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.GRAY_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("gray_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.GREEN.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.GREEN_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("green_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.LIGHTBLUE.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.LIGHT_BLUE_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("light_blue_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.LIGHTGRAY.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.LIGHT_GRAY_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("light_gray_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.LIME.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.LIME_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("lime_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.MAGENTA.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.MAGENTA_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("magenta_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.ORANGE.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.ORANGE_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("orange_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.PINK.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.PINK_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.PURPLE.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.PURPLE_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("pink_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.RED.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.RED_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("red_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(BlockInit.WHITE.barrel.get(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.WHITE_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("white_dyeabarrel_from_barrel"));
		ShapelessRecipeBuilder.shapelessRecipe(Blocks.BARREL.asItem(), 1).addIngredient(TagInit.DYE_BARRELS_ITEM).addIngredient(Items.BROWN_DYE).addCriterion("has_item", hasItem(Blocks.BARREL)).build(consumer, rl("barrel_from_dyeabarrel"));

	}
}

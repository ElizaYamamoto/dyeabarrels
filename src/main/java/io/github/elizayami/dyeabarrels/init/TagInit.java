package io.github.elizayami.dyeabarrels.init;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class TagInit 
{
	public static final ITag.INamedTag<Block> DYE_BARRELS = makeModBlockTag("dye_barrels");

	public static final ITag.INamedTag<Item> DYE_BARRELS_ITEM = makeModItemTag("dye_barrels_item");
	
	public static ITag.INamedTag<Block> makeModBlockTag(final String name) 
	{
		return BlockTags.makeWrapperTag(new ResourceLocation(Dyeabarrels.MOD_ID, name).toString());
	}
	
	public static ITag.INamedTag<Item> makeModItemTag(final String name) 
	{
		return ItemTags.makeWrapperTag(new ResourceLocation(Dyeabarrels.MOD_ID, name).toString());
	}
}

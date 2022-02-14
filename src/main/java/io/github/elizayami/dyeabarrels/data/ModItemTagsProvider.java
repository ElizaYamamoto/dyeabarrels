package io.github.elizayami.dyeabarrels.data;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.init.BlockInit;
import io.github.elizayami.dyeabarrels.init.TagInit;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemTagsProvider extends ItemTagsProvider
{
	public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper)
	{
		super(dataGenerator, blockTagProvider, Dyeabarrels.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerTags()
	{
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.RED.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.ORANGE.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.YELLOW.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.LIME.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.GREEN.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.CYAN.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.LIGHTBLUE.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.BLUE.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.PURPLE.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.MAGENTA.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.PINK.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.GRAY.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.LIGHTGRAY.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.BLACK.barrel.get().asItem());
		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(BlockInit.WHITE.barrel.get().asItem());

		getOrCreateBuilder(TagInit.DYE_BARRELS_ITEM).add(Blocks.BARREL.asItem());
	}
}

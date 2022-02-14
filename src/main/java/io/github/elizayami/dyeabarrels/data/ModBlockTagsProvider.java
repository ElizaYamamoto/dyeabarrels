package io.github.elizayami.dyeabarrels.data;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.init.BlockInit;
import io.github.elizayami.dyeabarrels.init.TagInit;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockTagsProvider extends BlockTagsProvider
{
	public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) 
	{
		super(generatorIn, Dyeabarrels.MOD_ID, existingFileHelper);
	}

	@Override
	protected void registerTags() 
	{
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.RED.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.ORANGE.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.YELLOW.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.LIME.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.GREEN.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.CYAN.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.LIGHTBLUE.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.BLUE.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.PURPLE.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.MAGENTA.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.PINK.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.GRAY.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.LIGHTGRAY.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.BLACK.barrel.get());
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(BlockInit.WHITE.barrel.get());
		
		getOrCreateBuilder(TagInit.DYE_BARRELS).add(Blocks.BARREL);
	}
}

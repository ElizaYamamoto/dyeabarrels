package io.github.elizayami.dyeabarrels.init;

import java.util.function.Supplier;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.barrels.DyeabarrelBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class BarrelRegistry
{
	public final String name;

	public final RegistryObject<Block> barrel;

	public BarrelRegistry(String name)
	{
		this.name = name;

		AbstractBlock.Properties materialPlanksNotSolid = AbstractBlock.Properties.create(Material.WOOD)
				.hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD).notSolid();

		barrel = registerBlockWithBurnItem(name + "_barrel", () -> new DyeabarrelBlock(materialPlanksNotSolid), 300);
	}

	private <T extends Block> RegistryObject<T> registerBlockWithBurnItem(String name,
			Supplier<? extends T> blockSupplier, int burnTime)
	{
		RegistryObject<T> block = BlockInit.BLOCKS.register(name, blockSupplier);
		BlockInit.ITEMS.register(name,
				() -> new BlockItem(block.get(), new Item.Properties().group(Dyeabarrels.barrelGroup))
				{
					public int getBurnTime(net.minecraft.item.ItemStack itemStack)
					{
						return burnTime;
					};
				});
		return block;
	}
}

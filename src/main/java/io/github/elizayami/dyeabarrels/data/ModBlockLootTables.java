package io.github.elizayami.dyeabarrels.data;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlockLootTables extends BlockLootTables
{
	@Override
	protected Iterable<Block> getKnownBlocks()
	{
		return StreamSupport.stream(ForgeRegistries.BLOCKS.spliterator(), false)
				.filter(entry -> entry.getRegistryName() != null
						&& entry.getRegistryName().getNamespace().equals(Dyeabarrels.MOD_ID))
				.collect(Collectors.toSet());
	}

	@Override
	protected void addTables()
	{
		registerDropSelfLootTable(BlockInit.RED.barrel.get());
		registerDropSelfLootTable(BlockInit.ORANGE.barrel.get());
		registerDropSelfLootTable(BlockInit.YELLOW.barrel.get());
		registerDropSelfLootTable(BlockInit.LIME.barrel.get());
		registerDropSelfLootTable(BlockInit.GREEN.barrel.get());
		registerDropSelfLootTable(BlockInit.CYAN.barrel.get());
		registerDropSelfLootTable(BlockInit.LIGHTBLUE.barrel.get());
		registerDropSelfLootTable(BlockInit.BLUE.barrel.get());
		registerDropSelfLootTable(BlockInit.PURPLE.barrel.get());
		registerDropSelfLootTable(BlockInit.MAGENTA.barrel.get());
		registerDropSelfLootTable(BlockInit.PINK.barrel.get());
		registerDropSelfLootTable(BlockInit.GRAY.barrel.get());
		registerDropSelfLootTable(BlockInit.LIGHTGRAY.barrel.get());
		registerDropSelfLootTable(BlockInit.BLACK.barrel.get());
		registerDropSelfLootTable(BlockInit.WHITE.barrel.get());
	}
}

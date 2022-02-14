package io.github.elizayami.dyeabarrels.init;

import java.util.List;

import com.google.common.collect.Lists;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.barrels.DyeabarrelTileEntity;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class TileEntityInit
{
	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister
			.create(ForgeRegistries.TILE_ENTITIES, Dyeabarrels.MOD_ID);

	public final static RegistryObject<TileEntityType<DyeabarrelTileEntity>> BARREL = TILE_ENTITY_TYPES.register(
			"barrel", () -> TileEntityType.Builder.create(DyeabarrelTileEntity::new, getBarrels()).build(null));

	static Block[] getBarrels()
	{
		List<Block> result = Lists.newArrayList();
		BlockInit.ITEMS.getEntries().forEach((item) ->
		{
			if (item.get() instanceof BlockItem)
			{
				Block block = ((BlockItem) item.get()).getBlock();
				if (block instanceof BarrelBlock)
				{
					result.add(block);
				}
			}
		});
		return result.toArray(new Block[]
		{});
	}
}
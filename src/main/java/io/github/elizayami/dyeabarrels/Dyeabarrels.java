package io.github.elizayami.dyeabarrels;

import io.github.elizayami.dyeabarrels.init.BlockInit;
import io.github.elizayami.dyeabarrels.init.TileEntityInit;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("dyeabarrels")
public class Dyeabarrels
{
	public static final String MOD_ID = "dyeabarrels";

	public Dyeabarrels()
	{
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		BlockInit.ITEMS.register(modEventBus);
		BlockInit.BLOCKS.register(modEventBus);
		
		TileEntityInit.TILE_ENTITY_TYPES.register(modEventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static final ItemGroup barrelGroup = new barrelGroup("barreltab");

	public static class barrelGroup extends ItemGroup
	{

		public barrelGroup(String label)
		{
			super(label);
		}

		@Override
		public ItemStack createIcon()
		{
			return new ItemStack(BlockInit.PURPLE.barrel.get());
		}
	}
}

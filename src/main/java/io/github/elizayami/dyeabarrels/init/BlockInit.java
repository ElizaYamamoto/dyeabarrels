package io.github.elizayami.dyeabarrels.init;

import java.util.ArrayList;
import java.util.List;
import io.github.elizayami.dyeabarrels.Dyeabarrels;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Dyeabarrels.MOD_ID);

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Dyeabarrels.MOD_ID);

	private static List<BarrelRegistry> barrels = null;
	
	public static final BarrelRegistry RED = createBarrels("red");
	public static final BarrelRegistry ORANGE = createBarrels("orange");
	public static final BarrelRegistry YELLOW = createBarrels("yellow");
	public static final BarrelRegistry LIME = createBarrels("lime");
	public static final BarrelRegistry GREEN = createBarrels("green");
	public static final BarrelRegistry CYAN = createBarrels("cyan");
	public static final BarrelRegistry LIGHTBLUE = createBarrels("light_blue");
	public static final BarrelRegistry BLUE = createBarrels("blue");
	public static final BarrelRegistry PURPLE = createBarrels("purple");
	public static final BarrelRegistry MAGENTA = createBarrels("magenta");
	public static final BarrelRegistry PINK = createBarrels("pink");
	public static final BarrelRegistry GRAY = createBarrels("gray");
	public static final BarrelRegistry LIGHTGRAY = createBarrels("light_gray");
	public static final BarrelRegistry BLACK = createBarrels("black");
	public static final BarrelRegistry WHITE = createBarrels("white");

	public static BarrelRegistry createBarrels(String name)
	{
		if (barrels == null)
			barrels = new ArrayList<>();

		BarrelRegistry material = new BarrelRegistry(name);
		barrels.add(material);
		return material;
	}

}

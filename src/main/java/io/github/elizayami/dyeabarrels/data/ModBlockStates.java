package io.github.elizayami.dyeabarrels.data;

import io.github.elizayami.dyeabarrels.Dyeabarrels;
import io.github.elizayami.dyeabarrels.init.BarrelRegistry;
import io.github.elizayami.dyeabarrels.init.BlockInit;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.Direction;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStates extends BlockStateProvider
{
	public ModBlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) 
	{
		super(gen, Dyeabarrels.MOD_ID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() 
	{
		registerBarrelStates(BlockInit.WHITE, "white");
		registerBarrelStates(BlockInit.ORANGE, "orange");
		registerBarrelStates(BlockInit.MAGENTA, "magenta");
		registerBarrelStates(BlockInit.LIGHTBLUE, "light_blue");
		registerBarrelStates(BlockInit.YELLOW, "yellow");
		registerBarrelStates(BlockInit.LIME, "lime");
		registerBarrelStates(BlockInit.PINK, "pink");
		registerBarrelStates(BlockInit.GRAY, "gray");
		registerBarrelStates(BlockInit.LIGHTGRAY, "light_gray");
		registerBarrelStates(BlockInit.CYAN, "cyan");
		registerBarrelStates(BlockInit.PURPLE, "purple");
		registerBarrelStates(BlockInit.BLUE, "blue");
		registerBarrelStates(BlockInit.GREEN, "green");
		registerBarrelStates(BlockInit.RED, "red");
		registerBarrelStates(BlockInit.BLACK, "black");
	}
	
	private void registerBarrelStates(BarrelRegistry material, String name)
	{
		barrelBlock(material.barrel.get(), name);
		final ModelFile model = models().getExistingFile(material.barrel.get().getRegistryName());
		simpleBlockItem(material.barrel.get(), model);
	}
    
    private void barrelBlock(Block block, String color)
    {
    	ModelFile open = models().withExistingParent(color + "_barrel_open", mcLoc("block/cube_bottom_top"))
    			.texture("top", modLoc("block/" + color + "_barrel_top_open"))
    			.texture("bottom", modLoc("block/" + color + "_barrel_bottom"))
    			.texture("side", modLoc("block/" + color + "_barrel_side"));
    	ModelFile closed = models().withExistingParent(color + "_barrel", mcLoc("block/cube_bottom_top"))
    			.texture("top", modLoc("block/" + color + "_barrel_top"))
    			.texture("bottom", modLoc("block/" + color + "_barrel_bottom"))
    			.texture("side", modLoc("block/" + color + "_barrel_side"));
        getVariantBuilder(block)
        .forAllStates(state -> {
           boolean opened = state.get(BarrelBlock.PROPERTY_OPEN);
           Direction dir = state.get(BarrelBlock.PROPERTY_FACING);
           int x = 0;
           int y = 0;
           switch (dir) {
           case DOWN:
        	   x = 180;
        	   break;
           case EAST:
        	   x = 90;
        	   y = 90;
        	   break;
           case NORTH:
        	   x = 90;
        	   break;
           case SOUTH:
        	   x = 90;
        	   y = 180;
        	   break;
           case UP:
        	   break;
           case WEST:
        	   x = 90;
        	   y = 270;
        	   break;
           }
           
           return ConfiguredModel.builder()
           .modelFile(opened ? open : closed)
           .rotationX(x)
           .rotationY(y)
           .build();
        });
    }
}

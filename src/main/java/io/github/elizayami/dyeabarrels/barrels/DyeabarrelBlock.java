package io.github.elizayami.dyeabarrels.barrels;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.piglin.PiglinTasks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class DyeabarrelBlock extends BarrelBlock
{
	public DyeabarrelBlock(AbstractBlock.Properties properties)
	{
		super(properties);
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn)
	{
		return new DyeabarrelTileEntity();
	}

	@Override
	public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit)
	{
		if (world.isRemote)
		{
			return ActionResultType.SUCCESS;
		}
		else
		{
			TileEntity blockEntity = world.getTileEntity(pos);
			if (blockEntity instanceof DyeabarrelTileEntity)
			{
				player.openContainer((DyeabarrelTileEntity) blockEntity);
				player.addStat(Stats.OPEN_BARREL);
				PiglinTasks.func_234478_a_(player, true);
			}

			return ActionResultType.CONSUME;
		}
	}

	@Override
	public void tick(BlockState state, ServerWorld world, BlockPos pos, Random rand)
	{
		TileEntity blockEntity = world.getTileEntity(pos);
		if (blockEntity instanceof DyeabarrelTileEntity)
		{
			((DyeabarrelTileEntity) blockEntity).tick();
		}
	}

	@Override
	public BlockRenderType getRenderType(BlockState state)
	{
		return BlockRenderType.MODEL;
	}

	@Override
	public void onBlockPlacedBy(World world, BlockPos pos, BlockState state, @Nullable LivingEntity placer,
			ItemStack stack)
	{
		if (stack.hasDisplayName())
		{
			TileEntity blockEntity = world.getTileEntity(pos);
			if (blockEntity instanceof DyeabarrelTileEntity)
			{
				((DyeabarrelTileEntity) blockEntity).setCustomName(stack.getDisplayName());
			}
		}
	}
}

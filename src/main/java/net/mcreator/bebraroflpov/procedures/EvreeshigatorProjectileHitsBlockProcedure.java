package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

public class EvreeshigatorProjectileHitsBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(new BlockPos(x, y + 1, z), Blocks.LAVA.defaultBlockState(), 3);
		for (int index0 = 0; index0 < 25; index0++) {
			world.setBlock(new BlockPos(x + Mth.nextDouble(RandomSource.create(), 1, 10), y + 1, z + Mth.nextDouble(RandomSource.create(), 1, 10)), Blocks.FIRE.defaultBlockState(), 3);
		}
	}
}

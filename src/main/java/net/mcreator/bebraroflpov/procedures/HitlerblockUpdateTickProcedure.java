package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.bebraroflpov.init.BebraRoflPovModEntities;
import net.mcreator.bebraroflpov.init.BebraRoflPovModBlocks;
import net.mcreator.bebraroflpov.entity.YaykoEntity;

public class HitlerblockUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y, z + 2))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x, y, z + 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x, y, z - 2))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x, y, z - 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y, z + 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 2, y, z + 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x + 3, y, z + 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 1, y, z - 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x - 2, y, z - 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 3, y, z - 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 2, y, z))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x + 3, y, z))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 3, y, z - 1))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x + 3, y, z - 2))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x + 3, y, z - 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x - 3, y, z + 1))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()
				&& (world.getBlockState(new BlockPos(x - 3, y, z + 2))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get() && (world.getBlockState(new BlockPos(x - 3, y, z + 3))).getBlock() == BebraRoflPovModBlocks.HITLERBLOCK.get()) {
			world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z + 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z + 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y, z + 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 3, y, z + 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 1, y, z - 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 2, y, z - 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 3, y, z - 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 1, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 2, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 3, y, z), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 3, y, z - 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 3, y, z - 2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x + 3, y, z - 3), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 3, y, z + 1), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 3, y, z + 2), Blocks.AIR.defaultBlockState(), 3);
			world.setBlock(new BlockPos(x - 3, y, z + 3), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new YaykoEntity(BebraRoflPovModEntities.YAYKO.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				world.addFreshEntity(entityToSpawn);
			}
		}
	}
}

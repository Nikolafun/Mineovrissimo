package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.network.chat.Component;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class GazachildrenRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.isClientSide() && world.getServer() != null)
			world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Nigger will explode in 60 seconds"), false);
		BebraRoflPovMod.queueServerWork(1200, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 1, Explosion.BlockInteraction.BREAK);
		});
	}
}

package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class AdolfHitlerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		BebraRoflPovMod.queueServerWork(20, () -> {
			if (world instanceof ServerLevel _level) {
				System.out.println(entity.getStringUUID());
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"scale add pehkui:height 2 " + entity.getStringUUID());
			}
			if (world instanceof ServerLevel _level) {
				System.out.println(entity.getStringUUID());
				_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
						"scale add pehkui:width 2 " + entity.getStringUUID());
			}
		});
	}
}

package net.mcreator.bebraroflpov.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class PetergrifinOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		BebraRoflPovMod.queueServerWork(50, () -> {
			BebraRoflPovMod.queueServerWork(20, () -> {
				if (Math.random() < 0.3) {
					if (world instanceof ServerLevel _level) {
						System.out.println(entity.getStringUUID());
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"scale subtract pehkui:height 0.1 " + entity.getStringUUID());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:lobotomywoks")), SoundSource.NEUTRAL, (float) 0.1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:lobotomywoks")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
						}
					}
				} else if (Math.random() < 0.45) {
					if (world instanceof ServerLevel _level) {
						System.out.println(entity.getStringUUID());
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"scale add pehkui:height 0.1 " + entity.getStringUUID());
					}
				}
			});
			BebraRoflPovMod.queueServerWork(20, () -> {
				if (Math.random() < 0.2) {
					if (world instanceof ServerLevel _level) {
						System.out.println(entity.getStringUUID());
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"scale add pehkui:width 0.3 " + entity.getStringUUID());
					}
				} else if (Math.random() < 0) {
					if (world instanceof ServerLevel _level) {
						System.out.println(entity.getStringUUID());
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"scale subtract pehkui:width 0.1 " + entity.getStringUUID());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:lobotomywoks")), SoundSource.NEUTRAL, (float) 0.1, 1);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:lobotomywoks")), SoundSource.NEUTRAL, (float) 0.1, 1, false);
						}
					}
				}
			});
			BebraRoflPovMod.queueServerWork(20, () -> {
				if (Math.random() < 0.11) {
					if (world instanceof ServerLevel _level) {
						System.out.println(entity.getStringUUID());
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"scale reset " + entity.getStringUUID());
					}
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:subcribe1")), SoundSource.NEUTRAL, 1, 7);
						} else {
							_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:subcribe1")), SoundSource.NEUTRAL, 1, 7, false);
						}
					}
				}
			});
		});
	}
}

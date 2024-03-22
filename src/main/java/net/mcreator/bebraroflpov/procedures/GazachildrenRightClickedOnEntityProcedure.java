package net.mcreator.bebraroflpov.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.bebraroflpov.init.BebraRoflPovModParticleTypes;
import net.mcreator.bebraroflpov.init.BebraRoflPovModBlocks;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class GazachildrenRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 100; index0++) {
			if (true) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Nigger will explode in 60 seconds"), false);
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (BebraRoflPovModParticleTypes.ZIGHAIL.get()), x, y, z, 100, 1, 1, 1, 10);
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:niggers")), SoundSource.VOICE, 100, 20);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("bebra_rofl_pov:niggers")), SoundSource.VOICE, 100, 20, false);
					}
				}
				BebraRoflPovMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level) {
						System.out.println(entity.getStringUUID());
						_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(0, 0, 0), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
								"scale subtract pehkui:height 10 " + entity.getStringUUID());
					}
					BebraRoflPovMod.queueServerWork(20, () -> {
						if (world instanceof Level _level && !_level.isClientSide())
							_level.explode(null, x, y, z, 100, Explosion.BlockInteraction.BREAK);
						if (world instanceof Level _level && !_level.isClientSide()) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(BebraRoflPovModBlocks.HITLERBLOCK.get()));
							entityToSpawn.setPickUpDelay(10);
							_level.addFreshEntity(entityToSpawn);
						}
					});
				});
			}
		}
	}
}

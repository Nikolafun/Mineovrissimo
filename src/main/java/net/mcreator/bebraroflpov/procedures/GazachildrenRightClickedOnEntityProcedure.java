package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.bebraroflpov.init.BebraRoflPovModParticleTypes;
import net.mcreator.bebraroflpov.init.BebraRoflPovModBlocks;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class GazachildrenRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND) {
			if (!world.isClientSide() && world.getServer() != null)
				world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Nigger will explode in 60 seconds"), false);
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (BebraRoflPovModParticleTypes.ZIGHAIL.get()), x, y, z, 100, 1, 1, 1, 10);
			BebraRoflPovMod.queueServerWork(120, () -> {
				if (world instanceof Level _level && !_level.isClientSide())
					_level.explode(null, x, y, z, 100, Explosion.BlockInteraction.BREAK);
				if (world instanceof Level _level && !_level.isClientSide()) {
					ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(BebraRoflPovModBlocks.HITLERBLOCK.get()));
					entityToSpawn.setPickUpDelay(10);
					_level.addFreshEntity(entityToSpawn);
				}
			});
		}
	}
}

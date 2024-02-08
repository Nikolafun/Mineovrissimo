package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.entity.Entity;

public class EvreeshigatorProjectileHitsBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(10);
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.bebraroflpov.entity.HamasEntity;
import net.mcreator.bebraroflpov.entity.EvreeshigatorEntity;
import net.mcreator.bebraroflpov.entity.AK47Entity;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class BebraRoflPovModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BebraRoflPovMod.MODID);
	public static final RegistryObject<EntityType<HamasEntity>> HAMAS = register("hamas",
			EntityType.Builder.<HamasEntity>of(HamasEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamasEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AK47Entity>> AK_47 = register("projectile_ak_47",
			EntityType.Builder.<AK47Entity>of(AK47Entity::new, MobCategory.MISC).setCustomClientFactory(AK47Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EvreeshigatorEntity>> EVREESHIGATOR = register("projectile_evreeshigator",
			EntityType.Builder.<EvreeshigatorEntity>of(EvreeshigatorEntity::new, MobCategory.MISC).setCustomClientFactory(EvreeshigatorEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HamasEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HAMAS.get(), HamasEntity.createAttributes().build());
	}
}

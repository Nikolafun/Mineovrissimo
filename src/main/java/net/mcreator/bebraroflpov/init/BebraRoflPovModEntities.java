
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

import net.mcreator.bebraroflpov.entity.YaykoEntity;
import net.mcreator.bebraroflpov.entity.PetergrifinEntity;
import net.mcreator.bebraroflpov.entity.MaksimkatsEntity;
import net.mcreator.bebraroflpov.entity.HamascreeperEntity;
import net.mcreator.bebraroflpov.entity.Hamasak47Entity;
import net.mcreator.bebraroflpov.entity.HamasEntity;
import net.mcreator.bebraroflpov.entity.GazachildrenEntity;
import net.mcreator.bebraroflpov.entity.EvreiEntity;
import net.mcreator.bebraroflpov.entity.EvreeszigatoradolfEntity;
import net.mcreator.bebraroflpov.entity.EvreeshigatorEntity;
import net.mcreator.bebraroflpov.entity.AdolfHitlerEntity;
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
	public static final RegistryObject<EntityType<EvreiEntity>> EVREI = register("evrei",
			EntityType.Builder.<EvreiEntity>of(EvreiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(EvreiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<HamascreeperEntity>> HAMASCREEPER = register("hamascreeper",
			EntityType.Builder.<HamascreeperEntity>of(HamascreeperEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(HamascreeperEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<YaykoEntity>> YAYKO = register("yayko",
			EntityType.Builder.<YaykoEntity>of(YaykoEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(YaykoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<Hamasak47Entity>> HAMASAK_47 = register("hamasak_47",
			EntityType.Builder.<Hamasak47Entity>of(Hamasak47Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(Hamasak47Entity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<AdolfHitlerEntity>> ADOLF_HITLER = register("adolf_hitler", EntityType.Builder.<AdolfHitlerEntity>of(AdolfHitlerEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AdolfHitlerEntity::new).fireImmune().sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<MaksimkatsEntity>> MAKSIMKATS = register("maksimkats",
			EntityType.Builder.<MaksimkatsEntity>of(MaksimkatsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MaksimkatsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GazachildrenEntity>> GAZACHILDREN = register("gazachildren",
			EntityType.Builder.<GazachildrenEntity>of(GazachildrenEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GazachildrenEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<EvreeszigatoradolfEntity>> EVREESZIGATORADOLF = register("projectile_evreeszigatoradolf", EntityType.Builder.<EvreeszigatoradolfEntity>of(EvreeszigatoradolfEntity::new, MobCategory.MISC)
			.setCustomClientFactory(EvreeszigatoradolfEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PetergrifinEntity>> PETERGRIFIN = register("petergrifin",
			EntityType.Builder.<PetergrifinEntity>of(PetergrifinEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PetergrifinEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			HamasEntity.init();
			EvreiEntity.init();
			HamascreeperEntity.init();
			YaykoEntity.init();
			Hamasak47Entity.init();
			AdolfHitlerEntity.init();
			MaksimkatsEntity.init();
			GazachildrenEntity.init();
			PetergrifinEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(HAMAS.get(), HamasEntity.createAttributes().build());
		event.put(EVREI.get(), EvreiEntity.createAttributes().build());
		event.put(HAMASCREEPER.get(), HamascreeperEntity.createAttributes().build());
		event.put(YAYKO.get(), YaykoEntity.createAttributes().build());
		event.put(HAMASAK_47.get(), Hamasak47Entity.createAttributes().build());
		event.put(ADOLF_HITLER.get(), AdolfHitlerEntity.createAttributes().build());
		event.put(MAKSIMKATS.get(), MaksimkatsEntity.createAttributes().build());
		event.put(GAZACHILDREN.get(), GazachildrenEntity.createAttributes().build());
		event.put(PETERGRIFIN.get(), PetergrifinEntity.createAttributes().build());
	}
}

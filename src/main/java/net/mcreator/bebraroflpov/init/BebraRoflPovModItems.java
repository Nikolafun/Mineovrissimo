
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.bebraroflpov.item.HitlerItem;
import net.mcreator.bebraroflpov.item.HamasheadItem;
import net.mcreator.bebraroflpov.item.GazaItem;
import net.mcreator.bebraroflpov.item.EvreeshigatorItem;
import net.mcreator.bebraroflpov.item.DvorecvgelendshikeItem;
import net.mcreator.bebraroflpov.item.AK47Item;
import net.mcreator.bebraroflpov.item.AK47AmmoItem;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BebraRoflPovMod.MODID);
	public static final RegistryObject<Item> HAMAS_SPAWN_EGG = REGISTRY.register("hamas_spawn_egg", () -> new ForgeSpawnEggItem(BebraRoflPovModEntities.HAMAS, -13408768, -13428224, new Item.Properties().tab(BebraRoflPovModTabs.TAB_CREATIVE_TAB)));
	public static final RegistryObject<Item> DVORECVGELENDSHIKE = REGISTRY.register("dvorecvgelendshike", () -> new DvorecvgelendshikeItem());
	public static final RegistryObject<Item> GAZA = REGISTRY.register("gaza", () -> new GazaItem());
	public static final RegistryObject<Item> COMPRESSEDBEAF = block(BebraRoflPovModBlocks.COMPRESSEDBEAF, BebraRoflPovModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> AK_47_AMMO = REGISTRY.register("ak_47_ammo", () -> new AK47AmmoItem());
	public static final RegistryObject<Item> IA_DYR_IA_VYIPIDORAS = block(BebraRoflPovModBlocks.IA_DYR_IA_VYIPIDORAS, null);
	public static final RegistryObject<Item> AK_47 = REGISTRY.register("ak_47", () -> new AK47Item());
	public static final RegistryObject<Item> EVREESHIGATOR = REGISTRY.register("evreeshigator", () -> new EvreeshigatorItem());
	public static final RegistryObject<Item> EVREI_SPAWN_EGG = REGISTRY.register("evrei_spawn_egg", () -> new ForgeSpawnEggItem(BebraRoflPovModEntities.EVREI, -1, -1, new Item.Properties().tab(BebraRoflPovModTabs.TAB_CREATIVE_TAB)));
	public static final RegistryObject<Item> HAMASCREEPER_SPAWN_EGG = REGISTRY.register("hamascreeper_spawn_egg",
			() -> new ForgeSpawnEggItem(BebraRoflPovModEntities.HAMASCREEPER, -16737997, -26368, new Item.Properties().tab(BebraRoflPovModTabs.TAB_CREATIVE_TAB)));
	public static final RegistryObject<Item> HAMASHEAD = REGISTRY.register("hamashead", () -> new HamasheadItem());
	public static final RegistryObject<Item> BANDERIK = block(BebraRoflPovModBlocks.BANDERIK, BebraRoflPovModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> YAYKO_SPAWN_EGG = REGISTRY.register("yayko_spawn_egg", () -> new ForgeSpawnEggItem(BebraRoflPovModEntities.YAYKO, -1, -13312, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> HITLER = REGISTRY.register("hitler", () -> new HitlerItem());
	public static final RegistryObject<Item> HITLERBLOCK = block(BebraRoflPovModBlocks.HITLERBLOCK, BebraRoflPovModTabs.TAB_CREATIVE_TAB);
	public static final RegistryObject<Item> HAMASAK_47_SPAWN_EGG = REGISTRY.register("hamasak_47_spawn_egg", () -> new ForgeSpawnEggItem(BebraRoflPovModEntities.HAMASAK_47, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> ADOLF_HITLER_SPAWN_EGG = REGISTRY.register("adolf_hitler_spawn_egg",
			() -> new ForgeSpawnEggItem(BebraRoflPovModEntities.ADOLF_HITLER, -52429, -13434829, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

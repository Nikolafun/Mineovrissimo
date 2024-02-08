
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

import net.mcreator.bebraroflpov.item.GazaItem;
import net.mcreator.bebraroflpov.item.DvorecvgelendshikeItem;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BebraRoflPovMod.MODID);
	public static final RegistryObject<Item> HAMAS_SPAWN_EGG = REGISTRY.register("hamas_spawn_egg", () -> new ForgeSpawnEggItem(BebraRoflPovModEntities.HAMAS, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> DVORECVGELENDSHIKE = REGISTRY.register("dvorecvgelendshike", () -> new DvorecvgelendshikeItem());
	public static final RegistryObject<Item> GAZA = REGISTRY.register("gaza", () -> new GazaItem());
	public static final RegistryObject<Item> COMPRESSEDBEAF = block(BebraRoflPovModBlocks.COMPRESSEDBEAF, CreativeModeTab.TAB_DECORATIONS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}

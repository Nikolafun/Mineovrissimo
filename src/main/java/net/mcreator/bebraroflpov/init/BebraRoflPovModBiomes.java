
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.biome.Biome;

import net.mcreator.bebraroflpov.world.biome.GazadesertBiome;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModBiomes {
	public static final DeferredRegister<Biome> REGISTRY = DeferredRegister.create(ForgeRegistries.BIOMES, BebraRoflPovMod.MODID);
	public static final RegistryObject<Biome> GAZADESERT = REGISTRY.register("gazadesert", GazadesertBiome::createBiome);
}

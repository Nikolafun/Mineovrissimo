
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, BebraRoflPovMod.MODID);
	public static final RegistryObject<PaintingVariant> TRAHATLUKUM = REGISTRY.register("trahatlukum", () -> new PaintingVariant(48, 48));
}

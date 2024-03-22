
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BebraRoflPovMod.MODID);
	public static final RegistryObject<SimpleParticleType> ZIGHAIL = REGISTRY.register("zighail", () -> new SimpleParticleType(false));
}

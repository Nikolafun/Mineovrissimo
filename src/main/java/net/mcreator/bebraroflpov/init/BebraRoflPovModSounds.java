
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, BebraRoflPovMod.MODID);
	public static final RegistryObject<SoundEvent> GOVNIDA = REGISTRY.register("govnida", () -> new SoundEvent(new ResourceLocation("bebra_rofl_pov", "govnida")));
	public static final RegistryObject<SoundEvent> AK_FIRE = REGISTRY.register("ak_fire", () -> new SoundEvent(new ResourceLocation("bebra_rofl_pov", "ak_fire")));
	public static final RegistryObject<SoundEvent> ALLAH = REGISTRY.register("allah", () -> new SoundEvent(new ResourceLocation("bebra_rofl_pov", "allah")));
	public static final RegistryObject<SoundEvent> PODLAYA_MUSICA = REGISTRY.register("podlaya_musica", () -> new SoundEvent(new ResourceLocation("bebra_rofl_pov", "podlaya_musica")));
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.bebraroflpov.block.GazaPortalBlock;
import net.mcreator.bebraroflpov.block.CompressedbeafBlock;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BebraRoflPovMod.MODID);
	public static final RegistryObject<Block> GAZA_PORTAL = REGISTRY.register("gaza_portal", () -> new GazaPortalBlock());
	public static final RegistryObject<Block> COMPRESSEDBEAF = REGISTRY.register("compressedbeaf", () -> new CompressedbeafBlock());
}

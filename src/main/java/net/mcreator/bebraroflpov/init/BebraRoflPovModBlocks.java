
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.bebraroflpov.block.IaDYRIaVYIPIDORASBlock;
import net.mcreator.bebraroflpov.block.HitlerblockBlock;
import net.mcreator.bebraroflpov.block.GazaPortalBlock;
import net.mcreator.bebraroflpov.block.CompressedbeafBlock;
import net.mcreator.bebraroflpov.block.BanderikBlock;
import net.mcreator.bebraroflpov.BebraRoflPovMod;

public class BebraRoflPovModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, BebraRoflPovMod.MODID);
	public static final RegistryObject<Block> GAZA_PORTAL = REGISTRY.register("gaza_portal", () -> new GazaPortalBlock());
	public static final RegistryObject<Block> COMPRESSEDBEAF = REGISTRY.register("compressedbeaf", () -> new CompressedbeafBlock());
	public static final RegistryObject<Block> IA_DYR_IA_VYIPIDORAS = REGISTRY.register("ia_dyr_ia_vyipidoras", () -> new IaDYRIaVYIPIDORASBlock());
	public static final RegistryObject<Block> BANDERIK = REGISTRY.register("banderik", () -> new BanderikBlock());
	public static final RegistryObject<Block> HITLERBLOCK = REGISTRY.register("hitlerblock", () -> new HitlerblockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			BanderikBlock.blockColorLoad(event);
		}
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bebraroflpov.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.bebraroflpov.client.renderer.HamascreeperRenderer;
import net.mcreator.bebraroflpov.client.renderer.HamasRenderer;
import net.mcreator.bebraroflpov.client.renderer.EvreiRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BebraRoflPovModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(BebraRoflPovModEntities.HAMAS.get(), HamasRenderer::new);
		event.registerEntityRenderer(BebraRoflPovModEntities.AK_47.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BebraRoflPovModEntities.EVREESHIGATOR.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(BebraRoflPovModEntities.EVREI.get(), EvreiRenderer::new);
		event.registerEntityRenderer(BebraRoflPovModEntities.HAMASCREEPER.get(), HamascreeperRenderer::new);
	}
}

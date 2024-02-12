
package net.mcreator.bebraroflpov.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.bebraroflpov.entity.AdolfHitlerEntity;

public class AdolfHitlerRenderer extends HumanoidMobRenderer<AdolfHitlerEntity, HumanoidModel<AdolfHitlerEntity>> {
	public AdolfHitlerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR))));
	}

	@Override
	public ResourceLocation getTextureLocation(AdolfHitlerEntity entity) {
		return new ResourceLocation("bebra_rofl_pov:textures/entities/adolf_hitler.png");
	}
}

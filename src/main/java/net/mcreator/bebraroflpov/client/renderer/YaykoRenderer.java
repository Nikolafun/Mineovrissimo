
package net.mcreator.bebraroflpov.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.bebraroflpov.entity.YaykoEntity;
import net.mcreator.bebraroflpov.client.model.ModelYayko;

public class YaykoRenderer extends MobRenderer<YaykoEntity, ModelYayko<YaykoEntity>> {
	public YaykoRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelYayko(context.bakeLayer(ModelYayko.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(YaykoEntity entity) {
		return new ResourceLocation("bebra_rofl_pov:textures/entities/discord_jicp5ocotn.png");
	}
}

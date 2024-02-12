package net.mcreator.bebraroflpov.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.client.renderer.entity.EntityRenderDispatcher;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.Minecraft;

import net.mcreator.bebraroflpov.BebraRoflPovMod;

import com.mojang.math.Vector3f;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GazaPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, boolean renderable, double camX, double camY, double camZ, PoseStack pose) {
		if (entity == null || pose == null)
			return;
		BebraRoflPovMod.queueServerWork(20, () -> {
			if (entity instanceof LivingEntity _entity && !_entity.level.isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 2000000, 2));
			{
				Entity _entity = entity;
				if (_entity != null && renderable) {
					Minecraft _minecraft = Minecraft.getInstance();
					EntityRenderDispatcher _entityRenderDispatcher = _minecraft.getEntityRenderDispatcher();
					float _partialTick = _entity.isAddedToWorld() ? _minecraft.getPartialTick() : 0.0F;
					float _f0 = _entity.getViewYRot(_partialTick);
					PoseStack _poseStack = new PoseStack();
					MultiBufferSource.BufferSource _bufferSource = _minecraft.renderBuffers().bufferSource();
					boolean _b0 = _entityRenderDispatcher.shouldRenderHitBoxes();
					_entityRenderDispatcher.setRenderShadow(false);
					_entityRenderDispatcher.setRenderHitBoxes(false);
					pose.popPose();
					pose.pushPose();
					_poseStack.pushPose();
					_poseStack.mulPoseMatrix(pose.last().pose());
					_poseStack.translate(x - camX, y - camY, z - camZ);
					_poseStack.mulPose(Vector3f.YN.rotationDegrees(0));
					_poseStack.mulPose(Vector3f.XP.rotationDegrees(0));
					_poseStack.mulPose(Vector3f.ZN.rotationDegrees(0));
					float _size = 1;
					_poseStack.scale(_size, _size, _size);
					int _packedLight = (int) (1 << 20 | 1 << 4);
					PoseStack _modelViewStack = RenderSystem.getModelViewStack();
					_modelViewStack.popPose();
					_modelViewStack.pushPose();
					RenderSystem.applyModelViewMatrix();
					_entityRenderDispatcher.render(_entity, 0.0D, 0.0D, 0.0D, _f0, _partialTick, _poseStack, _bufferSource, _packedLight);
					_bufferSource.endBatch();
					_modelViewStack.popPose();
					_modelViewStack.pushPose();
					_modelViewStack.mulPoseMatrix(pose.last().pose());
					RenderSystem.applyModelViewMatrix();
					RenderSystem.enableDepthTest();
					_poseStack.popPose();
					_entityRenderDispatcher.setRenderHitBoxes(_b0);
				}
			}
		});
	}
}

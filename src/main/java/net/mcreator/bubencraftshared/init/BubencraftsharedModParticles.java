
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubencraftshared.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.Minecraft;

import net.mcreator.bubencraftshared.client.particle.SchinkenparticlesParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BubencraftsharedModParticles {
	@SubscribeEvent
	public static void registerParticles(ParticleFactoryRegisterEvent event) {
		Minecraft.getInstance().particleEngine.register((SimpleParticleType) BubencraftsharedModParticleTypes.SCHINKENPARTICLES.get(),
				SchinkenparticlesParticle::provider);
	}
}

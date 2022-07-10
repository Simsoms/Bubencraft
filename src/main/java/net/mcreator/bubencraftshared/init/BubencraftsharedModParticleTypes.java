
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubencraftshared.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.bubencraftshared.BubencraftsharedMod;

public class BubencraftsharedModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES,
			BubencraftsharedMod.MODID);
	public static final RegistryObject<ParticleType<?>> SCHINKENPARTICLES = REGISTRY.register("schinkenparticles",
			() -> new SimpleParticleType(false));
}

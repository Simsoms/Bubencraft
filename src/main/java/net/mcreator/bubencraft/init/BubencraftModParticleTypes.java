
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.bubencraft.BubencraftMod;

public class BubencraftModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, BubencraftMod.MODID);
	public static final RegistryObject<ParticleType<?>> SCHINKENPARTICLES = REGISTRY.register("schinkenparticles",
			() -> new SimpleParticleType(false));
}

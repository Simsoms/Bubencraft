
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubencraftshared.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bubencraftshared.item.SchinkennuggetzItem;
import net.mcreator.bubencraftshared.item.SchinkennuggetItem;
import net.mcreator.bubencraftshared.BubencraftsharedMod;

public class BubencraftsharedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BubencraftsharedMod.MODID);
	public static final RegistryObject<Item> SCHINKENNUGGETZ = REGISTRY.register("schinkennuggetz", () -> new SchinkennuggetzItem());
	public static final RegistryObject<Item> SCHINKENNUGGET = REGISTRY.register("schinkennugget", () -> new SchinkennuggetItem());
}

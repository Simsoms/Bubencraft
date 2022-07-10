
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.test.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.test.item.SchinkennuggetzItem;
import net.mcreator.test.item.SchinkennuggetItem;
import net.mcreator.test.TestMod;

public class TestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MODID);
	public static final RegistryObject<Item> SCHINKENNUGGETZ = REGISTRY.register("schinkennuggetz", () -> new SchinkennuggetzItem());
	public static final RegistryObject<Item> SCHINKENNUGGET = REGISTRY.register("schinkennugget", () -> new SchinkennuggetItem());
}

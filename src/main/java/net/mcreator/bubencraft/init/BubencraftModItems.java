
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bubencraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bubencraft.item.SchinkennuggetzItem;
import net.mcreator.bubencraft.item.SchinkennuggetItem;
import net.mcreator.bubencraft.BubencraftMod;

public class BubencraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BubencraftMod.MODID);
	public static final RegistryObject<Item> SCHINKENNUGGETZ = REGISTRY.register("schinkennuggetz", () -> new SchinkennuggetzItem());
	public static final RegistryObject<Item> SCHINKENNUGGET = REGISTRY.register("schinkennugget", () -> new SchinkennuggetItem());
}

package com.enderdevelopment.electricity.registry;

import com.enderdevelopment.electricity.ElectricityMod;
import com.enderdevelopment.electricity.block.WireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ElectricityMod.MOD_ID);

    public static final RegistryObject<Block> WIRE_BLOCK = BLOCKS.register("wire_block", () -> new WireBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)));
    public static final RegistryObject<Block> BATTERY_BLOCK = BLOCKS.register("battery_block", () -> new BatteryBlock(BlockBehaviour.Properties.of(Material.METAL).strength(0.5f)));
}
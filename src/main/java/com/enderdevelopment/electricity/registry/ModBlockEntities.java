package com.enderdevelopment.electricity.registry;

import com.enderdevelopment.electricity.ElectricityMod;
import com.enderdevelopment.electricity.block.entity.BatteryBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ElectricityMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<BatteryBlockEntity>> BATTERY_BLOCK_ENTITY = BLOCK_ENTITIES.register("battery_block_entity", () -> BlockEntityType.Builder.of(BatteryBlockEntity::new, ModBlocks.BATTERY_BLOCK.get()).build(null));
}
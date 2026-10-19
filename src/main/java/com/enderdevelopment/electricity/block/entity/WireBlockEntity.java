package com.enderdevelopment.electricity.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.nbt.CompoundTag;

public class WireBlockEntity extends BlockEntity {
    private boolean powerState;

    public WireBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WIRE_BLOCK_ENTITY.get(), pos, state);
    }

    public boolean getPowerState() {
        return powerState;
    }

    public void setPowerState(boolean powerState) {
        this.powerState = powerState;
        setChanged();
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.powerState = tag.getBoolean("PowerState");
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putBoolean("PowerState", powerState);
    }
}
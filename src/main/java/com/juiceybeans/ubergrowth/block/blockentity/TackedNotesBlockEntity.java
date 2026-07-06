package com.juiceybeans.ubergrowth.block.blockentity;

import com.juiceybeans.ubergrowth.init.UbergrowthBlockEntityTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class TackedNotesBlockEntity extends BlockEntity {
    public TackedNotesBlockEntity(BlockPos pos, BlockState state) {
        super(UbergrowthBlockEntityTypes.TACKED_NOTES, pos, state);
    }
}

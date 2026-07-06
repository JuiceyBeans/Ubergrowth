package com.juiceybeans.ubergrowth.block;

import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.MultifaceSpreader;

public class UbergrowthBlock extends MultifaceBlock {
    public UbergrowthBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public MultifaceSpreader getSpreader() {
        return null;
    }
}

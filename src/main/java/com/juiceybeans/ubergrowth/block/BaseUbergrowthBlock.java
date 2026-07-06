package com.juiceybeans.ubergrowth.block;

import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.MultifaceSpreader;

public class BaseUbergrowthBlock extends MultifaceBlock {

    public BaseUbergrowthBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public MultifaceSpreader getSpreader() {
        return null;
    }
}

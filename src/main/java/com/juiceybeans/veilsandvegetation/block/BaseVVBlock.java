package com.juiceybeans.veilsandvegetation.block;

import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.MultifaceSpreader;

public class BaseVVBlock extends MultifaceBlock {

    public BaseVVBlock(Properties properties) {
        super(properties.noOcclusion());
    }

    @Override
    public MultifaceSpreader getSpreader() {
        return null;
    }
}

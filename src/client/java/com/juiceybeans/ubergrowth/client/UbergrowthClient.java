package com.juiceybeans.ubergrowth.client;

import com.juiceybeans.ubergrowth.init.UbergrowthBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class UbergrowthClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        Set<Block> translucentBlocks = Set.of(
                UbergrowthBlocks.RUST,
                UbergrowthBlocks.DUST,
                UbergrowthBlocks.GRIME
        );

        translucentBlocks.forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent()));

        for (Block block : UbergrowthBlocks.blocks) {
            if (!translucentBlocks.contains(block)) BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
        }
	}
}
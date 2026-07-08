package com.juiceybeans.veilsandvegetation.client;

import com.juiceybeans.veilsandvegetation.client.gui.screens.inventory.TackedNotesScreen;
import com.juiceybeans.veilsandvegetation.init.VVBlocks;
import com.juiceybeans.veilsandvegetation.init.VVMenus;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class VeilsAndVegetationClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
        ScreenRegistry.register(VVMenus.TACKED_NOTES_MENU, TackedNotesScreen::new);

        Set<Block> translucentBlocks = Set.of(
                VVBlocks.RUST,
                VVBlocks.DUST,
                VVBlocks.GRIME
        );

        translucentBlocks.forEach(block -> BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.translucent()));

        for (Block block : VVBlocks.blocks) {
            if (!translucentBlocks.contains(block)) BlockRenderLayerMap.INSTANCE.putBlock(block, RenderType.cutout());
        }

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world != null && pos != null) {
                return BiomeColors.getAverageFoliageColor(world, pos);
            }

            return FoliageColor.getDefaultColor();
        },
                VVBlocks.OAK_FOLIAGE,
                VVBlocks.JUNGLE_FOLIAGE,
                VVBlocks.ACACIA_FOLIAGE,
                VVBlocks.DARK_OAK_FOLIAGE,
                VVBlocks.MANGROVE_FOLIAGE
        );

        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> {
            if (world != null && pos != null) {
                return BiomeColors.getAverageGrassColor(world, pos);
            }

            return GrassColor.getDefaultColor();
            },
                VVBlocks.GRASS_SHOOTS
        );
	}
}
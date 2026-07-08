package com.juiceybeans.veilsandvegetation.init;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class VVOxidizables {
    public static void registerOxidizables() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VVBlocks.COPPER_PLATING, VVBlocks.EXPOSED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VVBlocks.EXPOSED_COPPER_PLATING, VVBlocks.WEATHERED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VVBlocks.WEATHERED_COPPER_PLATING, VVBlocks.OXIDIZED_COPPER_PLATING);

        OxidizableBlocksRegistry.registerWaxableBlockPair(VVBlocks.COPPER_PLATING, VVBlocks.WAXED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VVBlocks.EXPOSED_COPPER_PLATING, VVBlocks.WAXED_EXPOSED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VVBlocks.WEATHERED_COPPER_PLATING, VVBlocks.WAXED_WEATHERED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VVBlocks.OXIDIZED_COPPER_PLATING, VVBlocks.WAXED_OXIDIZED_COPPER_PLATING);
    }
}

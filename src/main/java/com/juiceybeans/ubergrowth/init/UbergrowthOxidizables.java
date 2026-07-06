package com.juiceybeans.ubergrowth.init;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class UbergrowthOxidizables {
    public static void registerOxidizables() {
        OxidizableBlocksRegistry.registerOxidizableBlockPair(UbergrowthBlocks.COPPER_PLATING, UbergrowthBlocks.EXPOSED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(UbergrowthBlocks.EXPOSED_COPPER_PLATING, UbergrowthBlocks.WEATHERED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(UbergrowthBlocks.WEATHERED_COPPER_PLATING, UbergrowthBlocks.OXIDIZED_COPPER_PLATING);

        OxidizableBlocksRegistry.registerWaxableBlockPair(UbergrowthBlocks.COPPER_PLATING, UbergrowthBlocks.WAXED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerWaxableBlockPair(UbergrowthBlocks.EXPOSED_COPPER_PLATING, UbergrowthBlocks.WAXED_EXPOSED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerWaxableBlockPair(UbergrowthBlocks.WEATHERED_COPPER_PLATING, UbergrowthBlocks.WAXED_WEATHERED_COPPER_PLATING);
        OxidizableBlocksRegistry.registerWaxableBlockPair(UbergrowthBlocks.OXIDIZED_COPPER_PLATING, UbergrowthBlocks.WAXED_OXIDIZED_COPPER_PLATING);
    }
}

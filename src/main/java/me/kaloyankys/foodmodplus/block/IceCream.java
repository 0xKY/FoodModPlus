package me.kaloyankys.foodmodplus.block;

import net.minecraft.block.*;

public class IceCream extends SnowBlock {

    public IceCream(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(LAYERS, 1));
    }
}
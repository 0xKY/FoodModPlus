package me.kaloyankys.foodmodplus;

import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class PancakeStackBlock extends CakeBlock {

    public PancakeStackBlock(AbstractBlock.Settings settings) {
        super(settings);



    }
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.2f, 0f, 0.2f, 0.7f, 0.9f, 0.7f);
    }

}



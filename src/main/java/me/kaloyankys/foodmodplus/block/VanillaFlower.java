package me.kaloyankys.foodmodplus.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class VanillaFlower extends PlantBlock {
    public VanillaFlower(Settings FabricBlockSettings) {
        super(Settings.of(Material.PLANT).nonOpaque().strength(0f));
    }
@Override
public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
    return VoxelShapes.cuboid(0f, 0f, 0f, 0.9f, 0.3f, 0.9f);
    }
}
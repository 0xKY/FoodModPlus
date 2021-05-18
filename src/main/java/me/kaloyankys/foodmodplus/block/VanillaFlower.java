package me.kaloyankys.foodmodplus.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FlowerBlock;
import net.minecraft.potion.Effect;

/*import net.minecraft.block.Material;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

*/public class VanillaFlower extends FlowerBlock {
    public VanillaFlower(Effect effect, int effectDuration, Properties properties) {
        super(effect, effectDuration, properties);
    }
 /*   public VanillaFlower(Settings FabricBlockSettings) {
        super(Settings.of(Material.PLANT).nonOpaque().strength(0f));
    }
@Override
public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
    return VoxelShapes.cuboid(0f, 0f, 0f, 0.9f, 0.1f, 0.9f);
    }


    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.7D, 0.95D, 0.7D));
    }*/
}
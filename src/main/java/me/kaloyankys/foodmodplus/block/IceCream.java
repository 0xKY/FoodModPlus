package me.kaloyankys.foodmodplus.block;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;


public class IceCream extends SnowBlock {

    public IceCream() {
        super(Block.Properties.create(Material.SNOW_BLOCK)
                .hardnessAndResistance(2));
        this.setDefaultState((BlockState) ((BlockState) this.stateContainer.getBaseState()).with(LAYERS, 1));
    }
    public void onEntityCollision(BlockState state, World worldIn, BlockPos pos, Entity entityIn) {
        entityIn.setMotionMultiplier(state, new Vector3d(0.8D, 0.95D, 0.8D));
      //  dropStacks(state, worldIn, pos);
        worldIn.removeBlock(pos, false);
        worldIn.addParticle(ParticleTypes.FALLING_WATER, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.2D, (double)pos.getZ() + 0.5D, 3.0D, 0.0D, 0.0D);
    }
}

package me.kaloyankys.foodmodplus.block;

import net.minecraft.block.*;
import net.minecraft.entity.Entity;
/*import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

*/public class IceCream extends SnowBlock {
    public IceCream(Properties properties) {
        super(properties);
    }

  /*  public IceCream(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState) ((BlockState) this.stateManager.getDefaultState()).with(LAYERS, 1));
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        entity.slowMovement(state, new Vec3d(0.8D, 0.95D, 0.8D));
            dropStacks(state, world, pos);
            world.removeBlock(pos, false);
            world.addParticle(ParticleTypes.FALLING_WATER, (double)pos.getX() + 0.5D, (double)pos.getY() + 1.2D, (double)pos.getZ() + 0.5D, 3.0D, 0.0D, 0.0D);
    }*/
}

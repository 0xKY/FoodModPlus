package me.kaloyankys.foodmodplus.block;

import me.kaloyankys.foodmodplus.Foodmodplus;
import net.minecraft.block.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

import java.util.function.Consumer;

public class Pizza extends GourdBlock {


    public Pizza(Settings settings) {
        super(settings);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView view, BlockPos pos, ShapeContext context) {
        return VoxelShapes.cuboid(0.2f, 0f, 0.2f, 0.7f, 0.1f, 0.7f);
    }

    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getStackInHand(hand);
        if (itemStack.getItem() == Items.IRON_SWORD) {
            if (!world.isClient) {
                Direction direction = hit.getSide();
                Direction direction2 = direction.getAxis() == Direction.Axis.Y ? player.getHorizontalFacing().getOpposite() : direction;
                ItemEntity itemEntity = new ItemEntity(world, (double) pos.getX() + 0.5D + (double) direction2.getOffsetX() * 0.65D, (double) pos.getY() + 0.1D, (double) pos.getZ() + 0.5D + (double) direction2.getOffsetZ() * 0.65D, new ItemStack(Foodmodplus.PIZZA_ITEM, 4));
                itemEntity.setVelocity(0.05D * (double) direction2.getOffsetX() + world.random.nextDouble() * 0.02D, 0.05D, 0.05D * (double) direction2.getOffsetZ() + world.random.nextDouble() * 0.02D);
                world.spawnEntity(itemEntity);
                world.setBlockState(pos, (BlockState)Blocks.AIR.getDefaultState());
            }
                return ActionResult.success(world.isClient);
            } else {
                return super.onUse(state, world, pos, player, hand, hit);
            }
        }
    @Override
    public StemBlock getStem() {
        return null;
    }

    @Override
    public AttachedStemBlock getAttachedStem() {
        return null;
    }
}
package me.kaloyankys.foodmodplus.world.feature;

import com.mojang.serialization.Codec;
import me.kaloyankys.foodmodplus.Foodmodplus;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.StructureWorldAccess;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;

import java.util.Random;

public class VanillaFeature extends Feature {
    public VanillaFeature(Codec configCodec) {
        super(configCodec);
    }
    @Override
    public boolean generate(StructureWorldAccess world, ChunkGenerator generator, Random random, BlockPos pos,
                            FeatureConfig config) {
        BlockPos topPos = world.getTopPosition(Heightmap.Type.WORLD_SURFACE, pos);
        Direction offset = Direction.NORTH;

        int y = 0; {
            world.setBlockState(topPos.up(y), Foodmodplus.VANILLA_FLOWER.getDefaultState(), 1);
        }

        return true;
    }
}
package code.erikdev.enderrite.block.custom;

import code.erikdev.enderrite.block.EnderriteBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.DryVegetationBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ShortDryGrassBlock extends DryVegetationBlock {

    public ShortDryGrassBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(EnderriteBlocks.END_GRASS.get())
                || super.mayPlaceOn(state, level, pos);
    }
}
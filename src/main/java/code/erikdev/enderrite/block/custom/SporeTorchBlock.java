package code.erikdev.enderrite.block.custom;

import code.erikdev.enderrite.particle.EnderriteParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TorchBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SporeTorchBlock extends TorchBlock {

    public SporeTorchBlock(Properties properties) {
        super(
                EnderriteParticles.SPORE_PARTICLE.get(),
                properties
        );
    }

    @Override
    public void animateTick(
            BlockState state,
            Level level,
            BlockPos pos,
            RandomSource random
    ) {
        if (random.nextFloat() < 0.35F) {
            double x = pos.getX() + 0.5D
                    + (random.nextDouble() - 0.5D) * 0.25D;

            double y = pos.getY() + 0.65D
                    + random.nextDouble() * 0.25D;

            double z = pos.getZ() + 0.5D
                    + (random.nextDouble() - 0.5D) * 0.25D;

            double xd = (random.nextDouble() - 0.5D) * 0.01D;
            double yd = 0.01D + random.nextDouble() * 0.015D;
            double zd = (random.nextDouble() - 0.5D) * 0.01D;

            level.addParticle(
                    EnderriteParticles.SPORE_PARTICLE.get(),
                    x, y, z,
                    xd, yd, zd
            );
        }
    }
}
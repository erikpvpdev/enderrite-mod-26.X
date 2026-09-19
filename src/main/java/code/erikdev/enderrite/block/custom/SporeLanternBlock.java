package code.erikdev.enderrite.block.custom;

import code.erikdev.enderrite.particle.EnderriteParticles;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LanternBlock;
import net.minecraft.world.level.block.state.BlockState;

public class SporeLanternBlock extends LanternBlock {

    public SporeLanternBlock(Properties properties) {
        super(properties);
    }

    @Override
    public void animateTick(
            BlockState state,
            Level level,
            BlockPos pos,
            RandomSource random
    ) {
        // Die Laterne erzeugt häufiger Sporen
        if (random.nextFloat() < 0.65F) {

            double x = pos.getX() + 0.5D
                    + (random.nextDouble() - 0.5D) * 0.45D;

            double y = pos.getY() + 0.55D
                    + random.nextDouble() * 0.45D;

            double z = pos.getZ() + 0.5D
                    + (random.nextDouble() - 0.5D) * 0.45D;

            double xd = (random.nextDouble() - 0.5D) * 0.015D;
            double yd = 0.01D + random.nextDouble() * 0.025D;
            double zd = (random.nextDouble() - 0.5D) * 0.015D;

            level.addParticle(
                    EnderriteParticles.SPORE_PARTICLE.get(),
                    x,
                    y,
                    z,
                    xd,
                    yd,
                    zd
            );
        }
    }
}
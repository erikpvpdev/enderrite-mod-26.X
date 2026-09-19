package code.erikdev.enderrite.block.custom;

import code.erikdev.enderrite.particle.EnderriteParticles;
import net.minecraft.world.level.block.WallTorchBlock;

public class SporeWallTorchBlock extends WallTorchBlock {

    public SporeWallTorchBlock(Properties properties) {
        super(
                EnderriteParticles.SPORE_PARTICLE.get(),
                properties
        );
    }
}
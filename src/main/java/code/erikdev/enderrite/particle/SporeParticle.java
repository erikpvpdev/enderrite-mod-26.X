package code.erikdev.enderrite.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SingleQuadParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.util.RandomSource;

public class SporeParticle extends SingleQuadParticle {

    private final SpriteSet sprites;

    protected SporeParticle(
            ClientLevel level,
            double x,
            double y,
            double z,
            SpriteSet sprites
    ) {
        super(level, x, y, z, sprites.first());

        this.sprites = sprites;

        this.gravity = -0.015F;
        this.friction = 0.96F;
        this.hasPhysics = false;

        this.lifetime = 30 + this.random.nextInt(35);

        this.quadSize = 0.08F + this.random.nextFloat() * 0.06F;

        this.xd = (this.random.nextDouble() - 0.5D) * 0.015D;
        this.yd = 0.01D + this.random.nextDouble() * 0.025D;
        this.zd = (this.random.nextDouble() - 0.5D) * 0.015D;

        this.setColor(
                0.65F,
                1.0F,
                0.75F
        );

        this.setAlpha(0.85F);
    }

    @Override
    public void tick() {
        super.tick();

        // Leichtes zufälliges Schweben
        this.xd += (this.random.nextDouble() - 0.5D) * 0.002D;
        this.zd += (this.random.nextDouble() - 0.5D) * 0.002D;

        this.xd *= 0.98D;
        this.zd *= 0.98D;

        // Falls du später mehrere Spore-Texturen animieren möchtest
        this.setSpriteFromAge(this.sprites);
    }

    @Override
    protected Layer getLayer() {
        return Layer.TRANSLUCENT;
    }

    public static class Provider
            implements ParticleProvider<SimpleParticleType> {

        private final SpriteSet sprites;

        public Provider(SpriteSet sprites) {
            this.sprites = sprites;
        }

        @Override
        public Particle createParticle(
                SimpleParticleType type,
                ClientLevel level,
                double x,
                double y,
                double z,
                double xd,
                double yd,
                double zd,
                RandomSource random
        ) {
            return new SporeParticle(
                    level,
                    x,
                    y,
                    z,
                    this.sprites
            );
        }
    }
}
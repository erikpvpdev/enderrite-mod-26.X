package code.erikdev.enderrite.particle;

import code.erikdev.enderrite.EnderriteMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class EnderriteParticles {

    public static final DeferredRegister<ParticleType<?>> PARTICLE_TYPES =
            DeferredRegister.create(
                    BuiltInRegistries.PARTICLE_TYPE,
                    EnderriteMod.MOD_ID
            );

    public static final Supplier<SimpleParticleType> SPORE_PARTICLE =
            PARTICLE_TYPES.register(
                    "spore_particle",
                    () -> new SimpleParticleType(false)
            );
}
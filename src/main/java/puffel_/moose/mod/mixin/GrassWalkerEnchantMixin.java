package puffel_.moose.mod.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import puffel_.moose.mod.Registries.ModBlocks;

/* GrassWalker Enchant
 *
 * Player will receive the the floppy status effect
 * as they walk on Grass or Moose Grass
 */

@Mixin(ClientPlayerEntity.class)
public class GrassWalkerEnchantMixin {
	@Inject(at = @At("HEAD"), method = "tick")

	private void tick(CallbackInfo info) {
	    ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        BlockState standingOnBlockState = (BlockState) (Object) player.getEntityWorld().getBlockState((BlockPos) (Object) player.getPos());
        Block standingOnBlock = standingOnBlockState.getBlock();

        if(standingOnBlock == Blocks.GRASS_BLOCK || standingOnBlock == ModBlocks.MOOSE_GRASS) {
            // Temporary status effect
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 20, 3, false, false, false));

            // TODO: add Floppy status effect
            // player.addStatusEffect(new StatusEffectInstance(<Instance>));
        }
	}
}

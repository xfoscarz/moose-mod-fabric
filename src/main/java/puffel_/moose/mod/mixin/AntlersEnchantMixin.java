package puffel_.moose.mod.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

//THIS IS ACTUALLY GRASS WALKER ENCHANTMENT BUT I ACCIDENTALLY MADE IT CALLED ANTLERS ENCHANT
//IT WILL BE CHANGED SOON :D

@Mixin(ClientPlayerEntity.class)
public class AntlersEnchantMixin {
	@Inject(at = @At("HEAD"), method = "tick")
	private void tick(CallbackInfo info) {
	    ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
        BlockState standingOnBlockState = (BlockState) (Object) player.getEntityWorld().getBlockState((BlockPos) (Object) player.getPos());
        Block standingOnBlock = standingOnBlockState.getBlock();
        if(standingOnBlock == Blocks.GRASS_BLOCK) {
            //TODO: add Floppy status effect
            //player.addStatusEffect(new StatusEffectInstance(StatusEffects);
        }
	}
}

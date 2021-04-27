package puffel_.moose.mod.mixin;

import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/* Antlers Enchant
 *
 * Functionality not decided yet, but we plan on making
 * it similar to thorns, give suggestions here:
 *
 * https://github.com/ChezCoder/moose-mod-fabric/issues/new/choose
 */

@Mixin(ClientPlayerEntity.class)
public class AntlersEnchantMixin {
    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {
        ClientPlayerEntity player = (ClientPlayerEntity) (Object) this;
    }
}

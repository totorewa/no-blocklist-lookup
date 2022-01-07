package noblocklistlookup.mixins;

import net.minecraft.client.network.SocialInteractionsManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;

@Mixin(SocialInteractionsManager.class)
public class SocialInteractionsManagerMixin {
    @Inject(method = "loadBlockList", at = @At("HEAD"), cancellable = true)
    private void preventLoad(CallbackInfo ci) {
        ci.cancel();
    }

    @Inject(method = "isPlayerBlocked(Ljava/util/UUID;)Z", at = @At("HEAD"), cancellable = true)
    private void noPlayersBlocked(UUID uuid, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
        cir.cancel();
    }
}

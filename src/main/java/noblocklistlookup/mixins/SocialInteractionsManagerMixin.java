package noblocklistlookup.mixins;

import net.minecraft.client.network.SocialInteractionsManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.UUID;

@Mixin(SocialInteractionsManager.class)
public class SocialInteractionsManagerMixin {
    @Inject(method = "isPlayerBlocked(Ljava/util/UUID;)Z", at = @At("HEAD"), cancellable = true)
    private void disablePlayerBlocking(UUID uuid, CallbackInfoReturnable<Boolean> cir) {
        cir.setReturnValue(false);
    }
}

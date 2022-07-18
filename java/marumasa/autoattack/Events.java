package marumasa.autoattack;

import net.minecraft.client.Minecraft;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Events {

    private static final Logger logger = LogManager.getLogger();

    private static final Minecraft mc = Minecraft.getInstance();

    @SubscribeEvent
    public void tick(TickEvent.ClientTickEvent event) {
        if (mc.gameMode == null || mc.player == null || mc.crosshairPickEntity == null) return;
        if (!mc.options.keyAttack.isDown() || mc.player.getAttackStrengthScale(0) != 1) return;
        logger.info("attack");
        mc.gameMode.attack(mc.player, mc.crosshairPickEntity);
    }
}
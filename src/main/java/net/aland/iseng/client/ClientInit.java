package net.aland.iseng.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber(
    modid = "iseng",
    bus = EventBusSubscriber.Bus.MOD,
    value = Dist.CLIENT
)
public class ClientInit {

    public static void init() {
        NeoForge.EVENT_BUS.addListener(
            DayOverlayRenderer::register
        );
    }
}

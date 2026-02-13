package net.aland.iseng;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.DistExecutor;
import net.neoforged.neoforge.eventbus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod("iseng")
public class IsengMain {

    public IsengMain(IEventBus modBus) {

        // 클라이언트 전용 초기화는 CLIENT에서만 실행
        DistExecutor.safeRunWhenOn(
            Dist.CLIENT,
            () -> net.aland.iseng.client.ClientInit::init
        );
    }
}

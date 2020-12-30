package org.teacon.chromeball;

import net.minecraft.scoreboard.ScoreObjective;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;

@Mod(VoidBucket.MOD_ID)
@Mod.EventBusSubscriber
public class VoidBucket {
    public static final String MOD_ID = "voidbucket";

    public VoidBucket() {
    }

    @SubscribeEvent
    public static void onFMLServerStartingEvent(FMLServerStartingEvent event) {
    }


}

package org.teacon.chromeball;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Register {
    public static final Item VOID_BUCKET_ITEM = new VoidBucketItem(new Item.Properties().group(ItemGroup.MISC));

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {

        event.getRegistry().registerAll(
                VOID_BUCKET_ITEM.setRegistryName("void_bucket")
        );
    }

    @SubscribeEvent
    public static void registerEntity(RegistryEvent.Register<EntityType<?>> event) {

        event.getRegistry().registerAll(
        );
    }

    @SubscribeEvent
    public static void onCommonSetup(FMLCommonSetupEvent event) {
    }

}

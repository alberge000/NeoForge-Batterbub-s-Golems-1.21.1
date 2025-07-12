package net.batterbub.batterbubsgolems.item;

import net.batterbub.batterbubsgolems.GolemMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GolemMod.MOD_ID);

    public static final DeferredItem<Item> SPARK = ITEMS.register("spark",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

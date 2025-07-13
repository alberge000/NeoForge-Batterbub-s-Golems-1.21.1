package net.batterbub.batterbubsgolems.item;

import net.batterbub.batterbubsgolems.GolemMod;
import net.batterbub.batterbubsgolems.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GolemMod.MOD_ID);

    public static final Supplier<CreativeModeTab> GOLEM_ITEMS_TAB = CREATIVE_MODE_TAB.register("golem_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SPARK.get()))
                    .title(Component.translatable("creativetab.golemmod.golem_items"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SPARK);
                    })).build());

    public static final Supplier<CreativeModeTab> GOLEM_BLOCKS_TAB = CREATIVE_MODE_TAB.register("golem_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GOLEM_SPAWNER))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(GolemMod.MOD_ID, "golem_items_tab"))
                    .title(Component.translatable("creativetab.golemmod.golem_blocks"))
                    .displayItems(((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.SPARK_ORE);
                        output.accept(ModBlocks.GOLEM_SPAWNER);
                    })).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}

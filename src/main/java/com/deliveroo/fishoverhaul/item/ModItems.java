package com.deliveroo.fishoverhaul.item;

import com.deliveroo.fishoverhaul.FishOverhaul;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STARTER_FISH = registerItem("starter_fish", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(FishOverhaul.MOD_ID, name), item);

    }

    public static void registerModItems() {
        FishOverhaul.LOGGER.info("Registering Mod Items For " + FishOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(STARTER_FISH);
        });
    }
}

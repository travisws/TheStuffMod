package net.deathpoolops.stuff.item;

import net.deathpoolops.stuff.StuffMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem {

    public static final Item STUFF = registerItem("stuff",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
    return Registry.register(Registry.ITEM, new Identifier(StuffMod.MO_ID, name), item);
    }

    public static void registerModItems(){
        System.out.println("registerModItems" + StuffMod.MO_ID);
    }
}

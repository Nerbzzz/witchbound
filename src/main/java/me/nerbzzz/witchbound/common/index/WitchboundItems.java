package me.nerbzzz.witchbound.common.index;

import me.nerbzzz.witchbound.Witchbound;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface WitchboundItems {
  public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Witchbound.MODID);

  // Crops
  public static final DeferredItem<Item> MANDRAKE = ITEMS.registerItem("mandrake", Item::new, new Item.Properties());
  public static final DeferredItem<Item> BELLADONNA = ITEMS.registerItem("belladonna", Item::new, new Item.Properties());
  public static final DeferredItem<Item> WORMWOOD = ITEMS.registerItem("wormwood", Item::new, new Item.Properties());
  public static final DeferredItem<Item> WOLFSBANE = ITEMS.registerItem("wolfsbane", Item::new, new Item.Properties());

  // Seeds
  public static final DeferredItem<Item> MANDRAKE_SEEDS = ITEMS.register("mandrake_seeds", () -> new ItemNameBlockItem(WitchboundBlocks.MANDRAKE_CROP.get(), new Item.Properties()));
  public static final DeferredItem<Item> BELLADONNA_SEEDS = ITEMS.register("belladonna_seeds", () -> new ItemNameBlockItem(WitchboundBlocks.BELLADONNA_CROP.get(), new Item.Properties()));
  public static final DeferredItem<Item> WORMWOOD_SEEDS = ITEMS.register("wormwood_seeds", () -> new ItemNameBlockItem(WitchboundBlocks.WORMWOOD_CROP.get(), new Item.Properties()));
  public static final DeferredItem<Item> WOLFSBANE_SEEDS = ITEMS.register("wolfsbane_seeds", () -> new ItemNameBlockItem(WitchboundBlocks.WOLFSBANE_CROP.get(), new Item.Properties()));

  static void initialize(IEventBus bus) {
    ITEMS.register(bus);
  }
}

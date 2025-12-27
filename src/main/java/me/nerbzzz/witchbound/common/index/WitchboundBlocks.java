package me.nerbzzz.witchbound.common.index;

import me.nerbzzz.witchbound.Witchbound;
import me.nerbzzz.witchbound.common.block.BelladonnaBlock;
import me.nerbzzz.witchbound.common.block.MandrakeBlock;
import me.nerbzzz.witchbound.common.block.WolfsbaneBlock;
import me.nerbzzz.witchbound.common.block.WormwoodBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

public interface WitchboundBlocks {
  public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(Witchbound.MODID);

  // Crops
  public static final DeferredBlock<Block> MANDRAKE_CROP = BLOCKS.register("mandrake", () -> new MandrakeBlock(Block.Properties.ofFullCopy(Blocks.WHEAT)));
  public static final DeferredBlock<Block> BELLADONNA_CROP = BLOCKS.register("belladonna", () -> new BelladonnaBlock(Block.Properties.ofFullCopy(Blocks.WHEAT)));
  public static final DeferredBlock<Block> WORMWOOD_CROP = BLOCKS.register("wormwood", () -> new WormwoodBlock(Block.Properties.ofFullCopy(Blocks.WHEAT)));
  public static final DeferredBlock<Block> WOLFSBANE_CROP = BLOCKS.register("wolfsbane", () -> new WolfsbaneBlock(Block.Properties.ofFullCopy(Blocks.WHEAT)));

  static void initialize(IEventBus bus) {
    BLOCKS.register(bus);
  }
}
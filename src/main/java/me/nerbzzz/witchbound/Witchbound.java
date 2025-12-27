package me.nerbzzz.witchbound;

import me.nerbzzz.witchbound.common.index.WitchboundBlocks;
import me.nerbzzz.witchbound.common.index.WitchboundItems;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

@Mod(Witchbound.MODID)
public class Witchbound {
    public static final String MODID = "witchbound";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Witchbound(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        WitchboundItems.initialize(modEventBus);
        WitchboundBlocks.initialize(modEventBus);

    }

    private void commonSetup(FMLCommonSetupEvent event) {}
}

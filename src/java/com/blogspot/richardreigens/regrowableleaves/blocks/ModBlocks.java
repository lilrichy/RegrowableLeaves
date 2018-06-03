package com.blogspot.richardreigens.regrowableleaves.blocks;

import com.blogspot.richardreigens.regrowableleaves.blocks.minecraftLevesBlock.BlockLeafAir;
import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class ModBlocks {

    public static final BlockLeafAir blockLeafAir = new BlockLeafAir();

    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(blockLeafAir);
    }
}
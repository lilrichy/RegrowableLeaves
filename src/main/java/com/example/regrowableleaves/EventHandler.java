package com.example.regrowableleaves;

import com.example.regrowableleaves.init.ModBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent;
import utility.LogHelper;


/**
 * Created by richa on 12/26/2015.
 */
public class EventHandler {

    @SubscribeEvent
    public void BreakEvent(BlockEvent.BreakEvent e) {
        int x = e.x;
        int y = e.y;
        int z = e.z;

        if (e.block == Blocks.leaves) {
            e.world.setBlock(x, y, z, ModBlocks.leafAirBlock);
            LogHelper.info("Setting Block");
        }
    }
}
package com.blogspot.richardreigens.regrowableleaves;

import com.blogspot.richardreigens.regrowableleaves.init.ModBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraftforge.event.world.BlockEvent;


/**
 * Created by LiLRichy on 12/26/2015.
 */
public class EventHandler {

    @SubscribeEvent
    public void BreakEvent(BlockEvent.BreakEvent e) {
        int x = e.x;
        int y = e.y;
        int z = e.z;

        if (e.block == Blocks.leaves) {
            if (e.blockMetadata == 0 || e.blockMetadata == 4 || e.blockMetadata == 8 || e.blockMetadata == 12) {
                e.world.setBlock(x, y, z, ModBlocks.oakLeafAirBlock);
            } else if (e.blockMetadata == 1 || e.blockMetadata == 5 || e.blockMetadata == 9 || e.blockMetadata == 13) {
                e.world.setBlock(x, y, z, ModBlocks.spruceleafAirBlock);
            } else if (e.blockMetadata == 2 || e.blockMetadata == 6 || e.blockMetadata == 10 || e.blockMetadata == 14) {
                e.world.setBlock(x, y, z, ModBlocks.birchLeafAirBlock);
            } else if (e.blockMetadata == 3 || e.blockMetadata == 7 || e.blockMetadata == 11 || e.blockMetadata == 15) {
                e.world.setBlock(x, y, z, ModBlocks.jungleLeafAirBlock);
            }
            e.setCanceled(true);
        } else if (e.block == Blocks.leaves2) {
            if (e.blockMetadata == 0 || e.blockMetadata == 4 || e.blockMetadata == 8 || e.blockMetadata == 12) {
                e.world.setBlock(x, y, z, ModBlocks.acaciaLeafAirBlock);
            } else if (e.blockMetadata == 1 || e.blockMetadata == 5 || e.blockMetadata == 9 || e.blockMetadata == 13) {
                e.world.setBlock(x, y, z, ModBlocks.darkOakLeafAirBlock);
            }
            e.setCanceled(true);
        }

    }
}
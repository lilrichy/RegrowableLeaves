package com.blogspot.richardreigens.regrowableleaves;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;


/**
 * Created by LiLRichy on 12/26/2015.
 */
public class EventHandler {

    @SubscribeEvent
    public void breakEvent(BlockEvent.BreakEvent e) {
        int x = e.x;
        int y = e.y;
        int z = e.z;
        World world = e.world;
        Block block = e.block;
        EntityPlayer player = e.getPlayer();

        // LogHelper.info(e.blockMetadata);

        if (block == Blocks.leaves) {
            if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.shears) {
                world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(block, 1, e.blockMetadata)));
            }

            world.setBlock(x, y, z, regrowableleaves.blockLeafAir, e.blockMetadata % 4, 3);
            e.setCanceled(true);

        } else if (block == Blocks.leaves2) {
            if (player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.shears) {
                world.spawnEntityInWorld(new EntityItem(world, x, y, z, new ItemStack(block, 1, e.blockMetadata)));
            }

            world.setBlock(x, y, z, regrowableleaves.blockLeafAir, (e.blockMetadata % 4) + 5, 3);
            e.setCanceled(true);
        }
    }
}


package com.blogspot.richardreigens.regrowableleaves;

import com.blogspot.richardreigens.regrowableleaves.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;


/**
 * Created by LiLRichy on 12/26/2015.
 */
public class EventHandler {

    @SubscribeEvent(priority = EventPriority.NORMAL)
    public void breakEvent(BlockEvent.BreakEvent e) {
        BlockPos pos = e.getPos();
        World world = e.getWorld();
        IBlockState state = e.getState();
        EntityPlayer player = e.getPlayer();
        Block block = state.getBlock();

        if (player.getHeldItemMainhand() == null || player.getHeldItemMainhand().getItem() != Items.SHEARS) {
            if (block == Blocks.LEAVES) {
                block.harvestBlock(world, player, pos, state, null, null);
                world.setBlockState(pos, ModBlocks.blockLeafAir.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                e.setCanceled(true);

            } else if (block == Blocks.LEAVES2) {
                block.harvestBlock(world, player, pos, state, null, null);
                world.setBlockState(pos, ModBlocks.blockLeafAir.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4 + 5));
                e.setCanceled(true);
            }
        }
    }
}
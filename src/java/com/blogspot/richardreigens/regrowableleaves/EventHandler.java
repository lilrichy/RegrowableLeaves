package com.blogspot.richardreigens.regrowableleaves;

import com.blogspot.richardreigens.regrowableleaves.blocks.ModBOPBlocks;
import com.blogspot.richardreigens.regrowableleaves.blocks.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
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

        if (block.isLeaves(state, world, pos)) {
            //Output for debug text.
            if (ConfigurationHandler.generalSettings.debugMode) {
                LogHelper.info("Block: " + block);
                LogHelper.info("State: " + state);
                LogHelper.info("State from Meta: " + state.getBlock().getMetaFromState(state));
            }

            if (player.getHeldItemMainhand().isEmpty() || player.getHeldItemMainhand().getItem() != Items.SHEARS) {
                //Minecraft Leaves
            	// TODO: consider converting "== Blocks.LEAVES" to "instanceof BlockLeavesBase"
                if (block == Blocks.LEAVES) {
                    if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("Minecraft leaves");
                    block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                    world.setBlockState(pos, ModBlocks.blockLeafAir.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                    e.setCanceled(true);
                } else if (block == Blocks.LEAVES2) {
                    if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("Minecraft leaves 2");
                    block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                    world.setBlockState(pos, ModBlocks.blockLeafAir.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4 + 5));
                    e.setCanceled(true);
                }

                //Biome's O Plenty Leaves "I know there is prolly a better way to do this...."
                if (regrowableleaves.isBOPInstalled) {
                    if (block == Block.getBlockFromName("biomesoplenty:leaves_0")) {
                        if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BOP leaves_0");
                        block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                        world.setBlockState(pos, ModBOPBlocks.BLOCK_BOP_LEAF_AIR_0.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                        e.setCanceled(true);
                    } else if (block == Block.getBlockFromName("biomesoplenty:leaves_1")) {
                        if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BOP leaves_1");
                        block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                        world.setBlockState(pos, ModBOPBlocks.BLOCK_BOP_LEAF_AIR_1.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                        e.setCanceled(true);
                    } else if (block == Block.getBlockFromName("biomesoplenty:leaves_2")) {
                        if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BOP leaves_2");
                        block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                        world.setBlockState(pos, ModBOPBlocks.BLOCK_BOP_LEAF_AIR_2.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                        e.setCanceled(true);
                    } else if (block == Block.getBlockFromName("biomesoplenty:leaves_3")) {
                        if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BOP leaves_3");
                        block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                        world.setBlockState(pos, ModBOPBlocks.BLOCK_BOP_LEAF_AIR_3.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                        e.setCanceled(true);
                    } else if (block == Block.getBlockFromName("biomesoplenty:leaves_4")) {
                        if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BOP leaves_4");
                        block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                        world.setBlockState(pos, ModBOPBlocks.BLOCK_BOP_LEAF_AIR_4.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                        e.setCanceled(true);
                    } else if (block == Block.getBlockFromName("biomesoplenty:leaves_5")) {
                        if (ConfigurationHandler.generalSettings.debugMode) LogHelper.info("BOP leaves_5");
                        block.harvestBlock(world, player, pos, state, null, ItemStack.EMPTY);
                        world.setBlockState(pos, ModBOPBlocks.BLOCK_BOP_LEAF_AIR_5.getStateFromMeta(state.getBlock().getMetaFromState(state) % 4));
                        e.setCanceled(true);
                    }
                }
            }
        }
    }
}
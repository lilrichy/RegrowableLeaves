package com.blogspot.richardreigens.regrowableleaves.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class ModBlocks {

    public static final BlockLeafAir blockLeafAir = new BlockLeafAir();

    public static void register() {
        registerBlock(blockLeafAir);
    }

    private static void registerBlock(Block block) {
        GameRegistry.register(block);
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        GameRegistry.register(itemBlock);
    }
}
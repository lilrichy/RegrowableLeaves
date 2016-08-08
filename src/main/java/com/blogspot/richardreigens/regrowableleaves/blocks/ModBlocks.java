package com.blogspot.richardreigens.regrowableleaves.blocks;

import com.blogspot.richardreigens.regrowableleaves.blocks.minecraftLevesBlock.BlockLeafAir;
import com.blogspot.richardreigens.regrowableleaves.regrowableleaves;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by LiLRichy on 7/14/2016.
 */
public class ModBlocks {

    public static final BlockLeafAir blockLeafAir = new BlockLeafAir();

    public static void register() {
        GameRegistry.register(blockLeafAir);

        //We should only load these blocks if BOP is installed:
        if (regrowableleaves.isBOPInstalled) {
            ModBOPBlocks.register();
        }
    }
}
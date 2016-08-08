package com.blogspot.richardreigens.regrowableleaves.blocks.bopLeavesPages;

import net.minecraft.util.IStringSerializable;

/**
 * Created by LiLRichy on 2/11/2016.
 */
public class BOPPage_2 {

    public enum EnumType implements IStringSerializable {

        ORIGIN(0, "origin"),
        PINK_CHERRY(1, "pink_cherry"),
        WHITE_CHERRY(2, "white_cherry"),
        MAPLE(3, "maple");

        private static final BOPPage_2.EnumType[] META_LOOKUP = new BOPPage_2.EnumType[values().length];

        static {
            for (BOPPage_2.EnumType BOPTrees$enumtype : values()) {
                META_LOOKUP[BOPTrees$enumtype.getID()] = BOPTrees$enumtype;
            }
        }

        private int ID;
        private String name;

        EnumType(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }

        public static BOPPage_2.EnumType byMetadata(int meta) {
            if (meta < 0 || meta >= META_LOOKUP.length) {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        @Override
        public String getName() {
            return name;
        }

        public int getID() {
            return ID;
        }

        @Override
        public String toString() {
            return getName();
        }
    }
}

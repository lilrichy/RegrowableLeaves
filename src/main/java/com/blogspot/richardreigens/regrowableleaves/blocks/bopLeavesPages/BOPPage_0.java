package com.blogspot.richardreigens.regrowableleaves.blocks.bopLeavesPages;

import net.minecraft.util.IStringSerializable;

/**
 * Created by LiLRichy on 2/11/2016.
 */
public class BOPPage_0 {

    public enum EnumType implements IStringSerializable {
        YELLOW_AUTUMN(0, "yellow_autumn"),
        ORANGE_AUTUMN(1, "orange_autumn"),
        BAMBOO(2, "bamboo"),
        MAGIC(3, "magic");

        private static final BOPPage_0.EnumType[] META_LOOKUP = new BOPPage_0.EnumType[values().length];

        static {
            for (BOPPage_0.EnumType BOPTrees$enumtype : values()) {
                META_LOOKUP[BOPTrees$enumtype.getID()] = BOPTrees$enumtype;
            }
        }

        private int ID;
        private String name;

        EnumType(int ID, String name) {
            this.ID = ID;
            this.name = name;
        }

        public static BOPPage_0.EnumType byMetadata(int meta) {
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

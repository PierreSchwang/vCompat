package net.sourcewriters.minecraft.versiontools.reflection.provider.v1_16_R2.utils;

import java.util.function.Function;

import net.minecraft.server.v1_16_R2.World;
import net.sourcewriters.minecraft.versiontools.reflection.provider.v1_16_R2.entity.ArmorStand1_16_R2;

public abstract class EntityConstructors1_16_R2 {

     public static final Function<World, ArmorStand1_16_R2> ARMOR_STAND = (world -> new ArmorStand1_16_R2(world));

}

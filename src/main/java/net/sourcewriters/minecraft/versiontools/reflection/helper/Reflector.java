package net.sourcewriters.minecraft.versiontools.reflection.helper;

import net.sourcewriters.minecraft.versiontools.VersionUtils;

@Deprecated
public class Reflector {
	
    public static Class<?> getNMSClass(String nmsClassString) {
        String path = "net.minecraft.server." + VersionUtils.getServerVersion() + "." + nmsClassString;
        return getClass(path);
    }
	
    public static Class<?> getCBClass(String cbClassString) {
        String path = "org.bukkit.craftbukkit." + VersionUtils.getServerVersion() + "." + cbClassString;
        return getClass(path);
    }
    
    public static Class<?> getClass(String classPath) {
        try {
            return Class.forName(classPath);
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

}

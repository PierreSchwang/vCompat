package net.sourcewriters.minecraft.versiontools.reflection.provider.v1_8_R3;

import net.sourcewriters.minecraft.versiontools.reflection.VersionControl;

public class VersionControl1_8_R3 extends VersionControl {

	public static VersionControl1_8_R3 INSTANCE;

	public static VersionControl1_8_R3 init() {
		return INSTANCE != null ? INSTANCE : (INSTANCE = new VersionControl1_8_R3());
	}

	private final ToolProvider1_8_R3 toolProvider = new ToolProvider1_8_R3(this);
	private final TextureProvider1_8_R3 textureProvider = new TextureProvider1_8_R3(this);
	private final PacketHandler1_8_R3 packetHandler = new PacketHandler1_8_R3(this);
	private final EntityProvider1_8_R3 entityProvider = new EntityProvider1_8_R3(this);
	private final PlayerProvider1_8_R3 playerProvider = new PlayerProvider1_8_R3(this);
	private final BukkitConversion1_8_R3 bukkitConversion = new BukkitConversion1_8_R3(this);

	private VersionControl1_8_R3() {

	}

	@Override
	public ToolProvider1_8_R3 getToolProvider() {
		return toolProvider;
	}

	@Override
	public EntityProvider1_8_R3 getEntityProvider() {
		return entityProvider;
	}

	@Override
	public PlayerProvider1_8_R3 getPlayerProvider() {
		return playerProvider;
	}

	@Override
	public TextureProvider1_8_R3 getTextureProvider() {
		return textureProvider;
	}

	@Override
	public PacketHandler1_8_R3 getPacketHandler() {
		return packetHandler;
	}

	@Override
	public BukkitConversion1_8_R3 getBukkitConversion() {
		return bukkitConversion;
	}

}

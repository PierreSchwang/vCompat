package net.sourcewriters.minecraft.versiontools.reflection.provider.v1_13_R2;

import org.bukkit.entity.Player;

import net.sourcewriters.minecraft.versiontools.reflection.PlayerProvider;
import net.sourcewriters.minecraft.versiontools.reflection.entity.NmsPlayer;
import net.sourcewriters.minecraft.versiontools.reflection.provider.v1_13_R2.entity.Player1_13_R2;

public class PlayerProvider1_13_R2 extends PlayerProvider<VersionControl1_13_R2> {

	protected PlayerProvider1_13_R2(VersionControl1_13_R2 versionControl) {
		super(versionControl);
	}

	@Override
	protected NmsPlayer createPlayer(Player player) {
		return new Player1_13_R2(player);
	}

}

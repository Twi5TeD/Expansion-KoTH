package me.F64.papiexpansions.koth;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import subside.plugins.koth.adapter.KothHandler;
import subside.plugins.koth.adapter.TimeObject;

public class ExpansionKoTH extends PlaceholderExpansion {
	public boolean canRegister() {
		return Bukkit.getPluginManager().getPlugin(getPlugin()) != null;
	}

	public String getAuthor() {
		return "F64_Rx";
	}

	public String getIdentifier() {
		return "koth";
	}

	public String getPlugin() {
		return "KoTH";
	}

	public String getVersion() {
		return "1.0";
	}

	public String onPlaceholderRequest(Player p, String identifier) {
		if (p == null) {
			return "";
		}
		if (identifier.equals("name")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return KothHandler.getInstance().getRunningKoth().getKoth()
					.getName();
		}
		if (identifier.equals("x")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return KothHandler.getInstance().getRunningKoth().getKoth()
					.getMiddle().getBlockX()
					+ "";
		}
		if (identifier.equals("y")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return KothHandler.getInstance().getRunningKoth().getKoth()
					.getMiddle().getBlockY()
					+ "";
		}
		if (identifier.equals("z")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return KothHandler.getInstance().getRunningKoth().getKoth()
					.getMiddle().getBlockZ()
					+ "";
		}
		if (identifier.equals("world")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return KothHandler.getInstance().getRunningKoth().getKoth()
					.getMiddle().getWorld().getName();
		}
		if (identifier.equals("loot_name")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			if (KothHandler.getInstance().getRunningKoth().getLootChest() == null)
				return "No Loot Set";
			return KothHandler.getInstance().getRunningKoth().getLootChest();
		}
		if (identifier.equals("loot_x")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			Location loc = KothHandler.getInstance().getRunningKoth().getKoth()
					.getLootPos();
			if (loc != null) {
				return loc.getBlockX() + "";
			}
			return "No Loot Set";
		}
		if (identifier.equals("loot_y")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			Location loc = KothHandler.getInstance().getRunningKoth().getKoth()
					.getLootPos();
			if (loc != null) {
				return loc.getBlockY() + "";
			}
			return "No Loot Set";
		}
		if (identifier.equals("loot_z")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			Location loc = KothHandler.getInstance().getRunningKoth().getKoth()
					.getLootPos();
			if (loc != null) {
				return loc.getBlockZ() + "";
			}
			return "No Loot Set";
		}
		if (identifier.equals("loot_world")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			Location loc = KothHandler.getInstance().getRunningKoth().getKoth()
					.getLootPos();
			if (loc != null) {
				return loc.getWorld().getName();
			}
			return "No Loot Set";
		}
		if (identifier.equals("player_inarea")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			for (OfflinePlayer oPlayer : Bukkit.getOfflinePlayers())
				if (KothHandler.getInstance().getRunningKoth().getKoth()
						.isInArea(oPlayer)) {
					return "True";
				}
			return "False";
		}
		if (identifier.equals("time_secondsleft")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getSecondsLeft();
		}
		if (identifier.equals("time_minutesleft")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getMinutesLeft();
		}
		if (identifier.equals("time_secondsleft")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getSecondsLeft();
		}
		if (identifier.equals("time_secondscapped")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getSecondsCapped();
		}
		if (identifier.equals("time_minutescapped")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getMinutesCapped();
		}
		if (identifier.equals("time_leftformatted")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getTimeLeftFormatted();
		}
		if (identifier.equals("time_cappedformatted")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getTimeCappedFormatted();
		}
		if (identifier.equals("time_totalsecondsleft")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";

			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getTotalSecondsLeft();
		}
		if (identifier.equals("time_totalsecondscapped")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getTotalSecondsCapped();
		}
		if (identifier.equals("time_lengthinminutes")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getLengthInMinutes();
		}
		if (identifier.equals("time_lengthinseconds")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			return ""
					+ KothHandler.getInstance().getRunningKoth()
							.getTimeObject().getLengthInSeconds();
		}
		if (identifier.equals("lastwinner")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			if (KothHandler.getInstance().getRunningKoth().getKoth()
					.getLastWinner() == null)
				return "No Last Winner";
			return KothHandler.getInstance().getRunningKoth().getKoth()
					.getLastWinner().getName();
		}
		if (identifier.equals("currentcapper")) {
			if (KothHandler.getInstance().getRunningKoth() == null)
				return "";
			if (KothHandler.getInstance().getRunningKoth().getCapper() == null)
				return "No One";
			return KothHandler.getInstance().getRunningKoth().getCapper()
					.getName();
		}
		if (identifier.equals("nextevent")) {
			return TimeObject.getTimeTillNextEvent();
		}
		return "";
	}
}
package me.F64.papiexpansions.koth;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import subside.plugins.koth.adapter.KothHandler;
import subside.plugins.koth.adapter.RunningKoth;
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
        return "1.1";
    }

    public String onPlaceholderRequest(Player player, String identifier) {
        if (player == null) {
            return "";
        }
        if (identifier.equals("nextevent")) {
            return TimeObject.getTimeTillNextEvent();
        }
        if (KothHandler.getInstance().getRunningKoth() == null) return "";
        
        RunningKoth rKoth = KothHandler.getInstance().getRunningKoth();
        if (rKoth == null) return "";
        if (identifier.equals("name")) return rKoth.getKoth().getName();
        if (identifier.equals("x")) return rKoth.getKoth().getMiddle().getBlockX() + "";
        if (identifier.equals("y")) return rKoth.getKoth().getMiddle().getBlockY() + "";
        if (identifier.equals("z")) return rKoth.getKoth().getMiddle().getBlockZ() + "";
        if (identifier.equals("world")) return rKoth.getKoth().getMiddle().getWorld().getName();
        
        if (identifier.equals("player_inarea")) return rKoth.getKoth().isInArea(player)?"True":"False";
        
        if (identifier.equals("time_secondsleft")) return "" + rKoth.getTimeObject().getSecondsLeft();
        if (identifier.equals("time_minutesleft")) return "" + rKoth.getTimeObject().getMinutesLeft();
        if (identifier.equals("time_secondscapped")) return "" + rKoth.getTimeObject().getSecondsCapped();
        if (identifier.equals("time_minutescapped")) return "" + rKoth.getTimeObject().getMinutesCapped();
        if (identifier.equals("time_leftformatted")) return "" + rKoth.getTimeObject().getTimeLeftFormatted();
        if (identifier.equals("time_cappedformatted")) return "" + rKoth.getTimeObject().getTimeCappedFormatted();
        if (identifier.equals("time_totalsecondsleft")) return "" + rKoth.getTimeObject().getTotalSecondsLeft();
        if (identifier.equals("time_totalsecondscapped")) return "" + rKoth.getTimeObject().getTotalSecondsCapped();
        if (identifier.equals("time_lengthinminutes")) return "" + rKoth.getTimeObject().getLengthInMinutes();
        if (identifier.equals("time_lengthinseconds")) return "" + rKoth.getTimeObject().getLengthInSeconds();
        
        if (identifier.equals("lastwinner")) {
            if (rKoth.getKoth().getLastWinner() == null) return "No Last Winner";
            return rKoth.getKoth().getLastWinner().getName();
        }
        if (identifier.equals("currentcapper")) {
            if (rKoth.getCapper() == null) return "No One";
            return rKoth.getCapper().getName();
        }
        
        
        if (identifier.equals("loot_name")) {
            if (rKoth.getLootChest() == null) return "No Loot Set";
            return KothHandler.getInstance().getRunningKoth().getLootChest();
        }
        if (identifier.equals("loot_x")) {
            if (rKoth.getKoth().getLootPos() == null) return "No Loot Set";
            return "" + rKoth.getKoth().getLootPos().getBlockX();
        }
        if (identifier.equals("loot_y")) {
            if (rKoth.getKoth().getLootPos() == null) return "No Loot Set";
            return "" + rKoth.getKoth().getLootPos().getBlockY();
        }
        if (identifier.equals("loot_z")) {
            if (rKoth.getKoth().getLootPos() == null) return "No Loot Set";
            return "" + rKoth.getKoth().getLootPos().getBlockZ();
        }
        if (identifier.equals("loot_world")) {
            if (rKoth.getKoth().getLootPos() == null) return "No Loot Set";
            return "" + rKoth.getKoth().getLootPos().getWorld().getName();
        }
            
        
        return "";
    }
}
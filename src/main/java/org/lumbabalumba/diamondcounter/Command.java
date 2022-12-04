package org.lumbabalumba.diamondcounter;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, org.bukkit.command.@NotNull Command command, @NotNull String label, @NotNull String[] args) {
        StringBuilder str = null;
        if (args.length != 0) sender.sendMessage("Too may arguments! This command does not take any.");
        else {
            str = new StringBuilder("These players have mined diamonds this day:\n");
            for (String s : DiamondCounter.dict.keySet()) {
                if (DiamondCounter.dict.get(s) != 0) {
                    str.append(Color.BLUE).append(s).append(": ").append(Color.YELLOW).append(DiamondCounter.dict.get(s)).append("\n");
                }
            }
        }
        sender.sendMessage(String.valueOf(str));
        return true;
    }
}

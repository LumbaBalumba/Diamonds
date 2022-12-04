package org.lumbabalumba.diamondcounter;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class StartCommand implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        String message;
        if (args.length !=0 ){
            message = "Too many arguments! This command does not take any.";
        }else{
            message="Started a new listening period successfully.";
            DiamondCounter.dict.replaceAll((s, v) -> 0);
        }
        sender.sendMessage(message);
        return true;
    }
}

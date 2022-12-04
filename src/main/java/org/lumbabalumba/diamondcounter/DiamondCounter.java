package org.lumbabalumba.diamondcounter;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class DiamondCounter extends JavaPlugin {
    public static HashMap<String, Integer> dict = new HashMap<>();

    @Override
    public void onEnable() {
        getLogger().info("Diamonds is enabled");
        getServer().getPluginManager().registerEvents(new DiamondEvent(), this);
        this.getCommand("diamonds").setExecutor(new Command());
        this.getCommand("start_period").setExecutor(new StartCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("Diamonds is disabled");
    }
}

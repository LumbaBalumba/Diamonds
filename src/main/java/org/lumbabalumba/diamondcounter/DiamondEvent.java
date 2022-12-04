package org.lumbabalumba.diamondcounter;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class DiamondEvent implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        if ((event.getBlock().getType() == Material.DIAMOND_ORE) | (event.getBlock().getType() == Material.DEEPSLATE_DIAMOND_ORE)) {
            String p = event.getPlayer().getName();
            if (DiamondCounter.dict.containsKey(p)) {
                DiamondCounter.dict.put(p, DiamondCounter.dict.get(p) + 1);
            } else {
                DiamondCounter.dict.put(p, 1);
            }
        }
    }
}

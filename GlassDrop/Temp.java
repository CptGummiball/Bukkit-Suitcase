package org.cptgummiball.bukkitsuitcase.glassdrop;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class GlassDrop extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Material blockType = event.getBlock().getType();
        
        if (blockType == Material.GLASS || blockType == Material.TINTED_GLASS ||
            blockType == Material.GLASS_PANE || blockType == Material.TINTED_GLASS_PANE ||
            blockType == Material.WHITE_STAINED_GLASS || blockType == Material.BLACK_STAINED_GLASS ||
            blockType == Material.BLUE_STAINED_GLASS || blockType == Material.BROWN_STAINED_GLASS ||
            blockType == Material.CYAN_STAINED_GLASS || blockType == Material.GRAY_STAINED_GLASS ||
            blockType == Material.GREEN_STAINED_GLASS || blockType == Material.LIGHT_BLUE_STAINED_GLASS ||
            blockType == Material.LIGHT_GRAY_STAINED_GLASS || blockType == Material.LIME_STAINED_GLASS ||
            blockType == Material.MAGENTA_STAINED_GLASS || blockType == Material.ORANGE_STAINED_GLASS ||
            blockType == Material.PINK_STAINED_GLASS || blockType == Material.PURPLE_STAINED_GLASS ||
            blockType == Material.RED_STAINED_GLASS || blockType == Material.YELLOW_STAINED_GLASS ||
            blockType == Material.WHITE_STAINED_GLASS_PANE || blockType == Material.BLACK_STAINED_GLASS_PANE ||
            blockType == Material.BLUE_STAINED_GLASS_PANE || blockType == Material.BROWN_STAINED_GLASS_PANE ||
            blockType == Material.CYAN_STAINED_GLASS_PANE || blockType == Material.GRAY_STAINED_GLASS_PANE ||
            blockType == Material.GREEN_STAINED_GLASS_PANE || blockType == Material.LIGHT_BLUE_STAINED_GLASS_PANE ||
            blockType == Material.LIGHT_GRAY_STAINED_GLASS_PANE || blockType == Material.LIME_STAINED_GLASS_PANE ||
            blockType == Material.MAGENTA_STAINED_GLASS_PANE || blockType == Material.ORANGE_STAINED_GLASS_PANE ||
            blockType == Material.PINK_STAINED_GLASS_PANE || blockType == Material.PURPLE_STAINED_GLASS_PANE ||
            blockType == Material.RED_STAINED_GLASS_PANE || blockType == Material.YELLOW_STAINED_GLASS_PANE) {

            event.setDropItems(false);
            event.getBlock().getWorld().dropItemNaturally(event.getBlock().getLocation(), new ItemStack(blockType));
        }
    }
}

package org.cptgummiball.bukkitsuitcase.creativeitemtagger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerCreativeInventoryEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.List;

public class CreativeItemTagger extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCreativeItem(PlayerCreativeInventoryEvent event) {
        if (event.getClickedInventory() == null || event.getWhoClicked().getGameMode() != GameMode.CREATIVE) {
            return;
        }

        ItemStack item = event.getCurrentItem();
        if (item != null && item.getItemMeta() != null) {
            ItemMeta meta = item.getItemMeta();
            List<String> lore = meta.hasLore() ? meta.getLore() : new ArrayList<>();
            
            // Check if the item already has the "Creative-Item" tag
            if (lore != null && !lore.contains(ChatColor.GRAY + "Creative-Item")) {
                lore.add(ChatColor.GRAY + "Creative-Item");
                meta.setLore(lore);
                item.setItemMeta(meta);
            }
        }
    }
}

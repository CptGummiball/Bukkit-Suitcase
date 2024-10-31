package org.cptgummiball.bukkitsuitcase.autotorchplacement;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashSet;
import java.util.UUID;

public class AutoTorchPlacement extends JavaPlugin implements Listener {

    private HashSet<UUID> autoTorchEnabledPlayers = new HashSet<>();

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        this.getCommand("autotorch").setExecutor((sender, command, label, args) -> {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                UUID playerId = player.getUniqueId();

                if (autoTorchEnabledPlayers.contains(playerId)) {
                    autoTorchEnabledPlayers.remove(playerId);
                    player.sendMessage("Auto-Torch Placement disabled.");
                } else {
                    autoTorchEnabledPlayers.add(playerId);
                    player.sendMessage("Auto-Torch Placement enabled.");
                }
                return true;
            }
            sender.sendMessage("This command can only be used by players.");
            return false;
        });
    }

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event) {
        Player player = event.getPlayer();
        if (!autoTorchEnabledPlayers.contains(player.getUniqueId())) return;

        Block blockBelow = player.getLocation().getBlock().getRelative(0, -1, 0);
        if (blockBelow.getLightLevel() < 8 && blockBelow.getType() == Material.AIR) {
            ItemStack torch = new ItemStack(Material.TORCH);
            if (player.getInventory().containsAtLeast(torch, 1)) {
                blockBelow.setType(Material.TORCH);
                player.getInventory().removeItem(torch);
                player.sendMessage("A torch has been placed automatically.");
            } else {
                player.sendMessage("No torches left in your inventory!");
            }
        }
    }
}

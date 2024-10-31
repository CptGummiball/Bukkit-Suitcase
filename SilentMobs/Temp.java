package org.cptgummiball.bukkitsuitcase.silentmobs;

import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collection;

public class SilentMobs extends JavaPlugin implements Listener {

    private static final int MOB_THRESHOLD = 10; // Number of mobs before silencing them
    private static final int RADIUS = 5; // Radius to check for nearby mobs

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onCreatureSpawn(CreatureSpawnEvent event) {
        if (event.getEntity() instanceof Monster) {
            Collection<Entity> nearbyEntities = event.getLocation().getWorld().getNearbyEntities(
                    event.getLocation(), RADIUS, RADIUS, RADIUS, entity -> entity instanceof Monster);

            if (nearbyEntities.size() > MOB_THRESHOLD) {
                ((LivingEntity) event.getEntity()).setSilent(true);
            }
        }
    }
}

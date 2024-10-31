# BukkitSuitcase

BukkitSuitcase is a collection of lightweight, single-purpose plugins for Spigot and Paper Minecraft servers (1.19+). Each plugin is designed to address a specific server need without requiring large or complex plugins. Perfect for server admins looking for minimalistic solutions to common Minecraft issues.

## Plugins

### 1. CropTramplePrevention

**CropTramplePrevention** prevents entities (players, mobs, animals) from trampling farmland blocks, ensuring that your crops remain safe. Ideal for servers looking to disable crop trampling without relying on datapacks or complex plugins.

- **Function**: Prevents entities from turning farmland into dirt by cancelling trample events.
- **Compatibility**: Spigot and Paper, Minecraft 1.19+
- **Setup**: No configuration needed; works automatically after installation.

### 2. GlassDrop

**GlassDrop** makes it so that breaking glass blocks and panes (any type) will drop the block as an item, without needing a Silk Touch tool. This plugin is for players who want to collect glass without worrying about destroying it.

- **Function**: Ensures all glass blocks and panes drop as items on break, even without Silk Touch.
- **Compatibility**: Spigot and Paper, Minecraft 1.19+
- **Setup**: Works automatically upon installation.

### 3. AutoTorchPlacement

**AutoTorchPlacement** automatically places a torch from the player’s inventory when they enter a dark area. Players can enable or disable this feature individually via a command.

- **Function**: When the light level around the player falls below a set threshold, a torch is automatically placed from the player’s inventory.
- **Command**: `/autotorch` - Toggles the auto-torch placement on or off for each player.
- **Compatibility**: Spigot and Paper, Minecraft 1.19+
- **Setup**: No configuration is needed; players can control it for themselves with the command.

### 4. SilentMobs

**SilentMobs** suppresses the sounds of hostile mobs when they spawn in high-density areas, such as mob farms, to reduce noise. Normal mob sounds remain active in areas with fewer mobs.

- **Function**: If more than a certain number of mobs (e.g., 10) are detected in a small radius, new mobs spawning there will be silent.
- **Compatibility**: Spigot and Paper, Minecraft 1.19+
- **Setup**: Works automatically upon installation; suitable for mob farms to keep the game quieter.

### 5. CreativeItemTagger

**CreativeItemTagger** automatically adds a "Creative-Item" tag to the lore of any item taken from the Creative inventory. This makes it easier for admins and players to identify items that originate directly from Creative mode.

- **Function**: Automatically adds the lore tag "Creative-Item" in gray text to all items taken from the Creative inventory.
- **Compatibility**: Spigot and Paper, Minecraft 1.19+
- **Setup**: No configuration needed; the plugin works automatically upon installation.
- **Use Case**: Ideal for servers that want to keep track of the origins of items and better identify Creative items.

## Installation

1. Download the `.jar` files for the plugins you want to use.
2. Place the `.jar` files in your server’s `plugins` folder.
3. Restart or reload your server.

## License

BukkitSuitcase is open-source and licensed under the MIT License. You’re free to use and modify the code as needed.

---

Enjoy simple, effective Minecraft enhancements with BukkitSuitcase!

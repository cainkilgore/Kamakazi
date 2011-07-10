package me.cain.kamakazi;

import java.util.logging.Logger;
import com.nijiko.permissions.PermissionHandler;
import com.nijikokun.bukkit.Permissions.Permissions;
import org.bukkit.plugin.Plugin;
import javax.swing.event.DocumentEvent.EventType;
import org.bukkit.plugin.Plugin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;
import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.block.*;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.Slot;

public class kamimain extends JavaPlugin{
	
	private final mainlistener TheListener = new mainlistener();	
	
Logger log = Logger.getLogger("Minecraft");
String pluginname = "Kamakazi";

	public void onDisable() {
		log.info("[" + pluginname + "] " + pluginname + " has been disabled.");
		}
	public void onEnable() {
		PluginManager pm = getServer().getPluginManager();
		log.info("[" + pluginname + "] " + pluginname + " has been enabled.");
		log.info("[" + pluginname + "] Created by CainFoool");
		pm.registerEvent(Event.Type.PLAYER_INTERACT, new mainlistener(), Priority.Normal, this);
	}
	
	Server server;
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if(p.isOp()) {
        if(cmd.getName().equalsIgnoreCase("kk")) {
            Location loc = p.getLocation();
            loc.setY(loc.getY() - 1);
            loc.getBlock().getFace(BlockFace.DOWN).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 3).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 4).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 5).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 6).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 7).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 8).setType(Material.TNT);
            loc.getBlock().getFace(BlockFace.DOWN, 9).setType(Material.TNT);
        loc.getBlock().getFace(BlockFace.DOWN, 2).setType(Material.REDSTONE_TORCH_ON);
        loc.getBlock().getFace(BlockFace.DOWN, 2).setType(Material.AIR);
        p.sendMessage(ChatColor.RED + "[WARNING] KAMAKAZI!");
        return true;
        }
        return false;
    }
        return false;
    }

}


		
// Created by CainFoool

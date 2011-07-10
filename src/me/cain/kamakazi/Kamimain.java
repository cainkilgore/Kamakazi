package me.cain.kamakazi;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Kamimain extends JavaPlugin {
	private Logger log = Logger.getLogger("Minecraft");
	private final String pluginname = "Kamakazi";

	public void onDisable() {
		log.info("[" + pluginname + "] " + pluginname + " has been disabled.");
	}

	public void onEnable() {
		log.info("[" + pluginname + "] " + pluginname + " has been enabled.");
		log.info("[" + pluginname + "] Created by CainFoool");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		if (cmd.getName().equalsIgnoreCase("kk")) {
			if (args.length != 0) {
				sender.sendMessage(ChatColor.RED + "No arguments needed!");
				return true;
			} else {
				if (sender instanceof Player) {
					Player p = (Player) sender;
					if (p.isOp()) {
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
						loc.getBlock().getFace(BlockFace.DOWN, 10).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 11).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 12).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 13).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 14).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 15).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 16).setType(Material.TNT);
						loc.getBlock().getFace(BlockFace.DOWN, 2).setType(Material.REDSTONE_TORCH_ON);
						loc.getBlock().getFace(BlockFace.DOWN, 2).setType(Material.AIR);
						p.sendMessage(ChatColor.RED + "[WARNING] KAMAKAZI!");
						return true;
					} else {
						sender.sendMessage(ChatColor.RED + "You must be op!");
						return true;
					}
				} else {
					sender.sendMessage("You must be a player!");
					return true;
				}
			}
		}
		return false;
	}
}

// Created by CainFoool
package me.Krash.ParticleJump;

import me.Krash.ParticleJump.listeners.JumpListener;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitScheduler;

public class ParticleJump extends JavaPlugin implements Listener{

	public void onEnable() {
		final JumpListener listener;
		listener = new JumpListener(this);
		Bukkit.getPluginManager().registerEvents(listener, this);
		final ConsoleCommandSender console = Bukkit.getServer().getConsoleSender();
		console.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "[" + ChatColor.AQUA + "" + ChatColor.BOLD + "ParticleJump" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "] " + ChatColor.RED + "" + ChatColor.BOLD + "Enabling...");
		BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
	    scheduler.scheduleSyncDelayedTask(this, new Runnable()
	    {
	      public void run()
	      {
	    	  console.sendMessage(ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "[" + ChatColor.AQUA + "" + ChatColor.BOLD + "ParticleJump" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "] " + ChatColor.GREEN + "" + ChatColor.BOLD + "Enabled!");
	        }
	    }, 50L);
	}
}

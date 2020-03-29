package com.nameofyourchoice.spigotplugintemplate;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

// NEVER INHERIT THIS CLASS
public final class SpigotPluginTemplate extends JavaPlugin {

    @Override
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage("Plugin enabled!");

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("Plugin disabled!");

    }

}

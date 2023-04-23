package me.davamu.bukkit.console;

import lombok.extern.java.Log;
import me.davamu.bukkit.StaffMonitoring;
import net.shibacraft.library.loader.SLLoader;

@Log
public class Banner implements SLLoader {

    private final StaffMonitoring plugin;

    public Banner(StaffMonitoring plugin){
        this.plugin = plugin;
    }

    @Override
    public void load() {
        log.info("&7Plugin: &b" + plugin.getName());
        log.info("&7Version: &b" + plugin.getDescription().getVersion());
        log.info("&7Author: &b" + plugin.getDescription().getAuthors().get(0));
        log.info("");
    }

    @Override
    public void unload() {

    }

    @Override
    public void reload() {

    }

}
package me.davamu.bukkit;

import lombok.Getter;
import me.davamu.bukkit.lib.ManagerLib;
import me.davamu.bukkit.modules.MainModule;
import org.bukkit.plugin.java.JavaPlugin;

public class StaffMonitoring extends JavaPlugin {

    @Getter
    private static StaffMonitoring plugin;
    private MainModule mainModule;

    @Override
    public void onLoad() {
        new ManagerLib(this);
    }

    @Override
    public void onEnable() {
        StaffMonitoring.plugin = this;

        mainModule = new MainModule(this);
        mainModule.load();

    }

    @Override
    public void onDisable() {
        mainModule.unload();
    }


}

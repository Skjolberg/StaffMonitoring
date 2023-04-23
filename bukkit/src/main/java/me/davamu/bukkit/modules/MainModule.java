package me.davamu.bukkit.modules;

import me.davamu.bukkit.StaffMonitoring;
import me.davamu.bukkit.commands.Internal.CommandLoader;
import me.davamu.bukkit.commands.Internal.CommandTranslatorProvider;
import net.shibacraft.library.loader.SLLoader;


public class MainModule implements SLLoader {

    private final StaffMonitoring plugin;
    private CommandLoader commandLoader;

    public MainModule(StaffMonitoring plugin){
        this.plugin = plugin;
    }

    @Override
    public void load() {
        final CommandTranslatorProvider commandTranslatorProvider = new CommandTranslatorProvider();
        commandLoader = new CommandLoader(commandTranslatorProvider, this);
        commandLoader.load();

    }

    @Override
    public void unload() {

    }

    @Override
    public void reload() {
        commandLoader.reload();
    }

}

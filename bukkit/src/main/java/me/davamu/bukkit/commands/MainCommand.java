package me.davamu.bukkit.commands;

import me.davamu.bukkit.modules.MainModule;
import me.fixeddev.commandflow.annotated.CommandClass;
import me.fixeddev.commandflow.annotated.annotation.Command;
import me.fixeddev.commandflow.bukkit.annotation.Sender;
import org.bukkit.command.CommandSender;

@Command(names = {"DefaultTemplate"}, permission = "defaulttemplate.use", desc = "Simple command")
public class MainCommand implements CommandClass {

    private final MainModule mainModule;

    public MainCommand(MainModule mainModule){
        this.mainModule = mainModule;
    }

    @Command(names = "")
    public void onMainCommand(@Sender CommandSender sender) {
        sender.sendMessage("It needs arguments.");
    }

}

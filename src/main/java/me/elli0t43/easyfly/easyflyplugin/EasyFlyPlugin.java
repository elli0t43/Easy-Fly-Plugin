/*
* Hi there, thanks for choosing my plugin,I am elli0t43,
* and with this plugin you can run and use  /fly command ingame and from console also,
* Enjoy :D
*/



package me.elli0t43.easyfly.easyflyplugin;

import me.elli0t43.easyfly.easyflyplugin.Commands.FlyCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyFlyPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("/-----------------------\\");
        System.out.println("|-----Easy Fly v1.0-----|");
        System.out.println("|-------elli0t43--------|");
        System.out.println("\\-----------------------/");
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("fly").setExecutor(new FlyCommand(this));
    }
}

package in.masem.speedchangerclock;

import in.masem.speedchangerclock.command.speedChangerClock;
import in.masem.speedchangerclock.listeners.walkSpeedChangerListener;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpeedChangerClock extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("sp").setExecutor(new speedChangerClock());
        getServer().getPluginManager().registerEvents(new walkSpeedChangerListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

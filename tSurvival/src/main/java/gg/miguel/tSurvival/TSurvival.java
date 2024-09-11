package gg.miguel.tSurvival;

import gg.miguel.tSurvival.comandos.tSurvival;
import gg.miguel.tSurvival.eventos.PlayersEvents;
import gg.miguel.tSurvival.utils.Utils;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class TSurvival extends JavaPlugin {

    @Override
    public void onEnable() {
        Utils.sendConsole("&7&m-----------------------------");
        Utils.sendConsole("");
        Utils.sendConsole("&6&ltSurvival - &f1.20.4");
        Utils.sendConsole("&eAutor: &fMiguel");
        Utils.sendConsole("&eVersion: &f0.1-BETA");
        Utils.sendConsole("");
        Utils.sendConsole("&7&m-----------------------------");
        verificarComandos();
        verificarEventos();
        Utils.sendConsole("Plugin cargado correctamente");
    }

    @Override
    public void onDisable() {
        Utils.sendConsole("&7&m-----------------------------");
        Utils.sendConsole("");
        Utils.sendConsole("&6&ltSurvival");
        Utils.sendConsole("&eAutor: &fMiguel");
        Utils.sendConsole("&eVersion: &f0.1-BETA");
        Utils.sendConsole("");
        Utils.sendConsole("&7&m-----------------------------");
        Utils.sendConsole("&cApagando el plugin");
    }

    public void verificarComandos(){
        this.getCommand("tsurvival").setExecutor(new tSurvival(this));
        Utils.sendConsole("&aComandos verificados");

    }
    public void verificarEventos(){
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayersEvents(), this);
        Utils.sendConsole("&aEventos verificados");
    }
}

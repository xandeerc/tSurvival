package gg.miguel.tSurvival.eventos;

import gg.miguel.tSurvival.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayersEvents implements Listener {
    public PlayersEvents() {
    }

    @EventHandler
    public void join(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(Utils.color("&a+ &6"+player.getDisplayName()+" &7ha entrado al servidor"));
        player.sendMessage(Utils.color("&7&m-----------------------------"));
        player.sendMessage(Utils.color(""));
        player.sendMessage(Utils.color("&FBienvenido al &6&lServidor "+player.getDisplayName()));
        player.sendMessage(Utils.color(""));
        player.sendMessage(Utils.color("&7&m-----------------------------"));
    }
    @EventHandler
    public void leave(PlayerQuitEvent event){
        Player player = event.getPlayer();
        event.setQuitMessage(Utils.color("&c+ &6"+player.getDisplayName()+" &7ha salido del servidor"));
    }
}

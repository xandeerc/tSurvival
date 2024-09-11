package gg.miguel.tSurvival.comandos;

import gg.miguel.tSurvival.TSurvival;
import gg.miguel.tSurvival.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class tSurvival implements CommandExecutor {

    public tSurvival(TSurvival tSurvival) {
    }

    @Override
    public boolean onCommand(CommandSender sender, Command label, String s, String[] args) {
        Player player = (Player) sender;
        if (args.length > 0) {
          if (args[0].equalsIgnoreCase("reload")) {
                if (!sender.hasPermission("survival.command.reload")) {
                    player.sendMessage(Utils.color("&cNo tienes permisos para este comando"));
                } else {
                    player.sendMessage(Utils.color("&aPlugin cargado correctamente"));
                }
            } else if (args[0].equalsIgnoreCase("info")){
                  player.sendMessage(Utils.color("&7&m-----------------------------"));
                  player.sendMessage(Utils.color(""));
                  player.sendMessage(Utils.color("&6&LtSurvival - &f1.20.4"));
                  player.sendMessage(Utils.color(""));
                  player.sendMessage(Utils.color("&eAutor: &fMiguel"));
                  player.sendMessage(Utils.color("&eVersion: &f0.1-BETA"));
                  player.sendMessage(Utils.color(""));
                  player.sendMessage(Utils.color("&7&m-----------------------------"));
              }
          else {
              player.sendMessage(Utils.color("&cNo existe ese sub-comando"));

          }
        } else {
            player.sendMessage(Utils.color("&7&m-----------------------------"));
            player.sendMessage(Utils.color(""));
            player.sendMessage(Utils.color("&6&LComandos de ayuda"));
            player.sendMessage(Utils.color(""));
            player.sendMessage(Utils.color("&e/tsurvival &finfo"));
            player.sendMessage(Utils.color("&e/tsurvival &freload"));
            player.sendMessage(Utils.color(""));
            player.sendMessage(Utils.color("&7&m-----------------------------"));
        }

        return false;
    }
}


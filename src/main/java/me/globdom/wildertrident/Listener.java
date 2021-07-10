package me.globdom.wildertrident;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerRiptideEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;


public class Listener implements org.bukkit.event.Listener {




    @EventHandler
    public void onRiptide(PlayerRiptideEvent event){
        Player player = (Player) event.getPlayer();


        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.TRIDENT))
            if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore())
                if (player.getLevel() < 5) {



                    player.sendMessage(ChatColor.RED + "You need 5 XP to activate the powers of Poseidon");
                    Vector direction = player.getLocation().getDirection();
                    Location directionLoc = player.getLocation().add(direction);
                    player.teleport(directionLoc);

                } else {


                    player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 200, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 200, 0));
                    player.setLevel(player.getLevel() - 5);


                }
            }




        }







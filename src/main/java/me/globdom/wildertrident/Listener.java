package me.globdom.wildertrident;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRiptideEvent;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Listener implements org.bukkit.event.Listener {


    @EventHandler
    public void onRiptide(PlayerRiptideEvent event){
        Player player = (Player) event.getPlayer();

        if (event.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.TRIDENT))
            if (event.getPlayer().getInventory().getItemInMainHand().getItemMeta().hasLore()) {

                    player.addPotionEffect(new PotionEffect(PotionEffectType.WATER_BREATHING, 200, 0));
                    player.addPotionEffect(new PotionEffect(PotionEffectType.DOLPHINS_GRACE, 200, 0));
                    player.setLevel(player.getLevel() - 5);

                }

            }




        }







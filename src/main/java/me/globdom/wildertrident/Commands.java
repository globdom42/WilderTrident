package me.globdom.wildertrident;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (label.equalsIgnoreCase("WilderTrident")) {

            if (!(sender instanceof Player)) {

                sender.sendMessage("sorry console no can do");
            }

            Player player = (Player) sender;
            player.getInventory().addItem(getItem());
            player.sendMessage("WilderTrident added to inventory");

        }

        return true;
    }

    public ItemStack getItem(){

        ItemStack trident = new ItemStack(Material.TRIDENT);
        ItemMeta meta = trident.getItemMeta();

        meta.setDisplayName("§aPoseidon's Trident");
        List<String> lore = new ArrayList<>();
        lore.add("§2Navigate the oceans like Poseidon himself");
        meta.setLore(lore);

        meta.addEnchant(Enchantment.RIPTIDE, 3, true);
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
        meta.setUnbreakable(true);

        trident.setItemMeta(meta);


        return trident;
    }

}

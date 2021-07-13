package io.github.thebusybiscuit.dough.inventory.payloads;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;

import io.github.thebusybiscuit.dough.inventory.Menu;

public class Payloads {

    private Payloads() {}

    @ParametersAreNonnullByDefault
    public static @Nonnull MenuClickPayload create(Menu inv, InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        int slot = e.getSlot();

        return new MenuClickPayload(inv, player, slot);
    }

}

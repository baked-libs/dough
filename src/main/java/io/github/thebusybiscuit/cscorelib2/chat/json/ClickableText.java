package io.github.thebusybiscuit.cscorelib2.chat.json;

import java.util.function.Consumer;

import org.bukkit.Keyed;
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;

/**
 * 
 * @deprecated Honestly, Kyori-adventure is infinite times better than this, please use that.
 *
 */
@Deprecated
@Getter
@AllArgsConstructor
class ClickableText implements Keyed {

    @NonNull
    private final NamespacedKey key;

    @NonNull
    private final Consumer<Player> callback;

}

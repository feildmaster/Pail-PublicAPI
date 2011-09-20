package me.escapeNT.pail;

import com.google.api.translate.Language;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import me.escapeNT.pail.Util.Waypoint;
import org.bukkit.Material;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * PublicAPI for Pail
 *
 * @author Feildmaster
 * @author escapeNT (original API)
 * @version 0.7.1
 */
public abstract class Pail extends JavaPlugin {
    // Public Variables
    public static final String PLUGIN_VERSION = "0.7.1";
    public final Image PAIL_ICON = null;

    // Public API
    /**
     * Loads the provided JPanel into the user interface under the given title.
     * If the title is null, it will be converted to the empty String.
     * @param panel The JPanel to load.
     * @param title The title of this panel.
     * @throws NullPointerException if the specified JPanel is null.
     * @throws IllegalArgumentException if the title is already taken.
     */
    public abstract void loadInterfaceComponent(String title, JPanel panel);

    /**
     * Gets the interface component by the specified title, or null if it isn't loaded.
     * @param title The title of the component.
     * @return The component loaded with the specified title, or null if it doesn't exist.
     */
    public abstract JPanel getInterfaceComponent(String title);

    /**
     * Sets the activated (visible) status of the specified tab. Note: this will
     * refresh the tab layout to reflect changes immediately.
     * @param title The title of the panel.
     * @param activated True if the tab will be visible.
     */
    public abstract void setActivated(String title, boolean activated);

    /**
     * Gets the waypoint with the specified name, or null if it doesn't exist.
     * @param name The name of the waypoint.
     * @return waypoint The waypoint with the given name.
     */
    public abstract Waypoint getWaypoint(String name);

    /**
     * Add the provided Waypoint to the list.
     * @param waypoint The Waypoint to add.
     */
    public abstract void addWaypoint(Waypoint waypoint);

    /**
     * Removes the waypoint with the given name from the list.
     * @param name The name of the Waypoint to remove.
     * @return True if a waypoint was indeed removed.
     */
    public abstract boolean removeWaypoint(String name);

    /**
     * Gets the currently selected language.
     * @return The Language selected.
     */
    public abstract Language getLanguage();

    /**
     * Translates the given text to the currently selected language.
     * @param text The text to translate.
     * @return the translated text, or the original text if English is the
     * currently selected language.
     */
    public abstract String translate(String text);

    /**
     * Gets the 25x25 pixel image icon for the provided Material.
     * @param material The material to get the icon for.
     * @return The 25x25px ImageIcon of the provided material.
     * @throws IllegalArgumentException if the Material is AIR.
     */
    public abstract ImageIcon getIcon(Material material);
}

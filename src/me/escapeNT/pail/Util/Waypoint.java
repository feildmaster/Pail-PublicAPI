package me.escapeNT.pail.Util;

import java.io.Serializable;
import org.bukkit.Location;

/**
 * Class for storing location data about a waypoint.
 * @author escapeNT
 */
public abstract class Waypoint implements Serializable {

    /**
     * Constructs a new Waypoint from the specified Location,
     * @param loc The Location of the waypoint.
     */
    public Waypoint(String name, Location loc) {}

    /**
     * Gets this Waypoint's location.
     * @return The Location of the waypoint.
     */
    public abstract Location getLocation();

    /**
     * Returns the name of this waypoint.
     * @return the name
     */
    public abstract String getName();

    /**
     * @param x the x to set
     */
    public abstract void setX(int x);

    /**
     * @param y the y to set
     */
    public abstract void setY(int y);

    /**
     * @param z the z to set
     */
    public abstract void setZ(int z);

    /**
     * @param world the world to set
     */
    public abstract void setWorld(String world);

    /**
     * @param name the name to set
     */
    public abstract void setName(String name);
}

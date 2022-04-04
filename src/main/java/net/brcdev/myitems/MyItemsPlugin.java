package net.brcdev.myitems;

import net.brcdev.myitems.shopguiplus.MyItemsShopGUIHook;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MyItemsPlugin extends JavaPlugin {

  private MyItemsShopGUIHook myItemsShopGUIHook;

  @Override
  public void onEnable() {
    if (Bukkit.getPluginManager().getPlugin("ShopGUIPlus") != null) {
      this.myItemsShopGUIHook = new MyItemsShopGUIHook(this);
      Bukkit.getPluginManager().registerEvents(myItemsShopGUIHook, this);

      this.getLogger().info("ShopGUI+ detected.");
    } else {
      this.getLogger().warning("ShopGUI+ not found.");
    }
  }
}

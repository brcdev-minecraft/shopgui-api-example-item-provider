package net.brcdev.myitems;

import net.brcdev.myitems.provider.MyItemsProvider;
import net.brcdev.shopgui.ShopGuiPlusApi;
import org.bukkit.plugin.java.JavaPlugin;

public class MyItemsPlugin extends JavaPlugin {

  private MyItemsProvider myItemsProvider;

  @Override
  public void onEnable() {
    hookIntoShopGui();
  }

  private void hookIntoShopGui() {
    this.myItemsProvider = new MyItemsProvider();
    ShopGuiPlusApi.registerItemProvider(myItemsProvider);
  }
}

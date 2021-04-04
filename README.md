# MyItems - Example plugin using ShopGUI+'s API
This repository contains an example Spigot plugin, MyItems, created with use of [ShopGUI+'s API](https://github.com/brcdev-minecraft/shopgui-api).
It shows how to correctly implement an item provider which will be registered in ShopGUI+ and used for selling & 
buying custom items.

## Building
```
./mvnw clean package
```

## Using
After you build the artifact using Maven command above, you can drop in the plugin to the `plugins` directory of your server along with regular ShopGUI+ plugin and see how it works.

You can expect this kind of messages during server startup:
```
[23:46:06] [Server thread/INFO]: [MyItems] Enabling MyItems v1.0.0
...
[23:46:06] [Server thread/INFO]: Done (18.512s)! For help, type "help"
...
[23:46:48] [Server thread/INFO]: [ShopGUIPlus] Enabled item provider for MyItems.
```

It means that the MyItems plugin successfully registered its item provider in ShopGUI+ and can be used in shops.
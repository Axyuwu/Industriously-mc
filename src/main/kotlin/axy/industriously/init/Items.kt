package axy.industriously.init

import axy.industriously.Industriously
import axy.industriously.items.Misc
import axy.industriously.items.Parts
import axy.industriously.util.BaseItem
import net.minecraft.item.Item
import net.minecraftforge.registries.IForgeRegistry

object Items {

    private var allItems = mutableMapOf<String, BaseItem>()

    init{
        Misc.all.forEach {
            allItems[it.value.name] = it.value
        }
        Parts.Ingots.all.forEach {
            allItems[it.value.name] = it.value
        }
        Parts.Gears.all.forEach {
            allItems[it.value.name] = it.value
        }
    }

    fun register(registry : IForgeRegistry<Item>) {
        allItems.forEach {
            registry.register(
                it.value
            )
        }
    }

    fun registerModels() {
        allItems.forEach {
            if (it.value.type == "") {
                Industriously.proxy.registerItemModel(item = it.value, id = it.key)
                return@forEach
            }
            Industriously.proxy.registerItemModel(item = it.value, id = it.key, subFolders = "${it.value.type}/")
        }
    }
}


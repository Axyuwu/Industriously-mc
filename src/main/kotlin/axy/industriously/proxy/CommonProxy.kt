package axy.industriously.proxy

import net.minecraft.item.Item

open class CommonProxy {
    open fun registerItemModel(item: Item, meta: Int = 0, id: String) {}
    open fun registerItemModel(item: Item, meta: Int = 0, id: String, subFolders : String) {}
}

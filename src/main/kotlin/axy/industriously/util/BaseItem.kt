package axy.industriously.util

import axy.industriously.Industriously
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation

abstract class BaseItem(val name: String, maxStackSize: Int = 64, val type : String = "") : Item() {
    init{
        this.registryName = ResourceLocation(Industriously.MOD_ID, name)
        this.translationKey = "${Industriously.MOD_ID}.$name"
        this.maxStackSize = maxStackSize
    }
}

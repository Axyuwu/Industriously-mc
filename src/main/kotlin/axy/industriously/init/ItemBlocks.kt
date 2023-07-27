package axy.industriously.init

import axy.industriously.init.Blocks.allBlocks
import axy.industriously.util.BaseItemBlock
import net.minecraft.item.Item
import net.minecraftforge.registries.IForgeRegistry

object ItemBlocks {

    val allItemBlocks = mutableSetOf<BaseItemBlock>()

    init {
        allBlocks.forEach {
            if(!it.value.hasItemBlock) {
                return@forEach
            }
            object : BaseItemBlock(it.value) {
                init {
                    allItemBlocks.add(this)
                }
            }
        }
    }

    fun register(registry: IForgeRegistry<Item>) {
        allItemBlocks.forEach {
            registry.register(
                it
            )
        }
    }
}

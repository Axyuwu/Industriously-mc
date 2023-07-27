package axy.industriously.util

import net.minecraft.block.Block
import net.minecraft.item.ItemBlock

abstract class BaseItemBlock(block: Block, maxStackSize: Int = 64) : ItemBlock(block) {
    init{
        this.registryName = block.registryName
        this.maxStackSize = maxStackSize
    }
}

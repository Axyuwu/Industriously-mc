package axy.industriously.init

import axy.industriously.blocks.MaterialBlocks
import axy.industriously.util.BaseBlock
import net.minecraft.block.Block
import net.minecraftforge.registries.IForgeRegistry

object Blocks {

    var allBlocks = mutableMapOf<String, BaseBlock>()

    init {
        MaterialBlocks.all.forEach {
            allBlocks[it.key] = it.value
        }
    }

    fun register(registry: IForgeRegistry<Block>) {
        allBlocks.forEach {
            registry.register(
                it.value
            )
        }
    }

    fun registerModels() {

    }
}

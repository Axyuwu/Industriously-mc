package axy.industriously.util

import net.minecraft.block.material.Material

abstract class BaseBlocksFromMaterials(materials: Map<String, BaseMaterial>, blocKMaterial: Material = Material.GROUND) {
    var all = mutableMapOf<String, BaseBlock>()

    init {
        materials.forEach {
            object : BaseBlock(name = "block_${it.key}", material = blocKMaterial) {
                init {
                    all[it.key] = this
                }
            }
        }
    }
}

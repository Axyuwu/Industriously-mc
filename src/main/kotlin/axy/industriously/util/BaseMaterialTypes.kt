package axy.industriously.util

import net.minecraft.block.material.Material

object BaseMaterialTypes {
    object Metal : MaterialType(hasIngot = true, shouldCreateIngot = true, hasGear = true, hasBlock = true, shouldCreateBlock = true, blockMaterial = Material.IRON)
    object Custom : MaterialType()
}

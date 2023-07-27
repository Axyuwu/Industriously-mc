package axy.industriously.util

import net.minecraft.block.material.Material

open class MaterialType(val hasIngot: Boolean = false,
                        val shouldCreateIngot: Boolean = false,
                        val hasGear: Boolean = false,
                        val hasBlock: Boolean = false,
                        val shouldCreateBlock: Boolean = false,
                        val blockMaterial: Material? = null,
                        val harvestTool: String? = null) {

}

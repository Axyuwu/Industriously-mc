package axy.industriously.util

import axy.industriously.Industriously
import net.minecraft.block.Block
import net.minecraft.block.material.Material
import net.minecraft.util.ResourceLocation

abstract class BaseBlock(val name: String, val hasItemBlock : Boolean = true, harvestLevel: Int = 0, harvestTool: String = "pickaxe", hardness: Float = 2F, resistance: Float = 15F, material: Material = Material.GROUND) : Block(material){
    init {
        this.registryName = ResourceLocation(Industriously.MOD_ID, name)
        this.translationKey = "${Industriously.MOD_ID}.$name"
        this.setHardness(hardness)
        this.setHarvestLevel(harvestTool, harvestLevel)
        this.setResistance(resistance)

    }
}

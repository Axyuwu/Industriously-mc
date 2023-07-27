package axy.industriously.util

data class BaseMaterial(
    val type: MaterialType = BaseMaterialTypes.Custom,
    val hasIngot: Boolean = type.hasIngot,
    var shouldCreateIngot: Boolean = type.shouldCreateIngot,
    val hasGear: Boolean = type.hasGear,
    val hasBlock: Boolean = type.hasBlock,
    val shouldCreateBlock: Boolean = type.shouldCreateBlock
)

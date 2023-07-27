package axy.industriously.util

abstract class BasePartsFromMaterials(materials: Map<String, BaseMaterial>, partName: String, maxStackSize: Int = 64) {
    var all = mutableMapOf<String, BaseItem>()

    init{
        materials.forEach {
            object : BaseItem(name = "${partName}_${it.key}", maxStackSize = maxStackSize, type = partName) {
                init {
                    all[it.key] = this
                }
            }
        }
    }
}

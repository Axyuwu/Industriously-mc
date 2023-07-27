package axy.industriously.init

import axy.industriously.util.BaseMaterial
import axy.industriously.util.BaseMaterialTypes

object Materials {

    private val metal = BaseMaterialTypes.Metal

    private val all = mapOf(
        "aluminium" to BaseMaterial(metal),
        "copper" to BaseMaterial(metal),
        "silver" to BaseMaterial(metal),
        "titanium" to BaseMaterial(metal),
        "tungsten" to BaseMaterial(metal),
        "gold" to BaseMaterial(metal, shouldCreateIngot = false, shouldCreateBlock = false),
        "iron" to BaseMaterial(metal, shouldCreateIngot = false, shouldCreateBlock = false)
    )

    var shouldCreateIngot = mutableMapOf<String, BaseMaterial>()
    var hasIngot = mutableMapOf<String, BaseMaterial>()
    var hasGear = mutableMapOf<String, BaseMaterial>()
    var hasBlock = mutableMapOf<String, BaseMaterial>()
    var shouldCreateBlock = mutableMapOf<String, BaseMaterial>()

    init {
        all.forEach {
            if(it.value.shouldCreateIngot) {
                shouldCreateIngot[it.key] = it.value
            }
            if(it.value.hasIngot) {
                hasIngot[it.key] = it.value
            }
            if(it.value.hasGear) {
                hasGear[it.key] = it.value
            }
            if(it.value.hasBlock) {
                hasBlock[it.key] = it.value
            }
            if(it.value.shouldCreateBlock) {
                shouldCreateBlock[it.key] = it.value
            }
        }
    }
}

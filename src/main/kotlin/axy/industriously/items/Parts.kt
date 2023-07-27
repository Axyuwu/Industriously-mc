package axy.industriously.items

import axy.industriously.init.Materials
import axy.industriously.util.BasePartsFromMaterials

object Parts {
    object Ingots : BasePartsFromMaterials(Materials.shouldCreateIngot, "ingot")
    object Gears : BasePartsFromMaterials(Materials.hasGear, "gear")
}

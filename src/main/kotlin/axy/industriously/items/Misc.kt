package axy.industriously.items

import axy.industriously.util.BaseItem

object Misc {
    object Flour : BaseItem(name = "flour")

    val all = mapOf<String, BaseItem>(
        Flour.name to Flour
    )

}

package axy.industriously.proxy

import axy.industriously.Industriously
import net.minecraft.client.renderer.block.model.ModelResourceLocation
import net.minecraft.item.Item
import net.minecraft.util.ResourceLocation
import net.minecraftforge.client.model.ModelLoader

class ClientProxy : CommonProxy() {
    override fun registerItemModel(item: Item, meta: Int, id: String) {
        ModelLoader.setCustomModelResourceLocation(item, meta, ModelResourceLocation(item.registryName ?: return, "inventory"))
    }
    override fun registerItemModel(item: Item, meta: Int, id: String, subFolders : String) {
        ModelLoader.setCustomModelResourceLocation(item, meta, ModelResourceLocation(ResourceLocation(Industriously.MOD_ID, "${subFolders}${id}"), "inventory"))
    }
}

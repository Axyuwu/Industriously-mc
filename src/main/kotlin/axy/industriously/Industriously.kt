package axy.industriously

import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import axy.industriously.proxy.CommonProxy
import axy.industriously.init.*
import net.minecraftforge.client.event.ModelRegistryEvent

@Mod(
    modid = Industriously.MOD_ID,
    name = Industriously.MOD_NAME,
    version = Industriously.VERSION,
    modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter"
)
object Industriously {
    const val MOD_ID = "industriously"
    const val MOD_NAME = "Industriously"
    const val VERSION = "0.0.1"

    @SidedProxy(
        clientSide = "axy.industriously.proxy.ClientProxy",
        serverSide = "axy.industriously.proxy.CommonProxy"
    )
    var proxy = CommonProxy()

    @Mod.EventHandler
    fun preinit(event: FMLPreInitializationEvent) {

    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {

    }

    @Mod.EventHandler
    fun postinit(event: FMLPostInitializationEvent) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID)
    object ObjectRegistryHandler {

        @SubscribeEvent
        fun registerItems(event: RegistryEvent.Register<Item>) {
            Items.register(event.registry)
            ItemBlocks.register(event.registry)
        }

        @SubscribeEvent
        fun registerModels(event: ModelRegistryEvent){
            Items.registerModels()
            Blocks.registerModels()
        }

        @SubscribeEvent
        fun registerBlocks(event: RegistryEvent.Register<Block>) {
            Blocks.register(event.registry)
        }
    }
}




package fr.lmf.itempredicatetutorial.init;

import fr.lmf.itempredicatetutorial.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> TEST_PREDICATE = ITEMS.register("test_predicate", ()-> new Item((new Item.Properties()).group(ItemGroup.MATERIALS)));

}

package com.thecow275.electrica.items.BaseItem1102;
import com.thecow275.electrica.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;



public class ItemBase extends Item implements ItemModelProvider{
    protected String name;

    public ItemBase(String name) {
        this.name = name;
        setUnlocalizedName(name);
        setRegistryName(name);
        //setCreativeTab(electrica.creativeTab);
    }
        @Override
    public void registerItemModel(Item item) {
        Main.proxy.registerItemRenderer(this, 0, name);

    }
    @Override
    public ItemBase setCreativeTab(CreativeTabs tab) {
        super.setCreativeTab(tab);
        return this;
    }
}

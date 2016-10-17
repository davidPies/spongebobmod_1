package spongebobmod_1;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class tabs extends Item{
	public static final CreativeTabs trumpmodtab = new CreativeTabs("trumpmodtab") {
	    @Override public Item getTabIconItem() {
	        return spongebobmod_1.spatula;
	    }
	};
}

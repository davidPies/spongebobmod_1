package spongebobmod_1;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = spongebobmod_1.MODID, version = spongebobmod_1.VERSION)
public class trumpmod
{
    public static final String MODID = "spongebobmod_1";
    public static final String VERSION = "1.0";
    
    	//public static wheatcannon1 wheatcannon1;
    	public static Item pants;
    	public static Item patty;

    public static ArmorMaterial spongepants = EnumHelper.addArmorMaterial("spongepants", "spongebobmod_1:spongepants", 10, new int[]{2, 0, 0, 2}, 15, SoundEvents.BLOCK_CLOTH_HIT, 0.0F);
    	
    	@SidedProxy(clientSide="spongebobmod_1.client", serverSide="spongebobmod_1.server")
    public static sharedproxy proxy;
    
    @EventHandler
    public void pre(FMLPreInitializationEvent e){
    	proxy.registerRenderers();
    	//trumphair = new hair("trumphair", hairt, 0, EntityEquipmentSlot.HEAD);
    	//GameRegistry.registerItem(trumphair, "trumphair");
    	EntityRegistry.registerModEntity(spongebob.class, "spongebob", 0, MODID, 64, 5, true);
    	EntityRegistry.registerEgg(spongebob.class, 0, 1000);
    	 }
    @EventHandler
    public void init(FMLInitializationEvent e)
    {
    	RenderingRegistry.registerEntityRenderingHandler(spongebob.class, new RenderBiped(Minecraft.getMinecraft().getRenderManager(), new model2(), 1.0F){
    		protected ResourceLocation getEntityTexture(Entity entity){
    			return new ResourceLocation("spongebobmod_1", "textures/entity/spongebob.png"); 
    			
    		}});
    	//EntityRegistry.registerModEntity(trump.class, "trump", 0, MODID, 15, 5, true);
    	//EntityRegistry.registerEgg(trump.class, 0, 1000);
    	GameRegistry.registerItem(patty = new patty(), "patty");
        GameRegistry.registerItem(pants = new armor("spongebobmod_1:spongepants", "spongepants", spongepants, 0, EntityEquipmentSlot.LEGS), "spongepants");
    	//GameRegistry.registerItem(money = new money(4, 1, false), "money");
    	//GameRegistry.registerItem(snatcher = new snatcher(), "snatcher");
    	//GameRegistry.registerItem(spring = new spring(), "spring");
    	//GameRegistry.registerItem(handle = new handle(), "handle");
    	//GameRegistry.registerItem(grabber = new grabber(), "grabber");
    	//GameRegistry.addRecipe(new ItemStack(trumpmod.snatcher), new Object[] {"x  ", " z ", "  y", 'x', trumpmod.grabber, 'z', trumpmod.spring, 'y', trumpmod.handle});
    	//GameRegistry.addRecipe(new ItemStack(trumpmod.spring, 4), new Object[] {"x  ", " x ", "  x", 'x', Items.STRING});
    	//GameRegistry.addRecipe(new ItemStack(trumpmod.handle, 4), new Object[] {"xx", "xx", 'x', Items.STICK});
    	//GameRegistry.addRecipe(new ItemStack(trumpmod.grabber, 4), new Object[] {" x", "xx", 'x', Items.STICK});
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(patty, 0, new ModelResourceLocation(MODID + ":" + patty.getUnlocalizedName().substring(5), "inventory"));
    	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(spongepants, 0, new ModelResourceLocation(MODID + ":" + spongepants.getUnlocalizedName().substring(5), "inventory"));
    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(money, 0, new ModelResourceLocation(MODID + ":" + money.getUnlocalizedName().substring(5), "inventory"));
    	//Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(snatcher, 0, new ModelResourceLocation(MODID + ":" + snatcher.getUnlocalizedName().substring(5), "inventory"));
      	 
        //System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }
}

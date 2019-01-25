package viking.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBoat;
import net.minecraftforge.common.util.EnumHelper;
import viking.mod.objects.armor.ArmorBase;
import viking.mod.objects.items.ItemBase;
import viking.mod.objects.tools.ToolAxe;
import viking.mod.objects.tools.ToolHoe;
import viking.mod.objects.tools.ToolPickaxe;
import viking.mod.objects.tools.ToolShovel;
import viking.mod.objects.tools.ToolSword;
import viking.mod.util.Reference;

public class ItemInit 
{

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material
	public static final ToolMaterial TOOL_SA = EnumHelper.addToolMaterial("tool_sa", 2, 500, 7.0F, 2.0F, 10);
	public static final ToolMaterial TOOL_P = EnumHelper.addToolMaterial("tool_p", 3, 10000, 10.0F, 3.5F, 10);
	public static final ToolMaterial TOOL_SP = EnumHelper.addToolMaterial("tool_sp", 2, 500, 6.0F, 2.0F, 10);
	public static final ToolMaterial TOOL_AQ = EnumHelper.addToolMaterial("tool_aq", 4, 2500, 9.0F, 4.0F, 10);
	public static final ToolMaterial TOOL_AM = EnumHelper.addToolMaterial("tool_am", 5, 5000, 10.0F, 5.0F, 10);
	public static final ToolMaterial TOOL_STRANGE = EnumHelper.addToolMaterial("tool_strange", 6, 100000, 12.0F, 6.0F, 10);
	public static final ToolMaterial TOOL_SPACE = EnumHelper.addToolMaterial("tool_space", 1000000000, 1000000000, 1000000000.0F, 1000000000.0F, 1000000000);
	
	public static final ArmorMaterial ARMOR_SA = EnumHelper.addArmorMaterial("armor_sa", Reference.MODID + ":sa", 25, new int[]{3, 6, 7, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_P = EnumHelper.addArmorMaterial("armor_p", Reference.MODID + ":p",50, new int[]{5, 10, 11, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 4.0F);
	public static final ArmorMaterial ARMOR_SP = EnumHelper.addArmorMaterial("armor_sp", Reference.MODID + ":sp", 20, new int[]{3, 5, 6, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial ARMOR_AQ = EnumHelper.addArmorMaterial("armor_aq", Reference.MODID + ":aq", 44, new int[]{4, 7, 9, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial ARMOR_AM = EnumHelper.addArmorMaterial("armor_am", Reference.MODID + ":am", 55, new int[]{5, 8, 10, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	public static final ArmorMaterial ARMOR_STRANGE = EnumHelper.addArmorMaterial("armor_strange", Reference.MODID + ":strange", 33, new int[]{6, 12, 14, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static final ArmorMaterial ARMOR_SPACE = EnumHelper.addArmorMaterial("armor_space", Reference.MODID + ":space", 1000000000, new int[]{1000000000, 1000000000, 1000000000, 1000000000}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1000000000.0F);
	
	//Items
	public static final Item SA_GEM = new ItemBase("sa_gem");
	public static final Item PLASMACORE = new ItemBase("plasmacore");
	public static final Item SP_INGOT = new ItemBase("sp_ingot");
	public static final Item AQ_INGOT = new ItemBase("aq_ingot");
	public static final Item AMETHYST = new ItemBase("amethyst");
	public static final Item STRANGE_COIN = new ItemBase("strange_coin");
	public static final Item IRON_RODE = new ItemBase("iron_rode");
	public static final Item MOON_BALL = new ItemBase("moon_ball");
	
	//Tools
	public static final Item SA_SHOVEL = new ToolShovel("sa_shovel", TOOL_SA);
	public static final Item SA_PICKAXE = new ToolPickaxe("sa_pickaxe", TOOL_SA);
	public static final Item SA_AXE = new ToolAxe("sa_axe", TOOL_SA);
	public static final Item SA_SWORD = new ToolSword("sa_sword", TOOL_SA);
	public static final Item SA_HOE = new ToolHoe("sa_hoe", TOOL_SA);
	
	public static final Item P_SHOVEL = new ToolShovel("p_shovel", TOOL_P);
	public static final Item P_PICKAXE = new ToolPickaxe("p_pickaxe", TOOL_P);
	public static final Item P_AXE = new ToolAxe("p_axe", TOOL_P);
	public static final Item P_SWORD = new ToolSword("p_sword", TOOL_P);
	public static final Item P_HOE = new ToolHoe("p_hoe", TOOL_P);
	
	public static final Item SP_SHOVEL = new ToolShovel("sp_shovel", TOOL_SP);
	public static final Item SP_PICKAXE = new ToolPickaxe("sp_pickaxe", TOOL_SP);
	public static final Item SP_AXE = new ToolAxe("sp_axe", TOOL_SP);
	public static final Item SP_SWORD = new ToolSword("sp_sword", TOOL_SP);
	public static final Item SP_HOE = new ToolHoe("sp_hoe", TOOL_SP);
	
	public static final Item AM_SHOVEL = new ToolShovel("am_shovel", TOOL_AM);
	public static final Item AM_PICKAXE = new ToolPickaxe("am_pickaxe", TOOL_AM);
	public static final Item AM_AXE = new ToolAxe("am_axe", TOOL_AM);
	public static final Item AM_SWORD = new ToolSword("am_sword", TOOL_AM);
	public static final Item AM_HOE = new ToolHoe("am_hoe", TOOL_AM);
	
	public static final Item AQ_SHOVEL = new ToolShovel("aq_shovel", TOOL_AQ);
	public static final Item AQ_PICKAXE = new ToolPickaxe("aq_pickaxe", TOOL_AQ);
	public static final Item AQ_AXE = new ToolAxe("aq_axe", TOOL_AQ);
	public static final Item AQ_SWORD = new ToolSword("aq_sword", TOOL_AQ);
	public static final Item AQ_HOE = new ToolHoe("aq_hoe", TOOL_AQ);
	
	public static final Item STRANGE_SHOVEL = new ToolShovel("strange_shovel", TOOL_STRANGE);
	public static final Item STRANGE_PICKAXE = new ToolPickaxe("strange_pickaxe", TOOL_STRANGE);
	public static final Item STRANGE_AXE = new ToolAxe("strange_axe", TOOL_STRANGE);
	public static final Item STRANGE_SWORD = new ToolSword("strange_sword", TOOL_STRANGE);
	public static final Item STRANGE_HOE = new ToolHoe("strange_hoe", TOOL_STRANGE);
	
	public static final Item SPACE_SHOVEL = new ToolShovel("space_shovel", TOOL_SPACE);
	public static final Item SPACE_PICKAXE = new ToolPickaxe("space_pickaxe", TOOL_SPACE);
	public static final Item SPACE_AXE = new ToolAxe("space_axe", TOOL_SPACE);
	public static final Item SPACE_SWORD = new ToolSword("space_sword", TOOL_SPACE);
	public static final Item SPACE_HOE = new ToolHoe("space_hoe", TOOL_SPACE);
		
	//Armor
	public static final Item SA_HELMET = new ArmorBase("sa_helmet", ARMOR_SA, 1, EntityEquipmentSlot.HEAD);
	public static final Item SA_CHEST = new ArmorBase("sa_chest", ARMOR_SA, 1, EntityEquipmentSlot.CHEST);
	public static final Item SA_PANTS = new ArmorBase("sa_pants", ARMOR_SA, 2, EntityEquipmentSlot.LEGS);
	public static final Item SA_BOOTS = new ArmorBase("sa_boots", ARMOR_SA, 1, EntityEquipmentSlot.FEET);
	
	public static final Item P_HELMET = new ArmorBase("p_helmet", ARMOR_P, 1, EntityEquipmentSlot.HEAD);
	public static final Item P_CHEST = new ArmorBase("p_chest", ARMOR_P, 1, EntityEquipmentSlot.CHEST);
	public static final Item P_PANTS = new ArmorBase("p_pants", ARMOR_P, 2, EntityEquipmentSlot.LEGS);
	public static final Item P_BOOTS = new ArmorBase("p_boots", ARMOR_P, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SP_HELMET = new ArmorBase("sp_helmet", ARMOR_SP, 1, EntityEquipmentSlot.HEAD);
	public static final Item SP_CHEST = new ArmorBase("sp_chest", ARMOR_SP, 1, EntityEquipmentSlot.CHEST);
	public static final Item SP_PANTS = new ArmorBase("sp_pants", ARMOR_SP, 2, EntityEquipmentSlot.LEGS);
	public static final Item SP_BOOTS = new ArmorBase("sp_boots", ARMOR_SP, 1, EntityEquipmentSlot.FEET);
	
	public static final Item AQ_HELMET = new ArmorBase("aq_helmet", ARMOR_AQ, 1, EntityEquipmentSlot.HEAD);
	public static final Item AQ_CHEST = new ArmorBase("aq_chest", ARMOR_AQ, 1, EntityEquipmentSlot.CHEST);
	public static final Item AQ_PANTS = new ArmorBase("aq_pants", ARMOR_AQ, 2, EntityEquipmentSlot.LEGS);
	public static final Item AQ_BOOTS = new ArmorBase("aq_boots", ARMOR_AQ, 1, EntityEquipmentSlot.FEET);
	
	public static final Item AM_HELMET = new ArmorBase("am_helmet", ARMOR_AM, 1, EntityEquipmentSlot.HEAD);
	public static final Item AM_CHEST = new ArmorBase("am_chest", ARMOR_AM, 1, EntityEquipmentSlot.CHEST);
	public static final Item AM_PANTS = new ArmorBase("am_pants", ARMOR_AM, 2, EntityEquipmentSlot.LEGS);
	public static final Item AM_BOOTS = new ArmorBase("am_boots", ARMOR_AM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item STRANGE_HELMET = new ArmorBase("strange_helmet", ARMOR_STRANGE, 1, EntityEquipmentSlot.HEAD);
	public static final Item STRANGE_CHEST = new ArmorBase("strange_chest", ARMOR_STRANGE, 1, EntityEquipmentSlot.CHEST);
	public static final Item STRANGE_PANTS = new ArmorBase("strange_pants", ARMOR_STRANGE, 2, EntityEquipmentSlot.LEGS);
	public static final Item STRANGE_BOOTS = new ArmorBase("strange_boots", ARMOR_STRANGE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SPACE_HELMET = new ArmorBase("space_helmet", ARMOR_SPACE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPACE_CHEST = new ArmorBase("space_chest", ARMOR_SPACE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SPACE_PANTS = new ArmorBase("space_pants", ARMOR_SPACE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SPACE_BOOTS = new ArmorBase("space_boots", ARMOR_SPACE, 1, EntityEquipmentSlot.FEET);
}

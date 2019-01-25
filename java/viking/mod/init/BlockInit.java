package viking.mod.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import viking.mod.objects.blocks.BlockBase;
import viking.mod.objects.blocks.BlockDust;
import viking.mod.objects.blocks.BlockOres;
import viking.mod.objects.blocks.BlockSpace;

public class BlockInit
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Material Blocks
	public static final Block SA_BLOCK = new BlockBase("sa_block", Material.IRON);
	public static final Block P_BLOCK = new BlockBase("p_block", Material.IRON);
	public static final Block SP_BLOCK = new BlockBase("sp_block", Material.IRON);
	public static final Block AQ_BLOCK = new BlockBase("aq_block", Material.IRON);
	public static final Block AM_BLOCK = new BlockBase("am_block", Material.IRON);
	public static final Block SPACE_BLOCK = new BlockSpace("space_block", Material.IRON);
	
	
	//Spire
	public static final Block SPIRE_BLOCK = new BlockBase("spire_block", Material.IRON);
	public static final Block SPIRE_DUST = new BlockDust("spire_dust", Material.SAND);
	public static final Block SPIRE_STONE = new BlockBase("spire_stone", Material.ROCK);
	public static final Block SPIRE_LINK = new BlockBase("spire_link", Material.IRON);
	
	//Ore
	public static final Block ORE_OVERWORLD = new BlockOres("ore_overworld", "overworld");
	
	//Environment
}

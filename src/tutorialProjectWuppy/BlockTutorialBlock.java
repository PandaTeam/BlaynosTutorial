package tutorialProjectWuppy;

//CTRL(CMD) + SHIFT + O
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTutorialBlock extends Block
{
	//Adds the block id and material, and adds it to the creative tab. 
	public BlockTutorialBlock(int id, Material material) {
		super(id, material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}

}

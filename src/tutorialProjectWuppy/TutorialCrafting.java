package tutorialProjectWuppy;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class TutorialCrafting 
{

	public static void loadRecipies()
	{
		
		//makes a recipe to create a tutorialBlock out of the recipe. to make multiple tutorialBlock, (new ItemStack(tutorialBlock, n)
		//where n = number. (e.g. (new ItemStack(tutorialBlock, 5) makes 5 blocks from the recipe
		//if you want to make a SHAPELESS recipe, you need to call it a shapeless recipe. GameRegistry.addShapelessRecipe
		GameRegistry.addShapelessRecipe(new ItemStack(TutorialProjectWuppy.tutorialBlock), new Object[]{
			//diamond, stone, and white dye. dye number 15 is the 16th dye, (java counts 0 as the first number). 16th dye is bonemeal
			new ItemStack(Item.diamond), new ItemStack(Block.stone), new ItemStack(Item.dyePowder, 1, 15)
		});
		
		//adds the shaped recipe
		//"   "
		//"   "
		//"   "
		//Crafting Grid
		GameRegistry.addShapedRecipe(new ItemStack(TutorialProjectWuppy.tutorialBlock), new Object[]{
			"XZX",
			"CXC",
			//adding what each letter in the above crafting recipe is linked to
			'X', Item.ingotGold, 'C', Block.stone, 'Z', new ItemStack(Item.dyePowder, 1, 15)
		});
		
		//adds enchanting recipe
		ItemStack enchanted = new ItemStack(Item.pickaxeDiamond);
		enchanted.addEnchantment(Enchantment.silkTouch, 1);
		
		GameRegistry.addShapelessRecipe(enchanted, new Object[]{
				new ItemStack(Item.pickaxeDiamond), new ItemStack(Item.flint), new ItemStack(TutorialProjectWuppy.tutorialBlock)
		});
		
		//adds smelting recipes
		FurnaceRecipes.smelting().addSmelting(Item.beefCooked.itemID, new ItemStack(TutorialProjectWuppy.tutorialItem), 0.1F);
		
	}

}

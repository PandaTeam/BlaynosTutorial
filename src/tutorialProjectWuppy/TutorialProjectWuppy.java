package tutorialProjectWuppy;

//can hit Ctrl(or CMD for mac) + SHIFT + O to import the required files
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

// The "//" marker is for adding comments to code. These notes are ignored by Java
//For Forge to recognise the code is a mod
@Mod(modid = TutorialProjectWuppy.modid, name = "Tutorial Mod Wuppy", version = "1.0")

//defines if who needs the mod. this line means the client needs it, but server doesn't.
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class TutorialProjectWuppy 
{
	//Mod Name (for the modid
	public static final String modid  ="pandateam_wuppytutorial";
	
	
	public static Block tutorialBlock; 
	public static Item tutorialItem;
	
	
	//for pretty much everything, you only need "init"
	//whatever is put in this event handler is run during the Init Phase of startup
	//can use pre/post init. pre will be run BEFORE this, post will be run AFTER this
	//can be done to add dependencies for other mods
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		//tutorialBlock is an instance of Block. In the load method, set to BlockTutorialBlock (a file), take two paramteres
		//First parameter = ID of Block, send parameter is Material of Block. Material has a set of parameters, such as required tool, etc.
		tutorialBlock = new BlockTutorialBlock(500, Material.rock).setUnlocalizedName("tutorialBlock");
		
		//essentially means "pandateam_wuppytutorialtutorialBlock" - if you ever change the unlocalized name, it will change as well. 
		GameRegistry.registerBlock(tutorialBlock, modid + tutorialBlock.getUnlocalizedName().substring(5));
		
		//Adds the name of the block to the game. 
		LanguageRegistry.addName(tutorialBlock, "Tutorial Block");
		
		//adds the tutorialitem
		tutorialItem = new ItemTutorial(5000).setUnlocalizedName("tutorialItem");
		
		//adds the name of the item to the game
		LanguageRegistry.addName(tutorialItem, "Tutorial Item");
		
		TutorialCrafting.loadRecipies();

	}
	
}

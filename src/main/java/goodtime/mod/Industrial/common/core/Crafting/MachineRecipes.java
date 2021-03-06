package goodtime.mod.Industrial.common.core.Crafting;

import goodtime.mod.Industrial.common.Items.OreItem;
import goodtime.mod.Industrial.common.Items.Plate;
import goodtime.mod.Industrial.common.block.Ore;
import ic2.api.recipe.IMachineRecipeManager;
import ic2.api.recipe.IRecipeInput;
import ic2.api.recipe.RecipeInputItemStack;
import ic2.api.recipe.RecipeInputOreDict;
import ic2.api.recipe.RecipeOutput;
import ic2.api.recipe.Recipes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MachineRecipes {
	
	public static void InitMachineRecipes() {
		maceratorRecipes();
		compressorRecipes();
	}
	
	public static void maceratorRecipes() {
		Ore.IRs = new ItemStack(Ore.IR);
		//-------------------------------------------
		
		//----Ore
		Recipes.macerator.addRecipe(new RecipeInputItemStack(Ore.IRs) ,null , new ItemStack(OreItem.CrushedIR , 2));
		
		//----OreItem
		Recipes.macerator.addRecipe(new RecipeInputItemStack(OreItem.CrushedIRs), null, OreItem.DustIRs);
		Recipes.macerator.addRecipe(new RecipeInputItemStack(OreItem.IngotIRs, 1), null, OreItem.DustIRs);
	}
	
	public static void compressorRecipes() {
		//----Plate
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Item.getItemById(264))), null, new ItemStack(Plate.DimPlate));
		Recipes.compressor.addRecipe(new RecipeInputItemStack(new ItemStack(Plate.DimPlate , 9)), null, new ItemStack(Plate.DenseDimPlate));
	}
}

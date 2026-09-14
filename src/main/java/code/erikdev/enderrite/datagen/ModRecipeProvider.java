package code.erikdev.enderrite.datagen;

import code.erikdev.enderrite.EnderriteMod;
import code.erikdev.enderrite.block.EnderriteBlocks;
import code.erikdev.enderrite.item.EnderriteItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {
        public Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
            return new ModRecipeProvider(registries, output);
        }

        @Override
        public String getName() {
            return "enderrite Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        shaped(RecipeCategory.BUILDING_BLOCKS, EnderriteBlocks.ENDERRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', EnderriteItems.ENDERRITE.get())
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .group("ENDERRITE")
                .save(output);

        shapeless(RecipeCategory.MISC, EnderriteItems.ENDERRITE.get(), 9)
                .requires(EnderriteBlocks.ENDERRITE_BLOCK)
                .unlockedBy(getHasName(EnderriteBlocks.ENDERRITE_BLOCK.get()), has(EnderriteBlocks.ENDERRITE_BLOCK))
                .group("ENDERRITE")
                .save(output);

        List<ItemLike> ENDERRITE_SMELTABLES = List.of(EnderriteItems.RAW_ENDERRITE, EnderriteBlocks.ENDERRITE_ORE);

        oreSmelting(ENDERRITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, EnderriteItems.ENDERRITE.get(), 0.25f, 200, "ENDERRITE");
        oreBlasting(ENDERRITE_SMELTABLES, RecipeCategory.MISC, CookingBookCategory.MISC, EnderriteItems.ENDERRITE.get(), 0.25f, 100, "ENDERRITE");
        shaped(RecipeCategory.COMBAT, EnderriteItems.ENDERRITE_SWORD.get())
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', EnderriteItems.ENDERRITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.TOOLS, EnderriteItems.ENDERRITE_PICKAXE.get())
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', EnderriteItems.ENDERRITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.TOOLS, EnderriteItems.ENDERRITE_SHOVEL.get())
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .define('A', EnderriteItems.ENDERRITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.TOOLS, EnderriteItems.ENDERRITE_AXE.get())
                .pattern("AA")
                .pattern("SA")
                .pattern("S ")
                .define('A', EnderriteItems.ENDERRITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.TOOLS, EnderriteItems.ENDERRITE_HOE.get())
                .pattern("AA")
                .pattern("S ")
                .pattern("S ")
                .define('A', EnderriteItems.ENDERRITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.COMBAT, EnderriteItems.ENDERRITE_SPEAR.get())
                .pattern("  A")
                .pattern(" S ")
                .pattern("S  ")
                .define('A', EnderriteItems.ENDERRITE.get())
                .define('S', Items.STICK)
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK))
                .group("ENDERRITE")
                .save(output);
        
        shaped(RecipeCategory.COMBAT, EnderriteItems.ENDERRITE_HELMET.get())
                .pattern("AAA")
                .pattern("A A")
                .define('A', EnderriteItems.ENDERRITE.get())
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.COMBAT, EnderriteItems.ENDERRITE_CHESTPLATE.get())
                .pattern("A A")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', EnderriteItems.ENDERRITE.get())
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.COMBAT, EnderriteItems.ENDERRITE_LEGGINGS.get())
                .pattern("AAA")
                .pattern("A A")
                .pattern("A A")
                .define('A', EnderriteItems.ENDERRITE.get())
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .group("ENDERRITE")
                .save(output);

        shaped(RecipeCategory.COMBAT, EnderriteItems.ENDERRITE_BOOTS.get())
                .pattern("A A")
                .pattern("A A")
                .define('A', EnderriteItems.ENDERRITE.get())
                .unlockedBy(getHasName(EnderriteItems.ENDERRITE.get()), has(EnderriteItems.ENDERRITE))
                .group("ENDERRITE")
                .save(output);


    }

    @Override
    protected <T extends AbstractCookingRecipe> void oreCooking(AbstractCookingRecipe.Factory<T> factory, List<ItemLike> smeltables,
                                                                RecipeCategory craftingCategory, CookingBookCategory cookingCategory, ItemLike result,
                                                                float experience, int cookingTime, String group, String fromDesc) {
        for(ItemLike itemlike : smeltables) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), craftingCategory, cookingCategory, result, experience, cookingTime, factory).group(group).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(output, EnderriteMod.MOD_ID + ":" + getItemName(result) + fromDesc + "_" + getItemName(itemlike));
        }
    }
}
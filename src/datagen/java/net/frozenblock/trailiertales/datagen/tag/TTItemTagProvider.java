package net.frozenblock.trailiertales.datagen.tag;

import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.frozenblock.trailiertales.tag.TrailierItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public final class TTItemTagProvider extends FabricTagProvider.ItemTagProvider {

	public TTItemTagProvider(@NotNull FabricDataOutput output, @NotNull CompletableFuture<HolderLookup.Provider> registries) {
		super(output, registries);
	}

	@NotNull
	private TagKey<Item> getTag(String id) {
		return TagKey.create(this.registryKey, new ResourceLocation(id));
	}

	@Override
	protected void addTags(@NotNull HolderLookup.Provider arg) {
		this.getOrCreateTagBuilder(TrailierItemTags.COPYABLE_SHERDS)
			.add(Items.SCRAPE_POTTERY_SHERD)
			.add(Items.SHEAF_POTTERY_SHERD)
			.add(Items.SHELTER_POTTERY_SHERD)
			.add(Items.SKULL_POTTERY_SHERD)
			.add(Items.SNORT_POTTERY_SHERD)
			.add(Items.ANGLER_POTTERY_SHERD)
			.add(Items.ARCHER_POTTERY_SHERD)
			.add(Items.ARMS_UP_POTTERY_SHERD)
			.add(Items.BLADE_POTTERY_SHERD)
			.add(Items.BREWER_POTTERY_SHERD)
			.add(Items.BURN_POTTERY_SHERD)
			.add(Items.DANGER_POTTERY_SHERD)
			.add(Items.EXPLORER_POTTERY_SHERD)
			.add(Items.FLOW_POTTERY_SHERD)
			.add(Items.FRIEND_POTTERY_SHERD)
			.add(Items.GUSTER_POTTERY_SHERD)
			.add(Items.HEART_POTTERY_SHERD)
			.add(Items.HEARTBREAK_POTTERY_SHERD)
			.add(Items.HOWL_POTTERY_SHERD)
			.add(Items.MINER_POTTERY_SHERD)
			.add(Items.MOURNER_POTTERY_SHERD)
			.add(Items.PLENTY_POTTERY_SHERD)
			.add(Items.PRIZE_POTTERY_SHERD);

		this.getOrCreateTagBuilder(TrailierItemTags.POT_BASES)
			.add(Items.BRICK);
	}
}
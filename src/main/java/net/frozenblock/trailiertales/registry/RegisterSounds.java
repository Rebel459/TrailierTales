package net.frozenblock.trailiertales.registry;

import net.frozenblock.trailiertales.TrailierConstants;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.SoundType;
import org.jetbrains.annotations.NotNull;

public class RegisterSounds {
	public static final Holder.Reference<SoundEvent> MUSIC_DISC_FAUSSE_VIE = registerForHolder("music_disc.fausse_vie");

	public static final SoundEvent COFFIN_BREAK = register("block.coffin.break");
	public static final SoundEvent COFFIN_STEP = register("block.coffin.step");
	public static final SoundEvent COFFIN_PLACE = register("block.coffin.place");
	public static final SoundEvent COFFIN_HIT = register("block.coffin.hit");
	public static final SoundEvent COFFIN_FALL = register("block.coffin.fall");
	public static final SoundEvent COFFIN_SPAWN_MOB = register("block.coffin.spawn_mob");
	public static final SoundType COFFIN = new SoundType(
		1F,
		1F,
		COFFIN_BREAK,
		COFFIN_STEP,
		COFFIN_PLACE,
		COFFIN_HIT,
		COFFIN_FALL
	);

	public static final SoundEvent APPARITION_IDLE = register("entity.apparition.idle");
	public static final SoundEvent APPARITION_HURT = register("entity.apparition.hurt");
	public static final SoundEvent APPARITION_DEATH = register("entity.apparition.death");
	public static final SoundEvent APPARITION_AID = register("entity.apparition.aid");

	public static final SoundEvent SUSPICIOUS_DIRT_BREAK = register("block.suspicious_dirt.break");
	public static final SoundEvent SUSPICIOUS_DIRT_STEP = register("block.suspicious_dirt.step");
	public static final SoundEvent SUSPICIOUS_DIRT_PLACE = register("block.suspicious_dirt.place");
	public static final SoundEvent SUSPICIOUS_DIRT_HIT = register("block.suspicious_dirt.hit");
	public static final SoundEvent SUSPICIOUS_DIRT_FALL = register("block.suspicious_dirt.fall");
	public static final SoundEvent BRUSH_DIRT = register("item.brush.brushing.dirt");
	public static final SoundEvent BRUSH_DIRT_COMPLETED = register("item.brush.brushing.dirt.complete");
	public static final SoundType SUSPICIOUS_DIRT = new SoundType(
		1F,
		1F,
		SUSPICIOUS_DIRT_BREAK,
		SUSPICIOUS_DIRT_STEP,
		SUSPICIOUS_DIRT_PLACE,
		SUSPICIOUS_DIRT_HIT,
		SUSPICIOUS_DIRT_FALL
	);

	public static final SoundEvent SUSPICIOUS_CLAY_BREAK = register("block.suspicious_clay.break");
	public static final SoundEvent SUSPICIOUS_CLAY_STEP = register("block.suspicious_clay.step");
	public static final SoundEvent SUSPICIOUS_CLAY_PLACE = register("block.suspicious_clay.place");
	public static final SoundEvent SUSPICIOUS_CLAY_HIT = register("block.suspicious_clay.hit");
	public static final SoundEvent SUSPICIOUS_CLAY_FALL = register("block.suspicious_clay.fall");
	public static final SoundEvent BRUSH_CLAY = register("item.brush.brushing.clay");
	public static final SoundEvent BRUSH_CLAY_COMPLETED = register("item.brush.brushing.clay.complete");
	public static final SoundType SUSPICIOUS_CLAY = new SoundType(
		1F,
		1F,
		SUSPICIOUS_CLAY_BREAK,
		SUSPICIOUS_CLAY_STEP,
		SUSPICIOUS_CLAY_PLACE,
		SUSPICIOUS_CLAY_HIT,
		SUSPICIOUS_CLAY_FALL
	);

	public static final SoundEvent SUSPICIOUS_CLAY_WW_BREAK = register("block.suspicious_clay_ww.break");
	public static final SoundEvent SUSPICIOUS_CLAY_WW_STEP = register("block.suspicious_clay_ww.step");
	public static final SoundEvent SUSPICIOUS_CLAY_WW_PLACE = register("block.suspicious_clay_ww.place");
	public static final SoundEvent SUSPICIOUS_CLAY_WW_HIT = register("block.suspicious_clay_ww.hit");
	public static final SoundEvent SUSPICIOUS_CLAY_WW_FALL = register("block.suspicious_clay_ww.fall");
	public static final SoundEvent BRUSH_CLAY_WW = register("item.brush.brushing.clay_ww");
	public static final SoundEvent BRUSH_CLAY_WW_COMPLETED = register("item.brush.brushing.clay_ww.complete");
	public static final SoundType SUSPICIOUS_CLAY_WW = new SoundType(
		0.9F,
		1F,
		SUSPICIOUS_CLAY_WW_BREAK,
		SUSPICIOUS_CLAY_WW_STEP,
		SUSPICIOUS_CLAY_WW_PLACE,
		SUSPICIOUS_CLAY_WW_HIT,
		SUSPICIOUS_CLAY_WW_FALL
	);

	public static final SoundEvent SUSPICIOUS_GRAVEL_WW_BREAK = register("block.suspicious_gravel_ww.break");
	public static final SoundEvent SUSPICIOUS_GRAVEL_WW_STEP = register("block.suspicious_gravel_ww.step");
	public static final SoundEvent SUSPICIOUS_GRAVEL_WW_PLACE = register("block.suspicious_gravel_ww.place");
	public static final SoundEvent SUSPICIOUS_GRAVEL_WW_HIT = register("block.suspicious_gravel_ww.hit");
	public static final SoundEvent SUSPICIOUS_GRAVEL_WW_FALL = register("block.suspicious_gravel_ww.fall");
	public static final SoundEvent BRUSH_GRAVEL_WW = register("item.brush.brushing.gravel_ww");
	public static final SoundEvent BRUSH_GRAVEL_WW_COMPLETED = register("item.brush.brushing.gravel_ww.complete");
	public static final SoundType SUSPICIOUS_GRAVEL_WW = new SoundType(
		0.8F,
		1F,
		SUSPICIOUS_GRAVEL_WW_BREAK,
		SUSPICIOUS_GRAVEL_WW_STEP,
		SUSPICIOUS_GRAVEL_WW_PLACE,
		SUSPICIOUS_GRAVEL_WW_HIT,
		SUSPICIOUS_GRAVEL_WW_FALL
	);

	@NotNull
	private static SoundEvent register(@NotNull String string) {
		ResourceLocation resourceLocation = TrailierConstants.id(string);
		return Registry.register(BuiltInRegistries.SOUND_EVENT, resourceLocation, SoundEvent.createVariableRangeEvent(resourceLocation));
	}

	private static Holder.@NotNull Reference<SoundEvent> registerForHolder(String id) {
		return registerForHolder(TrailierConstants.id(id));
	}

	private static Holder.@NotNull Reference<SoundEvent> registerForHolder(ResourceLocation id) {
		return registerForHolder(id, id);
	}

	private static Holder.@NotNull Reference<SoundEvent> registerForHolder(ResourceLocation id, ResourceLocation soundId) {
		return Registry.registerForHolder(BuiltInRegistries.SOUND_EVENT, id, SoundEvent.createVariableRangeEvent(soundId));
	}

	public static void init() {}
}

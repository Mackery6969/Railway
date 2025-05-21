package com.railwayteam.railways.util;

import com.simibubi.create.content.trains.schedule.Schedule;
import com.simibubi.create.content.trains.schedule.condition.ScheduleWaitCondition;
import com.simibubi.create.content.trains.schedule.destination.ScheduleInstruction;
import com.simibubi.create.foundation.utility.Pair;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Supplier;

/**
 * Compatibility layer for Create 6.0 type changes
 */
public class CreateCompatUtil {
    /**
     * Register a schedule instruction using the correct Pair type
     */
    public static void registerInstruction(String name, ResourceLocation id, Supplier<? extends ScheduleInstruction> factory) {
        Schedule.INSTRUCTION_TYPES.add(Pair.of(id, factory));
    }

    /**
     * Register a schedule condition using the correct Pair type
     */
    public static void registerCondition(String name, ResourceLocation id, Supplier<? extends ScheduleWaitCondition> factory) {
        Schedule.CONDITION_TYPES.add(Pair.of(id, factory));
    }
    
    // Add other adapter methods as needed
}
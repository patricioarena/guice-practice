package app.repository.impl;

import java.util.List;
import com.google.inject.Singleton;

import app.enums.StateVehicle;
import app.model.vo.State;
import app.repository.ConditionVehicle;

@Singleton
public class ConditionVehicleImpl implements ConditionVehicle {

    private final List<State> statesVehicle;

    public ConditionVehicleImpl() {
        statesVehicle = List.of(
            State.builder().name(StateVehicle.NEW.name())
            .description("Unused, in perfect mechanical and aesthetic condition. It has no wear and does not require reconditioning.")
            .build(),
            State.builder().name(StateVehicle.CLEAN.name())
            .description("Some normal wear, but no major mechanical or cosmetic problems. May require limited reconditioning.")
            .build(),
            State.builder().name(StateVehicle.ROUGH.name())
            .description("Several mechanical and/or cosmetic problems requiring significant repairs.")
            .build(),
            State.builder().name(StateVehicle.DAMAGED.name())
            .description("Major mechanical and/or body damage that may render it in non-safe running condition.")
            .build()
        );
    }

    @Override
    public List<State> get() {
        return this.statesVehicle;
    }
}

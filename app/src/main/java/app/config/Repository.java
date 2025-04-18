package app.config;

import com.google.inject.PrivateModule;

import app.repository.ConditionVehicle;
import app.repository.OperationalMode;
import app.repository.impl.ConditionVehicleImpl;
import app.repository.impl.OperationalModeImpl;

public class Repository extends PrivateModule {

    @Override
    protected void configure() {
        bind(OperationalMode.class).to(OperationalModeImpl.class);
        bind(ConditionVehicle.class).to(ConditionVehicleImpl.class);

        expose(OperationalMode.class);
        expose(ConditionVehicle.class);
    }
}

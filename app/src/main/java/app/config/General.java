package app.config;

import app.component.vehicle.impl.VehicleFactoryImpl;
import app.usecase.VehicleAdapter;
import app.usecase.VehicleAdapterImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import app.component.vehicle.VehicleFactory;
import app.component.vehicle.impl.CarFactoryImpl;
import app.component.vehicle.impl.LightSailboatFactoryImpl;

public class General extends AbstractModule {

    @Override
    protected void configure() {

        bind(VehicleAdapter.class).to(VehicleAdapterImpl.class);

        bind(VehicleFactory.class).to(VehicleFactoryImpl.class);
        bind(VehicleFactory.class)
            .annotatedWith(Names.named("CarFactory"))
                .to(CarFactoryImpl.class);
       bind(VehicleFactory.class)
            .annotatedWith(Names.named("LightSailboatFactory"))
                .to(LightSailboatFactoryImpl.class);
    }
}
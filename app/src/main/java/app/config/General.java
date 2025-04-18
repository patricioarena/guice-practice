package app.config;

import app.components.vehicle.GeneralVehicleFactoryImpl;
import app.usecase.VehicleAdapter;
import app.usecase.VehicleAdapterImpl;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import app.components.vehicle.VehicleFactory;
import app.components.vehicle.impl.CarFactoryImpl;
import app.components.vehicle.impl.LightSailboatFactoryImpl;

public class General extends AbstractModule {

    @Override
    protected void configure() {
        install(new Repository());

        bind(VehicleAdapter.class).to(VehicleAdapterImpl.class);
        bind(VehicleFactory.class).to(GeneralVehicleFactoryImpl.class);

        bind(VehicleFactory.class)
            .annotatedWith(Names.named("CarFactory"))
                .to(CarFactoryImpl.class);

       bind(VehicleFactory.class)
            .annotatedWith(Names.named("LightSailboatFactory"))
                .to(LightSailboatFactoryImpl.class);


    }
}
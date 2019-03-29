package command;

import model.boat.Boat;
import model.boat.Yacht;
import model.engine.Engine;
import repository.BoatRepository;
import repository.EngineRepository;

public class CreateYacht implements Command {
    private String[] data;
    private EngineRepository engineRepository;
    private BoatRepository boatRepository;

    CreateYacht(String[] data, EngineRepository engineRepository, BoatRepository boatRepository) {
        this.data = data;
        this.engineRepository = engineRepository;
        this.boatRepository = boatRepository;
    }

    @Override
    public void execute() {
        String model = data[1];
        double weight = Double.parseDouble(data[2]);
        Engine engine = engineRepository.getByModel(data[3]);
        double cargo = Double.parseDouble(data[4]);

        Boat yacht = new Yacht(model, weight, engine, cargo);
        boatRepository.save(yacht);
    }
}

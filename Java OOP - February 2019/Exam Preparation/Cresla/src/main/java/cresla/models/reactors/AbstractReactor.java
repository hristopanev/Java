package cresla.models.reactors;

import cresla.entities.containers.ModuleContainer;
import cresla.interfaces.AbsorbingModule;
import cresla.interfaces.Container;
import cresla.interfaces.EnergyModule;
import cresla.interfaces.Module;
import cresla.interfaces.Reactor;

import java.lang.reflect.Field;
import java.util.LinkedList;

public abstract class AbstractReactor implements Reactor {

    private Container container;
    private int id;


    protected AbstractReactor(Container container, int id) {
        this.container = container;
        this.id = id;
    }


    @Override
    public abstract long getTotalEnergyOutput();

    @Override
    public abstract long getTotalHeatAbsorbing();


    @Override
    @SuppressWarnings("unchecked")
    public int getModuleCount() {
        Class moduleContainer = ModuleContainer.class;
        Field field = moduleContainer.getDeclaredFields()[1];
        field.setAccessible(true);
        try {
           return ((LinkedList<Module>)field.get(this.container)).size();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void addEnergyModule(EnergyModule energyModule) {
        this.container.addEnergyModule(energyModule);
    }

    @Override
    public void addAbsorbingModule(AbsorbingModule absorbingModule) {
        this.container.addAbsorbingModule(absorbingModule);
    }

    @Override
    public int getId() {
        return this.id;
    }

    protected Container getContainer() {
        return this.container;
    }
}

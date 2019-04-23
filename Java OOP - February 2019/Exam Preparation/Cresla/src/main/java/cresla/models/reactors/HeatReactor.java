package cresla.models.reactors;

import cresla.interfaces.Container;

public class HeatReactor extends AbstractReactor {

    private int heatReductionIndex;

    public HeatReactor(Container container, int id, int index) {
        super(container, id);
        this.heatReductionIndex = index;
    }

    @Override
    public long getTotalEnergyOutput() {
        long result = super.getContainer().getTotalEnergyOutput();

        if (result > this.getTotalHeatAbsorbing()) {
            result = 0;
        }

        return result;
    }

    @Override
    public long getTotalHeatAbsorbing() {
        return super.getContainer().getTotalHeatAbsorbing() + this.heatReductionIndex;
    }
}

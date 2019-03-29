package softwareComponent;

public abstract class Software {
    private String name;
    private String type;
    private int capacityConsumption;
    private int memoryConsumption;

    public Software(String name, String type, int capacityConsumption, int memoryConsumption) {
        this.name = name;
        this.type = type;
        this.setCapacityConsumption(capacityConsumption);
        this.setMemoryConsumption(memoryConsumption);
    }

    protected void setCapacityConsumption(int capacityConsumption){
        this.capacityConsumption = capacityConsumption;
    }

    protected void setMemoryConsumption(int memoryConsumption){
        this.memoryConsumption = memoryConsumption;
    }


    public int getCapacityConsumption() {
        return this.capacityConsumption;
    }

    public int getMemoryConsumption() {
        return this.memoryConsumption;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}

class SuperShip implements IStart{
    @Override
    public boolean Examination() {
        return false;
    }

    @Override
    public boolean EngineStarting(IStart obj) {
        return false;
    }

    @Override
    public void Start() {
        System.out.println("Старт ракеты.");
    }
}

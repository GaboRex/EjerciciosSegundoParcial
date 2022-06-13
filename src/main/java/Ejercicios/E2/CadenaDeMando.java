package Ejercicios.E2;


public class CadenaMando implements IMando {
    private IMando next;
    @Override
    public void setNext(IMando handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona personas) {
        General general = new General();
        this.setNext(general);
        Teniente teniente = new Teniente();
        general.setNext(teniente);
        Coronel coronel = new Coronel();
        teniente.setNext(coronel);
        Cabo cabo = new Cabo();
        coronel.setNext(cabo);
        this.next.criteriaHandler(personas);


    }

    @Override
    public IMando next() {
        return next;
    }
}

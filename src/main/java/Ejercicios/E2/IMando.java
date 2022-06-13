package Ejercicios.E2;

public interface IHandler {
    void setNext(IHandler handler);
    void criteriaHandler(String Tarea);
    IHandler next();
}

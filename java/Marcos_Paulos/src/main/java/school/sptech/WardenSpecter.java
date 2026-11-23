package school.sptech;

public class WardenSpecter extends SpecterIA {
    public WardenSpecter(MemoriaDeCombate memoria) { super(memoria); }

    @Override
    public void executarTurno() {
        System.out.println("Warden controla o ritmo e segura a linha.");
        super.registrar("Atacou");
    }
}
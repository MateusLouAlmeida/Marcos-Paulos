package school.sptech;

public abstract class SpecterIA {
    private int energia;
    private MemoriaDeCombate memoria; // composição: TEM UMA

    public SpecterIA(MemoriaDeCombate memoria) {
        this.energia = 100;
        this.memoria = memoria;
    }

    public abstract void executarTurno(); // abstração + gancho de polimorfismo

    public void receberDano(int valor) {
        if (valor < 0) return;
        if (!estaAtivo()){return;}

        energia = Math.max(0, energia - valor);
        memoria.registrarMemoria("Foi atacado");
    }

    public Boolean estaAtivo(){
        if (energia <= 0){
            return false;
        } else {
            return true;
        }
    }

    public void registrar(String log){
        memoria.registrarMemoria(log);
    }
}

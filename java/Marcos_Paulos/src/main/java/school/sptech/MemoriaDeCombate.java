package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class MemoriaDeCombate {
    private List<String> logs;

    public MemoriaDeCombate() {
        this.logs = new ArrayList<>();
    }

    public void registrarMemoria(String memoria){
        logs.add(memoria);
    }
}

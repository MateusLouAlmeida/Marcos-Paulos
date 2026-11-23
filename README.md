# Marcos-Paulos
Este repositório tem como fim validar a atividade/dinâmica feita em aula
# Esqueleto Java — Specter League

Equipe: Marcos Paulos

Papéis XP:
- Jonatas — Tracker
- Matheus Jacob — Driver
- Thays — Coach
- Galhiardo — Navigator
- Mateus Lourenço — AI Operator

Modelamos o núcleo OOP da Specter League em Java demonstrando os cinco conceitos obrigatórios: abstração (`SpecterIA` abstrata com `executarTurno()`), herança (`WardenSpecter` e `AssassinSpecter` estendem `SpecterIA`), polimorfismo (`Main` chama `executarTurno()` por referência do tipo base), encapsulamento (`energia` protegida por `receberDano()`) e composição (`SpecterIA` tem uma `MemoriaDeCombate` como atributo e usa `registrarAcao` para gravar eventos).

Prompt usado: "crie no users/loure/projects/Ollama o projeto do auxiliar_specter_league (1).md"

Ajuste na IA: a IA gerou o projeto inteiro de uma vez; o grupo pediu um esqueleto fiel à especificação, uma classe por vez, em projeto IntelliJ, copiando exatamente o exemplo da spec.

Diagrama: ver `diagrama-classes.mmd`.

Como compilar e executar:

javac src\*.java
java -cp src Main

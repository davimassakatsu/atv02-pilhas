public class Main {
    public static void main(String[] args) {
        System.out.println("============ PILHA SIMPLES ==========");
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        pilhaSimples.empilhar("20");
        pilhaSimples.empilhar("10");
        pilhaSimples.empilhar("30");
        pilhaSimples.exibir();
        pilhaSimples.mostrarTopo();
        pilhaSimples.quantidadeElementos();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.empilhar("10");
        pilhaSimples.empilhar("30");
        pilhaSimples.empilhar("50");
        pilhaSimples.empilhar("70");
        pilhaSimples.empilhar("90");
        pilhaSimples.empilhar("110");
        pilhaSimples.exibir();
        pilhaSimples.mostrarTopo();

        System.out.println("\n============ PILHA DINÂMICA ============");
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Banana");
        pilhaDinamica.empilhar("Maçã");
        pilhaDinamica.empilhar("Pera");
        pilhaDinamica.exibir();
        pilhaDinamica.mostrarTopo();
        pilhaDinamica.quantidadeElementos();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.empilhar("Kiwi");
        pilhaDinamica.empilhar("Pitaya");
        pilhaDinamica.exibir();
        pilhaDinamica.mostrarTopo();
    }
}

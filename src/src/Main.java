public class Main {
    public static void main(String[] args) {
        System.out.println("------ PILHA SIMPLES ------");
        PilhaSimples pilhaSimples = new PilhaSimples(5);

        pilhaSimples.empilhar("10");
        pilhaSimples.empilhar("20");
        pilhaSimples.empilhar("30");
        pilhaSimples.exibir();
        pilhaSimples.mostrarTopo();
        pilhaSimples.quantidadeElementos();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.desempilhar();
        pilhaSimples.empilhar("40");
        pilhaSimples.empilhar("50");
        pilhaSimples.empilhar("60");
        pilhaSimples.empilhar("70");
        pilhaSimples.empilhar("80");
        pilhaSimples.empilhar("90");
        pilhaSimples.exibir();
        pilhaSimples.mostrarTopo();

        System.out.println("\n------ PILHA DINÂMICA ------");
        PilhaDinamica pilhaDinamica = new PilhaDinamica();

        pilhaDinamica.empilhar("Arroz");
        pilhaDinamica.empilhar("Feijão");
        pilhaDinamica.empilhar("Batata");
        pilhaDinamica.exibir();
        pilhaDinamica.mostrarTopo();
        pilhaDinamica.quantidadeElementos();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.desempilhar();
        pilhaDinamica.empilhar("Macarrão");
        pilhaDinamica.empilhar("Carne");
        pilhaDinamica.exibir();
        pilhaDinamica.mostrarTopo();
    }
}

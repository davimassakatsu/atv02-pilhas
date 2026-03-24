public class PilhaDinamica implements PilhaOperacoes {
    No topo;

    public PilhaDinamica() {
        this.topo = null;
        System.out.println("Pilha dinâmica criada com sucesso!");
    }

    private boolean estaVazio() {
        if(this.topo == null) {
            System.out.println("A pilha está vazia!");
            return true;
        }
        return false;
    }

    @Override
    public void empilhar(String elemento) {
        No novoNo = new No(elemento);
        novoNo.setProx(this.topo);
        this.topo = novoNo;
        System.out.println("Elemento " + elemento + " adicionado com sucesso!");
    }

    @Override
    public void desempilhar() {
        if(!estaVazio()) {
            System.out.println("Elemento " + this.topo.getConteudo() + " removido com sucesso!");
            this.topo = this.topo.getProx();
        }
    }

    @Override
    public void exibir() {
        if(!estaVazio()) {
            No aux = this.topo;
            int posicao = 0;

            while(aux != null) {
                System.out.println("Pilha[" + posicao + "] = " + aux.getConteudo());
                aux = aux.getProx();
                posicao++;
            }
        }
    }

    @Override
    public void mostrarTopo() {
        if(!estaVazio()) {
            System.out.println("Topo da pilha: " + this.topo.getConteudo());
        }
    }

    @Override
    public void quantidadeElementos() {
        int quantidade = 0;
        No aux = this.topo;

        while(aux != null) {
            quantidade++;
            aux = aux.getProx();
        }

        System.out.println("Quantidade de elementos: " + quantidade);
    }
}

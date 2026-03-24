public class PilhaSimples implements PilhaOperacoes {
    int topo;
    int tamanho;
    String[] pilha;


    public PilhaSimples(int tamanho) {
        this.tamanho = tamanho;
        this.pilha = new String[tamanho];
        this.topo = -1;
        System.out.println("Pilha simples criada! Existem " + tamanho + " posições disponíveis.");
    }

    private boolean estaCheia() {
        if(this.topo == this.tamanho - 1) {
            System.out.println("Pilha cheia!");
            return true;
        }
        return false;
    }

    private boolean estaVazio() {
        if(this.topo == -1) {
            System.out.println("Pilha vazia!");
            return true;
        }
        return false;
    }

    @Override
    public void empilhar(String elemento) {
        if(!estaCheia()) {
            this.topo++;
            this.pilha[this.topo] = elemento;
            System.out.println("Elemento " + elemento + " adicionado!!");
        }
    }

    @Override
    public void desempilhar() {
        if(!estaVazio()) {
            System.out.println("Elemento " + this.pilha[this.topo] + " desempilhado e removido com sucesso!");
            this.pilha[this.topo] = null;
            this.topo--;
        }
    }

    @Override
    public void exibir() {
        if(!estaVazio()) {
            for(int i = this.topo; i >= 0; i--) {
                System.out.println("Pilha[" + i + "] = " + this.pilha[i]);
            }
        }
    }

    @Override
    public void mostrarTopo() {
        if(!estaVazio()) {
            System.out.println("Topo da pilha: " + this.pilha[this.topo]);
        }
    }

    @Override
    public void quantidadeElementos() {
        System.out.println("Numero de elementos: " + (this.topo + 1));
    }


}

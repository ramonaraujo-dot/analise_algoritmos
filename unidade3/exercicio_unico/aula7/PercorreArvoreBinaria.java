package aula7;

public class PercorreArvoreBinaria {

    static class Node {
        int valor;
        Node esquerdo, direito;

        Node(int valor) {
            this.valor = valor;
        }
    }

    static class ArvoreBinaria {
        Node raiz;

        ArvoreBinaria(int[] valores) {
            for (int v : valores) {
                raiz = inserir(raiz, v);
            }
        }

        private Node inserir(Node no, int valor) {
            if (no == null) {
                return new Node(valor);
            }

            if (valor < no.valor) {
                no.esquerdo = inserir(no.esquerdo, valor);
            } else {
                no.direito = inserir(no.direito, valor);
            }
            return no;
        }

        void mostrarArvore() {
            mostrarNo(raiz, 0);
        }

        private void mostrarNo(Node no, int nivel) {
            if (no == null) {
                return;
            }

            mostrarNo(no.direito, nivel + 1);
            for (int i = 0; i < nivel; i++) {
                System.out.print("     ");
            }
            System.out.println(no.valor);
            mostrarNo(no.esquerdo, nivel + 1);
        }

        void preOrdem(Node no) {
            if (no == null) return;
            System.out.print(no.valor + " ");
            preOrdem(no.esquerdo);
            preOrdem(no.direito);
        }

        void emOrdem(Node no) {
            if (no == null) return;
            emOrdem(no.esquerdo);
            System.out.print(no.valor + " ");
            emOrdem(no.direito);
        }

        void posOrdem(Node no) {
            if (no == null) return;
            posOrdem(no.esquerdo);
            posOrdem(no.direito);
            System.out.print(no.valor + " ");
        }
    }

    public static void main(String[] args) {
        // 25 elementos para testar a inserção e os percursos.
        int[] valores = {
            50, 30, 70, 20, 40, 60, 80, 10, 25, 35,
            45, 55, 65, 75, 90, 5, 15, 22, 27, 33,
            37, 43, 47, 85, 95
        };

        ArvoreBinaria arvore = new ArvoreBinaria(valores);

        System.out.println("Total de elementos: " + valores.length);
        System.out.println("Árvore:");
        arvore.mostrarArvore();

        System.out.print("\nPré-ordem: ");
        arvore.preOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Em-ordem: ");
        arvore.emOrdem(arvore.raiz);
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem(arvore.raiz);
        System.out.println();
    }
}

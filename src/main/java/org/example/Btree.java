package org.example;

public class Btree {
    private Bnode raiz;

    public Btree() {
        raiz = null;
    }

    public void add(Livro x) {
        if (raiz != null) {
            raiz.add(x);
        } else {
            raiz = new Bnode(x);
        }

    }
    public void show() {
        if (raiz != null) {
            raiz.show();
        }
        else{
            System.out.println("Sem dados inseridos.");
        }

    }
    public void show_isnb(String isbn){
        if (raiz != null) {
            raiz.show_isbn(isbn);
        }
        else{
            System.out.println("Sem dados inseridos.");
        }
    }

}






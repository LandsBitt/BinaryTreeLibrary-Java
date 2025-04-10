package org.example;

public class Bnode {
    private Livro lv;
    private Bnode esq,dir;

    public Bnode(Livro x) {
        this.lv = x;
        esq=dir=null;
    }

    public void add (Livro x){
        if(x.getIsbn().compareTo(lv.getIsbn()) < 0) {
            if (esq != null) {
                esq.add(x);
            } else {
                esq = new Bnode(x);
            }
        }
        else{
            if (dir != null) {
                dir.add(x);
            } else {
                dir = new Bnode(x);
            }
        }
    }
    public void show() {
        if (esq != null) {
            esq.show();
        }
        
        System.out.print("Isbn: " + lv.getIsbn() + " - Titulo: " + lv.getTitulo() + " - Autor" + lv.getAutor());

    
        System.out.println();

        if (dir != null) {
            dir.show();
        }
    }
    public void show_isbn(String isbn){

        if(esq!=null){
            esq.show_isbn(isbn);
        }
        if(lv.getIsbn().equals(isbn)){
            System.out.print("Isbn: " + lv.getIsbn() + " - Titulo: " + lv.getTitulo() + " - Autor" + lv.getAutor());
            
        }

        if(dir!=null){
            dir.show_isbn(isbn);
        }

    }



}



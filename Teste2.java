public class Teste2 {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authors[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');

        Book testeBook = new Book("Java for Dummy", authors, 19.99, 99);

        System.out.println(testeBook);

        testeBook.setPrice(29.99);
        testeBook.setQty(50);
        System.out.println("Preço atualizado: " + testeBook.getPrice());
        System.out.println("Quantidade atualizada: " + testeBook.getQty());
    }
}

//MELISSA ESCARMELOTO GUEDES CB3030296

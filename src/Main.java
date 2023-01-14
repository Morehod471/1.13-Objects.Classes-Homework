public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Aleksandr", "Pushkin");
        Author bonk = new Author("Aleksandr", "Bonk");
        System.out.println("pushkin.getName() = " + pushkin.getName());
        Book lukomorie = new Book("Lukomorie", pushkin, 1828);
        Book englishForDummies = new Book("EnglishForDummies", bonk, 1828);
        System.out.println(pushkin);
        System.out.println(pushkin.equals(bonk));
        System.out.println(lukomorie.equals(englishForDummies));

    }
}
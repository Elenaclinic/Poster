import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {


    @Test
    public void testAddPoster() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindAll() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");

        String[] expected = {"Бладшот", "Вперед", "Отель Белград", "Джентельмены", "Человек-невидимка", "Тролли. Мировой тур", "Номер один"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");

        String[] expected = {"Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast11posters() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("Отель");
        manager.addPoster("Джин");
        manager.addPoster("Человек в железной маске");
        manager.addPoster("Троя");


        String[] expected = {"Троя", "Человек в железной маске", "Джин", "Отель", "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград","Вперед"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast10posters() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("Отель");
        manager.addPoster("Джин");
        manager.addPoster("Человек в железной маске");


        String[] expected = {"Человек в железной маске", "Джин", "Отель", "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast9posters() {
        PosterManager manager = new PosterManager();

        manager.addPoster("Бладшот");
        manager.addPoster("Вперед");
        manager.addPoster("Отель Белград");
        manager.addPoster("Джентельмены");
        manager.addPoster("Человек-невидимка");
        manager.addPoster("Тролли. Мировой тур");
        manager.addPoster("Номер один");
        manager.addPoster("Отель");
        manager.addPoster("Джин");


        String[] expected = { "Джин", "Отель", "Номер один", "Тролли. Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперед", "Бладшот" };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);

    }
}

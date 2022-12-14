import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

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
}

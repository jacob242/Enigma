package file.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class fileUtilsTest {
    private final int NUMBER_OF_LINES = 5;
    private final String PATH_TO_FILE = getClass().getResource("/fileUtils/test.txt").getPath();
    private final String FIRST_LINE = "Przygotuj program, w którym będą";

    @Test
    protected void testIfNumberOfLineAreEquals() {
        String fileContent = FileTool.getFileContent(PATH_TO_FILE);
        String[] split = fileContent.split("\n");
        Assertions.assertEquals(NUMBER_OF_LINES, split.length);
    }

    @Test
    protected void firstLineEqual() {
        String fileContent = FileTool.getFileContent(PATH_TO_FILE);
        String[] split = fileContent.split("\n");
        Assertions.assertEquals(FIRST_LINE, split[0]);
    }

    @Test
    protected void howDoesSplitWorks() {
        String textToSplit = "1,2,3,4,5";
        String[] split = textToSplit.split(",");
        for (String e : split) {
            System.out.println(e);
        }
        System.out.println("===========");
        System.out.println(split.length);
    }
}


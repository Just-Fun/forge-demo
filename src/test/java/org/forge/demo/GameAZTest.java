package org.forge.demo;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

import static org.junit.Assert.assertTrue;

/**
 * Created by Serzh on 4/21/17.
 */
public class GameAZTest {

//    private GameAZ game;
    private ConfigurableInputStream in;
    private ByteArrayOutputStream out;

    @Before
    public void init() {
//        game = new GameAZ();
        out = new ByteArrayOutputStream();
        in = new ConfigurableInputStream();
        System.setIn(in);
        System.setOut(new PrintStream(out));
    }

    @Test
    public void checkLetterTest() {
        for (int i = 0; i < 26; i++) {
            char random_3_Char = (char) (65 + i);
            in.add(String.valueOf(random_3_Char));
        }
        // when
        GameAZ.main(new String[0]);

//        game.checkLetter()

        String data = getData();
        assertTrue(data.startsWith("Try to guess letter."));
        assertTrue(data.contains("Enter the letter from 'A' to 'Z'."));
        assertTrue(data.endsWith("You win!\n"));
    }

    private String getData() {
        try {
//            String result = new String(out.toByteArray(), "UTF-8").replaceAll("\r\n", "\n");
            String result = new String(out.toByteArray(), "UTF-8").replaceAll(System.lineSeparator(), "\n");
            out.reset();
            return result;
        } catch (UnsupportedEncodingException e) {
            return e.getMessage();
        }
    }
}
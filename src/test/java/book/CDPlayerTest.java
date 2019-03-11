package book;

import book.Interface.CompactDisc;
import book.Interface.impl.CDplayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sun.rmi.runtime.Log;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * TODO
 * 2019/3/8 15:11
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private CompactDisc compactDisc;

    @Autowired
    private CDplayer cDplayer;

    @Test
    public void cdShouldBeNotNull(){
        assertNotNull(compactDisc);
    }

    @Test
    public void cdplayerShouldBeNotNull(){
        assertNotNull(cDplayer.getCompactDisc());
    }

    @Test
    public void eaqulsShouldBeTrue(){
        compactDisc.play();
        assertEquals("Play :this is titile by :nb man", log.getLog());
    }
}

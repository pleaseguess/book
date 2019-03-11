package book.Interface.impl;

import book.Interface.CompactDisc;
import org.springframework.stereotype.Component;

/**
 * TODO
 * 2019/3/8 15:04
 */
@Component
public class CompactDiscImpl implements CompactDisc{

    private String title = "this is titile";
    private String artist = "nb man";

    @Override
    public void play() {
        System.out.print("Play :" + title + " by :" + artist);
    }
}

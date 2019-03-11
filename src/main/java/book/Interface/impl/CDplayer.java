package book.Interface.impl;

import book.Interface.CompactDisc;
import book.Interface.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * TODO
 * 2019/3/8 16:20
 */
@Component
public class CDplayer implements MediaPlayer {

    private CompactDisc compactDisc;

    @Autowired
    public CDplayer(CompactDisc compactDisc){
        this.compactDisc = compactDisc;
    }

    @Autowired
    public CompactDisc getCompactDisc() {
        return compactDisc;
    }

    @Autowired
    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }


    @Override
    public void play() {

    }
}

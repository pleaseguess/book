package book;

import book.Interface.CompactDisc;
import book.Interface.impl.CompactDiscImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 * 2019/3/8 15:04
 */
@Configuration
//@ComponentScan
public class CDPlayerConfig {


    @Bean
    public CompactDisc sgtPeppers(){
        return new CompactDiscImpl();
    }

    /*@Bean
    public CompactDisc randomBeatlesCD(){
        int choice = (int) Math.floor(Math.random() * 4);
        if(choice == 0){
            return new CompactDiscImpl();
        }
    }*/

}

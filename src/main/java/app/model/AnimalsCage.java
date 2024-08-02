package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired
    @Qualifier("dog")
    private Animal animal;

    @Autowired
    private Timer timer;

    public AnimalsCage(Timer timer) {
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        /*fixme время печатается всегда разное, потому что каждый раз создается новый объект. Используй поле timer
           вместо new Timer()
        */
        System.out.println(new Timer().getTime());
        System.out.println("________________________");

    }

}

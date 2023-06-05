package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Wood3 {

    private Rabbit4 rabbit;

    @Autowired
    public void setWood3(Rabbit4 rabbit) {
        this.rabbit = rabbit;
    }//связь через сетер, поле не должно быть final

    @Override
    public String toString() {
        return ", на дереве заяц " + rabbit.toString();
    }
}

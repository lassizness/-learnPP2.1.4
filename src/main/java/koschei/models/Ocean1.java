package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ocean1 {

    private Island2 island;
@Autowired
    public Ocean1(@Qualifier("island2") Island2 island){//Связывание через конструктор,
    // почему то ругался на то что не может понять какой бин, указал через аннотацию нужный
        this.island=island;
    }

    @Override
    public String toString() {
        return "на океане остров " + island.toString();
    }
}

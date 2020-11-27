package Chapter05_Convention.Ex2;

import javafx.beans.property.Property;

import java.util.ArrayList;
import java.util.List;

public class ReporterConfig {
    /*
    * 리포터 리스너의 클래스 이름
    * */
    private String m_className;

    /*
    * 리포터 리스너의 속성
    * */
    private List<Property> m_properties = new ArrayList<Property>();
    public void addProperty(Property property) {
        m_properties.add(property);
    }
}

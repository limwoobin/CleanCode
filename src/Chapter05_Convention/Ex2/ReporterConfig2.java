package Chapter05_Convention.Ex2;

import javafx.beans.property.Property;

import java.util.ArrayList;
import java.util.List;

// ReporterConfig 와 비교했을때 이 소스가
// 인스턴스 변수2개 메소드 1개라는 사실이 눈에 더 잘들어온다.
public class ReporterConfig2 {
    private String m_className;
    private List<Property> m_properties = new ArrayList<Property>();

    public void addProperty(Property property) {
        m_properties.add(property);
    }
}

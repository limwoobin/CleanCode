package Chapter05_Convention.Ex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// BoldWidget 와 BoldWidget2 의 빈 행의 차이
// 가독성에 큰 차이가 나타난다.
public class BoldWidget extends ParentWidget {
    public static final String REGEXP = "'''.+?'''";
    private static final Pattern pattern = Pattern.compile("'''(.+?)'''",
            Pattern.MULTILINE + Pattern.DOTALL);

    public BoldWidget(ParentWidget parent , String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
    }

    public String render() throws Exception {
        StringBuffer html = new StringBuffer("<b>");
        html.append("").append("</b>");
        return html.toString();
    }
}

class BoldWidget2 extends ParentWidget {
    public static final String REGEXP = "'''.+?'''";
    private static final Pattern pattern = Pattern.compile("'''(.+?)'''",
            Pattern.MULTILINE + Pattern.DOTALL);
    public BoldWidget2(ParentWidget parent , String text) throws Exception {
        super(parent);
        Matcher match = pattern.matcher(text);
        match.find();
    }
    public String render() throws Exception {
        StringBuffer html = new StringBuffer("<b>");
        html.append("").append("</b>");
        return html.toString();
    }
}
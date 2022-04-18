package pojo;

/**
 * 词法分析结果
 *
 */

public class LexerResult {


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    /**
     * 单词序号
     */
    int id;

    /**
     * 单词的值
     */
    String value;
    /**
     * 单词类型
     */
    String type;
    /**
     * 单词所在行
     */
    int line;
    /**
     * 单词是否合法
     */
    boolean flag = true;

    public LexerResult() {
    }

    public LexerResult(int id, String value, String type, int line, boolean flag) {
        this.id = id;
        this.value = value;
        this.type = type;
        this.line = line;
        this.flag = flag;
    }

}
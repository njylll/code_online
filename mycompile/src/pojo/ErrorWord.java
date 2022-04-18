package pojo;

public class ErrorWord {
    /**
     * 错误编号
     */
    int id;

    /**
     * 错误信息
     */
    String info;


    /**
     * 错误行数
     */
    int line;
    /**
     * 错误单词
     */
    pojo.LexerResult lexerResult;

    public ErrorWord() {
    }

    public ErrorWord(int id, String info, int line, pojo.LexerResult lexerResult) {
        this.id = id;
        this.info = info;
        this.line = line;
        this.lexerResult = lexerResult;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getLine() {
        return line;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public pojo.LexerResult getLexerResult() {
        return lexerResult;
    }

    public void setLexerResult(pojo.LexerResult lexerResult) {
        this.lexerResult = lexerResult;
    }
}


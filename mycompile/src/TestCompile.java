import pojo.ErrorWord;
import pojo.LexerResult;
import service.LexAnalyse;
import util.ReadFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestCompile {
    public static void main(String[] args) {

        String code = ReadFile.doRead("D:\\ideaWorkSpace\\compile\\code_online\\mycompile\\src\\test.txt");
        Map<String, List> map = LexAnalyse.doLexer(code);
        List<ErrorWord> errorList = map.get("errorList");
        HashMap<String, Object> returnMap = new HashMap<>();
        for (ErrorWord errorWord : errorList) {
            returnMap.put("result", errorWord);
            returnMap.put("msg", 0);
        }
        List<LexerResult> resultList = map.get("resultList");
        for (LexerResult lexerResult : resultList) {
            String type = String.format("%-20s", "类型: " + lexerResult.getType());
            String value = String.format("%-20s", "值为: " + lexerResult.getValue());
            String line = String.format("%-20s", "单词所在行为: " + lexerResult.getLine());
            String id = String.format("%-20s", "单词Id为:" + lexerResult.getId());

            System.out.println(type+value+line+id);
        }
    }
}

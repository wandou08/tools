package cn.ezbuild.tools;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * 测试运行类
 *
 * @author wandoupeas
 * @version 1.0.0
 * @since 0.0.1
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(ToolsTests.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("测试结果：" + result.wasSuccessful());
    }
}

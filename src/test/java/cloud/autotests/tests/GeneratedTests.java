package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("You can explore some docs /src/test/java/docs how to write tests.\n" + 
            "Also, autotest can be developed by QA.GURU engineers for low price, contact admin@qa.guru")
    @DisplayName("Test1")
    void generated0Test() {
        step("test2", () -> {
            step("// todo: just add selenium action");
        });

        step("", () -> {
            step("// todo: just add selenium action");
        });

        step("2", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("You can explore some docs /src/test/java/docs how to write tests.\n" + 
            "Also, autotest can be developed by QA.GURU engineers for low price, contact admin@qa.guru")
    @DisplayName("hola hola")
    void generated1Test() {
        step("haha", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://qa.guru'", () ->
            open("https://qa.guru"));

        step("Page title should have text 'QA.GURU'", () -> {
            String expectedTitle = "QA.GURU";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://qa.guru'", () ->
            open("https://qa.guru"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
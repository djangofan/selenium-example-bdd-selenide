import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.Step;

public class StepImplementation {

    @Step("access <url> in browser.")
    public void accessUrl(String url) {
        Selenide.open(url);
    }

    @Step("input <word> in <selector> element.")
    public void inputTextIn(String word, String selector) {
        Selenide.$(selector).val(word);
    }

    @Step("click <selector> element.")
    public void click(String selector) {
        Selenide.$(selector).click();
    }

    @Step("verify page shows <text> link.")
    public void verifyLinkByText(String text) {
        Selenide.$(Selectors.byLinkText(text)).is(Condition.exist);
    }
}

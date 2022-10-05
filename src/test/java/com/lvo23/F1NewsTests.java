package com.lvo23;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.lvo23.pages.F1NewsPage;

/**
 * @author Vlad Litvinov
 */
public class F1NewsTests extends BaseTest {

    /**
     * Инициализация страницы с формой регистрации
     */
    F1NewsPage f1NewsPage = new F1NewsPage();

    @ValueSource(strings = { "Нет, отставание уже слишком велико", "В Формуле 1 всё возможно",
            "Нет, для этого должно произойти что-то невероятное" })
    @ParameterizedTest(name = "Проверка выбора ответа {0} в опросе про лидерство")
    void checkVotingWidgetTest(String variant) {

        f1NewsPage.openPage().setWidgetVote(variant).submitButtonClick().checkVisibleSlider();
    }

}

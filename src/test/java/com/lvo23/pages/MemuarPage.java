package com.lvo23.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

/**
 * @author Vlad Litvinov страница со статьями
 */
public class MemuarPage {

    /**
     * Константа урла страницы статей
     */
    private static final String REG_FORM_URL = "/memuar/";

    /**
     * Константа с текстом заголовка на странице
     */
    private final static String TITLE_TEXT = "Статьи";

    /**
     * Нужные локаторы на странице
     */
    private final SelenideElement postTitle = $(".post_title");

    /**
     * метод открытия страницы со вспомогательными действиями
     *
     * @return F1NewsPage
     */
    public MemuarPage openPage() {

        open(REG_FORM_URL);
        postTitle.shouldHave(text(TITLE_TEXT));

        return this;
    }

    /**
     * выбор года, в котором была опубликована статья
     * @param year год
     * @return MemuarPage
     */
    public MemuarPage yearSelect(int year) {

        $(byTagAndText("a", String.valueOf(year))).click();
        return this;
    }

    /**
     * проверка того, что заголовок содержит выбранный год
     * @param titleText текст заголовка
     * @return MemuarPage
     */
    public MemuarPage checkTitle(String titleText) {

        postTitle.shouldHave(text(titleText));
        return this;
    }

}

package com.lvo23.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

/**
 * @author Vlad Litvinov
 */
public class MemuarPage {

    /**
     * Константа урла с формой регистрации
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

    public MemuarPage yearSelect(int year) {

        $(byTagAndText("a",String.valueOf(year))).click();
        return this;
    }

    public MemuarPage checkTitle(String titleText) {

        postTitle.shouldHave(text(titleText));
        return this;
    }

}

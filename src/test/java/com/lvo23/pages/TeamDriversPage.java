package com.lvo23.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

/**
 * @author Vlad Litvinov
 */
public class TeamDriversPage {

    /**
     * Константа урла страницы статей
     */
    private static final String REG_FORM_URL = "/Championship/2022/drivers.shtml";

    /**
     * Константа с текстом заголовка на странице
     */
    private final static String TITLE_TEXT = "Сезон 2022: Составы команд";

    /**
     * Нужные локаторы на странице
     */
    private final SelenideElement postTitle = $(".post_title"), content = $(".post_content");

    /**
     * метод открытия страницы со вспомогательными действиями
     *
     * @return TeamDriversPage
     */
    public TeamDriversPage openPage() {

        open(REG_FORM_URL);
        postTitle.shouldHave(text(TITLE_TEXT));

        return this;
    }

    public TeamDriversPage checkTeamName(String team) {

        content.shouldHave(text(team));
        return this;
    }

}

package com.lvo23.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;

/**
 * @author Vlad Litvinov
 */
public class ChampionatTeamsPage {

    /**
     * Константа урла страницы команд
     */
    private static final String CHAMP_DRIVERS_URL = "/auto/_f1/tournament/689/teams/";

    /**
     * Константа с текстом заголовка на странице
     */
    private final static String TITLE_TEXT = "Формула-1 2022";

    /**
     * Нужные локаторы на странице
     */
    private final SelenideElement titleName = $(".entity-header__title-name"),
            driversButton = $("[title=Спортсмены]");

    /**
     * метод открытия страницы со вспомогательными действиями
     *
     * @return TeamDriversPage
     */
    public ChampionatTeamsPage openPage() {

        open(CHAMP_DRIVERS_URL);
        titleName.shouldHave(text(TITLE_TEXT));

        return this;
    }

    /**
     * нажать на карточку с названием команды
     * 
     * @param teamName
     *            название команды
     * @return ChampionatTeamsPage
     */
    public ChampionatTeamsPage clickOnTeamItem(String teamName) {

        $$(".teams-item__name").findBy(text(teamName)).click();
        return this;
    }

    /**
     * клик на нужную кнопку с гонщиками
     * 
     * @return ChampionatTeamsPage
     */
    public ChampionatTeamsPage clickOnButtonDrivers() {

        driversButton.click();
        return this;
    }

    /**
     * проверка того, что заголовок содержит выбранный год
     * 
     * @param titleText
     *            текст заголовка
     * @return MemuarPage
     */
    public ChampionatTeamsPage checkTitle(String titleText) {

        titleName.shouldHave(text(titleText));
        return this;
    }

    /**
     * проверка количества гонщиков в таблице специально делается +1, тк ещё одна строка это
     * названия столбцов в таблице
     * 
     * @param countDrivers
     *            кол-во гонщиков в команде
     * @return ChampionatTeamsPage
     */
    public ChampionatTeamsPage checkDriversInTable(int countDrivers) {

        int countRowTable = countDrivers + 1;
        $$(".table-responsive__row").shouldHave(CollectionCondition.size(countRowTable));
        return this;
    }
}

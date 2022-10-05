package com.lvo23.pages;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

/**
 * @author Vlad Litvinov главная страница новостей
 */
public class F1NewsPage {

    /**
     * Нужные локаторы на странице
     */
    private final SelenideElement titleLogo = $(".b-logo__img"), widgetVoting = $(".voting"),
            submitButton = $("#pollbtn"), itemSlider = $(".forecasts_contest_item_slider");

    /**
     * метод открытия страницы со вспомогательными действиями
     *
     * @return F1NewsPage
     */
    public F1NewsPage openPage() {

        open("/");
        titleLogo.shouldBe(visible);
        widgetVoting.scrollIntoView(true);

        return this;
    }

    /**
     * выбрать вариант ответа в голосовании
     *
     * @param value
     *            вариант ответа строкой
     * @return F1NewsPage
     */
    public F1NewsPage setWidgetVote(String value) {

        widgetVoting.$(byText(value)).click();

        return this;
    }

    /**
     * нажать кнопку подтверждения
     * 
     * @return F1NewsPage
     */
    public F1NewsPage submitButtonClick() {

        submitButton.click();
        return this;
    }

    /**
     * проверка отображения слайдера после подтверждения выбора
     * 
     * @return F1NewsPage
     */
    public F1NewsPage checkVisibleSlider() {

        itemSlider.shouldBe(visible);
        return this;
    }
}

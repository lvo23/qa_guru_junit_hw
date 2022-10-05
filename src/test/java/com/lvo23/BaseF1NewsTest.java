package com.lvo23;

import org.junit.jupiter.api.BeforeAll;

import com.codeborne.selenide.Configuration;

/**
 * @author Vlad Litvinov
 */
public class BaseF1NewsTest {
    /**
     * метод сет-ап, который выполнится перед всеми тестами
     */
    @BeforeAll
    static void setUp() {

        Configuration.baseUrl = "https://www.f1news.ru";
        //        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";
    }

}

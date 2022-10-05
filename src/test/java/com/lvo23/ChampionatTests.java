package com.lvo23;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.lvo23.enums.Team;
import com.lvo23.pages.ChampionatTeamsPage;

/**
 * @author Vlad Litvinov
 */
public class ChampionatTests extends BaseChampionatTest {

    ChampionatTeamsPage championatTeamsPage = new ChampionatTeamsPage();

    @MethodSource("driversDataProvider")
    @ParameterizedTest(name = "Проверка количества {1} гонщиков в команде {0}")
    void checkLineUpTeam(String team, int countDrivers) {

        championatTeamsPage.openPage().clickOnTeamItem(team).clickOnButtonDrivers()
                .checkTitle(team).checkDriversInTable(countDrivers);
    }

    static Stream<Arguments> driversDataProvider() {

        return Stream.of(Arguments.of(Team.RED_BULL.getCutName(), 3),
                Arguments.of(Team.MERCEDES.getCutName(), 3),
                Arguments.of(Team.FERRARI.getCutName(), 2));
    }

}

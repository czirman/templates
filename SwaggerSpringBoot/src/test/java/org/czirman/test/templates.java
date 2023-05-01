package org.czirman.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;

import org.czirman.services.TestServices;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@ExtendWith(MockitoExtension.class)
public class templates {

    @Mock
    private TestServices testServices;


    @Test
    public void example(){

    }

    @ParameterizedTest
    @MethodSource("provideListOfId")
    void parametrizedTest(List<Integer> ids) {

    }

    private static Stream<Arguments> provideListOfId() {
        return Stream.of(
                Arguments.of(Arrays.asList(4, 3, 4))
        );
    }
}


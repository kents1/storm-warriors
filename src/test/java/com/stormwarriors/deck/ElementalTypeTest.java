package com.stormwarriors.deck;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class ElementalTypeTest {

    @Test
    @DisplayName("Elemental types should only contain Thunder")
    void shouldContainAllElementalTypes() {
        final List<String> allCardTypes = Arrays.stream(ElementalType.values())
                .map(Enum::name)
                .collect(Collectors.toList());
        assertEquals(1, allCardTypes.size());
        assertTrue(allCardTypes.contains("THUNDER"));
    }

}

package io.s1n.value;

import java.util.Map;

public record Reviewer(Name name, Boolean verified, Country country,
                       Map<String, String> otherInfo) {
}

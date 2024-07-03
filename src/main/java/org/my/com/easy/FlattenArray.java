package org.my.com.easy;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Slf4j
public class FlattenArray {
    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6}, 7};

        List<Object> flattenedList = flatten(array);
        log.info(flattenedList.toString());
    }

    public static List<Object> flatten(Object[] array) {
        return Arrays.stream(array)
                .flatMap(FlattenArray::flattenHelper)
                .collect(Collectors.toList());
    }

    private static Stream<Object> flattenHelper(Object element) {
        if (element instanceof Object[]) {
            return Arrays.stream((Object[]) element).flatMap(FlattenArray::flattenHelper);
        } else {
            return Stream.of(element);
        }
    }
}

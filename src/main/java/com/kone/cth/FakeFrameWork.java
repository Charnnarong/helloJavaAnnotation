package com.kone.cth;

import java.lang.reflect.Field;

public class FakeFrameWork {

    public static <T> T newInstance(Class<T> className) throws IllegalAccessException, InstantiationException {

        T obj = className.newInstance();

        for (Field field : className.getDeclaredFields()) {
            if (field.isAnnotationPresent(KoneDefault.class)) {
                KoneDefault koneDefault = field.getAnnotation(KoneDefault.class);
                String annotationValue = koneDefault.value();
                assignFieldToValue(obj, field, annotationValue);
            }
        }

        return obj;

    }

    private static <T> void assignFieldToValue(T obj, Field field, String annotationValue) throws IllegalAccessException {

        if (!field.isAccessible()) {
            field.setAccessible(true);
        }
        field.set(obj, annotationValue);
    }
}

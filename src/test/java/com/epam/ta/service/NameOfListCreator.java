package com.epam.ta.service;

public class NameOfListCreator {
    private static final String TEST_DATA_NAME_OF_NEW_LIST = "test_data.name_of_new_list";
    private NameOfListCreator() {}
    public static NameOfList getNameOfNewList() {
        return new NameOfList(TestDataReader.getUserData(TEST_DATA_NAME_OF_NEW_LIST));
    }
}

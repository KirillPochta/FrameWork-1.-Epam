package com.epam.ta.service;

import com.epam.ta.model.User;

public class UserCreator {
    private static final String TEST_DATA_USER_POSITIVE_LOGIN = "test_data.user_positive.login";
    private static final String TEST_DATA_USER_POSITIVE_PASSWORD = "test_data.user_positive.password";
    private static final String TEST_DATA_USER_NEGATIVE_EMAIL = "test_data.user_negative.login";
    private static final String TEST_DATA_USER_NEGATIVE_PASSWORD = "test_data.user_negative.password";

    private UserCreator() { }

    public static User getUserPosivite(){
        return new User(TestDataReader.getUserData(TEST_DATA_USER_POSITIVE_LOGIN),
                TestDataReader.getUserData(TEST_DATA_USER_POSITIVE_PASSWORD));
    }
    public static User getUserNegative(){
        return new User(TestDataReader.getUserData(TEST_DATA_USER_NEGATIVE_EMAIL),
                TestDataReader.getUserData(TEST_DATA_USER_NEGATIVE_PASSWORD));
    }
}

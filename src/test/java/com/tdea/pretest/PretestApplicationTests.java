package com.tdea.pretest;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

class PretestApplicationTests {

    @Test
    void contextLoads() {
        String dbPassword = "pablo";
        String password = "pablo";
        UserUtils userUtils = new UserUtils();
        assertTrue(userUtils.isPasswordEqual(dbPassword,password));
    }

}

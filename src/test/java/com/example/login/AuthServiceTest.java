package com.example.login;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AuthServiceTest {

    private AuthService authService;

    @Before
    public void setUp() {
        authService = new AuthService();
    }

    @Test
    public void testAuthenticateSuccess() {
        assertTrue(authService.authenticate("admin", "password123"));
    }

    @Test
    public void testAuthenticateFailure() {
        assertFalse(authService.authenticate("admin", "wrongpassword"));
    }
}

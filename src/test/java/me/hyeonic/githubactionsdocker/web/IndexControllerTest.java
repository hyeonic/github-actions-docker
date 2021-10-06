package me.hyeonic.githubactionsdocker.web;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class IndexControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET /")
    void defaultPage() throws Exception {

        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET /hello")
    void hello() throws Exception {

        mockMvc.perform(get("/hello"))
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET /codecov")
    void codecov() throws Exception {

        mockMvc.perform(get("/codecov"))
                .andExpect(status().isOk());
    }
}
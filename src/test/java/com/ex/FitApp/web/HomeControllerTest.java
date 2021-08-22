package com.ex.FitApp.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getIndexShouldReturnStatusOk() throws Exception {
        this.mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }

    @Test
    public void getAboutUsShouldReturnStatusOk() throws Exception {
        this.mockMvc.perform(get("/about-us"))
                .andExpect(status().isOk());
    }

    @Test
    public void getHomeShouldReturnStatusFound() throws Exception {
        this.mockMvc.perform(get("/home"))
                .andExpect(status().isFound());
    }

}
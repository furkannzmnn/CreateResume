package com.example.resume.api.controller;

import com.example.resume.Business.ExperienceService;
import com.example.resume.DataAcces.ExperienceDao;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ExperienceControllerTest {


    @Mock
    private ExperienceDao experienceDao;

    @InjectMocks
    private ExperienceService experienceService;


}
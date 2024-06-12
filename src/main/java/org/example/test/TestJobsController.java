package org.example.test;

import jakarta.ws.rs.core.UriBuilder;
import jakarta.ws.rs.core.UriInfo;
import org.example.controller.JobsController;
import org.example.dao.JobsDAO;
import org.example.mappers.JobMapper;
import org.example.models.Jobs;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.net.URI;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TestJobsController {

    @InjectMocks
    JobsController jobsController;

    @Mock
//    @Spy
    JobsDAO dao;

    @Mock
    JobMapper mapper;

    @Mock
    UriInfo uriInfo;


    @Test
    public void testUpdateController(){

        Jobs jobs = new Jobs(8 , "Manager" , 6500 , 5500);
        URI uri = URI.create("http://localhost/api/job/1");

        when(uriInfo.getAbsolutePathBuilder()).thenReturn(UriBuilder.fromUri(uri));
        Assertions.assertDoesNotThrow(() -> jobsController.UPDATE_JOB(1,jobs));


    }



}
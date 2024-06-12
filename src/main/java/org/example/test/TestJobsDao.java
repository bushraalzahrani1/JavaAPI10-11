package org.example.test;

import org.example.dao.JobsDAO;
import org.example.models.Jobs;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.sql.SQLException;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TestJobsDao {


    @Test
    public void testUpdateJobs() throws SQLException, ClassNotFoundException {

        JobsDAO dao = new JobsDAO();
        Jobs jobs = new Jobs(8 , "Manager" , 6500 , 5500);

        Assertions.assertDoesNotThrow(() -> dao.updateJob(jobs));

        Jobs newJ = dao.selectJob(jobs.getJob_id());

        Assertions.assertNotNull(newJ);
        Assertions.assertEquals(newJ.getJob_title(), jobs.getJob_title());
        Assertions.assertEquals(newJ.getMin_salary(), jobs.getMin_salary());
        Assertions.assertEquals(newJ.getMax_salary(), jobs.getMax_salary());

    }





}
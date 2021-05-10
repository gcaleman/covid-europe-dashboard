package com.covideurope.dashboard.data;

import com.covideurope.dashboard.model.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.Map;

@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    private EntityManager em;

    @Autowired
    public JobCompletionNotificationListener(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public void afterJob(JobExecution jobExecution) {

        if (jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("!!! JOB FINISHED! Time to verify the results");

            Map<String, Country> countryData = new HashMap<>();

            em.createQuery("select c.location, c.continent, c.population, c.totalCases from Covid c where c.date=(select max(c.date) from Covid c)", Object[].class)
                    .getResultList()
                    .stream()
                    .map(r -> new Country((String) r[0], (String) r[1], (Integer) r[2], (Integer) r[3])
                    ).forEach(country -> countryData.put(country.getCountryName(), country));

            countryData.values().forEach(country -> em.persist(country));

        }
    }
}
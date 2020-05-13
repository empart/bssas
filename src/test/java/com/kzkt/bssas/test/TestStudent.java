package com.kzkt.bssas.test;

import com.alibaba.druid.sql.visitor.functions.Now;
import com.kzkt.bssas.model.MelotResult;
import com.kzkt.bssas.model.Student;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class TestStudent {


    private RestTemplate restTemplate;

    private String qa;


    @Parameters({"qa"})
    @BeforeClass
    public void init(String qa) {
        this.restTemplate = new RestTemplate();
        this.qa = qa;
    }

    @DataProvider(name = "student")
    public Object[][] forStudent() {
        return new Object[][]{
                {new Student("testNg","16644444440")},
                {new Student("testNG1","16644444441")},
                {new Student("testNG2","16644444442")},
                {new Student("testNG3","16644444443")},
                {new Student("testNG4","16644444444")},
                {new Student("testNG5","16644444445")},
                {new Student("testNG6","16644444446")},
                {new Student("testNG7","16644444447")},
                {new Student("testNG8","16644444448")},
                {new Student("testNG9","16644444449")}
        };
    }


    @Test(dataProvider = "student")
    public void addStudent(Student student) throws URISyntaxException {
        String url = qa + "org/student/create";
        Map<String,Object> map = new HashMap<>();
        map.put("personName",student.getPersonName());
        map.put("mobile",student.getMobile());
        HttpEntity<Map<String,Object>> httpEntity = new HttpEntity<>(map);
        ResponseEntity<MelotResult> entity = restTemplate.postForEntity(url, httpEntity,MelotResult.class);
        Assert.assertTrue(entity.getStatusCode().is2xxSuccessful());
    }

}

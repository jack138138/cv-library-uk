package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */
public class TestData {
    @DataProvider(name = "criteria")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                {"Tester", "Harrow", "5 miles", "30000", "500000", "Per annum", "Permanent", "Permanent Tester jobs in Harrow on the Hill"},
                {"Tester", "Reading", "1 mile", "2000", "5000", "Per month", "Contract", "Contract Tester jobs in Reading"},
                {"Tester", "Ealing", "10 miles", "100", "500", "Per day", "Part Time", "Part Time Tester jobs in Ealing"},
                {"Tester", "Stanmore", "2 miles", "35", "55", "Per hour", "Temporary", "Temporary Tester jobs in Stanmore"},
                {"Tester", "Pinner", "25 miles", "25000", "900000", "Per annum", "Apprenticeship", "Apprenticeship Tester jobs in Pinner"},
                {"Tester", "Finchley", "7 miles", "55000", "65000", "Per annum", "Permanent", "Permanent Tester jobs in Finchley"},
                {"Tester", "London", "750 miles", "32000", "70000", "Per annum", "Temporary", "Temporary Tester jobs in London"},

        };
        return data;
    }
        }



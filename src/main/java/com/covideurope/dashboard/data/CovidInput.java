package com.covideurope.dashboard.data;


public class CovidInput {

    private String id;
    private String iso_code;
    private String continent;
    private String location;
    private String date;
    private String total_cases;
    private String new_cases;
    private String total_deaths;
    private String new_deaths;
    private String total_cases_per_million;
    private String new_cases_per_million;
    private String total_deaths_per_million;
    private String new_deaths_per_million;
    private String icu_patients;
    private String icu_patients_per_million;
    private String hosp_patients;
    private String weekly_icu_admissions;
    private String weekly_icu_admissions_per_million;
    private String weekly_hosp_admissions;
    private String positive_rate;
    private String total_vaccinations;
    private String people_vaccinated;
    private String people_fully_vaccinated;
    private String new_vaccinations;
    private String total_vaccinations_per_hundred;
    private String people_vaccinated_per_hundred;
    private String people_fully_vaccinated_per_hundred;
    private String population;

    public CovidInput() {
    }

    public CovidInput(String id, String iso_code, String continent, String location, String date, String total_cases, String new_cases, String total_deaths, String new_deaths, String total_cases_per_million, String new_cases_per_million, String total_deaths_per_million, String new_deaths_per_million, String icu_patients, String icu_patients_per_million, String hosp_patients, String weekly_icu_admissions, String weekly_icu_admissions_per_million, String weekly_hosp_admissions, String positive_rate, String total_vaccinations, String people_vaccinated, String people_fully_vaccinated, String new_vaccinations, String total_vaccinations_per_hundred, String people_vaccinated_per_hundred, String people_fully_vaccinated_per_hundred, String population) {
        this.id = id;
        this.iso_code = iso_code;
        this.continent = continent;
        this.location = location;
        this.date = date;
        this.total_cases = total_cases;
        this.new_cases = new_cases;
        this.total_deaths = total_deaths;
        this.new_deaths = new_deaths;
        this.total_cases_per_million = total_cases_per_million;
        this.new_cases_per_million = new_cases_per_million;
        this.total_deaths_per_million = total_deaths_per_million;
        this.new_deaths_per_million = new_deaths_per_million;
        this.icu_patients = icu_patients;
        this.icu_patients_per_million = icu_patients_per_million;
        this.hosp_patients = hosp_patients;
        this.weekly_icu_admissions = weekly_icu_admissions;
        this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
        this.weekly_hosp_admissions = weekly_hosp_admissions;
        this.positive_rate = positive_rate;
        this.total_vaccinations = total_vaccinations;
        this.people_vaccinated = people_vaccinated;
        this.people_fully_vaccinated = people_fully_vaccinated;
        this.new_vaccinations = new_vaccinations;
        this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
        this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
        this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIso_code() {
        return iso_code;
    }

    public void setIso_code(String iso_code) {
        this.iso_code = iso_code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal_cases() {
        return total_cases;
    }

    public void setTotal_cases(String total_cases) {
        this.total_cases = total_cases;
    }

    public String getNew_cases() {
        return new_cases;
    }

    public void setNew_cases(String new_cases) {
        this.new_cases = new_cases;
    }

    public String getTotal_deaths() {
        return total_deaths;
    }

    public void setTotal_deaths(String total_deaths) {
        this.total_deaths = total_deaths;
    }

    public String getNew_deaths() {
        return new_deaths;
    }

    public void setNew_deaths(String new_deaths) {
        this.new_deaths = new_deaths;
    }

    public String getTotal_cases_per_million() {
        return total_cases_per_million;
    }

    public void setTotal_cases_per_million(String total_cases_per_million) {
        this.total_cases_per_million = total_cases_per_million;
    }

    public String getNew_cases_per_million() {
        return new_cases_per_million;
    }

    public void setNew_cases_per_million(String new_cases_per_million) {
        this.new_cases_per_million = new_cases_per_million;
    }

    public String getTotal_deaths_per_million() {
        return total_deaths_per_million;
    }

    public void setTotal_deaths_per_million(String total_deaths_per_million) {
        this.total_deaths_per_million = total_deaths_per_million;
    }

    public String getNew_deaths_per_million() {
        return new_deaths_per_million;
    }

    public void setNew_deaths_per_million(String new_deaths_per_million) {
        this.new_deaths_per_million = new_deaths_per_million;
    }

    public String getIcu_patients() {
        return icu_patients;
    }

    public void setIcu_patients(String icu_patients) {
        this.icu_patients = icu_patients;
    }

    public String getIcu_patients_per_million() {
        return icu_patients_per_million;
    }

    public void setIcu_patients_per_million(String icu_patients_per_million) {
        this.icu_patients_per_million = icu_patients_per_million;
    }

    public String getHosp_patients() {
        return hosp_patients;
    }

    public void setHosp_patients(String hosp_patients) {
        this.hosp_patients = hosp_patients;
    }

    public String getWeekly_icu_admissions() {
        return weekly_icu_admissions;
    }

    public void setWeekly_icu_admissions(String weekly_icu_admissions) {
        this.weekly_icu_admissions = weekly_icu_admissions;
    }

    public String getWeekly_icu_admissions_per_million() {
        return weekly_icu_admissions_per_million;
    }

    public void setWeekly_icu_admissions_per_million(String weekly_icu_admissions_per_million) {
        this.weekly_icu_admissions_per_million = weekly_icu_admissions_per_million;
    }

    public String getWeekly_hosp_admissions() {
        return weekly_hosp_admissions;
    }

    public void setWeekly_hosp_admissions(String weekly_hosp_admissions) {
        this.weekly_hosp_admissions = weekly_hosp_admissions;
    }

    public String getPositive_rate() {
        return positive_rate;
    }

    public void setPositive_rate(String positive_rate) {
        this.positive_rate = positive_rate;
    }

    public String getTotal_vaccinations() {
        return total_vaccinations;
    }

    public void setTotal_vaccinations(String total_vaccinations) {
        this.total_vaccinations = total_vaccinations;
    }

    public String getPeople_vaccinated() {
        return people_vaccinated;
    }

    public void setPeople_vaccinated(String people_vaccinated) {
        this.people_vaccinated = people_vaccinated;
    }

    public String getPeople_fully_vaccinated() {
        return people_fully_vaccinated;
    }

    public void setPeople_fully_vaccinated(String people_fully_vaccinated) {
        this.people_fully_vaccinated = people_fully_vaccinated;
    }

    public String getNew_vaccinations() {
        return new_vaccinations;
    }

    public void setNew_vaccinations(String new_vaccinations) {
        this.new_vaccinations = new_vaccinations;
    }

    public String getTotal_vaccinations_per_hundred() {
        return total_vaccinations_per_hundred;
    }

    public void setTotal_vaccinations_per_hundred(String total_vaccinations_per_hundred) {
        this.total_vaccinations_per_hundred = total_vaccinations_per_hundred;
    }

    public String getPeople_vaccinated_per_hundred() {
        return people_vaccinated_per_hundred;
    }

    public void setPeople_vaccinated_per_hundred(String people_vaccinated_per_hundred) {
        this.people_vaccinated_per_hundred = people_vaccinated_per_hundred;
    }

    public String getPeople_fully_vaccinated_per_hundred() {
        return people_fully_vaccinated_per_hundred;
    }

    public void setPeople_fully_vaccinated_per_hundred(String people_fully_vaccinated_per_hundred) {
        this.people_fully_vaccinated_per_hundred = people_fully_vaccinated_per_hundred;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
}

import { React, useRef, useState } from 'react';
import { Container, Row } from 'react-bootstrap';
import { Line } from 'react-chartjs-2';
import Select from 'react-select';

export const LineChart = ({ covidData }) => {

    const [selectedOption, setSelectedOption] = useState([]);

    const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];

    if (!covidData) {
        return <h1>No data;</h1>
    }

    const dates = covidData.map(data => {
        let dataDate = new Date(data.date);
        let formatted_date = dataDate.getDate() + " " + months[dataDate.getMonth()] + " " + dataDate.getFullYear()
        return formatted_date;
    });

    const newCases = covidData.map(data => {
        return data.newCases;
    });

    const totalCases = covidData.map(data => {
        return data.totalCases;
    });

    const totalDeaths = covidData.map(data => {
        return data.totalDeaths;
    });

    const newDeaths = covidData.map(data => {
        return data.newDeaths;
    });

    const peopleVaccinated = covidData.map(data => {
        return data.peopleVaccinated;
    });

    const peopleFullyVaccinated = covidData.map(data => {
        return data.peopleFullyVaccinated;
    });

    const newVaccinations = covidData.map(data => {
        return data.newVaccinations;
    });

    const peopleVacPerHundred = covidData.map(data => {
        let peopleVacPercentage = data.peopleVaccinatedPerHundred;
        return peopleVacPercentage;
    });


    if (!dates || !newCases) {
        return <h1>Waiting on data..</h1>
    }


    const options = {
        scales: {
            yAxes: [
                {
                    ticks: {
                        beginAtZero: true,
                    },
                },
            ],
        },
    };

    const dataNewCases = {
        labels: dates,
        datasets: [
            {
                label: 'Confirmed new cases',
                data: newCases,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataTotalCases = {
        labels: dates,
        datasets: [
            {
                label: 'Confirmed total cases',
                data: totalCases,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataTotalDeaths = {
        labels: dates,
        datasets: [
            {
                label: 'Confirmed total deaths',
                data: totalDeaths,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataNewDeaths = {
        labels: dates,
        datasets: [
            {
                label: 'Confirmed new deaths',
                data: newDeaths,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataPeopleVacPerHundred = {
        labels: dates,
        datasets: [
            {
                label: '% of People vaccinated',
                data: peopleVacPerHundred,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataPeopleVaccinated = {
        labels: dates,
        datasets: [
            {
                label: 'People vaccinated',
                data: peopleVaccinated,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataPeopleFullyVaccinated = {
        labels: dates,
        datasets: [
            {
                label: 'People fully vaccinated',
                data: peopleFullyVaccinated,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const dataNewVaccinations = {
        labels: dates,
        datasets: [
            {
                label: 'New vaccinations',
                data: newVaccinations,
                fill: false,
                backgroundColor: 'rgb(255, 99, 132)',
                borderColor: 'rgba(255, 99, 132, 0.2)',
            },
        ],
    };

    const selectOptions = [
        { value: "New Cases", label: 'New Cases' },
        { value: 'Total Cases', label: 'Total Cases' },
        { value: 'New Deaths', label: 'New Deaths' },
        { value: 'Total Deaths', label: 'Total Deaths' },
        { value: 'New Vaccinations', label: 'New Vaccinations' },
        { value: 'Total People Fully Vaccinated', label: 'Total People Fully Vaccinated' },
        { value: 'Total People Vaccinated', label: 'Total People Vaccinated' },
        { value: 'Percentage of People Vaccinated', label: 'Percentage of People Vaccinated' },
    ];

    const getChartNewCases = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "New Cases") {
                addData.push("New Cases");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataNewCases} options={options} />
                </Row>
            )
        }
        return <div></div>
    }

    const getChartTotalCases = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "Total Cases") {
                addData.push("Total Cases");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataTotalCases} options={options} />
                </Row>
            )
        }
        return <div></div>
    }

    const getChartNewDeaths = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "New Deaths") {
                addData.push("New deaths");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataNewDeaths} options={options} />
                </Row>
            )
        }
        return <div></div>
    }

    const getChartTotalDeaths = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "Total Deaths") {
                addData.push("Total Deaths");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataTotalDeaths} options={options} />
                </Row>
            )
        }
        return <div></div>
    }

    const getChartNewVaccinations = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "New Vaccinations") {
                addData.push("new vac");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataNewVaccinations} options={options} />
                </Row>
            )
        }
        return <div></div>
    }

    const getChartPeopleFullyVac = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "Total People Fully Vaccinated") {
                addData.push("new");
            }
            if (addData[0]) {
                return (
                    <Row>
                        <Line data={dataPeopleFullyVaccinated} options={options} />
                    </Row>
                )
            }
        }
        return <div></div>

    }

    const getChartPeopleVac = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "Total People Vaccinated") {
                addData.push("total");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataPeopleVaccinated} options={options} />
                </Row>
            )
        }
        return <div></div>
    }

    const getChartPeopleVacPerHundred = () => {
        let addData = [];
        for (let index = 0; index < selectedOption.length; index++) {
            if (selectedOption[index].value === "Percentage of People Vaccinated") {
                addData.push("percentage");
            }
        }
        if (addData[0]) {
            return (
                <Row>
                    <Line data={dataPeopleVacPerHundred} options={options} />
                </Row>
            )
        }
        return <div></div>

    }

    return (
        <div>
            {/* <Select
                defaultValue={[]}
                onChange={setSelectedOption}
                options={selectOptions}
                placeholder="Select chart option.."
            /> */}
            <Select
                defaultValue={[""]}
                isMulti
                name="charts"
                options={selectOptions}
                className="basic-multi-select"
                classNamePrefix="select"
                onChange={setSelectedOption}
                placeholder="Select the data.."
            />
            <Container>
                {getChartNewCases()}
                {getChartTotalCases()}
                {getChartNewDeaths()}
                {getChartTotalDeaths()}
                {getChartNewVaccinations()}
                {getChartPeopleVac()}
                {getChartPeopleFullyVac()}
                {getChartPeopleVacPerHundred()}
                {/* <div>
                    <Row>
                        <Line data={selectedOption.value} options={options} />
                    </Row>
                    <hr></hr>
                    <p style={{ color: 'grey', fontSize: 'small' }}>Data from <a href="https://ourworldindata.org/">ourworldindata</a></p>
                </div> */}
            </Container>
        </div>
    );
}


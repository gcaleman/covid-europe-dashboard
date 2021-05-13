import { React, useState, useEffect } from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import { LineChart } from './LineChart';

export const CovidCharts = ({ name }) => {

    const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];

    const [countryData, setCountryData] = useState({ covidCases: [] });

    useEffect(
        () => {
            const fetchData = async () => {
                const response = await fetch(`http://localhost:8080/country/${name}`);
                const data = await response.json();
                setCountryData(data);
            }
            fetchData();
        }, [name]
    )

    if (!countryData || !countryData.covidCases) {
        return <h1>Loading..</h1>
    }

    const shrinkDataForDate = () => {
        let lesserData = []
        for (let index = 0; index < countryData.covidCases.length; index = index + 6) {
            lesserData.push(countryData.covidCases[index]);
        }
        if (lesserData[countryData.covidCases[countryData.covidCases.length - 1]] !== countryData.covidCases[countryData.covidCases.length - 2])
            lesserData.push(countryData.covidCases[countryData.covidCases.length - 1])
        return lesserData;
    }

    const getSumAllCases = () => {
        let sumCases = 0;

        for (let index = 0; index < countryData.covidCases.length; index++) {
            sumCases = sumCases + countryData.covidCases[index].newCases;
        }

        return sumCases;
    }

    const getLatestDate = () => {
        let latestDate = [];
        for (let index = 0; index < countryData.covidCases.length; index++) {
            latestDate.push(countryData.covidCases[index].date);
        }
        let latestDataDate = new Date(latestDate[latestDate.length - 1])
        let formatted_date = latestDataDate.getDate() + " " + months[latestDataDate.getMonth()] + " " + latestDataDate.getFullYear()
        return formatted_date;
    }

    const getPopulation = () => {
        let population = 0;
        if (countryData.covidCases[0]) {
            population = countryData.covidCases[0].population;
        }
        return population
    }

    const getNumbOfDeaths = () => {
        let latestDate = [];
        for (let index = 0; index < countryData.covidCases.length; index++) {
            latestDate.push(countryData.covidCases[index].date);
        }

        let numbDeaths = 0;
        countryData.covidCases.map(data => {
            if (data.date === latestDate[latestDate.length - 1])
                numbDeaths = data.totalDeaths;
        })
        return numbDeaths;
    }

    return (
        <div className="CovidCharts">
            <Container style={{ paddingTop: '20px' }}>
                <Row>
                    <Col>
                        <p style={{ fontSize: 'small', color: 'grey' }}>Latest data from </p>
                        <p style={{ fontSize: 'small' }}><b>{getLatestDate()}</b></p>
                    </Col>
                    <Col>
                        <p style={{ fontSize: 'small' }}>Cases to date: <b>{getSumAllCases()}</b></p>
                        <p style={{ fontSize: 'small' }}>Population: <b>{getPopulation()}</b></p>
                        <p style={{ fontSize: 'small' }}>Number of deaths: <b>{getNumbOfDeaths()}</b></p>
                    </Col>
                </Row>
                <hr></hr>
            </Container>
            <LineChart covidData={shrinkDataForDate()} />
        </div>
    )
}
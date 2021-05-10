import { React, useState, useEffect } from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import { useParams } from 'react-router-dom';
import { CovidCharts } from '../components/CovidCharts';

export const CountryDetailPage = () => {

    const [countryData, setCountryData] = useState({ covidCases: [] });

    const { countryName } = useParams();


    useEffect(
        () => {
            const fetchData = async () => {
                const response = await fetch(`http://localhost:8080/country/${countryName}`);
                const data = await response.json();
                setCountryData(data);
            }
            fetchData();
        }, [countryName]
    )

    if (!countryData || !countryData.covidCases) {
        return <h1>Waiting for data..</h1>
    }

    const shrinkDataForDate = () => {
        let lesserData = []
        for (let index = 0; index < countryData.covidCases.length; index = index + 11) {
            lesserData.push(countryData.covidCases[index]);
        }
        if (lesserData[countryData.covidCases[countryData.covidCases.length - 1]] !== countryData.covidCases[countryData.covidCases.length - 1])
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
        return latestDate[latestDate.length -1 ];
    }

    return (
        <div className="CountryPageDetail">
            <h1>{countryName}</h1>
            <Container>
                <Row>
                    <Col md={4}>
                        <h4>Number of cases to date - {getLatestDate()}: {getSumAllCases()}</h4>
                    </Col>
                    <Col>
                        <CovidCharts covidData={shrinkDataForDate()} />
                    </Col>
                </Row>
            </Container>
        </div>
    )
}
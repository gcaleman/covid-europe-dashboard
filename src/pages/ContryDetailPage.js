import { React, useState, useEffect } from 'react';
import { Container, Row, Col, Navbar, Nav } from 'react-bootstrap';
import { useParams } from 'react-router-dom';
import { CovidCharts } from '../components/CovidCharts';

export const CountryDetailPage = () => {

    const months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"];

    const [countryData, setCountryData] = useState({ covidCases: [] });

    const { countryName } = useParams();


    useEffect(
        () => {
            const fetchData = async () => {
                const response = await fetch(`https://covidinfoapi.clmn.link/country/${countryName}`);
                const data = await response.json();
                setCountryData(data);
            }
            fetchData();
        }, [countryName]
    )

    if (!countryData || !countryData.covidCases || !countryData.covidCases[0]) {
        return <h1>Waiting for data..</h1>
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
        return countryData.covidCases[0].population;
    }

    return (
        <div className="CountryPageDetail">
            <Navbar bg="dark" variant="dark" sticky="top">
                <Container>
                    <Row>
                        <Navbar.Brand href={`/${countryName}`} style={{ color: 'black', textAlign: 'center' }}>
                            <h3 style={{ color: 'lightgrey' }}>{countryName}</h3>
                        </Navbar.Brand>
                        <Nav className="mr-auto">
                            <Nav.Link href="/">Home</Nav.Link>
                        </Nav>
                    </Row>
                </Container>
            </Navbar>
            <div>
                <Container style={{ paddingTop: '20px' }}>
                    <Row>
                        <Col>
                            <p style={{ fontSize: 'small', color: 'grey' }}>Latest data from </p>
                            <p style={{ fontSize: 'small' }}><b>{getLatestDate()}</b></p>
                        </Col>
                        <Col>
                            <p style={{ fontSize: 'small' }}>Cases to date: <b>{getSumAllCases()}</b></p>
                            <p style={{ fontSize: 'small' }}>Population: <b>{getPopulation()}</b></p>
                        </Col>
                    </Row>
                    <hr></hr>
                </Container>

                <Container style={{ paddingBottom: '60px' }}>
                    <Row style={{ height: '100vh' }}>
                        <Col style={{ paddingBottom: '60px' }}>
                            <CovidCharts covidData={shrinkDataForDate()} />
                        </Col>
                    </Row>
                </Container>
            </div>
        </div >
    )
}
import { React, useEffect, useState } from 'react';
import { Container, Row, Col } from 'react-bootstrap';
import { CountriesList } from '../components/CountriesList';
import { CovidCharts } from '../components/CovidCharts';
import { LineChart } from '../components/LineChart';

export const CountriesPage = () => {

    const [dataList, setDataList] = useState([]);

    useEffect(
        () => {
            const fetchCountriesList = async () => {
                const response = await fetch(`https://covidinfoapi.clmn.link/all-from-initial-date`);
                const data = await response.json();
                setDataList(data);
            }
            fetchCountriesList();
        }, []
    )

    if (!dataList) {
        return <h1>Not found!</h1>
    }

    return (
        <div className="countriesPage">
            <Container>
                <Row>
                    <Col style={{ paddingBottom: '60px' }}>
                        <h3>Countries List</h3>
                        <hr></hr>
                        <CountriesList />
                    </Col>
                    <Col md={8} style={{ paddingBottom: '60px' }}>
                        <h3>Data Charts EU</h3>
                        <hr></hr>
                        <LineChart covidData={dataList} />
                    </Col>
                </Row>
            </Container>
        </div>
    )
}
import { React, useState, useEffect } from 'react';
import { Container, Row, Col, Navbar, Nav } from 'react-bootstrap';
import { useParams } from 'react-router-dom';
import { CovidCharts } from '../components/CovidCharts';
import Select from 'react-select';
import './ContryDetailPage.css';

export const CountryDetailPage = () => {

    const [countrySelection, setCountrySelection] = useState([]);

    const [countryList, setCountryList] = useState([]);

    const { countryName } = useParams();


    useEffect(
        () => {
            const fetchData = async () => {
                const countryListResponse = await fetch(`https://covidinfoapi.clmn.link/countries`)
                const countryListData = await countryListResponse.json();
                setCountryList(countryListData);
            }
            fetchData();
        }, []
    )

    if (!countryList) {
        return <h1>Waiting for data..</h1>
    }


    const fillSelection = () => {
        let countrySelection = [];
        for (let index = 0; index < countryList.length; index++) {
            let listObj = { value: countryList[index], label: countryList[index] };
            countrySelection.push(listObj);
        }
        return countrySelection;
    }

    const nameParamOrSelected = countrySelection.value ? countrySelection.value : countryName;

    return (
        <div className="CountryPageDetail">
            <Navbar bg="dark" variant="dark" sticky="top">
                <Container>
                    <Navbar.Brand href={`/country/${nameParamOrSelected}`} style={{ color: 'black', textAlign: 'center' }}>
                        <h3 >{nameParamOrSelected}</h3>
                    </Navbar.Brand>
                    <Nav className="mr-auto">
                        <Nav.Link href="/">Home</Nav.Link>
                    </Nav>
                    <Col md={5}>
                        <Select
                            defaultValue={[]}
                            onChange={setCountrySelection}
                            options={fillSelection()}
                            placeholder="Select country.."
                        />
                    </Col>
                </Container>
            </Navbar>
            <div>

                <Container style={{ paddingBottom: '60px' }}>
                    <Row style={{ height: '100vh' }}>
                        <Col style={{ paddingBottom: '60px' }}>
                            <CovidCharts name={countrySelection.value ? countrySelection.value : countryName} />
                        </Col>
                    </Row>
                </Container>
            </div>
        </div >
    )
}
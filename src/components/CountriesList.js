import { React, useState, useEffect, useRef } from 'react';
import { Link } from 'react-router-dom';
import { Form } from 'react-bootstrap';

export const CountriesList = () => {

    const [countriesList, setCountriesList] = useState([]);
    const [searchTerm, setSearchTerm] = useState("");
    const [searchResult, setSearchResult] = useState([]);

    const userInput = useRef("");

    useEffect(
        () => {
            const fetchData = async () => {
                const response = await fetch(`https://covidinfoapi.clmn.link/countries`);
                const data = await response.json();
                setCountriesList(data);
            }
            fetchData();
        }, []
    )

    if (!countriesList) {
        return <h1>Waiting for data..</h1>
    }

    const getSearchTerm = () => {
        setSearchTerm(userInput.current.value);
        if (searchTerm !== "") {
            const filteredCountryList = countriesList.filter(countries => {
                return countries.toLowerCase().includes(searchTerm.toLowerCase());
            });
            setSearchResult(filteredCountryList);
        } else {
            setSearchResult(countriesList);
        }
    }

    const mapFilteredList = () => {
        let search = searchResult.length < 1 ? countriesList : searchResult;
        return (
            search.map((country, index) => {
                return (
                    <ol key={index} >
                        <h3><Link to={`/country/${country}`}>{country}</Link></h3>
                        <hr></hr>
                    </ol>
                )
            })
        )
    }

    return (
        <div className="contriesList" style={{ textAlign: 'left' }}>
            <Form.Group>
                <Form.Control ref={userInput} type='text' placeholder="Search country" value={searchTerm} onChange={getSearchTerm} />
            </Form.Group>
            {mapFilteredList()}
        </div>
    )
}
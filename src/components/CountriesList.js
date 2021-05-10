import { React, useState, useEffect } from 'react';
import { Link } from 'react-router-dom';

export const CountriesList = () => {

    const [countriesList, setCountriesList] = useState([]);

    useEffect(
        () => {
            const fetchData = async () => {
                const response = await fetch(`http://localhost:8080/countries`);
                const data = await response.json();
                setCountriesList(data);
            }
            fetchData();
        }, []
    )

    if (!countriesList) {
        return <h1>Waiting for data..</h1>
    }


    return (
        <div className="contriesList">
            {countriesList.map((country, index) => {
                return (
                    <ol key={index}>
                        <h3><Link to={`/${country}`}>{country}</Link></h3>
                    </ol>
                )
            })}
        </div>
    )
}
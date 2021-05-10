import { React, useEffect, useState } from 'react';
import { CountriesList } from '../components/CountriesList';
import { CovidCharts } from '../components/CovidCharts';

export const CountriesPage = () => {

    const [dataList, setDataList] = useState([]);

    useEffect(
        () => {
            const fetchCountriesList = async () => {
                const response = await fetch(`http://localhost:8080/all-from-initial-date`);
                const data = await response.json();
                setDataList(data);
            }
            fetchCountriesList();
        }, []
    )

        if(!dataList){
            return <h1>Not found!</h1>
        }

    return (
        <div className="countriesPage">
            <h3>European Countries</h3>
            <CountriesList list={dataList}/>
            <CovidCharts covidData={dataList}/>
        </div>
    )
}
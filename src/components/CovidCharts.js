import { React, useState, useEffect } from 'react';
import { LineChart } from './LineChart';

export const CovidCharts = ({ covidData }) => {


    if (!covidData) {
        return <h1>Error!</h1>
    }

    return (
        <div className="CovidCharts">
            <LineChart covidData={covidData} />
        </div>
    )
}
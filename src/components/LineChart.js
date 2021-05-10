import React from 'react';
import { Line } from 'react-chartjs-2';

export const LineChart = ({ covidData }) => {

    if (!covidData) {
        return <h1>No data;</h1>
    }

    const dates = covidData.map(data => {
        return data.date;
    });

    const newCases = covidData.map(data => {
        return data.newCases;
    });

    const totalCases = covidData.map(data => {
        return data.totalCases;
    });



    if (!dates || !newCases) {
        return <h1>Waiting on data..</h1>
    }

    const data1 = {
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

    const options1 = {
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

    return (
        <div>
            <Line data={data1} options={options1} />
            <p>Data from <a href="https://ourworldindata.org/">ourworldindata</a></p>
        </div>
    );
}


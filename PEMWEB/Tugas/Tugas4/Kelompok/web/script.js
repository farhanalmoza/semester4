$(document).ready(function(){
    updateChart();
});

function updateChart() {
    async function fetchData() {
        const url = './mahasiswa.json';
        const response = await fetch(url);
        // wait until the request is complete
        const data = await response.json();
        console.log(data);
        return data;
    };

    fetchData().then(data => {
        const nama = data.map(
            function(index) {return index.nama}
        );

        const sks = data.map(
            function(index) {return index.sks}
        );

        myChart.config.data.labels = nama;
        myChart.config.data.datasets[0].data = sks;
        myChart.update()

        barChart.config.data.labels = nama;
        barChart.config.data.datasets[0].data = sks;
        barChart.update()
    });
}

const data = {
    datasets: [{
        label: 'Jumlah SKS yang telah ditempuh',
        data: [12, 19, 3, 5, 2, 3],
        backgroundColor: [
            'rgba(255, 99, 132, 0.2)',
            'rgba(54, 162, 235, 0.2)',
            'rgba(255, 206, 86, 0.2)',
            'rgba(75, 192, 192, 0.2)',
            'rgba(153, 102, 255, 0.2)',
            'rgba(255, 159, 64, 0.2)'
        ],
        borderColor: [
            'rgba(255, 99, 132, 1)',
            'rgba(54, 162, 235, 1)',
            'rgba(255, 206, 86, 1)',
            'rgba(75, 192, 192, 1)',
            'rgba(153, 102, 255, 1)',
            'rgba(255, 159, 64, 1)'
        ],
        borderWidth: 1
    }]
}

const config = {
    type: 'pie',
    data,
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
}

const bar = {
    type: 'bar',
    data,
    options: {
        scales: {
            y: {
                beginAtZero: true
            }
        }
    }
}

const myChart = new Chart(
    document.getElementById('myChart'),
    config
)

const barChart = new Chart(
    document.getElementById('barChart'),
    bar
)
let tabHeader = document.getElementsByClassName('tab-header')[0];
let tabIndicator = document.getElementsByClassName('tab-indicator')[0];
let tabBody = document.getElementsByClassName('tab-body')[0];

let tabsPane = tabHeader.getElementsByClassName('pane');

for(let i=0; i<tabsPane.length; i++) {
    tabsPane[i].addEventListener('click', function() {
        tabHeader.getElementsByClassName('active')[0].classList.remove('active');
        tabsPane[i].classList.add('active');

        tabBody.getElementsByClassName('active')[0].classList.remove('active');
        tabBody.getElementsByClassName('content')[i].classList.add('active');

        tabIndicator.style.left = `calc(calc(100% / 4) * ${i})`;
    });
}


// segitiga  1
function segitiga1(form) {
    let tinggi = form.getElementsByClassName('tinggi')[0].value;
    let hasil = '';
    for (let i = 0; i < tinggi; i++) {
        for (let j = 0; j <= i; j++) {
            hasil += '* ';
        }
        hasil += '<br>';
    }
    let hasilArea = document.getElementsByClassName('bintang')[0];
    hasilArea.innerHTML = hasil;
}

// segitiga siku 2
function segitiga2(form) {
    let tinggi = form.getElementsByClassName('tinggi')[0].value;
    let hasil = '';
    for (let i = 0; i < tinggi; i++) {
        for (let j = tinggi; j > i; j--) {
            hasil += '*';
        }
        hasil += "<br>";
    }
    let hasilArea = document.getElementsByClassName('bintang')[0];
    hasilArea.innerHTML = hasil;
}

// segitiga siku 3
function segitiga3(form) {
    let tinggi = form.getElementsByClassName('tinggi')[0].value;
    let hasil = '';
    for (let i = tinggi; i > 0; i--) {
        for (let j = 1; j <= tinggi; j++) {
            if (j >= i) {
                hasil += '*';
            } else {
                hasil += '&nbsp;';
            }
        }
        hasil += '<br>';
    }
    let hasilArea = document.getElementsByClassName('bintang')[0];
    hasilArea.innerHTML = hasil;
}

// segitiga siku 4
function segitiga4(form) {
    let tinggi = form.getElementsByClassName('tinggi')[0].value;
    let hasil = '';
    for (let i = tinggi; i > 0; i--) {
        for (let j = tinggi; j > 0; j--) {
            if (j > i) {
                hasil += '&nbsp;';
            } else {
                hasil += '*';
            }
        }
        hasil += '<br>';
    }
    let hasilArea = document.getElementsByClassName('bintang')[0];
    hasilArea.innerHTML = hasil;
}

function bersihkan() {
    let bintang = document.getElementsByClassName('bintang')[0];
    bintang.innerHTML = '';
}
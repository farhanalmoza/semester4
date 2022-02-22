let tabHeader = document.getElementsByClassName('tab-header')[0];
let tabIndicator = document.getElementsByClassName('tab-indicator')[0];
let tabBody = document.getElementsByClassName('tab-body')[0];

let tabsPane = tabHeader.getElementsByTagName('div');

for(let i=0; i<tabsPane.length; i++) {
    tabsPane[i].addEventListener('click', function() {
        tabHeader.getElementsByClassName('active')[0].classList.remove('active');
        tabsPane[i].classList.add('active');

        tabBody.getElementsByClassName('active')[0].classList.remove('active');
        tabBody.getElementsByClassName('content')[i].classList.add('active');

        tabIndicator.style.left = `calc(calc(100% / 4) * ${i})`;
    });
}


// kotak
function kotak(alas, tinggi) {
    let hasil = '';
    for (let i = 0; i < tinggi; i++) {
        for (let j = 0; j < alas; j++) {
            hasil += '* ';
        }
        hasil += '\n';
    }
    return hasil;
}

// segitiga siku 1
function segitigaSiku1(panjang) {
    let hasil = '';
    for (let i = 0; i < panjang; i++) {
        for (let j = 0; j <= i; j++) {
            hasil += '* ';
        }
        hasil += "\n";
    }
    return hasil;
}

// segitiga siku 2
function segitigaSiku2(panjang) {
    let hasil = '';
    for (let i = 0; i < panjang; i++) {
        for (let j = panjang; j > i; j--) {
            hasil += '* ';
        }
        hasil += "\n";
    }
    return hasil;
}

// segitiga siku 3
function segitigaSiku3(panjang) {
    let hasil = '';
    for (let i = panjang; i > 0; i--) {
        for (let j = 1; j <= panjang; j++) {
            if (j >= i) {
                hasil += '*';
            } else {
                hasil += ' '
            }
        }
        hasil += '\n';
    }
    return hasil;
}

// segitiga siku 4
function segitigaSiku4(panjang) {
    let hasil = '';
    for (let i = panjang; i > 0; i--) {
        for (let j = panjang; j > 0; j--) {
            if (j > i) {
                hasil += ' ';
            } else {
                hasil += '*';
            }
        }
        hasil += '\n';
    }
    return hasil;
}
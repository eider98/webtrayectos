//Rellena los inputs de salida y llegada con el dia y hora actuales cuando se hace click en ellos

document.getElementById('salida').addEventListener('click', function() {
    const now = new Date();
    const year = now.getFullYear();
    const month = String(now.getMonth() + 1).padStart(2, '0');
    const day = String(now.getDate()).padStart(2, '0');
    const hours = String(now.getHours()).padStart(2, '0');
    const minutes = String(now.getMinutes()).padStart(2, '0');

    const localDatetime = `${year}-${month}-${day}T${hours}:${minutes}`;
    this.value = localDatetime;
});

document.getElementById('llegada').addEventListener('click', function() {
    const now = new Date();
    const year = now.getFullYear();
    const month = String(now.getMonth() + 1).padStart(2, '0');
    const day = String(now.getDate()).padStart(2, '0');
    const hours = String(now.getHours()).padStart(2, '0');
    const minutes = String(now.getMinutes()).padStart(2, '0');

    const localDatetime = `${year}-${month}-${day}T${hours}:${minutes}`;
    this.value = localDatetime;
});